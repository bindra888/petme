package com.petme.service;

import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrQuery.ORDER;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;

import com.petme.exceptions.SearchException;
import com.petme.util.SearchConstants;

/**
 * Service for Searching from Solr.
 * 
 * @author Taman Bindra
 * 
 */
public class SearchService extends SearchConstants implements ISearchService {

	private Logger logger = Logger.getLogger(SearchService.class);

	private static enum SearchServers {
		CONTACTS_CORE("Contacts"), SALE_MATE_CORE("SaleMate"), SERVICES_CORE(
				"Services"), ACCESSORIES_CORE("Accessories"), REQUIREMENT_CORE(
				"Requirement");

		private String server;

		private SearchServers(String server) {
			this.server = server;
		}

		public String toString() {
			return server;
		}
	}

	/*
	 * All Solr Servers Here
	 */
	private static HttpSolrServer CONTACTS_SERVER = null;
	private static HttpSolrServer SALE_MATE_SERVER = null;
	private static HttpSolrServer SERVICES_SERVER = null;
	private static HttpSolrServer ACCESSORIES_SERVER = null;
	private static HttpSolrServer REQUIREMENT_SERVER = null;

	private static final String SOLR_BASE_URL = "http://localhost:8983/PetSearch/";
	static {
		initialiseSearchServers();
	}

	private static void initialiseSearchServers() {
		CONTACTS_SERVER = new HttpSolrServer(SOLR_BASE_URL
				+ SearchServers.CONTACTS_CORE);
		CONTACTS_SERVER.setMaxRetries(2);
		CONTACTS_SERVER.setConnectionTimeout(5000);

		SALE_MATE_SERVER = new HttpSolrServer(SOLR_BASE_URL
				+ SearchServers.SALE_MATE_CORE);
		SALE_MATE_SERVER.setMaxRetries(2);
		SALE_MATE_SERVER.setConnectionTimeout(5000);

		SERVICES_SERVER = new HttpSolrServer(SOLR_BASE_URL
				+ SearchServers.SERVICES_CORE);
		SERVICES_SERVER.setMaxRetries(2);
		SERVICES_SERVER.setConnectionTimeout(5000);

		ACCESSORIES_SERVER = new HttpSolrServer(SOLR_BASE_URL
				+ SearchServers.ACCESSORIES_CORE);
		ACCESSORIES_SERVER.setMaxRetries(2);
		ACCESSORIES_SERVER.setConnectionTimeout(5000);

		REQUIREMENT_SERVER = new HttpSolrServer(SOLR_BASE_URL
				+ SearchServers.REQUIREMENT_CORE);
		REQUIREMENT_SERVER.setMaxRetries(2);
		REQUIREMENT_SERVER.setConnectionTimeout(5000);
	}

	@Override
	public QueryResponse fetchResultsFromSolr(
			Map<String, String> filterQueryMap, Map<String, String> paramMap,
			Map<String, ORDER> sortMap, int numberOfResults,
			SEARCH_TYPE searchType, int start) {
		QueryResponse queryResponse = null;
		SolrQuery solrQuery = new SolrQuery();
		solrQuery.setQuery("*:*");
		solrQuery.setRows(numberOfResults);
		solrQuery.setStart(start);
		for (Map.Entry<String, String> param : filterQueryMap.entrySet()) {
			solrQuery.addFilterQuery(param.getKey() + ":" + param.getValue());
		}
		if (paramMap != null && paramMap.size() > 0) {
			for (Map.Entry<String, String> param : filterQueryMap.entrySet()) {
				solrQuery.setParam(param.getKey(), param.getValue());
			}
		}
		if (sortMap != null && sortMap.size() > 0) {
			for (Map.Entry<String, SolrQuery.ORDER> entry : sortMap.entrySet()) {
				solrQuery.addSort(entry.getKey(), entry.getValue());
			}
		}
		try {
			switch (searchType) {
			case SALE_MATE_SEARCH:
				logger.debug(SOLR_BASE_URL + SearchServers.SALE_MATE_CORE
						+ "/select?" + solrQuery.toString());
				queryResponse = SALE_MATE_SERVER.query(solrQuery);
				break;
			case SERVICES_SEARCH:
				logger.debug(SOLR_BASE_URL + SearchServers.SERVICES_CORE
						+ "/select?" + solrQuery.toString());
				queryResponse = SERVICES_SERVER.query(solrQuery);
				break;
			case ACCESSORIES_SEARCH:
				logger.debug(SOLR_BASE_URL + SearchServers.ACCESSORIES_CORE
						+ "/select?" + solrQuery.toString());
				queryResponse = ACCESSORIES_SERVER.query(solrQuery);
				break;
			case CONTACTS_SEARCH:
				logger.debug(SOLR_BASE_URL + SearchServers.CONTACTS_CORE
						+ "/select?" + solrQuery.toString());
				queryResponse = CONTACTS_SERVER.query(solrQuery);
				break;
			case REQUIREMENT_SEARCH:
				logger.debug(SOLR_BASE_URL + SearchServers.REQUIREMENT_CORE
						+ "/select?" + solrQuery.toString());
				queryResponse = REQUIREMENT_SERVER.query(solrQuery);
				break;
			default:
				throw new SearchException("Invalid Search Type");
			}

		} catch (SolrServerException e) {
			logger.error(e);
		} catch (SearchException e) {
			logger.error(e);
		}
		return queryResponse;
	}
}

package com.petme.service;

import java.util.Map;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.response.QueryResponse;

import com.petme.util.SearchConstants.SEARCH_TYPE;

/**
 * Interface for Search Service
 * 
 * @author Taman Bindra
 * 
 */
public interface ISearchService {

	/**
	 * The method to use for normal searches from Solr i.e. where Solr Request
	 * Handler is Standard
	 * 
	 * @param filterQueryMap
	 * @param paramMap
	 * @param sortMap
	 * @param numberOfResults
	 * @param searchType
	 * @param start
	 * @return
	 */
	public QueryResponse fetchResultsFromSolr(
			Map<String, String> filterQueryMap, Map<String, String> paramMap,
			Map<String, SolrQuery.ORDER> sortMap, int numberOfResults,
			SEARCH_TYPE searchType, int start);

}

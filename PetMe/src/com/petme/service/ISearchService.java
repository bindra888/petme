package com.petme.service;

import java.util.Map;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.response.QueryResponse;

public interface ISearchService {

	public QueryResponse fetchResultsFromSolr(
			Map<String, String> filterQueryMap, Map<String, String> paramMap,
			Map<String, SolrQuery.ORDER> sortMap, int numberOfResults,
			int searchType, int start);

}

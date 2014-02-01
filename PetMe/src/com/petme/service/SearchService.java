package com.petme.service;

import java.util.Map;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrQuery.ORDER;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;

import com.petme.util.SearchConstants;

public class SearchService extends SearchConstants implements ISearchService{

	@Override
	public QueryResponse fetchResultsFromSolr(
			Map<String, String> filterQueryMap, Map<String, String> paramMap,
			Map<String, ORDER> sortMap, int numberOfResults, int searchType,
			int start) {
		QueryResponse queryResponse = null;
		SolrQuery solrQuery = new SolrQuery();
		solrQuery.setQuery("*:*");
		solrQuery.setRows(numberOfResults);
		solrQuery.setStart(start);
		for(Map.Entry<String, String> param: filterQueryMap.entrySet()){
			solrQuery.addFilterQuery(param.getKey()+":"+param.getValue());
		}
		if(paramMap != null && paramMap.size() > 0)	{
			for(Map.Entry<String, String> param: filterQueryMap.entrySet()){
				solrQuery.setParam(param.getKey(), param.getValue());
			}
		}
		if(sortMap != null && sortMap.size() > 0){
			for(Map.Entry<String, SolrQuery.ORDER> entry : sortMap.entrySet()){
				solrQuery.addSort(entry.getKey(), entry.getValue());
			}
		}
		try{
			System.out.println(SOLR_BASE_URL+CONTACTS_CORE+"/select?"+solrQuery.toString());
			queryResponse = CONTACTS_SERVER.query(solrQuery);
		}
		catch(SolrServerException e){
			e.printStackTrace();
		}
		return queryResponse;
	}
	}

}

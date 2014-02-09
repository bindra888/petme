package com.petme.util;

/**
 * All Search Related constants to come here.
 * 
 * @author Taman Bindra
 * 
 */
public class SearchConstants extends Constants {

	public static enum SEARCH_TYPE {
		SALE_MATE_SEARCH(1), SERVICES_SEARCH(2), ACCESSORIES_SEARCH(3), CONTACTS_SEARCH(
				4), REQUIREMENT_SEARCH(5);

		private int searchType;

		private SEARCH_TYPE(int searchType) {
			this.searchType = searchType;
		}
	}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainSolution;

import java.util.*;

// Map to hold items which have offer on them and the offer details
public class itemOffers {
	public static TreeMap<String, itemOffer> itemOfferMap = new TreeMap<String, itemOffer>();
	
	static{
		itemOfferMap.put("A", new itemOffer("A", 3, 130.0));
		itemOfferMap.put("B", new itemOffer("B", 2, 37.0));
	}
	
	
}
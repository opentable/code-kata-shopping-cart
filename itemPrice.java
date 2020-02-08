/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainSolution;

import java.util.*;

// Map to hold price of individual item
public class itemPrice {
	public static TreeMap<String, Double> itemPriceMap = new TreeMap<String, Double>();
	
	static{
		itemPriceMap.put("A", 50.0);
		itemPriceMap.put("B", 30.0);
		itemPriceMap.put("C", 20.0);
		itemPriceMap.put("D", 10.0);
	}
}
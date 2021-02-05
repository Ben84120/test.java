package com.hemebiotech.analytics;

import java.util.Map;


/**
 * * @author Benoît Vacher
 * Write the results of AnalyticsCounter.java into a new file
 * The important of our interface is to write the resultat of our MAP into the new file
 * 
 */

public interface IWriterMap {

	/**
	 * 
	 * @param symptoms
	 */
	public void ecrireResult(Map<String, Integer>  symptoms);
}

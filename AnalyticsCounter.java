package com.hemebiotech.analytics;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {
		
		/**
		 * Using the ISymptomReader interface to read the symptoms.txt file and place its contents in an alphabetically arranged collection.
		 */
		AnalyticsCounter counter=new AnalyticsCounter();
		List<String>symptoms= counter.readingFile("Project02Eclipse/symptoms.txt");
		Collections.sort(symptoms);
		System.out.println(symptoms.toString());
		Map<String, Integer> map = cumputingSymptoms(List<String> symptoms)
		
		IWriterMap writer = new WriteFromDataMap();
		writer.ecrireResult(map);

	}
	
	private List<String> readingFile(String file) {
		ISymptomReader reader = new ReadSymptomDataFromFile(file);
		return reader.GetSymptoms();
		
	}
	
	
	private Map<String, Integer> cumputingSymptoms(List<String> symptoms) {
		Map<String, Integer> map = new HashMap<>();
		for (String symptom : symptoms) {

			if (symptom != null) {

			if (!map.containsKey(symptom)) {
				map.put(symptom, 1);
			} else {
				map.put(symptom, map.get(symptom) + 1);
			}
		}
		return map;	
	}
	
	
	
	
}
}

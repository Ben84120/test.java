package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {

		/**
		 * @param Main function of the program
		 */
		AnalyticsCounter counter = new AnalyticsCounter();
		List<String> symptoms = counter.readingFile("Project02Eclipse/symptoms.txt");
		System.out.println(symptoms.toString());
		Map<String, Integer> map = counter.cumputingSymptoms(symptoms);
		
		//TODO Appel de la methode saving
		IWriterMap writer = new WriteFromDataMap(); /* Use our program to write to a text file */
		writer.ecrireResult(map);

	}

	/**
	 * 
	 * @param Function allowing to browse the Map
	 * @return Returns the symptoms
	 */
	public List<String> readingFile(String file) {
		ISymptomReader reader = new ReadSymptomDataFromFile(file);
		return reader.GetSymptoms();

	}

	/**
	 * 
	 * @param Function allowing to iterate each occurrence through a loop.
	 * @detail Use TreeMap to sort our collection alphabetically.
	 * @return Return the occurrences and their numbers
	 */
	public Map<String, Integer> cumputingSymptoms(List<String> symptoms) {
		Map<String, Integer> map = new TreeMap<>();
		for (String symptom : symptoms) {
			if (symptom != null) {

				if (!map.containsKey(symptom)) {
					map.put(symptom, 1);
				} else {
					map.put(symptom, map.get(symptom) + 1);

				}

			}
		}

		return map;

	}
	
	public void saving(Map<String, Integer> map) {
		//TODO à trasferet le code d'ecriture du fichier

	}
	
	

}

package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Simple brute force implementation
 *
 */

public class WriteFromDataMap implements IWriterMap {

	public WriteFromDataMap() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ecrireResult(Map<String, Integer> symptoms) {
		/**
		 * Writing of the result obtained using the IWriterMap interface.
		 * Setting up exceptions to catch any errors with the blocks "try & catch"
		 * setting up a finally block to close the file's resources.
		 */
		
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter("Project02Eclipse/results.txt"));

			for (String key : symptoms.keySet()) {

				writer.write(key + ":" + symptoms.get(key) + "\r\n");

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (writer != null)
					writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}

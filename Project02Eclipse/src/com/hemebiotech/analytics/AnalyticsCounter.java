package com.hemebiotech.analytics;

public class AnalyticsCounter {

	
	public static void main(String args[]) throws Exception {
		// first get input
		
		String path = "Project02Eclipse/symptom.txt";
		String resultPath = "result.txt";
		ReadSymptomDataFromFile symptomReader = new ReadSymptomDataFromFile(path);
		ISymptomHandler symptomhandler  = new SymptomHandler(symptomReader.GetSymptoms());
		symptomhandler.countAndSortEachSymptom();
		symptomhandler.CreateSortedFile(resultPath);
	}
}

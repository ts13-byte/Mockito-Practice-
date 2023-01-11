package com.example.mockito.demo;

public class SomeBusinessImpl {

	private DataService dataService;

	public int findTheGreatestFromAllAData() {

		int[] arr = dataService.retrieveAllData();

		int greatest = Integer.MIN_VALUE;
		for (int num : arr) {
			if (num > greatest) {
				greatest = num;
			}
		}
		return greatest;
	}

	public SomeBusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}
}

interface DataService {
	int[] retrieveAllData();

}

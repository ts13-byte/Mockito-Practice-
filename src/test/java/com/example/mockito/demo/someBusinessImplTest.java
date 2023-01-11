package com.example.mockito.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
//this is an example of using stubs for testing the scenarios.
class someBusinessImplTest {

	@Test
	void test() {
		DataServiceStub dataServiceStub=new DataServiceStub();
		SomeBusinessImpl businessImpl=new SomeBusinessImpl(dataServiceStub);
		int result=businessImpl.findTheGreatestFromAllAData();
		assertEquals(3, result);
	}
	
	class DataServiceStub implements DataService{

		@Override
		public int[] retrieveAllData() {
			// TODO Auto-generated method stub
			return new int[] {1,2,3};
		}
	}

}

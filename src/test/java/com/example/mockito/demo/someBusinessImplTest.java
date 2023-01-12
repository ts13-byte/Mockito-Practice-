package com.example.mockito.demo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.*;
//this is an example of using stubs for testing the scenarios.
@ExtendWith(MockitoExtension.class)
class someBusinessImplTest{
	@Mock
	private DataService dataServiceMock;
	@InjectMocks
	private SomeBusinessImpl businessImpl;
	
	@Test
	void test() {
	
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1,2,3});
		int result=businessImpl.findTheGreatestFromAllAData();
		assertEquals(3, result);
	}
	
	/*class DataServiceStub implements DataService{

		@Override
		public int[] retrieveAllData() {
			// TODO Auto-generated method stub
			return new int[] {1,2,3};
		}
	}*/
	

}

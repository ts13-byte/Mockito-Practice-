package com.example.mockito.demo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ListTest {

	@Test
	void simpletest() {
		List listMock=mock(List.class);
		when(listMock.size()).thenReturn(3);
		assertEquals(3, listMock.size());
	}
	@Test
	void multipleReturns() {
		List listMock=mock(List.class);
		when(listMock.size()).thenReturn(3).thenReturn(2);
		assertEquals(3, listMock.size());
		assertEquals(2,listMock.size());
	}
	@Test
	void parameterMethod() {
		List listMock=mock(List.class);
		when(listMock.get(0)).thenReturn("some string");
		assertEquals("some string", listMock.get(0));
		assertEquals(null, listMock.get(1));
	}
	@Test
	void generalparameterMethod() {
		List listMock=mock(List.class);
		when(listMock.get(Mockito.anyInt())).thenReturn("some other string");
		assertEquals("some other string", listMock.get(0));
		assertEquals("some other string", listMock.get(1));
	}
}

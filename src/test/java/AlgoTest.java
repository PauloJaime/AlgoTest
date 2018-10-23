package test.java;
import static org.junit.Assert.*;

import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;

public class AlgoTest {

	Item[] expected = new Item[] {new Item(2), new Item(9), new Item(12), new Item(41), new Item(55)};
	SortAlgos obj = new SortAlgos();
	
	
//***********************Edge Condition Coverage****************************************************************
	
	@SuppressWarnings("static-access")
	@Test
	public void testSelectionSort_Unsorted() {
		Item[] input = new Item[] {new Item(55), new Item(41), new Item(12), new Item(9), new Item(2)};
		obj.selectionSort(input);
		assertTrue(expected[0].key == input[0].key);
		assertTrue(expected[1].key == input[1].key);
		assertTrue(expected[2].key == input[2].key);
		assertTrue(expected[3].key == input[3].key);
	}	
	
	@SuppressWarnings("static-access")
	@Test
	public void bubblesort_WithException() {
		try {
			obj.bubbleSort(null);
		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
		
	}
		
	@SuppressWarnings("static-access")
	@Test
	public void bubbleSort_withOneItem() {
		Item[] input = new Item[]{new Item(56)};
		obj.bubbleSort(input);
		assertTrue(56 == input[0].key);	
	}	
	
	@SuppressWarnings("static-access")
	@Test
	public void selectionSort_Sorted() {
		Item[] input = new Item[]{new Item(2),new Item(9),new Item(12),new Item(41),new Item(55)};
		obj.selectionSort(input);
		assertTrue(expected[0].key == input[0].key);
		assertTrue(expected[1].key == input[1].key);
		assertTrue(expected[2].key == input[2].key);
		assertTrue(expected[3].key == input[3].key);
		assertTrue(expected[4].key == input[4].key);
		
	}
		
	@SuppressWarnings("static-access")
	@Test
	public void selectionSort_withException() {
		try {
			obj.selectionSort(null);
		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
		
	}	
		
	@SuppressWarnings("static-access")
	@Test
	public void selectionSort_OneItem() {
		Item[] input = new Item[]{new Item(45)};
		obj.selectionSort(input);
		assertTrue(45 == input[0].key);
				
	}	
	
	@SuppressWarnings("static-access")
	@Test
	public void testinsertionSort_Unsorted() {
		Item[] input = new Item[] {new Item(55), new Item(41), new Item(12), new Item(9), new Item(2)};
		obj.insertionSort(input);
		assertTrue(expected[0].key == input[0].key);
		assertTrue(expected[1].key == input[1].key);
		assertTrue(expected[2].key == input[2].key);
		assertTrue(expected[3].key == input[3].key);
		assertTrue(expected[4].key == input[4].key);
	}		
			
	@SuppressWarnings("static-access")
	@Test
	public void insertionSort_Sorted() {
		Item[] input = new Item[]{new Item(2),new Item(9),new Item(12),new Item(41),new Item(55)};
		obj.insertionSort(input);
		assertTrue(expected[0].key == input[0].key);
		assertTrue(expected[1].key == input[1].key);
		assertTrue(expected[2].key == input[2].key);
		assertTrue(expected[3].key == input[3].key);
		assertTrue(expected[4].key == input[4].key);
		
	}		
	
	@SuppressWarnings("static-access")
	@Test
	public void insertionSor_withException() {
		try {
			obj.insertionSort(null);
		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
		
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void insertionSort_OneItem() {
		Item[] input = new Item[]{new Item(36)};
		obj.selectionSort(input);
		assertTrue(36 == input[0].key);
				
	}		

	@SuppressWarnings("static-access")
	@Test
	public void testmergeSort_Unsorted() {
		Item[] input = new Item[] {new Item(55), new Item(41), new Item(12), new Item(9), new Item(2)};
		obj.mergeSort(input);
		assertTrue(expected[0].key == input[0].key);
		assertTrue(expected[1].key == input[1].key);
		assertTrue(expected[2].key == input[2].key);
		assertTrue(expected[3].key == input[3].key);
		assertTrue(expected[4].key == input[4].key);
	}			
		
	@SuppressWarnings("static-access")
	@Test
	public void mergeSort_Sorted() {
		Item[] input = new Item[]{new Item(2),new Item(9),new Item(12),new Item(41),new Item(55)};
		obj.mergeSort(input);
		assertTrue(expected[0].key == input[0].key);
		assertTrue(expected[1].key == input[1].key);
		assertTrue(expected[2].key == input[2].key);
		assertTrue(expected[3].key == input[3].key);
		
	}		
			
	@SuppressWarnings("static-access")
	@Test
	public void mergeSor_withException() {
		try {
			obj.mergeSort(null);
		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
		
	}		
			
	@SuppressWarnings("static-access")
	@Test
	public void mergeSortwhenOnlyOnceexpected() {
		Item[] input = new Item[]{new Item(43)};
		obj.mergeSort(input);
		assertTrue(43 == input[0].key);	
	}		
				
	@SuppressWarnings("static-access")
	@Test
	public void testquickSort_Unsorted() {
		Item[] input = new Item[] {new Item(55), new Item(41), new Item(12), new Item(9), new Item(2)};
		obj.quickSort(input);
		assertTrue(expected[0].key == input[0].key);
		assertTrue(expected[1].key == input[1].key);
		assertTrue(expected[3].key == input[3].key);
		assertTrue(expected[4].key == input[4].key);
	}			
			
	@SuppressWarnings("static-access")
	@Test
	public void quickSort_Sorted() {
		Item[] input = new Item[]{new Item(2),new Item(9),new Item(12),new Item(41),new Item(55)};
		obj.quickSort(input);
		assertTrue(expected[0].key == input[0].key);
		assertTrue(expected[2].key == input[2].key);
		assertTrue(expected[3].key == input[3].key);
		assertTrue(expected[4].key == input[4].key);
	}		
			
			
	@SuppressWarnings("static-access")
	@Test
	public void quickSort_withException() {
		try {
			obj.quickSort(null);
		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
		
	}
					
	@SuppressWarnings("static-access")
	@Test
	public void quickSort_OneItem() {
		Item[] input = new Item[]{new Item(33)};
		obj.quickSort(input);
		assertTrue(33 == input[0].key);	
	}	
			
	@SuppressWarnings("static-access")
	@Test
	public void testheapSort_Unsorted() {
		Item[] input = new Item[] {new Item(55), new Item(41), new Item(12), new Item(9), new Item(2)};
		obj.heapSort(input);
		assertTrue(expected[0].key == input[0].key);
		assertTrue(expected[2].key == input[2].key);
		assertTrue(expected[3].key == input[3].key);
		assertTrue(expected[4].key == input[4].key);
	}		
			
	@SuppressWarnings("static-access")
	@Test
	public void heapSort_Sorted() {
		Item[] input = new Item[]{new Item(2),new Item(9),new Item(12),new Item(41),new Item(55)};
		obj.heapSort(input);
		assertTrue(expected[0].key == input[0].key);
		assertTrue(expected[1].key == input[1].key);
		assertTrue(expected[2].key == input[2].key);
		assertTrue(expected[3].key == input[3].key);
	}				
			
	@SuppressWarnings("static-access")
	@Test
	public void heapSort_withException() {
		try {
			obj.heapSort(null);
		} catch (NullPointerException e) {
			assertNull(e.getMessage());
		}
		
	}		
				
	@SuppressWarnings("static-access")
	@Test
	public void heapSort_oneItem() {
		Item[] input = new Item[]{new Item(4)};
		obj.heapSort(input);
		assertTrue(4 == input[0].key);
				
	}					
//******************************************************************************************************				

//*************************Node Coverage & Edge Coverage***********************************************************
	
	@SuppressWarnings("static-access")
	@Test
	public void testbubbleSort_Sorted() {
		Item[] input = new Item[]{new Item(2),new Item(9),new Item(12),new Item(41),new Item(55)};
		obj.bubbleSort(input);
		assertTrue(expected[1].key == input[1].key);
		assertTrue(expected[2].key == input[2].key);
		assertTrue(expected[3].key == input[3].key);
		assertTrue(expected[4].key == input[4].key);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testBubbleSort_Unsorted() {
		Item[] input = new Item[] {new Item(55), new Item(41), new Item(12), new Item(9), new Item(2)};
		obj.bubbleSort(input);
		assertTrue(expected[1].key == input[1].key);
		assertTrue(expected[2].key == input[2].key);
		assertTrue(expected[3].key == input[3].key);
		assertTrue(expected[4].key == input[4].key);
	}
	
//***********************************************************************************************************	
		


}



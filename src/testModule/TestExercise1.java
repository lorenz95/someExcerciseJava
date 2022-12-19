package testModule;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.After;
import org.junit.Test;

import moduloEsercizi.ModuloEsercizi;

public class TestExercise1 {

	private List<Integer> arrayProduct = new ArrayList<>();
	private List<Integer> listEvaluate = new ArrayList<>();
	
	@After
	public void operationAfter() {
		arrayProduct.clear();
		listEvaluate.clear();
	}
	
	@Test
	public void testFirst() {
		Collections.addAll(arrayProduct, 1,2,3,4,5);
		
		System.out.println("Initial array is: " + arrayProduct);
		List<Integer> arrayModified = ModuloEsercizi.returnArray(arrayProduct);
		System.out.println("The modified array is: " + arrayModified);
		
		Collections.addAll(listEvaluate, 120, 60, 40, 30, 24);
		arrayModified.equals(listEvaluate);
	}
	
	@Test
	public void testSecond() {
		Collections.addAll(arrayProduct, 3,2,1);
		
		System.out.println("Initial array is: " + arrayProduct);
		List<Integer> arrayModified = ModuloEsercizi.returnArray(arrayProduct);
		System.out.println("The modified array is: " + arrayModified);
		
		Collections.addAll(listEvaluate, 2,3,6);
		arrayModified.equals(listEvaluate);
	}
}

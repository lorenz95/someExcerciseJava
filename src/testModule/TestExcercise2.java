package testModule;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.After;
import org.junit.Test;

import moduloEsercizi.ModuloEsercizi;

public class TestExcercise2 {

	private List<String> arrayStringOne = new ArrayList<>();
	private List<String> arrayStringTwo = new ArrayList<>();
	
	private List<String> setEvaluate = new ArrayList<>();
	
	@After
	public void operationAfter() {
		arrayStringOne.clear();
		arrayStringTwo.clear();
		setEvaluate.clear();
	}
	
	@Test
	public void testFirst() {
		Collections.addAll(arrayStringOne, "Ava","Emma","Olivia");
		Collections.addAll(arrayStringTwo, "Olivia","Sophia","Emma");
		
		System.out.println("Initial array are: " + arrayStringOne + " " + arrayStringTwo);
		List<String> setResult = ModuloEsercizi.uniqueNames(arrayStringOne, arrayStringTwo);
		System.out.println("The result set is: " + setResult);
		
		setEvaluate.add("Ava");
		setEvaluate.add("Emma");
		setEvaluate.add("Olivia");
		setEvaluate.add("Sophia");
		setEvaluate.equals(setResult);
	}
	
	@Test
	public void testSecond() {
		Collections.addAll(arrayStringOne, "Eva","Eva","Liam");
		Collections.addAll(arrayStringTwo, "Olivia","Eva","Emma");
		
		System.out.println("Initial array are: " + arrayStringOne + " " + arrayStringTwo);
		List<String> setResult = ModuloEsercizi.uniqueNames(arrayStringOne, arrayStringTwo);
		System.out.println("The result set is: " + setResult);
		
		setEvaluate.add("Eva");
		setEvaluate.add("Liam");
		setEvaluate.add("Olivia");
		setEvaluate.add("Emma");
		setEvaluate.equals(setResult);
	}
	
	@Test
	public void testThird() {
		Collections.addAll(arrayStringOne, "Eva","Eva","Liam");
		Collections.addAll(arrayStringTwo, "Olivia","Eva","Emma");
		
		System.out.println("Initial array are: " + arrayStringOne + " " + arrayStringTwo);
		List<String> setResult = ModuloEsercizi.uniqueNames(arrayStringOne, arrayStringTwo);
		System.out.println("The result set is: " + setResult);
		
		setEvaluate.add("Liam");
		setEvaluate.add("Eva");
		setEvaluate.add("Olivia");
		setEvaluate.add("Emma");
		setEvaluate.equals(setResult);
	}
}

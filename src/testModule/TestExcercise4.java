package testModule;

import org.junit.Test;

import moduloEsercizi.ModuloEsercizi;

public class TestExcercise4 {
	
	@Test
	public void checkLastCypherOne()  {		
		if (!ModuloEsercizi.checkLastDigit(155, 25)) {
			System.err.println("First Test Not Passed");
		} else {
			System.out.println("First Test Passed");
		}
	}
	
	@Test
	public void checkLastCypherTwo()  {		
		if (ModuloEsercizi.checkLastDigit(134, 30)) {
			System.err.println("Second Test Not Passed");
		} else {
			System.out.println("Second Test Passed");
		}
	}
}

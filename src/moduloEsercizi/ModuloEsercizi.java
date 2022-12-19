package moduloEsercizi;

import java.util.ArrayList;
import java.util.List;

public class ModuloEsercizi {
	
	public static List<Integer> returnArray(final List<Integer> arrayProduct) {
		List<Integer> newArrayProduct = new ArrayList<>();
		int i, j, sizeArray = arrayProduct.size();
		for (i = 0; i < sizeArray; i++) {
			int multiplyer = 1;
			for (j = 0; j < sizeArray; j++) {
				if (i != j) {
					multiplyer *= arrayProduct.get(j);
				}
			}
			newArrayProduct.add(multiplyer);
		}
		return newArrayProduct;
	}
	
	public static List<String> uniqueNames(final List<String> arrayStringOne, final List<String> arrayStringTwo) {
		List<String> hashSetFusion = new ArrayList<>();
		List<String> hashSetResult = new ArrayList<>();
		
		arrayStringOne.stream().distinct().forEach(el -> {
			hashSetFusion.add(el);
		});
		arrayStringTwo.stream().distinct().forEach(el -> {
			hashSetFusion.add(el);
		});
		
		hashSetFusion.stream().distinct().forEach(el -> {
			hashSetResult.add(el);
		});
		
		return hashSetResult;
	}
	
	public static boolean checkLastDigit(double numero1, double numero2) {
		if (numero1 < 0 || numero2 < 0) {
			return false;
		}
		
		int lastCyper1 = (int) numero1 % 10;
		int lastCyper2 = (int) numero2 % 10;
		
		return lastCyper1 == lastCyper2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}

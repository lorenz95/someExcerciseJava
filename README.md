# someExcerciseJava
Some simple exercise in java

Some methods like:
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

Or like:
protected void add(char c) {
		if (Character.isDigit(c)) {
			this.input += c;
		}
	}

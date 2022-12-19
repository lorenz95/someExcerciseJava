package moduloEsercizi;

import java.io.IOException;

public class NumericInput extends TextInput {

	protected void add(char c) {
		if (Character.isDigit(c)) {
			this.input += c;
		}
	}
	
	public static void main(String... args) {
		TextInput textInput = new NumericInput();
		String name = "";
		int charRead = -1;
        
		while (!name.equals("exit")) {
			name = "";
			try {
				charRead = System.in.read();
			} catch (NullPointerException | IOException e) {
			} finally {
				textInput.add((char)charRead);
				name = textInput.getValue();
				System.out.println("name = ".concat(name));
			}
		}
	}
}

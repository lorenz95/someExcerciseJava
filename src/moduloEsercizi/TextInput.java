package moduloEsercizi;

import java.io.IOException;

public class TextInput {
	protected String input;
	
	public TextInput() {
		input = "";
	}
	
	protected void add(char c) {
		if (c != '\r' && c!='\n') {
			input += c;
		}
	}
	
	public String getValue() {
		return input;
	}
	
	public static void main(String... args) {
		TextInput textInput = new TextInput();
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

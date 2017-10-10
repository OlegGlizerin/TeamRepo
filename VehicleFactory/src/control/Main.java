package control;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		Menu menu = new Menu();
		try {
			menu.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

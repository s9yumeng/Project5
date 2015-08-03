package tinycc.implementation;

import tinycc.diagnostic.Diagnostic;
import tinycc.diagnostic.Locatable;

public class Diagnostic2 implements Diagnostic {

	@Override
	public void printError(Locatable location, String fmt, Object... args) {
		// TODO Auto-generated method stub
		System.out.println(location);
	}

	@Override
	public void printNote(Locatable location, String fmt, Object... args) {
		// TODO Auto-generated method stub
		System.out.println(location);
	}
	
}

package mySpringHello.chapter01.knights;

import java.io.PrintStream;

public class SlayDragonQuest implements IQuest {

	private PrintStream printStream;
	
	public SlayDragonQuest(PrintStream printStream) {
		this.printStream = printStream;
	}

	@Override
	public void embark() {
		printStream.println("Embarking on quest to slay the dragon!");	
	}

}

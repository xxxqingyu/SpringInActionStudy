package soundsystem;

import org.springframework.beans.factory.annotation.Value;

public class WhiteDisc implements ICompactDisc {

	public WhiteDisc(@Value("${disc.title}")String title,@Value("${disc.artist}")String artist) {
		// TODO Auto-generated constructor stub
	}

	public void play() {
		// TODO Auto-generated method stub

	}

}

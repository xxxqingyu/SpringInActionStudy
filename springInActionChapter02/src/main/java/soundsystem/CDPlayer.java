package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements IMediaPlayer {

	private ICompactDisc cd;
	
	@Autowired
	public CDPlayer(ICompactDisc cd) {
		this.cd=cd;
	}

	public void play() {
		cd.play();
	}

}

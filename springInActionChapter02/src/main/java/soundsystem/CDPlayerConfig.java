package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
//@ComponentScan(basePackages={"soundsystem"})
public class CDPlayerConfig {

	public CDPlayerConfig() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Bean
	public IMediaPlayer cdPlayer(ICompactDisc compactDisc){
		return new CDPlayer(compactDisc);
	}
}

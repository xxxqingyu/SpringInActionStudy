package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDConfig {

	@Bean
	public ICompactDisc compactDisc(){
		return new SgtPeppers();
	}

}

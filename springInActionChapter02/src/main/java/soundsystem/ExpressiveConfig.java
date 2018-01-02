package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:/soundsystem/app.properties")
public class ExpressiveConfig {

	@Autowired
	Environment env;
	
	public ExpressiveConfig() {
		// TODO Auto-generated constructor stub
	}

	@Bean
	public BlankDisc disc(){
		return new BlankDisc(env.getProperty("disc.title"),env.getProperty("disc.artist"),null);
	}
	
	@Bean
	public static PropertyPlaceholderConfigurer placeholderConfigurer(){
		return new PropertyPlaceholderConfigurer();
	}
}

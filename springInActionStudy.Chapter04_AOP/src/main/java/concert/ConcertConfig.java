package concert;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import soundsystem.CDPlayerConfig;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
@Import({CDPlayerConfig.class})
@ImportResource("classpath:beans.xml")
public class ConcertConfig {

	@Bean
	public Audience audience(){
		return new Audience();
	}
	
	@Bean
	public Performance performance(){
		return new MyPerformance();
	}
}

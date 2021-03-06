package spittr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import spittr.data.MemorySpitterRepository;
import spittr.data.MemorySpittleRepository;
import spittr.data.SpitterRepository;
import spittr.data.SpittleRepository;

@Configuration
//@ComponentScan(basePackages={"spittr"}, excludeFilters={
//		@Filter(type=FilterType.ANNOTATION,value=EnableWebMvc.class)
//})
@ComponentScan(basePackages={"spittr"})
public class RootConfig {
	
	@Bean
	public SpittleRepository spittleRepository() {
		return new MemorySpittleRepository();
	}
	
	@Bean
	public SpitterRepository spitterRepository() {
		return new MemorySpitterRepository();
	}
}

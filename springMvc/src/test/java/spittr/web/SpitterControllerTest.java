package spittr.web;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceView;

import spittr.data.SpitterRepository;
import spittr.data.SpittleRepository;
import spittr.data.model.Spitter;
import spittr.data.model.Spittle;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.mockito.Mockito.*;

import static org.hamcrest.CoreMatchers.*;

public class SpitterControllerTest {

	@Test
	public void shouldShowRegistration() throws Exception {
		SpitterRepository mockRepository=mock(SpitterRepository.class);
		SpitterController controller = new SpitterController(mockRepository);
		MockMvc mockMvc=standaloneSetup(controller).build();
		
		mockMvc.perform(get("/spitter/register"))
			.andExpect(view().name("registerForm"));
	}
	
	public void shouldProcessRegistration() throws Exception {
		SpitterRepository mockRepository=mock(SpitterRepository.class);
		
		Spitter unsaved=new Spitter("jbauer", "24hours", "Jack","Bauer");
		
		Spitter saved=new Spitter(24L, "jbauer", "24hours", "Jack","Bauer");
		
		when(mockRepository.save(unsaved)).thenReturn(saved);
		
		SpitterController controller = new SpitterController(mockRepository);
		
		MockMvc mockMvc= standaloneSetup(controller).build();
		
		mockMvc.perform(post("/spitter/register")
				.param("firstName", "Jack")
				.param("lasstName", "Bauer")
				.param("username", "jbauer")
				.param("password", "24hours")).andExpect(redirectedUrl("/spitter/jbauer"));
		
		verify(mockRepository,atLeastOnce()).save(unsaved);
	}
}

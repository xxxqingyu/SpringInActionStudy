package spittr.web;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceView;

import spittr.data.SpittleRepository;
import spittr.data.model.Spittle;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.hamcrest.CoreMatchers.*;

public class HomeControllerTest {
	@Test
	public void testHomePage() throws Exception {

		List<Spittle> expectedSpittles = createSpittleList(20);
		SpittleRepository mockRepository = mock(SpittleRepository.class);
		
		when(mockRepository.findSpittles(Long.MAX_VALUE, 20)).thenReturn(expectedSpittles);
		
		HomeController controller = new HomeController(mockRepository);
		MockMvc mockMvc=standaloneSetup(controller).setSingleView(new InternalResourceView( "/WEB-INFO/views/spittles.jsp"))
				.build();
		
		mockMvc.perform(get("/spittles"))
			.andExpect(view().name("spittles"))
			.andExpect(model().attributeExists("spittleList"))
			.andExpect(model().attribute("spittleList", hasItems(expectedSpittles.toArray())));
	}
	
	
	public void testPagedHomePage() throws Exception {

		List<Spittle> expectedSpittles = createSpittleList(20);
		SpittleRepository mockRepository = mock(SpittleRepository.class);
		
		when(mockRepository.findSpittles(238900, 20)).thenReturn(expectedSpittles);
		
		HomeController controller = new HomeController(mockRepository);
		MockMvc mockMvc=standaloneSetup(controller).setSingleView(new InternalResourceView( "/WEB-INFO/views/spittles.jsp"))
				.build();
		
		mockMvc.perform(get("/spittles?max=238900&count=50"))
			.andExpect(view().name("spittles"))
			.andExpect(model().attributeExists("spittleList"))
			.andExpect(model().attribute("spittleList", hasItems(expectedSpittles.toArray())));
	}

	
	private  List<Spittle> createSpittleList(int count){
		List<Spittle> spittles = new ArrayList<Spittle>();
		for (int i = 0; i < count; i++) {
			spittles.add(new Spittle(i,"Spittle "+i, new Date()));
		}
		return spittles;
	}
}

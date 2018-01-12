package spittr.web;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import spittr.data.SpittleRepository;

@Controller
@RequestMapping("/spittles")
public class HomeController {

	private SpittleRepository spittleRepository;
	
	@Autowired
	public HomeController(SpittleRepository spittleRepository) {
		this.spittleRepository=spittleRepository;
	}
	
	@RequestMapping(method=GET)
	public String spittles(Model model) {
		model.addAttribute(spittleRepository.findSpittles(Long.MAX_VALUE, 20));
		return "spittles";
	}
}

package spittr.web;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import spittr.data.SpittleRepository;

@Controller
@RequestMapping("/spittles")
public class HomeController {
	private static final String MAX_LONG_AS_STRING= "9223372036854775807";

	private SpittleRepository spittleRepository;
	
	@Autowired
	public HomeController(SpittleRepository spittleRepository) {
		this.spittleRepository=spittleRepository;
	}
	
	@RequestMapping(method=GET)
	public String spittles(@RequestParam(value="max",defaultValue=MAX_LONG_AS_STRING)long max,
			@RequestParam(value="count",defaultValue="20")int count, Model model) {
		model.addAttribute("spittleList",spittleRepository.findSpittles(Long.MAX_VALUE, 20));
		return "spittles";
	}
	
	@RequestMapping(value="/{spittleId}",method=RequestMethod.GET)
	public String spittle(@PathVariable("spittleId")long spittleId, Model model) {
		model.addAttribute(spittleRepository.findOne(spittleId));
		return "spittle";
	}
	
}

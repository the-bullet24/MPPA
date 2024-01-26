package pe.bn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ControllerJS {

	
	@RequestMapping("/")
	public String showIndex(ModelMap model) {
		return "index";
	}
	@RequestMapping("/casa")
	public String showIndexs(Model model) {
		return "template/casa";
	}
	
}

package javaot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static javaot.common.Application.*;

@Controller
public class HomePageController {
	@RequestMapping("/home")
	public String showHomePage() {
		// default point to webapp
		return HOME_PAGE;
	}
}
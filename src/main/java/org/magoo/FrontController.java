package org.magoo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class FrontController {
	
	@RequestMapping(value="/magoo", method=RequestMethod.GET)
	public String showFrontPage()
	{
		return "frontPage";
	}
	
	@RequestMapping(value="/view", method=RequestMethod.POST)
	public String showMyWork()
	{
		return "viewWork";
	}

	@RequestMapping(value="/projects")
	public String showProjects()
	{
		return "projects";
	}
	
	
	@RequestMapping(value="/aboutinfo")
	public String showAboutMeInfo()
	{
		return "aboutinfo";
	}
}

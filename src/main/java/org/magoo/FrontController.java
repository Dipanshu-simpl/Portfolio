package org.magoo;

import javax.validation.Valid;

import org.magoo.dao.contactInsert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class FrontController {
	
	
	@Autowired
	private FrontService frontService;
	
	@Autowired
	private contactInsert contIns;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
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
	
	@RequestMapping(value="/contact" , method=RequestMethod.GET)
	public String showContactMePage(ModelMap model)
	{
		Contact contact=new Contact();
		model.addAttribute("contact",contact);
		return "contact";
	}
	
	@RequestMapping(value="/contact" , method=RequestMethod.POST)
	public String submitContactMePage(@Valid Contact contact,ModelMap model, BindingResult result)
	{
		if(result.hasErrors())
		{
			return "thanks";
		}
		model.addAttribute("name",contact.getName());
		frontService.sendEmail();
		contIns.insertUser(contact);
		System.out.println(contact.getName());
		return "thanks";
	}
}

package com.mvcSpring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvcSpring.beans.Medicine;
import com.mvcSpring.dao.ListDao;

@Controller
public class ListController {

	@Autowired
	ListDao dao;

	@RequestMapping(value = "/sample", method = RequestMethod.GET)
	@ResponseBody
	public String sample() {
		return "rahul";

	}
	@RequestMapping(value = "/reported", method = RequestMethod.GET)
	public String showReprtedPage() {
		return "reported";
	}

	
	 @RequestMapping(value = "/logout", method = RequestMethod.GET) public String
	  logout() { return "login"; }
	 
	
	
	  @RequestMapping("/listform") public String showform(Model m) {
	m.addAttribute("command", new Medicine()); return "listform"; }
	 
	  
	 
	 // model object. You need to mention RequestMethod.POST method because default
	 // request is GET
	  
	  @RequestMapping(value = "/save", method = RequestMethod.POST) public String
	  save(@ModelAttribute("menulist") Medicine menulist) { dao.save(menulist);
	  return "redirect:/viewlist";// will redirect to viewemp request mapping }
	  }

	/* It provides list of employees in model object */
	@RequestMapping("/viewlist")
	public String viewlist(Model m) {
		List<Medicine> list = dao.getList();
		m.addAttribute("list", list);
		return "viewlist";
	}

	
	 @RequestMapping("/cviewlist") public String cviewlist(Model m) {
	  List<Medicine> list = dao.getList1(); m.addAttribute("list", list); return
	  "cviewlist"; }
	 
	
	 

	
	 @RequestMapping(value = "/editlist/{medId}") public String edit(@PathVariable
	  int medId, Model m) { Medicine menulist = dao.getMedById(medId);
	  m.addAttribute("command", menulist); return "listeditform";
	  
	 }
	
	 
	  @RequestMapping(value="/mvcSpring/editsave/{medId}",method = RequestMethod.POST)
	  public String editsave(@ModelAttribute("menulist") Medicine menulist){
	  dao.update(menulist); return "redirect:/viewlist"; }
	 

}

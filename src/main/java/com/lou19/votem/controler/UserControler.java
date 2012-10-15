
package com.lou19.votem.controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.lou19.util.ContextUtils;
import com.lou19.votem.model.User;
import com.lou19.votem.service.UserService;

@Controller
@RequestMapping("/user")
public class UserControler {
	@Autowired
	private UserService userService;

	@RequestMapping("/hello")
	public void single(HttpServletRequest request,
			HttpServletResponse response)
			throws IOException {
		PrintWriter writer = response.getWriter();
		writer.write(userService.single("hello world").getId());
		System.out.println(ContextUtils.getContext().getBean("freemarkerConfig"));
		writer.flush();
		writer.close();
	}
	@RequestMapping("/welcome/{name}")
	public ModelAndView welcom(@PathVariable String name,Model model){
		model.addAttribute("userName", name);
		ModelAndView mav=new ModelAndView("hellox",model.asMap());
		return mav;
	}
	@RequestMapping("/save")
	@ResponseBody
	public  User save(@RequestBody User user){
		System.out.println(user.getId());
		return user;
	}
	@RequestMapping(value="/json/{id}",method=RequestMethod.GET)
	@ResponseBody
	public  User jsonUser(@PathVariable String id){
		return new User(id);
	}
}
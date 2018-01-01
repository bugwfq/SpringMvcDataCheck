package cn.et.fuqiang.HibernateDataCheck.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.et.fuqiang.HibernateDataCheck.entity.User;
import cn.et.fuqiang.HibernateDataCheck.service.UserManager;

@Controller
@RequestMapping(value="/user")
public class UserController {
	private UserManager userManager;
	@RequestMapping(method=RequestMethod.POST)
	public String addUser(@Valid User user,BindingResult errors){
		if(errors.hasErrors()){
			if(user.getBirthday()==null){
				errors.addError(new FieldError(null,"birthday", "²»ÄÜÎª¿Õ"));
			}
			return "/restful/register.jsp";
		}
		userManager.addUser(user);
		return "restful/fault.jsp";
	}
	@RequestMapping(method=RequestMethod.PUT)
	public String updateUser(@Valid User user){
		userManager.update(user);
		return "/restful/register.jsp";
	}
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public String deleteUser(@PathVariable String id){
		return null;
	}
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public String findUser(@PathVariable String name){
		return null;
	}

}

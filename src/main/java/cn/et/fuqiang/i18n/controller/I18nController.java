package cn.et.fuqiang.i18n.controller;

import java.io.OutputStream;
import java.util.Locale;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.et.fuqiang.i18n.entity.User;
import cn.et.fuqiang.i18n.service.UserManager;

@Controller
@RequestMapping(value="/i18n")
public class I18nController {
	private UserManager userManager;
	/**
	 * 设置了中转站选择语言的时候存入session中
	 * @param name
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET)
	public String list(){
		return "/i18n/register.jsp";
	}
	
	/**
	 * 后台获取国际化要使用的类
	 */
	@Autowired
	MessageSource ms;
	
	@RequestMapping(method=RequestMethod.POST)
	public String addUser(@Valid User user,BindingResult errors,Locale locale){
		if(errors.hasErrors()){
			//后台数据校验时可能会返回错误信息
			if(user.getBirthday()==null){
				//使用MessageSource 中的getMessage方法获取国际化文件的值
				String birthdayNull = ms.getMessage("birthdayNull", null, locale);
				errors.addError(new FieldError("user","birthday", birthdayNull));
			}
			return "/i18n/register.jsp";
		}
		userManager.addUser(user);
		return "/i18n/fault.jsp";
	}
	@RequestMapping(method=RequestMethod.PUT)
	public String updateUser(@Valid User user){
		userManager.update(user);
		return "/i18n/register.jsp";
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

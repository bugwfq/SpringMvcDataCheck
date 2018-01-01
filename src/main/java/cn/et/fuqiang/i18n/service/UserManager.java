package cn.et.fuqiang.i18n.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import cn.et.fuqiang.i18n.entity.User;

public class UserManager {
	private Map<String,User> list = new HashMap<String,User>();
	
	public void addUser(User user){
		int index = list.size()+1;
		user.setUid(index+"");
		list.put(user.getUid(),user);
	}
	public void update(User user){
		User ord = getUserById(user.getUid());
		if(ord==null){
			return;
		}
		ord = user;
		
	}
	public User getUserById(String id){
		User user =list.get(id);
		return user;
	}
	public void deleteUser(String id){
		list.remove(id);
	}
	public User getUserByName(String name){
		Set<String> key = list.keySet();
		

		for(Iterator<String> iter  =  key.iterator();iter.hasNext();){
			String uid = iter.next();
			User user = list.get(uid);
			if(name.equals(user.getName())){
				return user;
			}
		}
		return null;
	}
}

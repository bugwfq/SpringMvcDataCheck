package cn.et.fuqiang.HibernateDataCheck.entity;

import java.util.Date;


import javax.validation.constraints.Past;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.URL;
import org.springframework.format.annotation.DateTimeFormat;

public class User {
	
	private String uid;//�û�id
	@NotEmpty(message="��������Ϊ��")
	private String name;//�û�����
	@NotEmpty(message="���䲻��Ϊ��")
	@Range(min=10,max=120,message="���䲻��С��ʮ�����120��")
	private String age;//�û�����
	@NotEmpty(message="���벻��Ϊ��")
	private String password;//�û�����
	@NotEmpty(message="���벻��Ϊ��")
	private String confirmPassword;//ȷ������
	@DateTimeFormat(pattern="yyyy-MM-dd ")
	@Past(message="��������ȷ��������")
	private Date birthday;//��������
	/**
	 * @Pattern(regexp="\\w{6,}@\\w+\\.\\w+")
	 */
	@Email
	private String email;//�����ַ
	/**
	 * @Pattern(regexp="^http[s]?:[w]{3}\\.\\w+\\.\\w+")
	 */
	@URL
	private String url;//������ַ
	@Size(min=11,max=11,message="��������ȷ�ĵ绰����")
	private String phone;//�绰����
	public User() {}
	public User(String uid, String name, String age, String password, String confirmPassword, Date birthday, String email,
			String url, String phone) {
		this.uid = uid;
		this.name = name;
		this.age = age;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.birthday = birthday;
		this.email = email;
		this.url = url;
		this.phone = phone;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}

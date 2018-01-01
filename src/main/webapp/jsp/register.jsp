<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function postUser(){
		
		/*js验证*/
		
		document.forms[0].submit();
	}

</script>
<body>

	<form action="${pageContext.request.contextPath}/user" method="post">
		姓名 ：<input type="text" name="name"/><form:errors path="user.name"></form:errors><br/>
		年龄：<input type="text" name="age"/><form:errors path="user.age"></form:errors><br/>
		密码：<input type="text" name="password"/><form:errors path="user.password"></form:errors><br/>
		确认密码<input type="text" name="confirmPassword"/><form:errors path="user.confirmPassword"></form:errors><br/>
		生日：<input type="text" name="birthday"/><form:errors path="user.birthday"></form:errors><br/>
		邮箱：<input type="text" name="email"/><form:errors path="user.email"></form:errors><br/>
		个人网址：<input type="text" name="url"/><form:errors path="user.url"></form:errors><br/>
		电话：<input type="text" name="phone"/><form:errors path="user.phone"></form:errors><br/>
		
		<input type="button" value="提交" onclick="postUser()">
	</form>
</body>
</html>
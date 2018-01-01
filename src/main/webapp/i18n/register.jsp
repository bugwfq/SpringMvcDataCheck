<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
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
	 <a href="${pageContext.request.contextPath}/i18n?lang=zh_CN">中文</a> <a href="${pageContext.request.contextPath}/i18n?lang=en_US">English</a>
	<form action="${pageContext.request.contextPath}/i18n" method="post">
		<s:message code="name"></s:message>：<input type="text" name="name"/><form:errors path="user.name"></form:errors><br/>
		<s:message code="age"></s:message>：<input type="text" name="age"/><form:errors path="user.age"></form:errors><br/>
		<s:message code="password"></s:message>：<input type="text" name="password"/><form:errors path="user.password"></form:errors><br/>
		<s:message code="confirmPassword"></s:message>:<input type="text" name="confirmPassword"/><form:errors path="user.confirmPassword"></form:errors><br/>
		<s:message code="brithday"></s:message>：<input type="text" name="birthday"/><form:errors path="user.birthday"></form:errors><br/>
		<s:message code="email"></s:message>：<input type="text" name="email"/><form:errors path="user.email"></form:errors><br/>
		<s:message code="url"></s:message>：<input type="text" name="url"/><form:errors path="user.url"></form:errors><br/>
		<s:message code="phone"></s:message>：<input type="text" name="phone"/><form:errors path="user.phone"></form:errors><br/>
		
		<input type="button" value="提交" onclick="postUser()">
	</form>
</body>
</html>
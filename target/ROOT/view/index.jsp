<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>
</head>
<body>
	这是首页，如果想跳转到个人主页请点击下方按钮！
	<form action="#" onsubmit="${pageContext.request.contextPath}/hello">
		个人名：<input type="text" name="name"> <input type="submit"
			value="跳转">
	</form>

</body>
</html>
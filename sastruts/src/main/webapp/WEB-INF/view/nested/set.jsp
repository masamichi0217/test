<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<html:errors/>
<s:form method="POST">
ユーザ名<html:text property = "user.name" /><br>
パスワード<html:text property = "user.password" /><br>

<s:submit property="output" value="表示するだけ"/>
</s:form>

</body>
</html>
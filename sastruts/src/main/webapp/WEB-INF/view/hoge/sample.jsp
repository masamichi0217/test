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
配列のやつのためし
<html:select property = "products" multiple="true">
<html:option value ="S2Container" />
<html:option value ="SAstruts" />
<html:option value ="S2JDBC" />
</html:select>

<s:submit property="send" value="送信"/>
</s:form>

</body>
</html>
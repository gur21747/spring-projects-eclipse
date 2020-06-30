<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
This is the JSP
	<%
		String message[] = (String []) request.getAttribute("myWelcomeMessage");
		String welcomeMessage = "";
		for(String msg : message){
			welcomeMessage += msg += "";
		}
		out.print(welcomeMessage);
	
	%>
</body>
</html> 
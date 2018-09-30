<%@ page import="by.stepovoy.util.PropertyReader" %>
<%PropertyReader propertyReader = PropertyReader.getInstance();%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
Author of project :<%= propertyReader.getProperty("groupId")%>
</body>
</html>

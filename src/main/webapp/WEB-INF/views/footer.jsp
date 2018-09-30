<%@ page import="by.stepovoy.util.PropertyReader" %>
<%PropertyReader propertyReader = PropertyReader.getInstance();%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
version :<%=propertyReader.getProperty("version")%><br>
build time :<%= propertyReader.getProperty("build")%><br>
</body>
</html>

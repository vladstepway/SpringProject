<%@ page import="by.stepovoy.util.PropertyReader" %>
<%PropertyReader propertyReader = PropertyReader.getInstance();%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Home</title>
</head>
<body>
<header>
    Author of project :<%= propertyReader.getProperty("groupId")%>
</header>
<p><b>Enter birthday:</b></p>
<form method="post" action="/result">
    Birthday: <input type="text" name="birthday"><br>
    <input type="submit" value="Result">
</form>
<br>
<footer>
    version :<%=propertyReader.getProperty("version")%><br>
    build time :<%= propertyReader.getProperty("build")%><br>
</footer>
</body>
</html>
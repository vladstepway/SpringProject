<%@ page import="by.stepovoy.util.PropertyReader" %>
<%PropertyReader propertyReader = PropertyReader.getInstance();%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Birthday</title>
</head>
<body>
<header>
    <jsp:include page="WEB-INF/views/header.jsp"/>

</header>
<p><b>Enter birthday:</b></p>
<form method="post" action="/result">
    Birthday: <input type="text" name="birthday"><br>
    <input type="submit" value="Result">
</form>

<footer>
    <jsp:include page="WEB-INF/views/footer.jsp"/>

</footer>
</body>
</html>

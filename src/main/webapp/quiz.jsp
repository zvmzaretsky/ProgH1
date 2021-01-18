<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/result.jsp">
    <p>
        <b>Question 1</b>
    </p>
    <p>
        <input name="q1" type="radio" value="0">
        No
    </p>
    <p>
        <input name="q1" type="radio" value="1">
        Yes
    </p>
    <p>
        <b>Question 2</b>
    </p>
    <p>
        <input name="q2" type="radio" value="0">
        No
    </p>
    <p>
        <input name="q2" type="radio" value="1">
        Yes
    </p>
    <p>
        <input type="submit" value="Submit">
    </p>
</form>
</body>
</html>

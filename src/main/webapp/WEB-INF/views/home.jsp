<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>ToDo list</title>
</head>
<body>
    <h1>ToDo tasks</h1>

    <ul>
        <c:forEach var="task" items="${taskList}">
            <li>${task}</li>
        </c:forEach>
    </ul>
</body>
</html>

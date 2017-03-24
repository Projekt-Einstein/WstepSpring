<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>All tasks</title>
</head>
<body>

    <form:form action="saveTasks" >
        <ul>
            <c:forEach var="task" items="${taskList}">
                <li>${task}</li>
            </c:forEach>
        </ul>
    </form:form>


</body>
</html>

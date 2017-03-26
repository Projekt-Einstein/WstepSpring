<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>All tasks</title>
</head>
<body>

    <c:if test="${not empty param.saved}">
        <h3 style="color: cornflowerblue">Saved successfully! :)</h3>
    </c:if>

    <form:form action="saveTasks" modelAttribute="taskListWrapper">
        <ul>
            <c:forEach var="task" items="${taskListWrapper.taskList}" varStatus="i">
                <li>
                    <form:checkbox path="taskList[${i.index}].finished" />
                    <form:input path="taskList[${i.index}].description"/>
                </li>
            </c:forEach>
        </ul>

        <a href="home">home</a> <button type="submit">Save changes</button>
    </form:form>


</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add new task</title>
</head>
<body>
    <h1>Add new ToDo task</h1>

    <form:form action="new" method="post" modelAttribute="task">
        <label for="desc">Description</label>
        <form:input path="description" id="desc" type="text" />

        <br>
        <a href="home">home</a><button type="submit">Save</button>
    </form:form>
</body>
</html>

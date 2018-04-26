<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Students From Database</title>
</head>
<body>
<table>
    <tr>
        <th>ID</th>
        <th>Username</th>
    </tr>
    <c:forEach items="${students}" var="student" varStatus="status">
        <tr>
            <td>${student.studentId}</td>
            <td>${student.userName}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

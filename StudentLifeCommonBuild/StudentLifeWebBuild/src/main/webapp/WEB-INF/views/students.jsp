<%--
  Created by IntelliJ IDEA.
  User: final
  Date: 4/21/2018
  Time: 7:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Students From Database</title>
</head>
<body>
<table>
    <tr>
        <th>ID</th>
        <th>Email</th>
    </tr>
    <c:forEach items="${students}" var="student" varStatus="status">
        <tr>
            <td>${student.studentId}</td>
            <td>${student.email}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

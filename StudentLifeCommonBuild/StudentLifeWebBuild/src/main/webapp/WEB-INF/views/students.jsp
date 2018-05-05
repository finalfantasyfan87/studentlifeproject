<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="common/header.jsp" />
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
<jsp:include page="common/footer.jsp" />
</body>
</html>
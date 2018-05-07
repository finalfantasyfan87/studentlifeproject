
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="common/header.jsp" />
<body>
<table class="table table-striped">
    <tr>
    <th scope="col">ID</th>
        <th scope="col">Username</th>
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
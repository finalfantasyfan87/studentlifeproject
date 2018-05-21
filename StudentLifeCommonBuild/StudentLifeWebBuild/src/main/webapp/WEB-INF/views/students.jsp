
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="common/header.jsp" />
<body>
<table id ="students" class="table table-striped table-bordered" style="width:50%">
    <tr>
    <th scope="col">ID</th>
        <th scope="col">Username</th>

    </tr>
    <c:forEach items="${students}" var="student" varStatus="status">
        <tr>
            <td>${student.studentId}</td>
            <td>${student.userName}</td>
            <span class="glyphicon glyphicon-envelope"></span>
        </tr>
    </c:forEach>
</table>
<jsp:include page="common/footer.jsp" />
</body>
</html>
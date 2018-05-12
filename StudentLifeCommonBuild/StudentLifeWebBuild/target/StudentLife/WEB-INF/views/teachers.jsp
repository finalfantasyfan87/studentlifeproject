<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="common/header.jsp" />
<body>
<table class="table table-striped">
    <tr>
        <th scope="col">First Name</th>
        <th scope = "col">Middle Name</th>
        <th scope="col">Last Name</th>
        <th scope = "col">Department</th>
    </tr>
    <c:forEach items="${teachers}" var="teacher" varStatus="status">
        <tr>
            <td>${teacher.firstName}</td>
            <td>${teacher.middleName}</td>
            <td>${teacher.lastName}</td>
            <td>${teacher.department}</td>
        </tr>
    </c:forEach>
</table>

<jsp:include page="common/footer.jsp" />
</body>
</html>

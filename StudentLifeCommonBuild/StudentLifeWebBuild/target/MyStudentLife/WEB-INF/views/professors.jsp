<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="common/header.jsp" />
<body>
<h2 class="form-signin-heading" align="center">Professors</h2>
<table id ="professors" class="table table-striped table-bordered" style="width:50%">
    <thead>
    <tr>
        <th scope = "col">Professor</th>
        <th scope = "col">Department</th>
        <th scope = "col">Professor's Profile</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${professors}" var="professor" varStatus="status">
        <tr>
            <td>${professor.name}</td>
            <td>${professor.department.name}</td>
            <td><a href="<c:url value="/rateTeacher?professorId=${professor.professorId}"/>"><i class="fas fa-user"></i></a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>


</body>
<jsp:include page="common/footer.jsp" />
</html>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="common/header.jsp" />
<body>
<h2 class="form-signin-heading"align="center">Students</h2>
<table id ="students" class="table table-striped table-bordered" style="width:50%">
  <thead>
    <tr>
    <th scope="col">ID</th>
        <th scope="col">Username</th>
        <th scope="col">Email</th>

    </tr>
  </thead>
    <tbody>
    <c:forEach items="${students}" var="student" varStatus="status">
        <tr>
            <td>${student.studentId}</td>
            <td>${student.userName}</td>
            <td><i class="far fa-envelope" > </i></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
<jsp:include page="common/footer.jsp" />
</html>
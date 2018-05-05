<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="common/header.jsp" />
<body>
<div class="container">
    <form:form action = "registerUser" method="post" modelAttribute="student" class="form-signin">
        <h2 class="form-signin-heading">Register For StudentLife</h2>
        <div class="form-group">
            <form:input type="email" path="email" class="form-control" placeholder="email"
                        autofocus="true"></form:input>
            <form:errors path="email"></form:errors>
        </div>
        <div class="form-group">
            <form:input type="userName" path="userName" class="form-control" placeholder="userName"
                        autofocus="true"></form:input>
            <form:errors path="userName"></form:errors>
        </div>
        <div class= "form-group">
            <form:input type="password" path="password" class="form-control" placeholder="password"></form:input>
            <form:errors path="password"></form:errors>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
    </form:form>
</div>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<jsp:include page="common/footer.jsp" />
</body>
</html>
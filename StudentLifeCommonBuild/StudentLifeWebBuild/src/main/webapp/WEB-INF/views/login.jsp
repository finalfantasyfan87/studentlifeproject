<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="common/header.jsp" />
<div class="container">
    <form:form action = "registerUser" method="post" modelAttribute="student" class="form-signin">
        <h2 class="form-signin-heading">Register For StudentLife</h2>
        <div class="form-group row">
            <form:input type="userName" path="userName" class="col-sm-4" placeholder="userName"
                        autofocus="true"></form:input>
            <form:errors path="userName"></form:errors>
        </div>
        <div class= "form-group row">
            <form:input type="password" path="password" class="col-sm-4" placeholder="password"></form:input>
            <form:errors path="password"></form:errors>
        </div>
    <div class= "form-group row">
        <button class="btn btn-lg btn-primary" type="submit">Submit</button>
    </div>
        </form:form>
</div>
<jsp:include page="common/footer.jsp" />
</body>
</html>

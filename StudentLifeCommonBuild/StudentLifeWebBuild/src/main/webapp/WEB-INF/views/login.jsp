<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="common/header.jsp" />
<div class="container">
    <tablerow></tablerow>
    <form:form action = "registerUser" method="post" modelAttribute="student" class="form-signin">
        <h2 class="form-signin-heading">Register For StudentLife</h2>
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
<jsp:include page="common/footer.jsp" />
</body>
</html>

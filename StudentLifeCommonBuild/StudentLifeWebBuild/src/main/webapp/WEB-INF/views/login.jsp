<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="common/header.jsp" />
<div class="container">
    <form:form action = "loginStudent" method="post" modelAttribute="student" class="form-signin">
        <h2 class="form-signin-heading">Login to MyStudentLife</h2>
        <div class="form-group row">
            <label for="userName" class="col-sm-2 col-form-label">Username</label>
            <form:input type="userName" path="userName" class="col-sm-4" placeholder="username"
                        autofocus="true"></form:input>
            <form:errors path="userName" element = "div" class="has-error"></form:errors>
        </div>
        <div class= "form-group row">
            <label for="password" class="col-sm-2 col-form-label">Password</label>
            <form:input type="password" path="password" class="col-sm-4" placeholder="password"></form:input>
            <form:errors path="password" element = "div" cssClass="error"></form:errors>
        </div>
    <span class= "button">
        <button class="btn btn-lg btn-primary" type="submit">Submit</button>
    </span>
        </form:form>
</div>
<jsp:include page="common/footer.jsp" />
</body>
</html>

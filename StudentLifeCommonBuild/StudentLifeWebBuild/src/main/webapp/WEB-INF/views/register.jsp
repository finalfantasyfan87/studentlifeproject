<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="common/vanillaHeader.jsp"/>

<body>
<br>
<br>
<div class="container">
    <form:form action = "registerUser" method="post" modelAttribute="student" class="form-signin">
        <h2 class="form-signin-heading">Register For MyStudentLife</h2>
        <div class="form-group row">

            <label for="email" class="col-sm-2 col-form-label">Email</label>
            <form:input type="email" path="email" class="col-sm-4" placeholder="email"
                        autofocus="true"></form:input>
            <form:errors path="email" element = "div" cssClass="error"></form:errors>
        </div>
        <div class="form-group row">
            <label for="userName" class="col-sm-2 col-form-label">UserName</label>
            <form:input type="text" path="userName" class="col-sm-4" placeholder="username"
                        autofocus="true"></form:input>
            <form:errors path="userName" element = "div" cssClass="error"></form:errors>
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
    <span>${genericError}</span>
</div>

</body>
<jsp:include page="common/footer.jsp" />
</html>
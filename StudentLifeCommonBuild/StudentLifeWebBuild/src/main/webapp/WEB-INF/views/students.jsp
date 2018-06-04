<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="common/header.jsp" />
<input type = "hidden" id = "userName" value = "${student.userName}"/>
<p>Welcome, ${student.userName}</p>

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
            <td><i class="far fa-envelope" id = "messageStudent"> </i></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<table id ="messages" class="table table-striped table-bordered" style="width:50%">
    <thead>
    <tr>
        <th scope="col">MessageId</th>
        <th scope="col">Recipient</th>
        <th scope="col">Message</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach items="${messages}" var="message" varStatus="status">
        <tr>
            <td>${message.messageId}</td>
            <td>${message.messageRecipient}</td>
            <td>${message.message}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>



<jsp:include page="sendMessageForm.jsp"/>

<jsp:include page="common/footer.jsp" />

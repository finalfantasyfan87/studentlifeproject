<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="common/header.jsp"/>
<input type="hidden" value="rateTeacherPage"/>

<input type="hidden" value="${profiledProfessor.professorId}" id="professorId">

<article>
    <h2 class="form-signin-heading" align="center">Feedback for Professor: ${profiledProfessor.name}</h2>
    <table>
        <thead>
        <tr>
            <th scope="col">Course No.</th>
            <th scope="col">Course Title</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${profiledProfessor.courseList}" var="course" varStatus="status">
            <tr>
                <td>${course.courseNo}</td>
                <td>${course.title}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <br>
    <div class="row">
        <div class="center col-sm-6 col-md-6">
            <form:form method="POST" action="saveComment" modelAttribute="professorComment">
                <form:textarea rows="4" cols="50" id="commentFeedBack" path="comment"></form:textarea>

                <br/>

                <button type="submit" class="btn btn-lg btn-primary" id="submitCommentButton"> Submit Feedback</button>
            </form:form>
        </div>
    </div>

    <hr>

    <h2 class="form-signin-heading" align="center">Teacher Comments</h2>
    <table id="professorComments" class="table table-striped table-bordered" style="width:50%">
        <thead>
        <tr>

            <th scope="col">Comments</th>

        </tr>
        </thead>
        <tbody>
        <c:forEach items="${professorComments}" var="professorComment" varStatus="status">
            <tr>
                <td>${professorComment.comment}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <p class="text-right">
        <a href="/displayTeachers" class="text-right">
            Back To List of Professors
        </a>
    </p>

    <hr>
</article>

<jsp:include page="common/footer.jsp"/>


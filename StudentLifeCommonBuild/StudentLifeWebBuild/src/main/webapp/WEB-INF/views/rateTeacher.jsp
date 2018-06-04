<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="common/header.jsp"/>
<input type = "hidden" value = "rateTeacherPage"/>
<body>

<article>
    <h2><a href="singlepost.html" align="center">Feedback for Professor, ${profiledProfessor.name}</a></h2>
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
        <div class="group1 col-sm-6 col-md-6">
            <i class="far fa-envelope"></i> <a href="#">Send Message</a>
        </div>
    </div>

    <hr>
    <textarea rows="4" cols="50" id = "comment"></textarea>

    <br/>

    <p class="lead"> </p>

    <p></p>

    <p class="text-right">
        <a href="/studentLife/displayTeachers" class="text-right">
            Back To List of Professors
        </a>
    </p>

    <hr>
</article>

</body>
<jsp:include page="common/footer.jsp"/>
</html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="common/header.jsp"/>
<input type = "hidden" value = "rateTeacherPage"/>
<body>

<article>
    <h2><a href="singlepost.html" align="center">Rating for Professor, ${profiledProfessor.name}</a></h2>
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

    <div class="row">
        <div class="group1 col-sm-6 col-md-6">
            <span class="glyphicon glyphicon-folder-open"></span> <a href="#">Rate</a>
            <span class="glyphicon glyphicon-bookmark"></span> <a href="#">Message</a>
        </div>
        <div class="group2 col-sm-6 col-md-6">
            <span class="glyphicon glyphicon-pencil"></span> <a href="singlepost.html#comments">20 Comments</a>
            <span class="glyphicon glyphicon-time"></span> May 16, 2018 9:00 PM
        </div>
    </div>

    <hr>
    <textarea rows="4" cols="50">
</textarea>

    <br/>

    <p class="lead"> </p>

    <p></p>

    <p class="text-right">
        <a href="singlepost.html" class="text-right">
            continue reading...
        </a>
    </p>

    <hr>
</article>

</body>
<jsp:include page="common/footer.jsp"/>
</html>

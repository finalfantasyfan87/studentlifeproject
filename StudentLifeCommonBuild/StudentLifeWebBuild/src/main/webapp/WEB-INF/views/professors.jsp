<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="common/header.jsp" />
<body>

<table id = "professors" class="table table-striped table-bordered" style="width:50%">
    <tr>
        <th scope = "col">Professor</th>
    </tr>
    <c:forEach items="${professors}" var="professor" varStatus="status">
        <tr>
            <td>${professor.name}</td>
        </tr>
    </c:forEach>
</table>

<jsp:include page="common/footer.jsp" />
</body>
</html>

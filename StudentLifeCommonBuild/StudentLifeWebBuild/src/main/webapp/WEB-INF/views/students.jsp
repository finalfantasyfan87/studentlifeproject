
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="common/header.jsp" />
<body>
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


<!-- Modal -->
<div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">

        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header" style="padding:35px 50px;">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4><span class="glyphicon glyphicon-lock"></span> Login</h4>
            </div>
            <div class="modal-body" style="padding:40px 50px;">
                <form role="form">
                    <div class="form-group">
                        <label for="usrname"><span class="glyphicon glyphicon-user"></span> Username</label>
                        <input type="text" class="form-control" id="usrname" placeholder="Enter UserName">
                    </div>
                    <div class="form-group">
                        <label for="message"><span class="glyphicon glyphicon-eye-open"></span> Message</label>
                        <textarea type="text" class="form-control" id="message" rows="6"></textarea>
                    </div>
                    <div class="checkbox">
                        <label><input type="checkbox" value="" checked>Remember me</label>
                    </div>
                    <button type="submit" class="btn btn-success btn-block"><span class="glyphicon glyphicon-off"></span> Login</button>
                </form>
            </div>
            <div class="modal-footer">
                <button type="submit" class="btn btn-danger btn-default pull-left" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> Cancel</button>
                <p>Not a member? <a href="#">Sign Up</a></p>
                <p>Forgot <a href="#">Password?</a></p>
            </div>
        </div>
    </div>
</div>
</body>
<jsp:include page="common/footer.jsp" />
</html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!-- Modal -->
<div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">

        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header" style="padding:35px 50px;">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4><span class="glyphicon glyphicon-lock"></span> Close</h4>
            </div>
            <div class="modal-body" style="padding:40px 50px;">
                <form:form method ="POST" action = "sendMessage" modelAttribute="message" role="form">
                    <div class="form-group">
                        <label for="messageBody"><span class="glyphicon glyphicon-eye-open"></span> Message</label>
                        <textarea type="text" class="form-control" path = "message" id="messageBody" rows="4" required = true></textarea>
                    </div>
                    <button type="submit" class="btn btn-success btn-block" id = "sendMessageButton"> Send</button>
                </form:form>
            </div>
            <div class="modal-footer">
                <button type="submit" class="btn btn-danger btn-default pull-left" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> Cancel</button>
            </div>
        </div>
    </div>
</div>

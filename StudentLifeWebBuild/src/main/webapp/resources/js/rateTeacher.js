$(function() {

    $('#professorComments').dataTable( {
    } );
    $('#submitCommentButton').click(function (event) {
        event.preventDefault();
        var professorId = $('#professorId').val();
        var comment = $('#commentFeedBack').val();

        $.ajax({

            url : "/studentLife/saveComment",
            type : "POST",
            data: "professorId=" + professorId + "&comment=" + comment,
            success : function(response) {
                    window.location.reload();
                }
            });
        });
});
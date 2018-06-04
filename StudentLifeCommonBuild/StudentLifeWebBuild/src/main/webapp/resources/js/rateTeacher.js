$(function() {

    $('#submitCommentButton').click(function (event) {
        event.preventDefault();
        var professorId = $('#professorId').val();
        var comment = $('#commentFeedBack').val();

        $.ajax({

            url : "/studentLife/saveComment",
            type : "POST",
            data: "professorId=" + professorId + "&comment=" + comment,
            success : function(response) {

                if(response.status !== 200) {
                   alert("An error has occurred!");
                } else {
                    window.location.reload();
                }
            },
            error : function(ex) {
                console.log(ex);
            }
        });

    });


});
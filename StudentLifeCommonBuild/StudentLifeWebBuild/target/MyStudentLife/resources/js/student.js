$(function() {
    $('#students').DataTable({

    });



    $('tr i').click(function(){
        $('#myModal').modal('show');

        $('#sendMessageButton').click(function (event) {
            event.preventDefault();
            var username = $('#username').val();
            var messageBody = $('#message').val();
            alert(username + "" + messageBody);

            $.ajax({

                url : "/studentLife/sendMessage",
                type : "POST",
                data: "username=" + username + "&messageBody=" + messageBody,
                success : function(response) {

                    if(response.status == 'FAIL') {
                        showFormError(response.errorMessageList);
                    } else {
                        //everything is O.K. user logged in successfully.
                        $('#exampleModal').modal('hide');
                        window.location.reload();
                    }
                },
                error : function(ex) {
                    console.log(ex);
                }
            });

        });
    });
});

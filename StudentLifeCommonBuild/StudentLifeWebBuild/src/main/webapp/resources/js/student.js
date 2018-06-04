$(function() {
    $('#students').DataTable({

    });



    $('tr i').click(function(){
        $('#myModal').modal('show');

        $('#sendMessageButton').click(function (event) {
            event.preventDefault();
            var messageRecipient= $('#messageRecipient').val();
            var messageBody = $('#messageBody').val();

            $.ajax({

                url : "/studentLife/sendMessage",
                type : "POST",
                data: "messageRecipient=" + messageRecipient + "&messageBody=" + messageBody,
                success : function(response) {

                    if(response.status == 'FAIL') {
                        showFormError(response.errorMessageList);
                    } else {
                        //everything is O.K. user logged in successfully.
                        $('#myModal').modal('hide');
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
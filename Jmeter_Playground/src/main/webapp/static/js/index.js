$(function () {
    $("#submit_btn").click (function () {
        $.ajax({
            type: "POST",
            url: "/userAdd.action",
            data: $("#userForm").serialize(),
            success: function (data) {
                //data = $.parseJSON(data);
                alert("abc");
                alert(data.msg);
                console.log("data.msg");
            }
        });
    });
});
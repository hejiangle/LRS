(function () {
    var actionType = location.search.split("?")[1].split("&")[0];
    var number = location.search.split("&")[1];
    var roomOrRole = "";
    if("create" == actionType){
        window.roomOrRole = number;
//        document.getElementById("roomOrRole").innerHTML = number;
    }else{
        document.getElementById("title").innerHTML = "你的角色是：";
        $.ajax({
            url : 'http://10.205.124.49:8080/join',
            method : 'GET',
            contentType: "application/json;charset=UTF-8",
            data : "number="+number,
            async: false,
            success: function (res) {
                window.roomOrRole = res;
 //               document.getElementById("roomOrRole").innerHTML = res;
            }
        });
    }
})();
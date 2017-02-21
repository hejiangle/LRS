var configurationObject = (function (){
    var getRoles = function(){
        var roles = {
            fortuneTeller : $("#fortuneTeller").is(':checked'),
            witch : $("#witch").is(':checked'),
            hunter : $("#hunter").is(':checked'),
            savior : $("#savior").is(':checked'),
            townsFolks : $("#townsFolks").val(),
            werewolves : $("#werewolves").val()
        };
        return roles;
    };

    var createRoom = function(){
        var room = getRoles();
        if(room != null){
            $.ajax({
                url : 'http://10.205.124.49:8080/create',
                method : "POST",
                contentType: "application/json;charset=UTF-8",
                data :JSON.stringify({
                    fortuneTeller : room.fortuneTeller,
                    witch : room.witch,
                    hunter : room.hunter,
                    savior : room.savior,
                    townsFolks : room.townsFolks,
                    werewolves : room.werewolves
                }),
                async : false,
                success : function(res){
                    window.location.href = "/message.html?create&"+res;
                }
            });
        }
    };

    return {
        createRoom : createRoom
    };
})();
$(document).ready(function () {

    $.ajax({
            url: "entity"
        }).then(function (data) {
            let entity_data = '';
            $.each(data, function (key, value) {
                entity_data += '<tr>';
                entity_data += '<td>' + value.id + '</td>';
                entity_data += '<td>' + value.content + '</td>';
                entity_data += '<td >' +
                    '<input type="hidden" value=' + value.id + '>' +
                    '<a>'
                    + '<span >Delete</span>' +
                    '</a>' +
                    '</td>';
            })
            $('#entityTable').append(entity_data);
            console.log(entity_data)
        })


    $(document).on("click", "a", function () {

        let entityId = $(this).parent().find('input').val();
        let workingObject = $(this);
        $.ajax({
            type: "DELETE",
            url: "/entity/" + entityId,
            success: function (){
                workingObject.closest("tr").remove();
            }
        })
    })

});

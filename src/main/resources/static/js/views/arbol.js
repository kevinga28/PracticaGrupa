//CREATE AND UPDATE
// No es Js puro
//JQuerry de JavaScript que es una libreria de Js para darle un Querry a la BD y darle instrucciones

//"DOM" es todo el documento web, con esto el va mapear el id del producto, agarrandolo desde la base de datos 
$(document).on("click", ".open-modal", function () {
    const currentArbolId = Number($(this).attr('idArbol'));

    if (currentArbolId) {
        const currentProduct = arboles.find(x => x.id === currentArbolId);
        $("#id").val(currentArbolId.id);
        $("#ruta_imagen").val(currentArbolId.ruta_imagen);
        $("#nombre_comun").val(currentArbolId.nombre_comun);
        $("#tipo_flor").val(currentArbolId.tipo_flor);
        $("#dureza_madera").val(currentArbolId.dureza_madera);
        $("#Hojas").val(currentArbolId.Hojas);
        $("#Altura").val(currentArbolId.Altura);
    }
});

$(document).on("click", "#saveArbol", function () {
    //formProduct es el ID que tenemos en el html del producto que este mismo llama a la funcion de save que tenemos
    // dentro el Controlador
    //Esto hay que fijarse que este bien en el html
    $("#formArbol").submit();
})

//Delete
$(document).on("click", ".btnDeleteArbol", function () {
    const currentArbolId = Number($(this).attr('idArbol'));
    const currentArbol = arboles.find(x => x.id === currentArbolId);
    $.ajax({
        url: 'arbol/delete',
        contentType: "application/json",
        dataType: 'json',
        type: 'POST',
        success: function (result) {
            //Location.reload hay que quitarlo y poner una funcion mas efectiva para la pagina 
            location.reload();
        },
        //here we are serialization the object
        data: JSON.stringify(currentArbol)
    });
})
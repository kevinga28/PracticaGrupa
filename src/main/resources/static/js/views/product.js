//CREATE AND UPDATE
// No es Js puro
//JQuerry de JavaScript que es una libreria de Js para darle un Querry a la BD y darle instrucciones

//"DOM" es todo el documento web, con esto el va mapear el id del producto, agarrandolo desde la base de datos 
$(document).on("click", ".open-modal", function () {
    const currentProductId = Number($(this).attr('idproduct'));

    if (currentProductId) {
        const currentProduct = products.find(x => x.id === currentProductId);
        $("#id").val(currentProduct.id);
        $("#id_categoria").val(currentProduct.id_categoria);
        $("#descripcion").val(currentProduct.descripcion);
        $("#detalle").val(currentProduct.detalle);
        $("#precio").val(currentProduct.precio);
        $("#existencias").val(currentProduct.existencias);
        $("#ruta_imagen").val(currentProduct.ruta_imagen);
    }
});

$(document).on("click", "#saveProduct", function () {
    //formProduct es el ID que tenemos en el html del producto que este mismo llama a la funcion de save que tenemos
    // dentro el Controlador
    $("#formProduct").submit();
})

//Delete
$(document).on("click", ".btnDeleteProduct", function () {
    const currentProductId = Number($(this).attr('idproduct'));
    const currentProduct = products.find(x => x.id === currentProductId);
    $.ajax({
        url: 'product/delete',
        contentType: "application/json",
        dataType: 'json',
        type: 'POST',
        success: function (result) {
            //Location.reload hay que quitarlo y poner una funcion mas efectiva para la pagina 
            location.reload();
        },
        //here we are serialization the object
        data: JSON.stringify(currentProduct)
    });
})
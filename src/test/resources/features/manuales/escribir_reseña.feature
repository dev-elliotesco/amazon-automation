# language: es
  Característica: Crear una reseña de un producto en Amazon
    Yo como comprador
    Quiero poder escribir una reseña de un producto
    Para compartir mi opinión con otros usuarios

    @manual
    @manual-result:passed
    Escenario: Crear una reseña de un producto
    Dado Un "producto" buscando que ya adquiri
    Cuando  Hago clic en "Escribir una reseña" e ingreso mi calificación y comentario
    Entonces Debería ver el mensaje de confirmación de que la reseña se publicó correctamente
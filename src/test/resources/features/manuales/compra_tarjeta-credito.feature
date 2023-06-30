# language: es
Característica: Realizar una compra con una tarjeta de crédito
  Yo como comprador
  Quiero poder realizar una compra contarjeta de crédito
  Para adquirir los productos que deseo

  @manual
  @manual-result:passed
  Escenario: Realizar una compra exitosa
    Dado Un producto buscado y agregado al carrito
    Cuando procedo al proceso de pago e ingreso los detalles de la tarjeta de crédito
    Entonces Debería ver el mensaje de confirmación de la compra
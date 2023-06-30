# language: es
  Característica: Realizar una devolución de un producto en Amazon
    Yo como comprador
    Quiero poder realizar una devolución de un producto
    Para obtener un reembolso o un reemplazo

    @manual
    @manual-result:passed
    Escenario: Realizar una devolución de un producto
      Dado accedi a  "Mis Pedidos" y selecciono el pedido con el producto a devolver
      Cuando Hago clic en "Devolver o reemplazar productos" y envío la solicitud de devolución
      Entonces Debería ver el mensaje de confirmación de que la solicitud de devolución se envió correctamente
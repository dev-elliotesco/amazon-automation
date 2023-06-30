# language: es
  Característica: Agregar un producto a la lista de deseos
    Yo como comprador
    Quiero poder agregar un producto a la lista de deseos
    Para guardarlos y comprarlos luego

    @manual
    @manual-result:passed
    Escenario: Agregar un producto a la lista de deseos
      Dado un "Producto" buscado y selecionado
      Cuando Agrego el producto a la lista de deseos
      Entonces Debería ver el mensaje de confirmación de que el "producto"se agregó a la lista de deseo y el "producto" debe estar en mi lista de deseos
# language: es
Característica: Filtrar producto por precio
  Yo como comprador
  Quiero poder filtrar un producto por precio
  Para poder realizar una compra

  Escenario: Verificar la filtracion de un producto por precio
    Dado estoy en la pagina de Amazon
    Cuando busco "PS5" y filtro los precios de la busqueda entre  300 y 500
    Entonces el primer producto de la busqueda deberia tener un precio entre 300 y 500
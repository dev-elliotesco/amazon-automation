# language: es
Característica: Filtrar producto por marca
  Yo como comprador
  Quiero poder filtrar un producto por marca
  Para poder realizar una compra

  Escenario: Verificar la filtracion de un producto por marca
    Dado estoy en la pagina de Amazon
    Cuando busco "Disco ssd" y filtro por la marca samsung
    Entonces el primer producto de la busqueda deberia ser de marca samsung
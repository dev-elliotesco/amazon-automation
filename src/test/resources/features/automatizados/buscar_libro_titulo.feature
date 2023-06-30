# language: es
Característica: Buscar libro por titulo
  Yo como comprador
  Quiero poder buscar un libro por titulo
  Para poder realizar una compra

  Escenario: Verificar la busqueda de un libro por titulo
    Dado estoy en la pagina de Amazon
    Cuando busco "Clean Code" y
    Entonces el primer libro deberia contener el titulo "Clean Code"
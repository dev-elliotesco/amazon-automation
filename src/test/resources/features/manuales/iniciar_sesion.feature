# language: es
  Característica: Iniciar sesión con una cuenta válida
    Yo como comprador
    Quiero poder iniciar sesión con mi cuenta
    Para acceder a mis datos y funcionalidades personalizadas

    @manual
    @manual-result:passed
    Escenario: Iniciar sesión exitosamente
    Dado Estoy en la página de inicio de Amazon
    Cuando Hago clic en el enlace identificate e ingreso mi "Usuario" y "contraseña"
    Entonces Debería ver mi sesion iniciada
#Author : Sergio  Andrés Gómez Roa

  Feature: Yo como usuario de la pagina Star Sharp
            Quiero acceder con mis credenciales a la plataforma
              Para poder realizar las operaciones con mi usuario
    @Scenario1
    Scenario Outline: Login Exitoso
      Given que ingreso a la pagina de StarSharp
      When ingrese mis credenciales usuario "<usuario>" y clave "<password>"
      Then debo ver el dashboard
      Examples:
      |usuario|password|
      | admin  |serenity|


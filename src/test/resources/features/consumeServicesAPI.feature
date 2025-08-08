Feature: Validar el CRUD de usuarios sobre el API reqres in

  Background:
    Given el user obtiene la base url

  @Test
  Scenario: Crear un usuario por medio del metodo POST - API reqres in
    When Se envia los datos sobre el cuerpo de la peticion
      | name    | job    |
      | Juancho | Tester |
    Then Se realiza la creacion del usuario

  @Test
  Scenario: Listar los usuarios al consumir el metodo GET - API reqres in
    When Se envia la peticion al metodo Get single user
    Then Se enlistan los usuarios registrados

  @Test
  Scenario: Actualizar el registro por el metodo PUT - API reqres in
    When Se envia los datos sobre el cuerpo de la peticion al metodo PUT
      | name    | job    |
      | Juancho Mod | Tester 2|
    Then Se realiza la actualizacion del usuario a traves del metodo PUT

  @Test
  Scenario: Actualizar el registro por el metodo PACTH - API reqres in
    When Se envia los datos sobre el cuerpo de la peticion al metodo PACTH
      | name    | job    |
      | Juancho Mod | Tester 3 |
    Then Se realiza la actualizacion del usuario a traves del metodo PACTH

  @Test
  Scenario: Eliminar un usuario por el metodo DELETE - API reqres in
    When Se envia la peticion al metodo delete single user
    Then Se realiza la eliminacion del usuario

  @Test
  Scenario: Eliminar un usuario por el metodo DELETE - API reqres in # 2
    When Se envia la peticion al metodo delete single user
    Then Se realiza la eliminacion del usuario
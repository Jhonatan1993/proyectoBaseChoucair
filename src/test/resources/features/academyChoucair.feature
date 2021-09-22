#language:es
#Autor: Jhonatan Paternina Rojas

@stories
Característica: Academy Choucair
  Como usuario, quiero aprender a automatizar en screamplay en la Academia Choucair con el curso de automatización.
  Antecedentes:
    Dado que Jhonatan quiere ingresar a choucair academy
    | strUser    | strPassword   |
    | 1064189399 | 1064189399Jp@ |
  @caso1
    Escenario: Buscar un curso de automatización.
      Cuando el busca un el curso de en la academia choucair
      | strCourse         |
      | Foundation Level  |
      Entonces el encontrara el curso llamado
        | strCourse         |
        | Foundation Level  |




$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('loginLinkedin\login.feature');
formatter.feature({
  "id": "desde-un-navegador-probar-funcionamiento",
  "description": "de la pagina linkedin",
  "name": "desde un navegador probar funcionamiento",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "desde-un-navegador-probar-funcionamiento;login-correcto-y-busqueda-de-contacto",
  "description": "",
  "name": "login correcto y busqueda de contacto",
  "keyword": "Scenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "abrir navegador buscar pagina linkendin Chrome",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "ingreso correo electronico liannymar313@gmail.com y contrasena juany0512313 correctos",
  "keyword": "When ",
  "line": 6
});
formatter.step({
  "name": "presiono boton inicia sesion",
  "keyword": "And ",
  "line": 7
});
formatter.step({
  "name": "busco contacto Javier Chacon de red",
  "keyword": "And ",
  "line": 8
});
formatter.step({
  "name": "como resultado muestra el perfil del contacto",
  "keyword": "Then ",
  "line": 9
});
formatter.match({
  "arguments": [
    {
      "val": "Chrome",
      "offset": 40
    }
  ],
  "location": "loginTest.givenAbrirNavegador(String)"
});
formatter.result({
  "duration": 27799647605,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "liannymar313@gmail.com",
      "offset": 27
    },
    {
      "val": "juany0512313",
      "offset": 63
    }
  ],
  "location": "loginTest.when(String,String)"
});
formatter.result({
  "duration": 1107362163,
  "status": "passed"
});
formatter.match({
  "location": "loginTest.andIniciarSesion()"
});
formatter.result({
  "duration": 18269623903,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Javier Chacon",
      "offset": 15
    }
  ],
  "location": "loginTest.andBuscarContacto(String)"
});
formatter.result({
  "duration": 2693800636,
  "status": "passed"
});
formatter.match({
  "location": "loginTest.thenMostrarPerfil()"
});
formatter.result({
  "duration": 1362989667,
  "status": "passed"
});
formatter.scenario({
  "id": "desde-un-navegador-probar-funcionamiento;login-usuario-no-registrado",
  "description": "",
  "name": "login usuario no registrado",
  "keyword": "Scenario",
  "line": 16,
  "type": "scenario",
  "comments": [
    {
      "value": "#\t\tExamples:",
      "line": 11
    },
    {
      "value": "#\t\t\t\t|\tnavegador\t\t\t|",
      "line": 12
    },
    {
      "value": "#\t\t\t\t|\tChrome\t\t\t\t|",
      "line": 13
    },
    {
      "value": "#\t\t\t\t|   InternetExplorer\t|",
      "line": 14
    }
  ]
});
formatter.step({
  "name": "se abre navegador buscar pagina linkendin Chrome",
  "keyword": "Given ",
  "line": 17
});
formatter.step({
  "name": "ingreso correo electronico liannymar312@gmail.com no registrado y contrasena juany0512313",
  "keyword": "When ",
  "line": 18
});
formatter.step({
  "name": "se presiona boton inicia sesion",
  "keyword": "And ",
  "line": 19
});
formatter.step({
  "name": "como resultado muestra mensaje de error",
  "keyword": "Then ",
  "line": 20
});
formatter.match({
  "arguments": [
    {
      "val": "Chrome",
      "offset": 42
    }
  ],
  "location": "loginTestFail.givenAbrirNavegador(String)"
});
formatter.result({
  "duration": 30980849245,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "liannymar312@gmail.com",
      "offset": 27
    },
    {
      "val": "juany0512313",
      "offset": 77
    }
  ],
  "location": "loginTestFail.when(String,String)"
});
formatter.result({
  "duration": 1179177029,
  "status": "passed"
});
formatter.match({
  "location": "loginTestFail.and()"
});
formatter.result({
  "duration": 3295332714,
  "status": "passed"
});
formatter.match({
  "location": "loginTestFail.then()"
});
formatter.result({
  "duration": 300537921,
  "status": "passed"
});
});
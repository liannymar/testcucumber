Feature: desde un navegador probar funcionamiento 
	de la pagina linkedin 
	
	Scenario: login correcto y busqueda de contacto
		Given abrir navegador buscar pagina linkendin Chrome 
		When ingreso correo electronico liannymar313@gmail.com y contrasena juany0512313 correctos
		And presiono boton inicia sesion
		And busco contacto Javier Chacon de red
		Then como resultado muestra el perfil del contacto

#		Examples:
#				|	navegador			|
#				|	Chrome				|
#				|   InternetExplorer	|
		
	Scenario: login usuario no registrado
		Given se abre navegador buscar pagina linkendin Chrome 
		When ingreso correo electronico liannymar312@gmail.com no registrado y contrasena juany0512313
		And se presiona boton inicia sesion
		Then como resultado muestra mensaje de error


#		Examples:
#				|	navegador			|
#				|	Chrome				|
#				|   InternetExplorer	|
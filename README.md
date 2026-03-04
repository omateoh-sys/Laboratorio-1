#  Analisis del Programa Original
# 1 Identificación de Tareas Repetitivas
1.	 ¿Qué partes del código pueden convertirse en métodos?
  Se pueden convertir a métodos donde se pide al usuario ingresar un estudiante, el promedio, mostrar estudiantes, calificación más alta.
2.	¿Qué bloques de código se repiten?
  La validación de si la lista esta vacia, se repite en caso todas las listas.
3.	¿Qué responsabilidades pueden separarse?
  Se pueden separar por métodos por cada operación específica.
4.	 Explicar por qué dividir estas tareas mejora el programa.
  Para que el Código sea legible y entendible, además se pueden reutilizar trozos de Código y el main se leería parte a parte.

# 2 Variables Locales vs Globales
* Globales:
  “Estudiantes” y “calificación” 
¿Por qué?

Ya que todos los métodos podrán acceder y modificar la fuente de datos y su ciclo debe durar y toda la ejecución del programa.

* Locales:
  podrían ser promedio, suma, opción o incluso nombre,
¿Por qué?

 Ya que solo existirían en el método mientras se ejecuta. 
 
•	Alcance (scope) podrían ser variables declaradas dentro de la clase, pero fuera de cualquier metodo.

•	Tiempo de vida de la variable, existen mientras sea static y se encuentre dentro de la clase

•	Riesgos de modificar datos globales accidentalmente

Si se modifica por varias personas es muy difícil encontrar errores.

# 3 Validaciones y Manejo de Excepciones
Las validaciones agregadas try catch para leer entero y double evita que el programa se caiga si se ingresa letras en lugar de números.
Así mismo la validación de rango de calificaciones 0 a 10 esta con un if y else para que no haya errores a la hora de que el usuario ingrese su calificación.
Estas son importantes ya que si no lo tuvieran el programa se cae cuando se le ingresan datos que son erróneos, y con esto ya podemos reingresar datos asta que cumplan con lo requerido.
Como los métodos mostrarLista1, calcularPromedio, y mostrarEstudianteMasAlto ya incluía la verificación if para evitar errores si la lista estaba vacia, solo se adapto de manera que funcionara bien a la hora de ejecutar el código modificado.
Agregamos el método buscarEstudiante para practicar un poco más la relación de métodos y variables locales este método sirve para buscar los estudiantes registrados y así mismo que verifique si el estudiante esta registrado, usamos una variable booleana para el control de flujo encontrado.
# 4 Preguntas de reflexión 
-¿Qué ventajas tiene dividir el código en métodos?

Por lo que ya hemos trabajo y observado influye y da mucha ventaja en la organización del código, ayudando a entender mejor su lógica y cómo funciona, así mismo usando métodos nos permite reutilizar el código en proyectos futuros. 

-¿Por qué no es recomendable usar muchas variables locales?

Porque esto en alguna ocasión puede generar que se dificulte más encontrar un error entre métodos ya que genera que dependan unos de otros.

-¿Cómo mejorar la modularización y la legibilidad?

Se observa y aprende como cada método tiene un propósito de ser y hacer en el código, además que nos ayuda a entender el flujo de ejecución en el código.




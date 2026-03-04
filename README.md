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

# 3 



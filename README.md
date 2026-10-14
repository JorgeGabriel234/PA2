# README — Evaluación

> **Curso:** Algoritmo y estructura de datos 
> **Código:** 4682
> **Evaluación:** PA1 
> **Equipo:** Grupo 6

## 1. Integrantes

| Integrante | Rol | Aporte principal |
|---|---|---|
| JORGE GABRIEL ZUÑIGA SOTO | Actividad  2| Desarrolló la Actividad 2 Recorrido e inserción |
| JOSEPT MATTIAS YALAN LARA | Actividad 1 | Actividad 1 Fundamentos y representación de listas enlazadas |
|IMANOL HUMBERTO PONCE DE LEON PORTAL | Actividad 4| Actividad 4 Listas dobles y circulares|
 CESAR AUGUSTO CHAVERO MEJIAS | Actividad 3|Actividad 3 Lista enlazada simple: búsqueda, modificación y eliminación|
 |ROY ORLANDO GRANADOS AGUILAR| Actividad 3| Actividad 3 Lista enlazada simple: búsqueda, modificación y eliminación|


## 2. Descripción y objetivo

**Problema:**  
Una organización requiere gestionar una secuencia dinámica de solicitudes de atención. El registro cambia constantemente: ingresan nuevos casos, algunos se eliminan, otros deben reubicarse y en ciertos procesos se necesita navegar en ambos sentidos o mantener un ciclo continuo de revisión.

**Objetivo:**  
debe proponer una solución para registrar cantidades de inscritos, ordenar resultados, realizar consultas puntuales y representar la distribución de estudiantes por aulas y horarios.

**Solución desarrollada:**  
Se trabajó con la representación de las listas enlazadas simples y dobles y tambien se hizo los recorridos e insercciones 



## 3. Cómo ejecutar o revisar

El proyecto fue desarrollado utilizando las siguientes tecnologías:

Java
IntelliJ IDEA
Git
GitHub
Estructuras dobles y simples

El desarrollo de las actividades se encuentra principalmente en el archivo:

Nodo.java
ListaEnlazada.java

El archivo Main.java mantiene el código inicial del proyecto.

**Pasos de revisión:**
1.Descargar o clonar el repositorio desde GitHub.
2.Abrir el proyecto utilizando IntelliJ IDEA.
3.Ubicar el archivo VectoPA1.java.
4.Ejecutar el programa.
5.Revisar los resultados obtenidos en cada actividad.
6.Verificar las operaciones realizadas con vectores y matrices.

link:https://github.com/JorgeGabriel234/PA2

> No publicar contraseñas, tokens, credenciales ni datos sensibles.

## 4. Evidencias

Agregar aquí capturas, resultados, pruebas o enlaces que demuestren el funcionamiento.

"C:\Program Files\Java\jdk-21.0.12.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2026.2.2\lib\idea_rt.jar=57828" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Pa2-main\Pa2-main\PA2\target\classes com.isil.pe.Main
Hello and welcome!i = 1
i = 2
i = 3
i = 4
i = 5

Process finished with exit code 0

##5. Actividades teoricas

Actividad 1.1
Expliquen qué es una lista enlazada, cómo se clasifica y cuál es su representación gráfica básica.
Una lista enlazada es una estructura de datos lineal y dinámica compuesta por nodos conectados mediante referencias. Cada nodo contiene un dato y una referencia al siguiente nodo de la secuencia. En la lista enlazada simple, el último nodo apunta a null, lo que indica el fin de la estructura.

Una lista enlazada se puede clasificar según el número de referencias por nodo, la dirección del recorrido, la existencia o no de terminación en null y el nivel de complejidad en la manipulación de enlaces.

| Tipo | Descripción | Características |
| :--- | :--- | :--- |
| **Simple** | Cada nodo tiene un dato y una única referencia (siguiente). El último nodo apunta a null. | Recorrido unidireccional; es la más simple de implementar. |
| **Doble** | Cada nodo tiene un dato, una referencia al siguiente y otra al anterior. | Recorrido bidireccional; mayor consumo de memoria; facilita la eliminación directa. |
| **Circular** | El último nodo apunta al primero en lugar de null, formando un ciclo cerrado. | No existe null; permite recorrer la lista indefinidamente; útil en algoritmos cíclicos. |
| **Doblemente circular** | Cada nodo tiene referencias al siguiente y al anterior; los extremos se conectan entre sí en ambas direcciones. | Combina recorrido bidireccional y ciclo cerrado. |

Actividad 1.2
Elaboren una representación gráfica de una lista enlazada con al menos 5 nodos asociados al caso
planteado
CABEZA → [101|Ana|Reclamo] → [102|Luis|Consulta] → [103|María|Trámite] → [104|Carlos|Soporte] → [105|Rosa|Reclamo] → null

Actividad 2.5
El orden de la estructura se adapta por cada inserción, si originalmente era 10 20 30 → null
Cuando se le añada un 5 al inicio pasará a ser 5 10 20 30 → null
Cuando se le añada un 40 al final pasará a ser 5 10 20 30 40 → null


Actividad 3.3
Expliquen cómo se reajustan los enlaces

Si teniamos un nodo 10 20 30 40 → null y eliminamos el nodo de valor 40, la lista pasará a ser 10 20 30 → null, solamente se desplazan los valores

Actividad 3.4
Comparen la eficiencia básica de inserción y eliminación según el punto de intervención

La eficiencia se mide dependiendo de dónde se realice la operación dentro de la lista enlazada simple, siendo bastante rapidas al inicio, en la cabeza, pero siendo mucho más lentas al final, ya que debe de recorrer toda la lista


Actividad 4.1
Planteen una situación del caso en la que convenga usar una lista doble

Escenario: Navegación e historial de auditoría de un gestor de atención al cliente. Un operador requiere revisar una solicitud y desplazarse hacia atrás ("Anterior") y hacia adelante ("Siguiente") entre el historial de casos procesados para validar correcciones en tiempo real.
[NULL] <-- (Prev | ID:101 | Next) <==> (Prev | ID:102 | Next) <==> (Prev | ID:103 | Next) --> [NULL]

Actividad 4.2
Planteen una situación del caso en la que convenga usar una lista circular.

Escenario: Mapeo en bucle para asignación de tickets por turno de agentes (Round-Robin). El sistema distribuye solicitudes entrantes asignando de forma continua un caso al Agente 1, luego al Agente 2, luego al Agente 3, y al terminar este vuelve automáticamente al Agente 1 en un ciclo infinito.

```text
+-------------------+        +-------------------+        +-------------------+
| Agente 1          |------->| Agente 2          |------->| Agente 3          |---------+
| Sig: 0x200        |        | Sig: 0x300        |        | Sig: 0x100        |         | (Cierra el ciclo)
+-------------------+        +-------------------+        +-------------------+         |
          ^                                                                             |
          |                                                                             |
          +-----------------------------------------------------------------------------+
```

## 6. Matriz de participación

| Integrante | Desarrollo | Pruebas | Documentación | Exposición | Evidencia de participación |
|---|---|---|---|---|---|
| JOSEPT MATTIAS YALAN LARA| [Alta] | [Alta] | [Alta] | [Sí] | [Desarrollo de las actividad 1] |
| JORGE GABRIEL ZUÑIGA SOTO [Alta] | [Alta] | [Alta] | [Sí] | [Desarrollo de las actividad 2] |
| IMANOL HUMBERTO PONCE DE LEON PORTAL [Alta] | [Alta] | [Alta] | [Sí] | [Desarrollo de las actividad 4] |
| CESAR AUGUSTO CHAVERO MEJIAS|[Alta] | [Alta] | [Alta] | [Sí] |[Desarrollo de las actividad 3] |
|ROY ORLANDO GRANADOS AGUILAR|[Alta] | [Alta] | [Alta] | [Sí] |[Desarrollo de las actividad 3] |
## 6. Video de exposición

**Video público de YouTube:** []

Todos los integrantes deben participar en la exposición con sus cámaras prendidas y explicar el procedimiento, la solución desarrollada y las decisiones tomadas.

## 7. Conclusiones

-Se comprendió las listas simples y dobles
-Se aplicaron operaciones de recorrido, búsqueda e inserción utilizando vectores en Java.
-Se utilizó los nodos y las listas enlazadas.

---

**Última actualización:** [13/10/2026]

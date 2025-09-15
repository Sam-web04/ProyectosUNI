Proyecto IMC con Patrón Singleton

Este es un proyecto en Java desarrollado en NetBeans, cuyo
objetivo es demostrar el uso del Patrón de Diseño Singleton
aplicándolo al cálculo del Índice de Masa Corporal (IMC).

------------------------------------------------------------------------

📌 ¿Qué es el Patrón Singleton?

El Singleton es un patrón de diseño creacional que garantiza que
solo exista una única instancia de una clase** y que se pueda acceder
a ella desde cualquier parte del programa.

En este proyecto, se utiliza para implementar una calculadora de IMC
que se comparte en toda la aplicación.

------------------------------------------------------------------------

⚙️ Funcionalidades

-   Calcular el IMC a partir del peso (kg) y altura (m).
-   Clasificar el resultado según la OMS:
    -   Bajo peso: IMC < 18.5
    -   Normal: 18.5 ≤ IMC < 24.9
    -   Sobrepeso: 25 ≤ IMC < 29.9
    -   Obesidad: IMC ≥ 30
-   Demostración de que la calculadora es un Singleton (misma
    instancia siempre).

------------------------------------------------------------------------

🚀 Cómo ejecutar el proyecto

1.  Clona este repositorio:
    git clone https://github.com/TU-USUARIO/ProyectoIMCSingleton.git

2.  Abre el proyecto en NetBeans.

3.  Ejecuta la clase Principal.java.

4.  Ingresa tu peso (en kg) y tu altura (en metros) cuando el
    programa lo pida.

------------------------------------------------------------------------

🖥️ Ejemplo de ejecución

    Ingrese su peso en kg: 70
    Ingrese su altura en metros: 1.75
    Su IMC es: 22.86 (Normal)
    ¿Ambas referencias son el mismo objeto? true

------------------------------------------------------------------------

📂 Estructura del proyecto

    ProyectoIMCSingleton
     └── src
          ├── singleton
          │     └── CalculadoraIMC.java   # Clase Singleton
          └── main
                └── Principal.java        # Clase principal con la ejecución

------------------------------------------------------------------------

📖 Tecnologías usadas

-   Java 8+
-   NetBeans IDE
-   Patrón de diseño Singleton

------------------------------------------------------------------------

✍️ Autor: [Samanta]
📅 Año: 2025

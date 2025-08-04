# Reto Automatización - Serenity BDD
Este proyecto es una solución de automatización de pruebas de extremo a extremo utilizando el framework Serenity BDD con Cucumber, integrando el patrón Screenplay, ideal para pruebas funcionales sobre aplicaciones web.

## Objetivos del Proyecto
- Automatizar pruebas funcionales de interfaces web.
- Estructurar la automatización con buenas prácticas usando el patrón Screenplay.
- Generar reportes detallados con Serenity.
- Hacer las pruebas fácilmente ejecutables y mantenibles.

## Tecnologías Utilizadas
[![Serenity BDD](https://img.shields.io/badge/Serenity-BDD-16a085)]()
[![Selenium](https://img.shields.io/badge/Selenium-4.0-f39c12)]()
[![Java](https://img.shields.io/badge/Java-11-3498db)]()
- Java 11
- Serenity BDD 3.9.8
- Cucumber 3.9.8
- Selenium 4.17.0
- JUnit 5
- WebDriverManager

## Estructura del Proyecto

![img.png](img.png)

## Cómo Ejecutar el Proyecto

### Prerrequisitos

1. JDK 11
2. Gradle (opcional, puedes usar el wrapper ./gradlew)
3. Navegador Google Chrome (última versión recomendada)

### Pasos para ejecutar
#### 1. Clona el repositorio:

git clone "https://Dev-Choucair@dev.azure.com/Dev-
Choucair/AUT_Movil/_git/Reto_Formacion_Auto_WebResponsive"

**Rama:** JUAN_DAVID_MATEUS
cd RetoAutomatizacion

#### 2. Ejecuta las pruebas con Gradle:
./gradlew clean test

#### 3. Filtra por etiquetas Cucumber si es necesario:

./gradlew clean test -Dcucumber.filter.tags="@TuTag"

#### 4. Genera el reporte de Serenity:

./gradlew serenity:aggregate

#### 5. Abre el reporte generado:

target/site/serenity/index.html

## Escribir Nuevos Casos de Prueba
1. Crea un nuevo archivo .feature dentro de src/test/resources/features/.
2. Define los escenarios en lenguaje Gherkin (Given, When, Then).
3. Implementa los Step Definitions correspondientes en src/test/java/stepdefinitions.
4. Si es necesario, crea o ajusta las Tareas, Preguntas, o Acciones en src/main/java/.
5. Ejecuta y revisa los resultados en el reporte.

Usa el patrón Screenplay para mantener tu código limpio, reutilizable y escalable.

## Contribuciones

¡Contribuir a este proyecto es muy bienvenido! Puedes aportar de varias formas:

### Ideas

- Proponer nuevas funcionalidades o mejoras.
- Discutir sobre el enfoque actual.

### Código

- Añadir nuevos escenarios de prueba.
- Refactorizar pasos o tareas existentes.
- Mejorar el rendimiento de ejecución o mantenimiento del framework.

### Reporte de errores

- Abrir issues para reportar errores encontrados.
- Documentar pasos para reproducir errores.

Antes de contribuir, por favor asegúrate de seguir las buenas prácticas y probar tu código.


## Recursos Recomendados
- [Serenity BDD Documentation](https://serenity-bdd.github.io/docs/tutorials/first_test)
- [Cucumber Docs](https://cucumber.io/docs/)
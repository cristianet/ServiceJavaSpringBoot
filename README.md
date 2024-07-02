# Kapsch Onboarding Test

Bienvenido al proyecto de Onboarding Test de Kapsch

## Artifacts

### Back-End
- **Framework:** Java Spring Boot 3
- **Gestor de Dependencias:** Maven
- **Pruebas:** JUnit 5

### Front-End
- **Framework:** Angular v18
- **Estilos:** Bootstrap

## Requisitos Previos

Asegúrate de tener instalados los siguientes programas antes de comenzar:

- Java Development Kit (JDK) 17
- Apache Maven
- Node.js y npm (para el front-end)
- Angular CLI (para el front-end)

## Configuración del Proyecto

### Back-End

1. **Clonar el repositorio**:
    ```sh
    git clone <URL_DEL_REPOSITORIO>
    cd back-end-kapsch
    ```

2. **Compilar y ejecutar el proyecto**:
    ```sh
    mvn clean install
    mvn spring-boot:run
    ```

3. **Propiedades de la aplicación**:
    El archivo `application.properties` contiene las configuraciones principales:
    ```properties
    spring.application.name=back-end-kapsch
    ```

### Front-End

1. **Clonar el repositorio** (si no se encuentra en el mismo directorio):
    ```sh
    git clone <URL_DEL_REPOSITORIO>
    cd front-end-kapsch
    ```

2. **Instalar dependencias**:
    ```sh
    npm install
    ```

3. **Ejecutar la aplicación**:
    ```sh
    ng serve
    ```

## Pruebas Unitarias

### Back-End

Para ejecutar las pruebas unitarias del back-end, utiliza el siguiente comando:

```sh
mvn test
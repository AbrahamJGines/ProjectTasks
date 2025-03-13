# Proyecto Task

## Descripci�n
Este es un proyecto de demostraci�n utilizando Spring Boot para la gesti�n de tareas. El proyecto incluye funcionalidades de autenticaci�n y autorizaci�n, as� como integraci�n con bases de datos y servicios web.

## Enlace al C�digo Fuente
Puedes acceder al c�digo fuente del proyecto en el siguiente enlace de GitHub:
[Repositorio de GitHub](https://github.com/ajgines-contractor_bbvaemu/task)

## Implementaci�n

### Tecnolog�as Utilizadas
- **Java 11**: Lenguaje de programaci�n principal.
- **Spring Boot 2.7.12**: Framework para la creaci�n de aplicaciones Java.
- **Maven**: Herramienta de gesti�n de dependencias y construcci�n del proyecto.
- **H2 Database**: Base de datos en memoria para pruebas.
- **Microsoft SQL Server**: Base de datos para el entorno de producci�n.
- **Logback**: Framework de logging.
- **JWT (JSON Web Tokens)**: Para la autenticaci�n y autorizaci�n.

### Estructura del Proyecto
- `src/main/java/com/list/task`: Contiene el c�digo fuente de la aplicaci�n.
- `src/main/resources`: Contiene los archivos de configuraci�n y recursos est�ticos.
- `src/test/java/com/list/task`: Contiene las pruebas unitarias y de integraci�n.

### Configuraci�n de Seguridad
Se ha implementado la seguridad utilizando Spring Security y JWT. La clase `SecurityConfig` configura los filtros de seguridad y las rutas protegidas.

### Dependencias Principales
- `spring-boot-starter-web`: Para la creaci�n de aplicaciones web.
- `spring-boot-starter-data-jpa`: Para la integraci�n con JPA y bases de datos.
- `spring-boot-starter-security`: Para la seguridad de la aplicaci�n.
- `spring-boot-starter-oauth2-client`: Para la autenticaci�n OAuth2.
- `jjwt`: Para la generaci�n y validaci�n de tokens JWT.

### Decisiones de Dise�o
- **Autenticaci�n y Autorizaci�n**: Se decidi� utilizar JWT para la autenticaci�n debido a su simplicidad y seguridad.
- **Base de Datos**: Se utiliza H2 para pruebas y SQL Server para producci�n, permitiendo un desarrollo �gil y una transici�n suave a producci�n.
- **Logging**: Se eligi� Logback por su flexibilidad y rendimiento.

# Proyecto Task

## Descripción
Este es un proyecto de demostración utilizando Spring Boot para la gestión de tareas. El proyecto incluye funcionalidades de autenticación y autorización, así como integración con bases de datos y servicios web.

## Enlace al Código Fuente
Puedes acceder al código fuente del proyecto en el siguiente enlace de GitHub:
[Repositorio de GitHub](https://github.com/ajgines-contractor_bbvaemu/task)

## Implementación

### Tecnologías Utilizadas
- **Java 11**: Lenguaje de programación principal.
- **Spring Boot 2.7.12**: Framework para la creación de aplicaciones Java.
- **Maven**: Herramienta de gestión de dependencias y construcción del proyecto.
- **H2 Database**: Base de datos en memoria para pruebas.
- **Microsoft SQL Server**: Base de datos para el entorno de producción.
- **Logback**: Framework de logging.
- **JWT (JSON Web Tokens)**: Para la autenticación y autorización.

### Estructura del Proyecto
- `src/main/java/com/list/task`: Contiene el código fuente de la aplicación.
- `src/main/resources`: Contiene los archivos de configuración y recursos estáticos.
- `src/test/java/com/list/task`: Contiene las pruebas unitarias y de integración.

### Configuración de Seguridad
Se ha implementado la seguridad utilizando Spring Security y JWT. La clase `SecurityConfig` configura los filtros de seguridad y las rutas protegidas.

### Dependencias Principales
- `spring-boot-starter-web`: Para la creación de aplicaciones web.
- `spring-boot-starter-data-jpa`: Para la integración con JPA y bases de datos.
- `spring-boot-starter-security`: Para la seguridad de la aplicación.
- `spring-boot-starter-oauth2-client`: Para la autenticación OAuth2.
- `jjwt`: Para la generación y validación de tokens JWT.

### Decisiones de Diseño
- **Autenticación y Autorización**: Se decidió utilizar JWT para la autenticación debido a su simplicidad y seguridad.
- **Base de Datos**: Se utiliza H2 para pruebas y SQL Server para producción, permitiendo un desarrollo ágil y una transición suave a producción.
- **Logging**: Se eligió Logback por su flexibilidad y rendimiento.

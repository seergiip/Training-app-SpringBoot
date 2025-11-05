# Training-app Spring Boot 🚀

Esto es un repo de la app de entrenamiento (training-app) hecha con Spring Boot. Es una aplicación ligera de backend en Java para gestionar entrenamientos, usuarios, etc.  
Fue creada como versión “bootstrapeada” de otro proyecto de entrenamiento, ahora aprovechando lo que Spring ofrece.

---

## 🔍 ¿Qué es este proyecto?

- Una aplicación construida con Spring Boot (Java) para gestionar entidades de entrenamiento.  
- Ideal para practicar integración de capas: controlador, servicio, repositorio.  
- Rest Client.

---

## 🛠 Tecnologías utilizadas

- Java (versión según el `pom.xml`)  
- Spring Boot (arranque rápido, configuración minimalista)  
- Maven como gestor de dependencias (`pom.xml`)  
- Estructura estándar: `src/main/java`, `src/main/resources`  
- Ficheros de configuración típicos: `.gitignore`, `mvnw`, `mvnw.cmd`, etc.

---

## 📂 Estructura del proyecto
```
/.mvn/ …
/src/
main/
java/…
resources/…
.gitignore
mvnw
mvnw.cmd
pom.xml
```

- `pom.xml` → coordenadas del proyecto + dependencias + plugin de build.  
- `src/main/java` → código fuente de la aplicación (controladores, servicios, entidades, repositorios).  
- `src/main/resources` → configuración, propiedades, plantillas, etc.  
- Los wrappers de Maven (`mvnw`, `mvnw.cmd`) para que cualquiera pueda construir sin instalar Maven globalmente.

---

## 🚀 ¿Cómo arrancar el proyecto?

1. Clona el repo:  
   ```
   git clone https://github.com/seergiip/Training-app-SpringBoot.git
   cd Training-app-SpringBoot
    ```
2. Arranca la aplicación con Maven (wrapper):
 ```
./mvnw spring-boot:run
 ```

o en Windows:
```
mvnw.cmd spring-boot:run
```
3. Abre tu navegador o Postman y visita el endpoint base, algo tipo:
```
http://localhost:8080/
```
4. Empieza a explorar los recursos (REST endpoints) que hayan sido definidos (usuarios, entrenamientos, etc).

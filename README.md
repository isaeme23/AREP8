# Taller 8 - Microservicios
En este laboratorio se realizo una aplicacion tipo twitter primero como monolito y despues separandolo en microservicios para luego añadirle seguridad con ayuda de Amazon Cognito.

## ¿Qué se necesita para usar este laboratorio?
- Git
- Maven
- Java
- Quarkus
- IDE de preferencia

## Instalando el proyecto

Para correrlo en nuestra maquina local, primero lo clonaremos con el siguiente comando:

  git clone https://github.com/isaeme23/AREP8

Luego lo abriremos con la IDE de nuestra preferencia y dentro del proyecto primero lo compilaremos:

  mvn clean install

Despues lo ejecutaremos con el siguiente comando:

  mvn quarkus:dev

Para ver el resultado de nuestro codigo, en el buscador web de su preferencia, escriba:

  http://localhost:8080/twitter/login

Aqui podremos encontrar nuestra pantalla inicial de login como monolito, en el que no hay seguridad solo ingresamos nuestro usuario:

![Captura de Pantalla 2023-10-31 a la(s) 6 28 12 p m](https://github.com/isaeme23/AREP8/assets/77862058/bac5236a-7b80-47fb-b37b-9516099b5dac)

Despues de ingresar, encontraremos la pantalla para realizar nuestros posts y en donde se publicaran:

![Captura de Pantalla 2023-10-31 a la(s) 6 32 09 p m](https://github.com/isaeme23/AREP8/assets/77862058/9bbc9f6d-41b8-4301-bf83-0f8d3b5176de)

Luego, lo subimos a un Bucket S3, en donde podemos ver el login disponible en internet asi:

![Captura de Pantalla 2023-10-31 a la(s) 6 28 12 p m](https://github.com/isaeme23/AREP8/assets/77862058/0a918053-f58e-4be3-a29e-30d5df281de5)

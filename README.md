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

![Captura de Pantalla 2023-10-31 a la(s) 6 57 32 p m](https://github.com/isaeme23/AREP8/assets/77862058/117e4615-e5ad-48c6-8527-bae88e1aea4f)

## Diseño y Arquitectura
Despues de haberlo desarrollado como monolito, separamos el front y el back y cada uno los colocamos en un Bucket S3 y en instancias EC2 respectivamente. En las instancias EC2
tendriamos los servicios que separamos el back que se comunicarian con el bucket S3 para mostrar el resultado de las consultas y de las publicaciones de los posts correspondientes.

![Captura de Pantalla 2023-11-01 a la(s) 4 55 50 p m](https://github.com/isaeme23/AREP8/assets/77862058/aa75815e-f03c-4b32-9d81-2e066509998c)

Los componentes los separamos en controllers que controlan los endpoints, servicios que son el intermediario entre la persistencia y los controllers y el modelo que corresponde
a las entidades que queriamos manejar.

## Despliegue
Aqui desplegamos los microservicios en internet y mostramos su funcionalidad en este video:

https://github.com/isaeme23/AREP8/assets/77862058/9f5cde5f-06f0-43ef-9200-44de2236dce1

## Autores
Santiago Ospina :octocat:
Isabella Manrique 🧑‍🚀

## Version
1.0-SNAPSHOT

## Licencia
GNU - General Public License Family

## Agradecimientos
A nuestro profesor Luis Daniel Benavides Navarro,
A nuestro monitor Jorge 💻

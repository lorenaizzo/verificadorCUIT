# Programa hecho en JAVA Spring BOOT para verificar el CUIT

Aplicacion hecha en Java Spring Boot para verificar el CUIT

# API

"/cuit/" 
    POST    
        enviar: {"numero": String }
        responde: String Ejemplo: "El cuit <cuit enviado> es <CORRECTO>/<INCORRECTO>"

    GET
        responde: String indicando pasos para funcionar


Dependencias

- Spring Boot DevTools
- Spring Web


Subido a Heroku en  https://fierce-meadow-98887.herokuapp.com/
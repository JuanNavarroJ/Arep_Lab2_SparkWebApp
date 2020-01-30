# Introducción a sistemas complejos, Heroku, Java, Maven y GitHub

## Link aplicación web

[SparkWebApp](https://arep-lab2-sparkwebapp.herokuapp.com/inputdata)
https://arep-lab2-sparkwebapp.herokuapp.com/inputdata

---

Este proyecto permite calcular la media y desviación estándar de un grupo de datos dados por medio de una pagina web, para realizar el ejercicio se utilizo una propia lista enlazada la cual permite almacenar cada dato ingresado y poder procesarlo. 



### Prerequisites

Debemos tener los siguientes programas instalados:
```
- Maven 
- Git
```

## ¿Como instalar y probar?

Debemos tener un editor java instalado y git, es opcional tener instalado el uso de maven que permitira un mejor control sobre el proyecto.

1. Entramos la terminal del dispositivo y accedemos a la carpeta en la cual queremos guardar el proyecto. 

![1](https://user-images.githubusercontent.com/44879884/73498856-7ecbf680-438c-11ea-8e18-d75ce3b36dd8.PNG)

2. Usando los comandos de git empezamos con : **$ git clone** https://github.com/JuanNavarroJ/Arep_Lab2_SparkWebApp.git

![2](https://user-images.githubusercontent.com/44879884/73498868-81c6e700-438c-11ea-9515-8fe96f2787d5.PNG)

3. Ingresamos a la carpeta que descargamos desde Github.

![3](https://user-images.githubusercontent.com/44879884/73498870-855a6e00-438c-11ea-9400-c1233021a9aa.PNG)

4. Usando maven podemos en la linea de comandos compilar y ejecutar el proyecto con el codigo **$ mvn package**

![4](https://user-images.githubusercontent.com/44879884/73498872-87bcc800-438c-11ea-9277-e8e48549c038.PNG)

![5](https://user-images.githubusercontent.com/44879884/73498873-88edf500-438c-11ea-9ce6-396135101579.PNG)

5. Si solo deseas correr las pruebas podemos ejecutar el comando maven **$ mvn test**

![6](https://user-images.githubusercontent.com/44879884/73498878-8ab7b880-438c-11ea-9fa1-fe11b0d5cff8.PNG)

6. Si deseas conocer a profundidad el funcionamiento del codigo, podemos abrir el proyecto en un editor java.

![7](https://user-images.githubusercontent.com/44879884/73498880-8be8e580-438c-11ea-94f6-611431805298.PNG)

7. Para generar el javadoc ejecutamos el comando **$ mvn javadoc:javadoc**

![8](https://user-images.githubusercontent.com/44879884/73498883-8e4b3f80-438c-11ea-8402-f0d6d71d94d0.PNG)

![9](https://user-images.githubusercontent.com/44879884/73498887-91dec680-438c-11ea-9594-8299c309d3c4.PNG)

## Despliegue continuo

[![CircleCI](https://circleci.com/gh/JuanNavarroJ/Arep_Lab2_SparkWebApp.svg?style=svg)](https://circleci.com/gh/JuanNavarroJ/Arep_Lab2_SparkWebApp)

## Desarrollo


Construido con:

-   [Maven](https://maven.apache.org/)  - Control de dependencias
-	[CircleCI] (https://circleci.com/)  - Despliegue continuo
-	[Heroku] (https://dashboard.heroku.com/apps) - Plataforma Web



## Autor

-   **Juan David Navarro Jimenez**    -  [JuanNavarroJ](https://github.com/JuanNavarroJ)


## License

This project is licensed under the GNU General Public License v3.0 - see the  [LICENSE.md]([https://github.com/JuanNavarroJ/ProyectoPSP0/blob/master/LICENSE.txt](https://github.com/JuanNavarroJ/ProyectoPSP0/blob/master/LICENSE.txt))  file for details.
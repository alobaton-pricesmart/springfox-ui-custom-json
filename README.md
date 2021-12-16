SpringFox (Swagger) UI From JSON File Example
=============================================
This is an example on generating [SpringFox/Swagger](http://springfox.github.io/springfox/) 
UI from API definition stored in a static JSON file.

### SpringFox Dependency
Only Springfox dependency required in this example is the `springfox-swagger-ui`
JAR.

```xml
<dependency>
	<groupId>io.springfox</groupId>
	<artifactId>springfox-boot-starter</artifactId>
	<version>${swagger.version}</version>
</dependency>
```

### Swagger JSON File
A `swagger.json` file containing the JSON definition is located under
`resources/static` folder. 

### Build
To build the JAR, execute the following command from the parent directory:

```
mvn clean install
```

### Run
To run the application fromm command line,

```
java -jar target/springfox-ui-from-json-example-1.0.0.jar
```

### Access Swagger Endpoints

##### Swagger UI
You can view the Swagger UI at `http://localhost:8080/swagger-ui/index.html?urls.primaryName=custom#/book-controller`.


##### Swagger JSON
You can view Swagger JSON doc at `http://localhost:8080/swagger.json`


[travis-badge]: https://travis-ci.org/indrabasak/springfox-ui-from-json-example.svg?branch=master
[travis-badge-url]: https://travis-ci.org/indrabasak/springfox-ui-from-json-example/

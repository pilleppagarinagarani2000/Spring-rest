# Spring Boot JWT Authentication example with Spring Security & Spring Data JPA


## Dependency
– If you want to use PostgreSQL:
```xml
<dependency>
  <groupId>org.postgresql</groupId>
  <artifactId>postgresql</artifactId>
  <scope>runtime</scope>
</dependency>
```
– or MySQL:
```xml
<dependency>
  <groupId>com.mysql</groupId>
  <artifactId>mysql-connector-j</artifactId>
  <scope>runtime</scope>
</dependency>
```
– or Oracle:
```xml
<dependency>
	<groupId>com.oracle.database.jdbc</groupId>
	<artifactId>ojdbc8-production</artifactId>
	<version>19.7.0.0</version>
	<type>pom</type>
</dependency>
```
## Configure Spring Datasource, JPA, App properties
Open `src/main/resources/application.properties`
- For PostgreSQL:
```
spring.datasource.url= jdbc:postgresql://localhost:5432/testdb
spring.datasource.username= postgres
spring.datasource.password= 123

spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation= true
spring.jpa.properties.hibernate.dialect= org.hibernate.dialect.PostgreSQLDialect

# Hibernate ddl auto (create, create-drop, validate, update)
spring.jpa.hibernate.ddl-auto= update

# App Properties
restdemo.app.jwtSecret= 8Zz5tw0Ionm3XPZZfN0NOml3z9FMfmpgXwovR9fp6ryDIoGRM8EPHAB6iHsc0fb
restdemo.app.jwtExpirationMs= 86400000
```
- For MySQL
```
spring.datasource.url=jdbc:mysql://localhost:3306/testdb_spring?useSSL=false
spring.datasource.username=root
spring.datasource.password=123456

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
spring.jpa.hibernate.ddl-auto=update

# App Properties
restdemo.app.jwtSecret=8Zz5tw0Ionm3XPZZfN0NOml3z9FMfmpgXwovR9fp6ryDIoGRM8EPHAB6iHsc0fb
restdemo.app.jwtExpirationMs=86400000
```

- For Oracle
```
spring.datasource.url=jdbc:oracle:thin:@localhost:1551:XE
spring.datasource.username=user
spring.datasource.password=123456

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.OracleDialect
spring.jpa.hibernate.ddl-auto=update

# App Properties
restdemo.app.jwtSecret=8Zz5tw0Ionm3XPZZfN0NOml3z9FMfmpgXwovR9fp6ryDIoGRM8EPHAB6iHsc0fb
restdemo.app.jwtExpirationMs=86400000
```

## Run Spring Boot application
```
mvn spring-boot:run
```
## Run Spring Boot application
```
mvn spring-boot:run
```

## Oracle table creation
```
CREATE TABLE USERS(
	ID NUMBER PRIMARY KEY,
	USERNAME VARCHAR2(20) UNIQUE,
	EMAIL VARCHAR2(50) UNIQUE,
	PASSWORD VARCHAR2(120),
	ADDRESS VARCHAR2(250)
);
```



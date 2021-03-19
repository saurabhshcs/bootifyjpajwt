# Spring-Boot JWT token authentication
> This is an example of JWT token based REST API authentication using Spring-Boot and JPA. 
> It will extend further to have integration with OAuth 2.0


## What is JWT?
> JSON Web Tokens are an open, industry standard RFC 7519 method for representing claims securely between two parties.
WT.IO allows you to decode, verify and generate JWT.


# What does this example do?
> This application generates JWT token and send this JWT token to the developer's email. The developer must use this JWT token to access our API.

## Machine Prerequisite
- Java 8 or later
- JWT Dependencies


# How to run this application
> This example is based on gradle but you can find following build configurations

## build.gradle

```gradle
dependencies {
	implementation('org.springframework.boot:spring-boot-starter-data-jpa')
	implementation('org.springframework.boot:spring-boot-starter-jdbc')
	implementation('org.springframework.boot:spring-boot-starter-web')
	implementation('org.springframework.boot:spring-boot-starter-security')
	compile group: 'io.jsonwebtoken', name: 'jjwt', version: '0.9.1'
	runtimeOnly('mysql:mysql-connector-java')
	testImplementation('org.springframework.boot:spring-boot-starter-test')
	testImplementation('org.springframework.security:spring-security-test')
}
```

## pom.xml

```xml
<project
    xmlns="http://maven.apache.org/POM/4.0.0"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.techsharezone</groupId>
    <artifactId>spring-boot-jpa-jwt</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.1.1.RELEASE</version>
        <relativePath />
    </parent>
    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
        <java.version>1.8</java.version>
    </properties>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-security</artifactId>
        </dependency>
        <dependency>
            <groupId>io.jsonwebtoken</groupId>
            <artifactId>jjwt</artifactId>
            <version>0.9.1</version>
        </dependency>
    </dependencies>
</project>
```

To clone this repository execute the following:

```
git clone https://github.com/saurabhshcs/bootify-aws.git
```
 
### Running service for the first time
In order to force the download of dependencies outside of IntelliJ:

`./gradlew build --refresh-dependencies`

### How to Run

`./gradlew bootRun`

#### Build conditionally on tests
`./gradlew clean build`  


This application is running on default port 6009 so that it can be accessible on http://localhost:6009


How to do
The developer first need to hit the 

`https://localhost:6009/authenticate`

from postman or any rest client. The system will generate a JWT token also send this token to the developer's email.


- 📫 Feel free to reach me: @ https://about.me/saurabhshcs

Reach out to me via [about.me](https://about.me/saurabhshcs)

![My github stats](https://github-readme-stats.vercel.app/api?username=saurabhshcs&show_icons=true)


![Profile views](https://komarev.com/ghpvc/?username=saurabhshcs)


Follow me on - [Medium](https://saurabhshcs.medium.com) | [Linkedin](https://www.linkedin.com/in/saurabhshcs/) | [YouTube](https://www.youtube.com/channel/UCSQqjPw7_tfx1Ie4yYHbcxQ?pbjreload=102) | [StackOverFlow](https://stackoverflow.com/users/10719720/saurabhshcs?tab=profile)


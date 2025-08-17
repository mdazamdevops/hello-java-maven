# DevOps Internship Task 8 - Hello Java Maven - Jenkins Build Project

## Elevate Labs: Empowering the Future of DevOps
This project is a testament to the high-quality, hands-on learning experience provided by Elevate Labs. Their internship program is dedicated to empowering the next generation of DevOps professionals by offering practical, real-world challenges that build foundational skills and a deep understanding of modern software development practices.
### Overview
This project is a simple Java HelloWorld application built with Maven and automated using Jenkins.  
It demonstrates how to integrate Maven builds into Jenkins CI/CD pipelines, including JUnit testing and artifact archiving.

### Tech Stack
- Java: JDK 8 or 11
- Maven: 3.8.x
- Jenkins: Freestyle Project
- JUnit: 4.13.2 for unit testing
- GitHub: Source code management

### Project Structure
```bash
hello-java-maven/
├── pom.xml                          # Maven build configuration file
├── src/
│   ├── main/
│   │   └── java/
│   │       └── HelloWorld.java      # Main application file
│   └── test/
│       └── java/
│           └── HelloWorldTest.java  # Unit test file

```

### How It Works

HelloWorld.java prints a simple message:
"Hello, Jenkins + Maven!"

HelloWorldTest.java uses JUnit to verify that the message is correct.

pom.xml:

Configures the Maven compiler plugin.

Adds JUnit as a test dependency.

Defines Java version compatibility.

### Jenkins Setup Steps
```
1. Install Jenkins (Docker method)
docker run -p 8080:8080 -p 50000:50000 jenkins/jenkins:lts
```
2. Configure Maven in Jenkins

Go to Manage Jenkins → Global Tool Configuration

Add Maven:

Name: Maven-3.8.6

Install automatically

Save.

3. Create Jenkins Job

New Item → Freestyle Project → hello-java-maven

Source Code Management: Git URL:

https://github.com/mdazamdevops/hello-java-maven.git


### Build:
```
Add build step: Invoke top-level Maven targets

Maven Version: Maven-3.8.6

Goals:

clean package
```

### Post-build Actions:

Archive artifacts: target/*.jar

Running Locally
### Compile and package

mvn clean package

### Run the application

java -cp target/hello-1.0.jar HelloWorld

### Run tests
mvn test
Output

### When the build is successful, Maven produces:
``
target/hello-1.0.jar
and Jenkins archives it as an artifact.
```
### Screenshots

Jenkins Dashboard (SUCCESS build)
Console Output (BUILD SUCCESS)
Test Results
Extra Features for Top Performer Submission
JUnit testing for code validation.
Artifact archiving in Jenkins.
```
### GitHub webhook for automated builds.

### Email/Slack notifications for build status.

# Creator
* Name: Mohd Azam Uddin

* Role: Data Analyst Intern

* Contribution: Monitored a server's performance using Netdata, gaining valuable experience in system observability and metrics analysis.

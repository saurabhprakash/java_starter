Uses: Java 8 and Spring boot

Main reference link: https://spring.io/guides

### STEPS
  	- brew update && brew install gradle
	- To test the Gradle installation, run Gradle from the command-line:
		>> gradle
	- Find out what Gradle can do
		>> gradle tasks
	- mkdir gradle
    - gradle wrapper --gradle-version 2.13
    - ./gradlew build
    - ./gradlew tasks
    - ./gradlew bootRun --stacktrace --debug

### Samples:
	1. curl localhost:8090/first: Fetches a string response(HelloController.java)
	2. localhost:8090/greeting?name=test: Sample rest response(GreetingController.java)
	3. Quote.java: consuming rest api data
	4. Postgres connection: (UserRepository.java, MainController.java, CustomUser.java)
		curl 'localhost:8090/demo/add?name=First&email=someemail@someemailprovider.com'
	5. Cache implementation(https://spring.io/guides/gs/caching/)[Book.java, BookRepository.java, SimpleBookRepository.java, AppRunner.java]
	6. Messaging using websocket: (https://spring.io/guides/gs/messaging-stomp-websocket/)[GreetingSocket.java, GreetingSocketController.java, HelloMessage.java, WebSocketConfig.java, src/main/resources/static/], test on url "http://localhost:8090/"
	7. securing webapp test code:(in progress)
	
Continuous Auto-restart With Spring Boot DevTools and Gradle: https://dzone.com/articles/continuous-auto-restart-with-spring-boot-devtools

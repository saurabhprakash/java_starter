STEPS
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

Sammples:
	1. curl localhost:8080: Fetches a string response(HelloController.java)
	2. localhost:8080/greeting?name=test: Sample rest response(GreetingController.java)
	3. Quote.java: consuming rest api data
	

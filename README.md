# Test Cases

1 - Find city by location service - location services off
``` java
Given the user is on the schedule page 
And he is not logged in
When he changes the city to seek care from the location service
And he blocks the location service on his device
Then he should see the alert message: "Please enable location services to find care near you."
```
2 - Change city by list of available cities
``` java
Given the user is on the schedule page
And he is not logged in
When he changes the city to seek care from the available cities
Then he should see the city was changed correctly
```

3 - Change city by city zip code
``` java
Given the user is on the schedule page
And he is not logged in
When he changes the city to seek care by entering the city zip code
Then he should see the city was changed correctly
```

4 -  Change city by city name
``` java
Given the user is on the schedule page
And he is not logged in
When he changes the city to seek care by entering the city name
Then he should see the city was changed correctly
```

5 - Choose the ChatCare option - without logging
``` java
Given the user is on the schedule page
And he is not logged in
When he selects the illness/injury
And he chooses the ChatCare option
Then he should see the login page
```

6 - Availability of the pages in the online help section
``` java
Given the user is on the schedule page
And he is not logged in
When he goes to each link on the Online Help section
Then he should see that each link has worked correctly
And every page is available
```

7 - Go to schedule page from the main page
``` java
Given the user is on the main page
And he is not logged in
When he goes to the schedule page
Then he should see the schedule page correctly
```

8 - Select illness/injury - frontend
``` java
Given the user is on the schedule page
And he is not logged in
When he selects the "Emergency Care" illness
Then he should see that the illness was selected correctly
```

9- Select illness/injury - e2e - validate the response for an user who is not logged in
``` java
Given the user is on the schedule page
And he is not logged in
When he selects the "Emergency Care" illness
Then he should see that the illness was selected correctly
And the service response should be a 403 forbidden
```

10 - Schedule a ChatCare - user not logged in
``` java
Given the user is on the schedule page
And he is not logged in
When he selects the "Emergency Care" illness
And he selects the ChatCare option
Then he should see the login page
```


# Automation Framework Instructions

## The technologies used are:
* Java
* Cucumber
* Gradle
* Selenium
* Serenity

## Required tool installations

* Java JDK [download](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html)
* Appium [download](https://github.com/appium/appium-desktop/releases/)
* Gradle [download](https://gradle.org/install/)
* Git executable [download](https://git-scm.com/downloads)

## Recommended tool installations

* IDE - IntelliJ IDEA Community Edition [download](https://www.jetbrains.com/idea/download)
* Gitflow Workflow [Documentation](https://www.atlassian.com/git/tutorials/comparing-workflows/gitflow-workflow)

## Setting required environment variables

We recommended going the official documentation for necessary setup.

* Java [Documentation](https://java.com/en/download/help/path.html)
* Gradle [Documentation](https://gradle.org/install/)

## Project compilation

It is important to compile the project before making a Pull Request in order to guarantee that the framework is working correctly.

```
gradle compileJava
```
And 
``` 
gradle clean assemble
```

## Run project

Available drivers [firefox, chrome, ie, safari, opera]

* Execute specific test using tags 
``` java
 gradle clean test -D"cucumber.filter.tags=@Smoke"
```

* Execution All tests and report generation - To run all the project tests and generate the Serenity report
``` java
 gradle clean test aggregate
```

## Report
The project is supported by [Serenity](https://serenity-bdd.github.io/theserenitybook/latest/manual-tests.html) for the generation of reports.

The report will available at -> 

``` 
├──AutomationFramework
|   └── target
|       └── site
|           └── serenity
|               └── index.html
```

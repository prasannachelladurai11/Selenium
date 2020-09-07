# Weather Authenticator Testing- Selenium 


Selenium is a portable framework for testing web applications


## Technical Stack Requirements

1) JAVA  ```1.8``` or Later 

	A) Download ```JDK``` and ```JRE``` 1.8 version form  ``` https://www.oracle.com/technetwork/java/javase/downloads/index.html ```
	
		i)How To Install JDK and JRE  https://docs.oracle.com/javase/10/install/installation-jdk-and-jre-microsoft-windows-platforms.htm#JSJIG-GUID-A7E27B90-A28D-4237-9383-A58B416071CA 

		ii)Set Environments Variables for the java to run the #Test From Command Line Refer the URL https://www.java.com/en/download/help/path.xml
	
2) Maven ```3.6``` or Later ( Depends on the JAVA Version) 
	
	A) Download ```Maven``` from ```https://maven.apache.org/download.cgi```
		
		i) Follow the installation guide https://mkyong.com/maven/how-to-install-maven-in-windows/
		

3) INTEGRATED DEVELOPMENT ENVIRONMENT
	
	A) Download ```Eclipse``` or ```VSCODE``` or ```IntelliJ IDEA```
	
4) From the IDE Market Place Download ```Cucumber```
	
	A) From ``` https://marketplace.eclipse.org/ ``` search for Nature Drag and Drop it on ```Eclipse```
	B) Or From Eclips Click ```Help``` -> ```Eclipse MarketPlace``` -> Search for ```Nature``` and Install
	
	
## Running Tests 

1) Download the Branch :- 
	1) Navigate to [Git Branch](https://github.com/prasannachelladurai11/Selenium/tree/Weather_Autheticator_Assignment)
	2) Click clone or Download 
	3) Click Download as Zip File.

## Import the Project
	
	A) Open Eclipse
	B) Click File -> Import -> Exsisting Maven Project -> Browse -> Select the Folder you Unzipped -> Make Sure Pom.xml is checked -> Finish.
	C) Wait for Maven to build your Project
	D) Make sure JDK is set as Execution Environment.
		
## Running Tests 
		
	A) Open CMD or Terminal
	B) Navigate to Project Root
	C) Type Command mvn clean verify -D surefire.suiteXmlFiles=./ExecutableFile/WeatherAuthenticator.testng.xml
	
## Verifying Results
	
	A) Open Project Root in File Explorer
	B) Navigate to target -> cucumber-reports -> advanced-reports -> cucumber-html-reports -> Open Overview-features
	
## Change Data Sets for Test Run:-
    
    A) For changing city Project-> src -> main -> resources -> FeatureFile -> WeatherAuthetication.feature and change city Name.
## Contributor
[Prasanna Chelladurai](www.linkedin.com/in/prasanna-chelladurai-00723144/)   
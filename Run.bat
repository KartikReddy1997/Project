@echo off
cd D:\gitfolder\NewLearnings1

echo Cleaning the project...
mvn clean

echo Running the tests...
mvn test

echo Generating Allure report...
allure generate allure-results --clean

echo Serving the Allure report...
allure serve target/allure-results

pause

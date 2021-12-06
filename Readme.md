# To Start the Application

1. Open Terminal. Execute : ./gradlew bootRun

# To test application

1. Open Terminal. Run curl localhost:8080

# Use actuator for check health status

1. curl localhost:8080/actuator
2. curl localhost:8080/actuator/health

# To generate Angular model/service using Open API

1. npm install -g ng-openapi-gen
2. npm install -g @angular/cli
3. Get Open API JSON for your Application : http://localhost:8080/v3/api-docs and store in a file as input

   ng-openapi-gen --input generate-type/digitallibrary-apidocs.json --output
   ../../workspace/DigitalLibrary-ag/src/app/api

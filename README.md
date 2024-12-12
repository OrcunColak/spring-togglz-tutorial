# Read Me

The original idea is from  
https://blog.devgenius.io/implementing-feature-flag-management-in-your-spring-boot-application-using-api-calls-and-ui-with-5dc49d621bf5

In this project Togglz stores the state in a JDBC store

# Togglz Management Console

The @Label annotation provides a human-readable name for the feature. This name will be displayed in the Togglz console if you decide to use it.

The FeatureManager is injected into the controller and used to check if a feature is active.

To enable the Togglz console, simply add the following property to your application.properties or application.yml file:

togglz.console.enabled=true

Go to
http://localhost:8080/togglz-console

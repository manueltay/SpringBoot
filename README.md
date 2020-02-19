Git and SpringBoot Tutorial - Manuel Tay - 
==============

Proyecto de prueba para mostrar el funcionamiento de git con gitflow al igual que la integración continua implementada en github


Workflow
========

To compile the entire project, run "mvn install".

To run the application, run "mvn jetty:run" and open http://localhost:8080/ .

To produce a deployable production mode WAR:
- change productionMode to true in the servlet class configuration (nested in the UI class)
- run "mvn clean package"
- test the war file with "mvn jetty:run-war"

# Use the latest Tomcat image as the base image
FROM tomcat:latest

# Rename the default Tomcat webapps directory to webapps2 (backup or reorganisation)
RUN mv /usr/local/tomcat/webapps /usr/local/tomcat/webapps2

# Restore the default webapps directory from its distribution copy
RUN mv /usr/local/tomcat/webapps.dist /usr/local/tomcat/webapps

# Add the compiled WAR file(s) from the target directory to the Tomcat webapps directory
ADD target/*.war /usr/local/tomcat/webapps/

# Expose port 9090 for external access to the application
EXPOSE 9090

# Command to run the Tomcat server using its Catalina script
CMD ["catalina.sh", "run"]

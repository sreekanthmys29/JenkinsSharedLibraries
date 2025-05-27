def call(){
       echo "Workspace: ${env.WORKSPACE}"
       echo "Job Name: ${env.JOB_NAME}"

       def WAR_FILE=$(find target -name "*.war" | head -n 1)
       echo "WAR_FILE : ${${env.JOB_NAME}}"
  
      withCredentials([usernamePassword(credentialsId: 'tomcat', passwordVariable: 'password', usernameVariable: 'username')]) {

       // Upload the WAR file to the remote server (e.g., Tomcat manager) 
        // --upload-file target/spring3-mvc-maven-xml-hello-world.war  or -T  target/spring3-mvc-maven-xml-hello-world.war
    sh """
       
        curl -v --upload-file "$WAR_FILE" \
          -u admin:${TOMCAT_PASSWORD} \
          "http://34.172.209.37:8085/manager/text/deploy?path=/spring3&update=true"
    """
    
      }


}

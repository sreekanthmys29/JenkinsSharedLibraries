def call(){

  
      withCredentials([usernamePassword(credentialsId: 'tomcat', passwordVariable: 'password', usernameVariable: 'username')]) {

       // Upload the WAR file to the remote server (e.g., Tomcat manager)
    sh """
      curl -v --upload-file target/spring3-mvc-maven-xml-hello-world.war \
           -u ${username}:${password} \
           http://34.172.209.37:8085/manager/text/deploy?path=/spring3&update=true
    """
    
      }


}

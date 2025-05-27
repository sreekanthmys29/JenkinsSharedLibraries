def call(){

 sh 'mvn clean verify sonar:sonar \
  -Dsonar.projectKey=spring3-mvc-maven-xml-hello-world \
  -Dsonar.host.url=http://34.172.209.37:9000 \
  -Dsonar.login=sqp_1b0b1c182e2397e490deb5f55c06987ce66fb757'
  

}

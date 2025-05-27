def call(String mavenGoal){
  
  if ("${mavenGoal}" == "clean")
     {
      echo "Clean------------"
       
       sh "mvn clean"
     }
  else if ("${mavenGoal}" == "compile")
     {
       sh "mvn clean compile"
     }
  else if ("${mavenGoal}" == "test")
     {
       sh "mvn clean test"
     }
   else if ("${mavenGoal}" == "package")
      {
        sh "mvn clean package"
     }
}

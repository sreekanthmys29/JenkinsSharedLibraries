def call(mavenGoal){

   if ("${mavenGoal}" == "clean"){
         sh "mvn clean"
   } 
 if ("${mavenGoal}" == "verify"){
         sh "mvn verify"
   } 

 if ("${mavenGoal}" == "test "){
         sh "mvn clean test"
   } 

 if ("${mavenGoal}" == "package "){
         sh "mvn clean package"
   } 

 if ("${mavenGoal}" == "install "){
         sh "mvn clean install"
  }

}

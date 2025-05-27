@Library('sharedLib') _

pipeline{

agent any

  tools{
      maven 'mavenLocal'

  }

  stages{

        stage('checkout code'){
     
                 steps{

                        git clone 'https://github.com/devopswithcloud/spring3-mvc-maven-xml-hello-world.git'


                 }

        }
      stage('maven build'){
     
                 steps{

                      build('clean')
                 }

        }




  }//stages





} //pipeline

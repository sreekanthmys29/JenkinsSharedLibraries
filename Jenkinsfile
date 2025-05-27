@Library('sharedLib') _

pipeline{

agent any

  tools{
      maven 'mavenLocal'

  }
  stages{
        stage('checkout code'){
                 steps{
                     script{
                        git 'https://github.com/devopswithcloud/spring3-mvc-maven-xml-hello-world.git'
                     }
                 }

        }
      stage('maven build'){
                 steps{
                      stages('Build')
                 }
        }
  }//stages




}       //pipeline



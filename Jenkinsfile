//@Library('sharedLib') _

pipeline {
    agent any
    tools {
       git 'Default'
       maven 'mavenLocal'
    }
    stages {
        stage('checkout code') {
            steps {
               git branch: 'master', credentialsId: 'jenkinsGit', url: 'https://github.com/sreekanthmys29/spring3-mvc-maven-xml-hello-world.git'
                
            }
        }
        stage('maven build') {
            steps {
                script {
                   sh 'mvn clean package'
                }
            }
        }
      
    }//stages
}       //pipeline

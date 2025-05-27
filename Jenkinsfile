@Library('sharedLib') _

pipeline {
    agent any
    tools {
        git 'Default'
        maven 'mavenLocal'
    }
    stages {
        stage('Checkout') {
            steps {
                gitclone(
                    branch: 'master',
                    url: 'https://github.com/sreekanthmys29/spring3-mvc-maven-xml-hello-world.git',
                    credentialsId: 'jenkinsGit'
                )
            }
        } //stage Checkout
         stage('maven build') {
            steps {
                script{
                               //  we are calling custom function buildcall in build.groovy  we should define inside script for custom functions
                                build.buildcall("package")

                }
            }
        } //maven build

        stage('sonarscanner') {
            steps {
                    //calling builit in function (call) in sonar.groovy file 
                    sonar()
                
            }
        } //sonar build

         stage('tomcat web') {
            steps {
                    //calling builit in function (call) in tomcat.groovy file 
                    tomcat()
              
            }
        } //tomcat

        stage('nexus deployment') {
            steps {
                    //calling builit in function (call) in nexus.groovy file 
                    nexus()
                
            }
        }
    }
}


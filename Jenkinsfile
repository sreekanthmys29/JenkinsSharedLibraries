@Library('sharedLib') _

pipeline {
    agent any
    tools {
        maven 'mavenLocal'
    }
    stages {
        stage('checkout code') {
            steps {
              
                    echo " GIt Chechout stage"
                    git();
                
            }
        }
        stage('maven build') {
            steps {
                script {
                    maven("package")
                }
            }
        }
        stage('sonarscanner') {
            steps {
                script {
                    sonar()
                }
            }
        }
        stage('nexus deployment') {
            steps {
              
                    nexus()
                
            }
        }
        stage('tomcat web') {
            steps {
               
                    tomcat()
                
            }
        }
    }//stages
}       //pipeline

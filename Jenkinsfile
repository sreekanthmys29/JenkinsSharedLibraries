@Library('sharedLib') _

pipeline {
    agent any
    tools {
       git 'Default'
       maven 'mavenLocal'
    }
    stages {
        stage('checkout code') {
            steps {
                script {
                    echo " GItclone stage"
                       gitclone('master', 'jenkinsGit', 'https://github.com/sreekanthmys29/spring3-mvc-maven-xml-hello-world.git')
                
                }
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
                script {
                    nexus()
                }
            }
        }
        stage('tomcat web') {
            steps {
                script {
                    tomcat()
                }
            }
        }
    }//stages
}       //pipeline

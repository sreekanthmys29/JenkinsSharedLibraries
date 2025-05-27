@Library('sharedLib') _

pipeline {
    agent any
    tools {
        maven 'mavenLocal'
    }
    stages {
        stage('checkout code') {
            steps {
                script {
                    git();
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

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
                               // instead of  build("package")   we are calling custom function buildcall  showuld define inside script
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
    }
}


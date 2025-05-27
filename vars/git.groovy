def call(String branch = 'master', String repoUrl, String credentialsId) {
    pipeline {
        agent any
        tools {
            git 'Default'
            maven 'mavenLocal'
        }
        stages {
            stage('Checkout code') {
                steps {
                    git branch: branch, credentialsId: credentialsId, url: repoUrl
                }
            }
            stage('Maven build') {
                steps {
                    sh 'mvn clean package'
                }
            }
        }
    }
}

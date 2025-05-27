def call(Map params = [:]) {
    // Extract parameters with defaults
    def branch = params.get('branch', 'master')
    def repoUrl = params.get('repoUrl', '')
    def credentialsId = params.get('credentialsId', '')

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

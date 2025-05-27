@Library('sharedLib') _

pipeline {
    agent any
    tools {
        git 'Default'
        maven 'mavenLocal'
    }
    stages {
        stage('Build app') {
            steps {
                git(
                    branch: 'master',
                    url: 'https://github.com/sreekanthmys29/spring3-mvc-maven-xml-hello-world.git',
                    credentialsId: 'jenkinsGit'
                )
            }
        }
    }
}


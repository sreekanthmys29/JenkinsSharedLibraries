// vars/buildSpringApp.groovy

def call(Map params = [:]) {
    def branch = params.get('branch', 'master')
    def repoUrl = params.get('repoUrl', '')
    def credentialsId = params.get('credentialsId', '')

  
        git branch: branch, credentialsId: credentialsId, url: repoUrl
   
   
}

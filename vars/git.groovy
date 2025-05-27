// vars/buildSpringApp.groovy

def call(Map params = [:]) {
    def branch = params.get('branch', 'master')
    def url = params.get('url', '')
    def credentialsId = params.get('credentialsId', '')

  
        git branch: branch, credentialsId: credentialsId, url: url
   
   
}

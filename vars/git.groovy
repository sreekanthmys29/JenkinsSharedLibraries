// vars/buildSpringApp.groovy

def call(Map params = [:]) {
    def branch = params.get('branch', 'master')
    def url = params.get('url', '')
    def credentialsId = params.get('credentialsId', '')

  git branch: 'master', credentialsId: 'jenkinsGit', url: 'https://github.com/sreekanthmys29/spring3-mvc-maven-xml-hello-world.git'
     
   
   
}

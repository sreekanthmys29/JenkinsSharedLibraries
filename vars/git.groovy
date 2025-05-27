def call(){
       echo "Invoke GIt Groovy------"
       git branch: 'main', credentialsId: 'jenkinsGit', url: 'https://github.com/sreekanthmys29/spring3-mvc-maven-xml-hello-world.git'
}

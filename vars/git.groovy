def call(){
       echo "Invoke GIt Groovy------"
       git(
                    url: 'https://github.com/sreekanthmys29/spring3-mvc-maven-xml-hello-world.git',
                    branch: 'master',
                    credentialsId: 'jenkinsGit'
                )
}

def call() {
    //Install jenkins  Pipeline Maven Integration Plugin
    //echo " Install Jenkins  Plugin  Pipeline Maven Integration..."
   // def pom = readMavenPom file: 'pom.xml'
   // echo "   POM: {pom} "
   // echo " - GroupId: ${pom.groupId}"
    //echo " - ArtifactId: ${pom.artifactId}"
   // echo " - Version: ${pom.version}"
   // echo " - Packaging: ${pom.packaging}"
    
        //If not Plugin , You can parse the pom.xml manually in Groovy
        def pomXml = readFile('pom.xml')
        def pom = new XmlSlurper().parseText(pomXml)
        echo "GroupId: ${pom.groupId.text()}"
        echo "ArtifactId: ${pom.artifactId.text()}"
        echo "Version: ${pom.version.text()}"

    
}

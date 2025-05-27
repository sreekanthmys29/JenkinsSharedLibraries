def call(){

     echo "Nexus deployment"
       def pom = readMavenPom file: 'pom.xml'
       echo "Parsed POM - GroupId: ${pom.groupId}, ArtifactId: ${pom.artifactId}, Version: ${pom.version}"

}

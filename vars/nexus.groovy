def call() {
    echo " Install Jenkins  Plugin  Pipeline Maven Integration..."

    // Read and parse pom.xml
    def pom = readMavenPom file: 'pom.xml'

    echo "   POM: {pom} "
    echo " - GroupId: ${pom.groupId}"
    echo " - ArtifactId: ${pom.artifactId}"
    echo " - Version: ${pom.version}"
    echo " - Packaging: ${pom.packaging}"
}

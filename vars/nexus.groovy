def call() {
    echo " Nexus Deployment Starting..."

    // Read and parse pom.xml
    def pom = readMavenPom file: 'pom.xml'

    echo "✅ Parsed POM:"
    echo " - GroupId: ${pom.groupId}"
    echo " - ArtifactId: ${pom.artifactId}"
    echo " - Version: ${pom.version}"
    echo " - Packaging: ${pom.packaging}"
}

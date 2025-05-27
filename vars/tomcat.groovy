def call() {
    echo "Workspace: ${env.WORKSPACE}"
    echo "Job Name: ${env.JOB_NAME}"

    // Find WAR file path using shell, and store it in a Groovy variable
    def warFile = sh(
        script: 'find target -name "*.war" | head -n 1',
        returnStdout: true
    ).trim()

    echo "WAR File: ${warFile}"

    withCredentials([usernamePassword(
        credentialsId: 'tomcat',
        usernameVariable: 'USERNAME',
        passwordVariable: 'PASSWORD'
    )]) {

        sh """
            curl -v --upload-file "${warFile}" \\
              -u ${USERNAME}:${PASSWORD} \\
              "http://34.172.209.37:8085/manager/text/deploy?path=/spring3&update=true"
        """
    }
}

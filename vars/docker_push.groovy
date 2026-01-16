def call(String projectName, String tag, String imageUser) {

    withCredentials([usernamePassword(
        credentialsId: "dockerHubCred",
        usernameVariable: "DH_USER",
        passwordVariable: "DH_PASS"
    )]) {
        sh '''
            echo "$DH_PASS" | docker login -u "$DH_USER" --password-stdin
        '''
    }

    sh "docker push ${imageUser}/${projectName}:${tag}"
}

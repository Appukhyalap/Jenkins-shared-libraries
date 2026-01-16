def call(String ProjectName, String Tag, String dockerhubuser){
    withCredentials([usernamePassword(credentialsId:"dockerHubCred", usernameVariable:"dockerHubUser", passwordVariable:"dockerHubPass")]){
        sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
    }
    sh "docker push ${dockerHubUser}/${ProjectName}:${Tag}"
}

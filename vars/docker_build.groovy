def call(String ProjectName, String Tag, String DockerHubUser){
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${Tag} ."
}

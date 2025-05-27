
def call(String branch , String credentialsId, String url) {
   echo "branch -----${branch}"
    echo "credentialsId -----${credentialsId}"
    echo "url -----${url}"
     echo "git clone"
    git branch: branch, credentialsId: credentialsId, url: url
}

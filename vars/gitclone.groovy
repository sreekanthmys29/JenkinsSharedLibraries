// Avoid re-calling the same `call` unintentionally
def call(Map params = [:]) {
    checkoutFromGit(params)
}

def checkoutFromGit(Map params) {
    git branch: params.branch, credentialsId: params.credentialsId, url: params.url
}

void call(){
    stages{
        stage('Pipeline Prerequisites') {
            steps {
                script {
                    sh(script: "echo SUCCESS", returnStdout: true).trim()
                }
            }
        }
    }
}
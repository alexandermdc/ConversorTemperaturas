pipeline {
    agent any 
    stages {
        stage('Linting') {
            steps {
                sh 'mvn site'
            }
        }
    }
}

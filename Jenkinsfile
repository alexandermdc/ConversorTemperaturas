pipeline {
    agent any 
    stages {
        stage('Linting') {
            steps {
                sh 'mvn site'
            }
        }
        stage('testes'){
            steps{
                sh 'mvn checkstyle::check'
            }
        }
    }
}
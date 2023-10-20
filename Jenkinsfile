pipeline {
    agent any {
        stages('Linting') {
            steps {
                sh 'mvn site'
            }
        }
    }
}

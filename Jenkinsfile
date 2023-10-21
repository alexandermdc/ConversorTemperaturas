pipeline {
    agent none {
        stages('Linting') {
            steps {
                sh 'mvn site'
            }
        }
    }
}

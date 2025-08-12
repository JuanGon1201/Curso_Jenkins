pipeline {
    agent any
    
    
    tools {
        jdk 'jdk11'
        //gradle 'Gradle 9.0' // Este nombre debe coincidir con el configurado en Jenkins
    }


    stages {
        stage('Build') {
            steps {
                script {
                    sh '''
                        java -version
                        ./gradlew clean build
                    '''
                }
            }
        }

        stage('Test') {
            steps {
                sh './gradlew test'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Paso de deploy'
            }
        }
    }

    post {
        always {
            echo "Pipeline completado - Estado: ${currentBuild.result ?: 'SUCCESS'}"
        }
        failure {
            echo "¡Pipeline fallido! Revisar logs."
        }
    }
}

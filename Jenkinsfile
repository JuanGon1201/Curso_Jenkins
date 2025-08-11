pipeline {
    agent any

    stages {  // "stages" agrupa todos los "stage"
        stage('Build') {  // Cada etapa es un "stage"
            steps {  // "steps" (en plural) para las acciones
                echo "Paso de build"
                    sh "./gradlew clean build"
            }
        }
        stage('Test') {
            steps {
                echo "Paso de test"
                sh "./gradlew clean test"
            }
        }
        stage('Deploy') {
            steps {
                echo "Paso de deploy"
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

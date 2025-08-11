pipeline {
    agent any

    stages {  // "stages" agrupa todos los "stage"
        stage('Build') {  // Cada etapa es un "stage"
            steps {  // "steps" (en plural) para las acciones
                echo "Paso de build"
            }
        }
        stage('Test') {
            steps {
                echo "Paso de test"
                echo "Paso de test 2"
            }
        }
        stage('Deploy') {
            steps {
                echo "Paso de deploy"
            }
        }
    }
}

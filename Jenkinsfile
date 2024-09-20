pipeline {
    agent any
    tools {
        maven 'Maven 3.9.9'  // Use the correct name with a space
    }
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/PetraHauk/TempConverter.git'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Verify') {
            steps {
                bat 'mvn verify'
            }
        }
    }
    post {
        always {
            junit '**/target/surefire-reports/*.xml'
        }
    }
}

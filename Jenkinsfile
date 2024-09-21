pipeline {
    agent any
    tools {
        maven 'Maven 3.9.9'  // Ensure the correct Maven version
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
        stage('JaCoCo Report') {
            steps {
                jacoco execPattern: '**/target/jacoco.exec'
            }
        }
    }
    post {
        always {
            junit '**/target/surefire-reports/*.xml'
            jacoco execPattern: '**/target/jacoco.exec'
        }
    }
}

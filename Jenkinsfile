pipeline {
    agent any
    tools {
        maven 'Maven_3.9.9'
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

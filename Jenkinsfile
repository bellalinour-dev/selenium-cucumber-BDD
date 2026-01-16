pipeline {
    agent any

    tools {
        maven 'Maven-3.9.12'     // nom du Maven configuré dans Jenkins
        jdk 'JDK21'             // nom du JDK configuré dans Jenkins
    }

    environment {
        MAVEN_OPTS = "-Xmx1024m"
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/bellalinour-dev/selenium-cucumber-BDD.git'
            }
        }

        stage('Clean') {
            steps {
                bat 'mvn clean'
            }
        }

        stage('Compile') {
            steps {
                bat 'mvn compile'
            }
        }

        stage('Run Tests') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Cucumber Report') {
            steps {
                bat 'mvn verify'
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: '**/target/*.html', fingerprint: true
            junit '**/target/surefire-reports/*.xml'
        }
        failure {
            echo '❌ Pipeline échoué'
        }
        success {
            echo '✅ Tests exécutés avec succès'
        }
    }
}

pipeline {
    agent any

    tools {
        maven 'Maven-3.9.12'
        jdk 'JDK21'
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
                // Génère le JSON report pour Cucumber
                bat 'mvn test -Dcucumber.plugin="json:target/cucumber-report.json"'
            }
        }

        stage('Cucumber Report') {
            steps {
                // Utilise le plugin Cucumber Jenkins pour générer le HTML à partir du JSON
                cucumber(
                    jsonReportDirectory: 'target',
                    fileIncludePattern: 'cucumber-report.json'
                )
            }
        }
    }

    post {
        always {
            //archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
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
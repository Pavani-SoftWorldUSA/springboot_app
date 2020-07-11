#!groovy

pipeline {

  agent any
  tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "M3"
    }


  stages {

    // Build
    stage('Build') {
      steps {
        deleteDir()
        checkout scm
       // Run Maven on a Unix agent.
                sh "mvn -Dmaven.test.failure.ignore=true clean package"
      }
    }

    // Static Code Analysis
    stage('Static Code Analysis') {
      steps {
        sh "echo 'Run Static Code Analysis'"
      }
    }

    // Unit Tests
    stage('Unit Tests') {
      steps {
        sh "echo 'Run Unit Tests'"
      }
    }

    // Acceptance Tests
    stage('Acceptance Tests') {
      steps {
        sh "echo 'Run Acceptance Tests'"
      }
    }

  }
  post {
    success {
      sh "echo 'Send mail on success'"
      // mail to:"pavaniRajeswari.m@gmail.com", subject:"SUCCESS: ${currentBuild.fullDisplayName}", body: "Yay, we passed."
    }
    failure {
      sh "echo 'Send mail on failure'"
      // mail to:"pavaniRajeswari.m@gmail.com", subject:"FAILURE: ${currentBuild.fullDisplayName}", body: "Boo, we failed."
    }
  }
}

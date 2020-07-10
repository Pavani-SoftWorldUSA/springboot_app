#!groovy

pipeline {

  agent any

  stages {

    // Build
    stage('Build') {
      agent {
        label 'node'
      }
      steps {
        deleteDir()
        checkout scm
      }
    }

    // Static Code Analysis
    stage('Static Code Analysis') {
      agent {
        label 'node'
      }
      steps {
        deleteDir()
        checkout scm
        sh "echo 'Run Static Code Analysis'"
      }
    }

    // Unit Tests
    stage('Unit Tests') {
      agent {
        label 'node'
      }
      steps {
        deleteDir()
        checkout scm
        sh "echo 'Run Unit Tests'"
      }
    }

    // Acceptance Tests
    stage('Acceptance Tests') {
      agent {
        label 'node'
      }
      steps {
        deleteDir()
        checkout scm
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

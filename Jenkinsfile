pipeline {
  agent any
  stages {
    stage('execute') {
      steps {
        sh '''sudo rm -rf /var/lib/apt/lists/*
sudo apt-get update
sudo apt-get install golang-1.10'''
      }
    }
  }
}
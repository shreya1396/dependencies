@Library("jenkins-shared-library") _
pipeline {
  agent any
  environment { 
    PATH = "/home/jenkins"
    
  }
  
  stages {
    stage('execute') {
      steps {
        sh '''sudo rm -rf /var/lib/apt/lists/*
sudo apt-get install golang-1.10'''
      }
    }
  }
}

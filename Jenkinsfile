@Library("jenkins-shared-library") _
pipeline {
  branch = 'branch1'
  agent any
  environment { 
    PATH = "/home/jenkins"
    
  }
  
  stages {
    stage('execute') {
      steps {
        sh '''
         echo 'The job is executing'
         '''
      }
    }
  }
}

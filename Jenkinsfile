pipeline {
  agent any
  stages {
    stage('execute') {
      steps {
        sh '''sudo rm -rf /var/lib/apt/lists/*
export http_proxy=http://shreya_gaunekar:sn13%2196%1@goaproxy.persistent.co.in:8080
sudo apt-get update
sudo apt-get install golang-1.10'''
      }
    }
  }
}
#!/usr/bin/env groovy

def call(body) {
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()
     
     script {
			  sh '''
			  	sudo apt-get -y install golang-1.10
			   '''
		   }

    
    return this
}

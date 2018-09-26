#!/usr/bin/env groovy

def call(body) {
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()
     
     script {
			  sh '''
			  	sudo apt-get -y install wget tar make gcc curl
			   '''
		   }

    
    return this
}

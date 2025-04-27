@Library('my-shared-library') _

pipeline {
    agent any

    stages {
        stage('Say Hello') {
            steps {
                script {
                    sayHello("Akash")  // Assuming sayHello is defined in the shared library
                }
            }
        }

        stage('Use Utils Class') {
            steps {
                script {
                    // Creating an instance of the Utils class
                    def utils = new org.example.Utils(this)
                    // Calling the greet method on the instance
                    utils.greet("Akash")
                }
            }
        }
    }
}

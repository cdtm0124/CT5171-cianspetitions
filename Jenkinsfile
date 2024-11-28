pipeline {
    agent any // Allows the pipeline to run on any available agent

    tools {
        git 'Default' // Ensures Git is available on the agent
    }

    stages {
        stage('GetProject') { // Stage to clone the project repository
            steps {
                git branch: 'main', url: 'https://github.com/cdtm0124/cianspetitions.git' // Clones the main branch of the GitHub repository
            }
        }

        stage('Build') { // Stage to clean the project
            steps {
                sh 'mvn clean:clean' // Runs Maven to clean the project
            }
        }

        stage('Package') { // Stage to package the project
            steps {
                sh 'mvn package' // Runs Maven to package the application into a WAR file
            }
        }

        stage('Archive') { // Stage to archive build artifacts
            steps {
                archiveArtifacts allowEmptyArchive: true, artifacts: '**/target/*.war'
                // Archives the WAR file(s) from the target directory
            }
        }

        stage('Deploy') { // Stage to build and deploy the Docker container
            steps {
                // Builds a Docker image named 'myapp' using the Dockerfile
                sh 'sudo docker build -f Dockerfile -t myapp .'

                // Removes any existing container named 'myappcontainer', ignoring errors if it doesn't exist
                sh 'sudo docker rm -f "myappcontainer" || true'

                // Runs the Docker container named 'myappcontainer', exposing port 9090 and detaching it
                sh 'sudo docker run --name "myappcontainer" -p 9090:8080 --detach myapp:latest'
            }
        }

        stage('Approve Deployment') { // Manual approval stage
            steps {
                input "Approve File Deployment:" // Waits for manual approval before proceeding
            }
        }
    }
}

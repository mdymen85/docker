pipeline {
    agent any
    
    stages {
        stage('clone') {
            steps {
                git branch: 'v3-23-10-2021', credentialsId: 'GitHub', url: 'https://github.com/mdymen85/docker.git'
            }
        
        }
        stage('build') {
            steps {
                sh "JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64/ ; PATH=$JAVA_HOME/bin:$PATH"
                sh "mvn clean install -DskipTests"
            }
        }
        stage('image') {
            steps {
                sh "sudo docker-compose up -d"
            }
        }
    }
}

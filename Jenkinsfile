pipeline {
    agent any
    
    environment {
       JAVA = '/usr/lib/jvm/java-11-openjdk-amd64/'
    }
    
    stages {
        stage('clone') {
            steps {
                git branch: 'v4-26-09-2021-Jenkinsfile', credentialsId: 'GitHub', url: 'https://github.com/mdymen85/docker.git'
            }
        
        }
        stage('build') {
            steps {
//                sh "JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64/"
                sh "PATH=${JAVA}/bin:$PATH"
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

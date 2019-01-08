node {
    stage('Application_Build') {
        checkout scm
        bat 'mvn package -DskipTests'
    }    
    stage('Application_Unit_Test') {        
        bat 'mvn test'
        step([$class: 'Publisher'])
    }    
    stage('Application_Code_Analysis') {        
        withSonarQubeEnv {
            bat 'mvn sonar:sonar'
        }        
    }
    stage('Application_Deploy') {
        build 'Application_Deploy_To_Test'
    }    
}

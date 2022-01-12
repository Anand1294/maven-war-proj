def url = env.RUN_DISPLAY_URL

url = url.replace("display/redirect","console")

pipeline {
    agent any

        /*tools
        {
        jdk 'JAVA_HOME'
        }*/
        stages {
        stage('Checkout') {
            steps {
                cleanWs()
                git branch: 'master', url: 'https://github.com/Anand1294/maven-war-proj.git'
                //sleep(30)
            }
        }
        stage('Build') {
            steps {
                script {
                    sh 'chmod -R +x /var/jenkins_home/workspace/'
                    sh './mvnw clean install'        
                    jacoco buildOverBuild: true, changeBuildStatus: true, deltaBranchCoverage: '40', deltaClassCoverage: '40', deltaComplexityCoverage: '40', deltaInstructionCoverage: '40', deltaLineCoverage: '40', deltaMethodCoverage: '40'//, maximumMethodCoverage: '2', minimumMethodCoverage: '1'
                }
                archiveArtifacts artifacts: 'target/*.war', fingerprint: true
            }
        }
        stage('Quality Check') {
            steps {
                script {
                    withSonarQubeEnv('sonarqube'){
                        sh '/var/jenkins_home/workspace/maven-war-pipeline/mvnw sonar:sonar'
                    }
                    
                    timeout(time: 1, unit: 'MINUTES') {
                        def qualityGate = waitForQualityGate()
                        if (qualityGate.status != 'OK') {
                            error "Pipeline aborted due to quality gate failure"
                        }
                    }
                }
            }
        }
        stage('Deploy') {
            steps {
                echo "deploying"
                deploy adapters: [tomcat8(credentialsId: 'tomcat', path: '', url: 'http://192.168.1.39:8082')], contextPath: 'test',  onFailure: false, war: 'target/*.war'
            }
        }
    }
    post {
        always {
            //junit 'build/test-results/**/*.xml'
            junit allowEmptyResults: true, testResults: 'target/**/*.xml'
        }
        success {
            mail body: "This is Jenkins Mail.\n${env.JOB_NAME} run successful.\nPlease verify the build result using the mentioned link : ${url}.\n\nThe job can also be accessed using the mentioned link : ${env.JOB_DISPLAY_URL}",
                subject: "Jenkins Success Build ${env.JOB_NAME}",
                to: "shubhamgke1203@gmail.com" 
        }
        failure {
            mail body: "This is Jenkins Mail.\n${env.JOB_NAME} execution failed.\nPlease verify and troubleshoot the build result using the mentioned link : ${url}.\n\nThe job can also be accessed using the mentioned link : ${env.JOB_DISPLAY_URL}",
                subject: "Jenkins Fail Build ${env.JOB_NAME}",
                to: "shubhamgke1203@gmail.com" 
        }
    }
}

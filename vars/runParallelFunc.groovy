def call(String name) {
      return {
//      stages {
        node("linux-agent") {
          stage("${name}") {
            stage('test & scan with sonar') { 
              sh "echo Do testing & scan ${name} with sonar"
            }
            stage("Build ${name} for ssv") {
              sh "echo building ${name}"
            }
          }
//    stage('Build FP_name Docker Image for ssv') {
//      steps {
//        echo "docker build ${name}"
//      }
//    }
//    stage('Deploy FP_name to SSV openshift') {
//      steps {
//        echo "deploy ${name}"
//      }
//    }
//  }
        }
//      }
      }
}

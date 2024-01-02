def call(String name) {
//  stages {
//    stage('test & scan with sonar') { 
//      steps {
        echo "testing & scan ${name} with sonar"
//      }
//    }
//    stage('Build FP_name for ssv') {
//      steps {
        echo "building ${name}"
//      }
//    }
//    stage('Build FP_name Docker Image for ssv') {
//      steps {
        echo "docker build ${name}"
//      }
//    }
//    stage('Deploy FP_name to SSV openshift') {
//      steps {
        echo "deploy ${name}"
//      }
//    }
//  }
}

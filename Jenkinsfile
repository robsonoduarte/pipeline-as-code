node{
   stage 'Checkout the source code '
   checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/robsonoduarte/tests.git']]])

   stage 'Run Assemble Project'
   sh './gradlew assemble'

   stage 'Run Unit Tests '
   sh './gradlew test'

   stage 'Run Build Docker Image'
   echo './gradlew dockerImage'

   stage 'Run Docker Image'
   sh 'docker -v'

   stage 'Run Integration Tests'
   echo './gradlew itest'

}






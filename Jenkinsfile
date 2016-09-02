node{
   stage 'Checkout the source code '
   checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/robsonoduarte/tests.git']]])

   stage 'Run Assemble Project'
   sh 'gradle assemble'

   stage 'Run Unit Tests '
   sh 'gradle test'

   stage 'Run Build Docker Image'
   sh 'gradle dockerImage'

   stage 'Run Docker Image'
   sh 'docker run ...'

   stage 'Run Integration Tests'
   sh 'gradle itest'

}






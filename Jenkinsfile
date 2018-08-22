node {
   stage ('Preperation'){
       checkout scm credentialsId: 'frederikmadsen', url: 'git@github.com:Hugzy/jenkins-workshop.git'
   }
   stage ('Build'){
       sh 'docker run -i -v $PWD:/usr/src/mymaven -w /usr/src/mymaven --rm maven:3-jdk-8 mvn clean package'
   }
   stage ('Results') {
       junit '**/target/surefire-reports/TEST-*.xml'
       // This step should not normally be used in your script. Consult the inline help for details.
       archiveArtifacts 'target/gildedrose-*.jar'
   }
   stage ('Javadoc'){
       echo 'i totally did something'
   }
}
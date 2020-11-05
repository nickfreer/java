pipeline {
   agent any

   stages {
      //stage('Clone Repo') {
         //steps {
            //println 'Cloning'
            //sh "rm -rf java"
            //sh "git clone https://github.com/nickfreer/java.git"
         //}
      //}
      stage('Build') {
         steps {
            println "Building"
            sh "cd java/mosh/src ; javac App.java"
         }
      }
      stage('Test') {
         steps {
            sh "cd java/mosh/src ; java App"
         }
      }
   }
}


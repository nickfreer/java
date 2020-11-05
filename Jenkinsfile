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
            sh "cd mosh/src ; javac App.java"
         }
      }
      stage('Test') {
         steps {
            sh "cd mosh/src ; java App"
         }
      }
   }
}


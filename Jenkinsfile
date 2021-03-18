node { 
 stage('Preparation') { 
 git 'https://github.com/T9801/SimpleWebApp.git' 
} 
 stage('Build') { 
 sh "./gradlew clean test" 
} 
 stage('Deploy') { 
 sh "git push https://git.heroku.com/cryptic-plateau-58964.git master" 
} 
}
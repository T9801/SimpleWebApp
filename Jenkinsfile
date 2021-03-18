node { 
 stage('Preparation') { 
 git 'https://github.com/T9801/SimpleWebApp.git' 
} 
 stage('Build') { 
 git-bash.exe -c "./gradlew clean test" 
} 
 stage('Deploy') { 
 git-bash.exe -c "git push https://git.heroku.com/cryptic-plateau-58964.git master" 
} 
}
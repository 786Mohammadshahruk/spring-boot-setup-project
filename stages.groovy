return [
        [
                name: 'Git Checkout',
                script: {

                }
        ],
        [
                name: 'Gradle Clean Build',
                script: {
                    sh './gradlew clean build'
                }
        ],
        [
                name: 'Gradle Test',
                script: {
                    sh './gradlew test'
                }
        ],
        [
                name: 'SonarQube Analysis',
                script: {
                    withSonarQubeEnv('SonarQube') {
                        sh './gradlew sonarqube'
                    }
                }
        ],
        [
                name: 'Docker Build and Push',
                script: {
                    def imageName = 'your-docker-repo/your-image-name'
                    sh 'docker build -t $imageName .'
                    sh 'docker push $imageName'
                }
        ]
        // Add more stages here as needed
]

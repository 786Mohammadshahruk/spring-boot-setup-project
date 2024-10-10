pipeline {
    agent any
    stages {
        script {
            def stages = load 'stages.groovy'
            for (stage in stages) {
                stage(stage.name) {
                    steps {
                        script {
                            stage.script()
                        }
                    }
                }
            }
        }
    }
}

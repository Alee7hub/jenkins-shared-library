def call(String imageName) {
    return new com.example.Docker(this).buildDockerImage(imageName)
}
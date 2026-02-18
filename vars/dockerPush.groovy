def call(String imageName) {
    return new com.example.Docker(this).dockerPush(imageName)
}
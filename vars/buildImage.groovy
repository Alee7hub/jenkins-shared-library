import com.example.Docker

def call(String imageName) {
    Docker docker = new Docker(this)
    return docker.buildDockerImage(imageName)
}
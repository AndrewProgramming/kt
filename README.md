# KTBYTE DevOps Interview App

This is a simple app that just displays "hello, world" on port 7070.

* `GET /` returns "Hello World"
* `GET /health` usually returns 200, but it's a little flaky.

## Instructions

Your goal is to have the app running in a Docker container on a server:

1. Create a Dockerfile that packages the app
2. Build the Docker image and push it to a Docker registry (e.g. Docker Hub)
3. On the server we provide, deploy the Docker image to a container

Things to consider:

- The Docker image should be (relatively) lightweight.
- The Docker container should have port 7070 exposed to the host.
- Logs are saved to /logs folder - these should be persisted on the server (outside the container).
- You can use the Docker CLI, or docker-compose.
- A health check on the container would be nice.

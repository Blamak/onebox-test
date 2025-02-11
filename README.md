### Building and running the application
1️⃣ Run the Application from Maven (pom.xml)
1. fgdf
2. Docker
Start application by running:
`docker compose up --build`.

The application will be available at http://localhost:9191.

### Deploying the application to the cloud

First, build the image, e.g.: `docker build -t myapp .`.
If your cloud uses a different CPU architecture than your development
machine (e.g., you are on a Mac M1 and your cloud provider is amd64),
you'll want to build the image for that platform, e.g.:
`docker build --platform=linux/amd64 -t myapp .`.

Then, push it to your registry, e.g. `docker push myregistry.com/myapp`.

Consult Docker's [getting started](https://docs.docker.com/go/get-started-sharing/)
docs for more detail on building and pushing.

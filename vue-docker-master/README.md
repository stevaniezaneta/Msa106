## Run App

Requires Node.js v6+

``` bash
npm install
npm install -g @vue/cli
npm run serve
```
## Now, application will be accessible at http://localhost:5000/.


# Dockerizing a Vue.js application

The blog post accompanying this repository is [here](https://shekhargulati.com/2019/01/18/dockerizing-a-vue-js-application/).

``` please run these following
docker build --build-arg APP_API_URL=http://localhost:3333 -f Dockerfile-prod -t myapp-prod 
docker run -it -p 80:80 --rm myapp-prod

after run, access the vue page on http://localhost (do not close this docker terminal)
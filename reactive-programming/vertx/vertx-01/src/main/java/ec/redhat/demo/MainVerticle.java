package ec.redhat.demo;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.DeploymentOptions;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;

public class MainVerticle extends AbstractVerticle {

    @Override
    public void start() {
        //Multiple threads
        DeploymentOptions ops= new DeploymentOptions()
        .setWorker(true)
        .setInstances(8);
        
        vertx.deployVerticle("ec.redhat.demo.HelloVerticle",ops);
        Router router = Router.router(vertx);
        router.get("/api/v1/hello")
               .handler(this::helloVertx);
        router.get("/api/v1/hello/:name")
                .handler(this::helloName);

        vertx.createHttpServer()
                .requestHandler(router)
                .listen(8080);
    }

    void helloVertx(RoutingContext ctx) {
        vertx.eventBus()
                .request("hello.vertx.addr", "", reply -> {
                    ctx.request()
                            .response()
                            .end((String) reply.result().body());
                });
    }

    void helloName(RoutingContext ctx) {
        String name = ctx.pathParam("name");
        vertx.eventBus()
                .request("hello.named.addr", name, reply -> {
                    ctx.request()
                            .response()
                            .end((String) reply.result().body());
                });
    }

}

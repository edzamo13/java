package ec.redhat.demo;

import io.vertx.core.AbstractVerticle;
import io.vertx.ext.web.Router;

public class MainVerticle extends AbstractVerticle {

    @Override
    public void start() {
        Router router = Router.router(vertx);
        router.get("/api/v1/hello")
                .handler(context -> {
                    context
                            .request()
                            .response()
                            .end("Hello vert.x world!..");
                });
        router.get("/api/v1/hello/:name")
                .handler(context -> {
                    String name = context.pathParam("name");
                    context
                            .request()
                            .response()
                            .end(String.format("Hello %s!", name));
                });
        vertx.createHttpServer()
                .requestHandler(router)
                .listen(8080);
    }

}

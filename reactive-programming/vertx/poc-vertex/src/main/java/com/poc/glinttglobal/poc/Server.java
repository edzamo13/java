package com.poc.glinttglobal.poc;

import io.reactivex.rxjava3.core.Single;
import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;

public class Server {

private final Vertx vertx;
private HttpServer server;

  public Server(Vertx vertx) {
    this.vertx = vertx;
  }

  public  Single<Server> createServer(){
    server= vertx.createHttpServer();
    return Single.just(this);
  }
  public static Single<Server> create(Vertx vertx){
    var server= new Server(vertx);
    return Single.just(server)
      .flatMap(Server::createServer);
  }

}

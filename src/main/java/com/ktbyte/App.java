package com.ktbyte;

import io.javalin.Javalin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

/**
 * Hello world!
 */
public class App {
    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> {
            config.requestLogger((ctx, ms) -> log.info("Request: " + ctx.req.getRequestURL().toString() + " " + ctx.res.getStatus() + " took " + ms + "ms"));
        }).start(7070);
        app.get("/", ctx -> {
            ctx.result("Hello World");
        });
        app.get("/health", ctx -> {
            if (new Random().nextInt(10) < 2) {
                ctx.status(500);
            } else {
                ctx.status(200);
            }
        });
    }
}

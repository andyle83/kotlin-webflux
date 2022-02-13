package com.microservice.webflux.router

import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.router
import reactor.kotlin.core.publisher.toMono

@Component
class CustomerRouter {
    @Bean
    fun customerRoutes() = router {
        "/functional".nest {
            "/customer".nest {
                GET() {
                    ok().body("hello world".toMono(), String::class.java)
                }
            }
        }
    }
}
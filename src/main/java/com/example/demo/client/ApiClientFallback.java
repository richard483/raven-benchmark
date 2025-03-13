package com.example.demo.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class ApiClientFallback implements ApiClient {

  private Logger log = LoggerFactory.getLogger(ApiClientFallback.class);

  @Override
  public Mono<ResponseEntity<String>> hello() {
    return null;
  }

  @Override
  public Mono<ResponseEntity<String>> number(String number) {
    return null;
  }

  @Override
  public Mono<ResponseEntity<String>> numberPost(String name) {
    return null;
  }

  @Override
  public Mono<ResponseEntity<String>> ise() {
    log.error("#ApiClientFallback.ise - Fallback during calling ise");
    return Mono.just(ResponseEntity.ok("Fallback during calling ise"));
  }
}

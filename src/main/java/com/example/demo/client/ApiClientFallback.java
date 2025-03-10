package com.example.demo.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
@Slf4j
public class ApiClientFallback implements ApiClient {

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

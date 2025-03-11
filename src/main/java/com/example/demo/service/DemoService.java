package com.example.demo.service;

import com.example.demo.client.ApiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class DemoService {

  private final ApiClient ravenApiClient;

  @Autowired
  public DemoService(ApiClient ravenApiClient) {
    this.ravenApiClient = ravenApiClient;
  }

  public Mono<ResponseEntity<String>> number() {
    return ravenApiClient.hello();
  }

  public Mono<ResponseEntity<String>> number(String number) {
    return ravenApiClient.number(number);
  }

  public Mono<ResponseEntity<String>> numberPost(String number) {
    return ravenApiClient.numberPost(number);
  }

  public Mono<ResponseEntity<String>> ise() {
    return ravenApiClient.ise();
  }
}

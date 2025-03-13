package com.example.demo.controller;

import com.example.demo.client.ApiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("demo")
public class DemoController {

  @Autowired
  private ApiClient apiClient;

  @GetMapping("/hello")
  public Mono<ResponseEntity<String>> number() {
    return apiClient.hello();
  }

  @GetMapping("/{number}")
  public Mono<ResponseEntity<String>> number(@PathVariable("number") String number) {
    return apiClient.number(number);
  }

  @PostMapping("/{number}")
  public Mono<ResponseEntity<String>> numberPost(@PathVariable("number") String number) {
    return apiClient.numberPost(number);
  }

  @GetMapping("/ise")
  public Mono<ResponseEntity<String>> ise() {
    return apiClient.ise();
  }


}

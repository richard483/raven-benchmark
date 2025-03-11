package com.example.demo.controller;

import com.example.demo.client.ApiClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@RestController
@RequestMapping("demo")
@Slf4j
public class DemoController {
  private final ApiClient apiClient;

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

package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@RestController
@RequestMapping("demo")
public class DemoController {

  @GetMapping("/hello")
  public Mono<ResponseEntity<String>> hello() {
    return Mono.just(new ResponseEntity<>("HELLO", HttpStatus.OK));
  }

  @GetMapping("/{number}")
  public Mono<ResponseEntity<String>> number(@PathVariable("number") String number) {
    return Mono.just(new ResponseEntity<>("GOT " + number, HttpStatus.OK));
  }

  @PostMapping("/number")
  public Mono<ResponseEntity<String>> numberPost(@RequestBody() String number) {
    return Mono.just(new ResponseEntity<>("POSTED " + number, HttpStatus.OK));
  }

  @GetMapping("/ise")
  public Mono<ResponseEntity<String>> ise() {
    return Mono.just(new ResponseEntity<>("YOU GOT ISE'D", HttpStatus.INTERNAL_SERVER_ERROR));
  }

}

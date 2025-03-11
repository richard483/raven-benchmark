package com.example.demo.controller;

import com.example.demo.service.DemoService;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class DemoController {

  private final DemoService demoService;

  @Autowired
  public DemoController(DemoService demoService) {
    this.demoService = demoService;
  }


  @GetMapping("/hello")
  public Mono<ResponseEntity<String>> number() {
    return demoService.number();
  }

  @GetMapping("/{number}")
  public Mono<ResponseEntity<String>> number(@PathVariable("number") String number) {
    return demoService.number(number);
  }

  @PostMapping("/{number}")
  public Mono<ResponseEntity<String>> numberPost(@PathVariable("number") String number) {
    return demoService.numberPost(number);
  }

  @GetMapping("/ise")
  public Mono<ResponseEntity<String>> ise() {
    return demoService.ise();
  }


}

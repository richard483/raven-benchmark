package com.example.demo.client;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import reactor.core.publisher.Mono;

@com.blibli.oss.backend.apiclient.annotation.ApiClient(
    name = "apiClient"
)
public interface ApiClient {

  @RequestMapping(
      value = "/hello",
      method = RequestMethod.GET,
      produces = MediaType.APPLICATION_JSON_VALUE
  )
  Mono<ResponseEntity<String>> hello();

  @RequestMapping(
      value = "/{number}",
      method = RequestMethod.GET,
      produces = MediaType.APPLICATION_JSON_VALUE
  )
  Mono<ResponseEntity<String>> number(@PathVariable("number") String number);

  @RequestMapping(
      value = "/{number}",
      method = RequestMethod.POST,
      produces = MediaType.APPLICATION_JSON_VALUE
  )
  Mono<ResponseEntity<String>> numberPost(@RequestBody String name);

  @RequestMapping(
      value = "/ise",
      method = RequestMethod.GET,
      produces = MediaType.APPLICATION_JSON_VALUE
  )
  Mono<ResponseEntity<String>> ise();

}

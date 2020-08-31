package lee.joohan.springeventexample.controller;

import lee.joohan.springeventexample.custom.CustomEventPublisher;
import lee.joohan.springeventexample.generic.GenericEventPublisher;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Joohan Lee on 2020/08/21
 */

@RequiredArgsConstructor
@RestController
@RequestMapping("event")
public class SpringEventController {
  private final CustomEventPublisher customEventPublisher;
  private final GenericEventPublisher genericEventPublisher;

  @GetMapping("custom")
  public ResponseEntity custom() {
    customEventPublisher.doStuffAndPublishAnEvent("Messaging");

    return ResponseEntity.ok(null);
  }

  @GetMapping("generic")
  public ResponseEntity generic(@RequestParam(value = "success", defaultValue = "false") boolean success) {

    System.out.println("Success: " + success);
    genericEventPublisher.doStuffAndPublishAnEvent("message", success);

    return ResponseEntity.ok(null);
  }
}

package lee.joohan.springeventexample.custom;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * Created by Joohan Lee on 2020/08/21
 */

@Slf4j
@RequiredArgsConstructor
@Component
public class CustomEventPublisher {
  private final ApplicationEventPublisher applicationEventPublisher;

  public void doStuffAndPublishAnEvent(final String message) {
    log.info("Publishing custom event.");

    CustomEvent customEvent = new CustomEvent(this, message);
    applicationEventPublisher.publishEvent(customEvent);
  }
}
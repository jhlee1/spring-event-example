package lee.joohan.springeventexample.generic;

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
public class GenericEventPublisher {
  private final ApplicationEventPublisher applicationEventPublisher;

  public void doStuffAndPublishAnEvent(final String message, boolean success) {
    log.info("Publishing generic event.");

    applicationEventPublisher.publishEvent(new GenericEvent<>(message, success));
  }
}
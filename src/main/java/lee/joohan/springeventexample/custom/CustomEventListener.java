package lee.joohan.springeventexample.custom;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by Joohan Lee on 2020/08/21
 */

@Slf4j
@Component
public class CustomEventListener implements ApplicationListener<CustomEvent> {

  @Override
  public void onApplicationEvent(CustomEvent event) {
    log.info("Received spring custom event - {}", event.getMessage());
  }
}

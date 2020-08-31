package lee.joohan.springeventexample.spring_context_event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by Joohan Lee on 2020/08/21
 */

@Slf4j
@Component
public class ContextRefreshedListener implements ApplicationListener<ContextRefreshedEvent> {

  // Hook into generic spring events

  @Override
  public void onApplicationEvent(ContextRefreshedEvent event) {
    log.info("Handling context re-freshed event. ");


  }
}
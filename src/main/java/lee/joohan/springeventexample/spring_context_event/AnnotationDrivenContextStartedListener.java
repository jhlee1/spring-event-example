package lee.joohan.springeventexample.spring_context_event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Created by Joohan Lee on 2020/08/21
 */

@Slf4j
@Component
public class AnnotationDrivenContextStartedListener {

  @EventListener
  public void handleContextStart(ContextStartedEvent contextStartedEvent) {
    log.info("Handling context started event. {}", contextStartedEvent);
  }

}

//@Component
//public class  {
//  // @Async
//  @EventListener
//  public void handleContextStart(ContextStartedEvent cse) {
//    System.out.println("Handling context started event.");
//  }
//}

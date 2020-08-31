package lee.joohan.springeventexample.generic;

import lee.joohan.springeventexample.custom.CustomEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

/**
 * Created by Joohan Lee on 2020/08/21
 */

@Slf4j
@Component
public class AnnotationDrivenGenericEventListener {

  @EventListener(condition = "#event.success")
  public void handleSuccessful(GenericEvent<String> event) {
    log.info("Handling generic event (conditional). {} ", event);
  }

  /**
   * AFTER_COMMIT (default) is used to fire the event if the transaction has completed successfully
   * AFTER_ROLLBACK – if the transaction has rolled back
   * AFTER_COMPLETION – if the transaction has completed (an alias for AFTER_COMMIT and AFTER_ROLLBACK)
   * BEFORE_COMMIT is used to fire the event right before transaction commit
   */

//  @TransactionalEventListener(phase = TransactionPhase.BEFORE_COMMIT)
//  public void handleCustom(CustomEvent event) {
//    log.info("Handling event {} inside a transaction BEFORE COMMIT.", event);
//  }

  /**
   * implementing ApplicationListener (like below) won't work because GenericEvent does not inherit from ApplicationEvent
   */

  //public class GenericSpringEventListener implements ApplicationListener<GenericEvent<String>> {
  //  @Override
  //  public void onApplicationEvent(GenericEvent<String> event) {
  //    log.info("Received spring custom event - {}", event.getWhat());
  //  }
  //}

}

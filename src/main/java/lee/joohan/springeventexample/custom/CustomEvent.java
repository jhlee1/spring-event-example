package lee.joohan.springeventexample.custom;

import lombok.Getter;
import lombok.ToString;
import org.springframework.context.ApplicationEvent;

/**
 * Created by Joohan Lee on 2020/08/21
 */

@ToString
@Getter
public class CustomEvent extends ApplicationEvent {
  private String message;

  public CustomEvent(Object source, String message) {
    super(source);
    this.message = message;
  }
}
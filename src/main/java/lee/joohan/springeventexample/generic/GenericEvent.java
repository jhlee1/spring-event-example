package lee.joohan.springeventexample.generic;

import lombok.Getter;
import lombok.ToString;
import org.springframework.context.ApplicationEvent;

/**
 * Created by Joohan Lee on 2020/08/21
 */

@ToString
@Getter
public class GenericEvent<T> extends ApplicationEvent {
  private T what;
  protected boolean success;

  public GenericEvent(T what, boolean success) {
    super(what);
    this.what = what;
    this.success = success;
  }
}

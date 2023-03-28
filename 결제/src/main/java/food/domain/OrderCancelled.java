package food.domain;

import food.domain.*;
import food.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderCancelled extends AbstractEvent {

    private Long id;

    public OrderCancelled(결제 aggregate) {
        super(aggregate);
    }

    public OrderCancelled() {
        super();
    }
}

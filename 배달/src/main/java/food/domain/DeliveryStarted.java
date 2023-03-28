package food.domain;

import food.domain.*;
import food.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;

    public DeliveryStarted(배달 aggregate) {
        super(aggregate);
    }

    public DeliveryStarted() {
        super();
    }
}

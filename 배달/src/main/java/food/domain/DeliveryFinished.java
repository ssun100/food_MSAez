package food.domain;

import food.domain.*;
import food.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DeliveryFinished extends AbstractEvent {

    private Long id;

    public DeliveryFinished(배달 aggregate) {
        super(aggregate);
    }

    public DeliveryFinished() {
        super();
    }
}

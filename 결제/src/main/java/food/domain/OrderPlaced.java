package food.domain;

import food.domain.*;
import food.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String foodid;
    private String option;
    private String address;

    public OrderPlaced(결제 aggregate) {
        super(aggregate);
    }

    public OrderPlaced() {
        super();
    }
}

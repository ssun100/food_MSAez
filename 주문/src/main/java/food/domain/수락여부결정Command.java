package food.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class 수락여부결정Command {

    private Boolean accept;
}

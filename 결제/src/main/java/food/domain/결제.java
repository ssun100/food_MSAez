package food.domain;

import food.domain.OrderPlaced;
import food.결제Application;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "결제_table")
@Data
public class 결제 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String customerid;

    private String foodid;

    private String option;

    private String address;

    private String status;

    @PostPersist
    public void onPostPersist() {
        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();
    }

    public static 결제Repository repository() {
        결제Repository 결제Repository = 결제Application.applicationContext.getBean(
            결제Repository.class
        );
        return 결제Repository;
    }

    public void 취소() {
        OrderCancelled orderCancelled = new OrderCancelled(this);
        orderCancelled.publishAfterCommit();
    }

    public static void 주문상태변경한다(CookStarted cookStarted) {
        /** Example 1:  new item 
        결제 결제 = new 결제();
        repository().save(결제);

        */

        /** Example 2:  finding and process
        
        repository().findById(cookStarted.get???()).ifPresent(결제->{
            
            결제 // do something
            repository().save(결제);


         });
        */

    }

    public static void 주문상태변경한다(DeliveryFinished deliveryFinished) {
        /** Example 1:  new item 
        결제 결제 = new 결제();
        repository().save(결제);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryFinished.get???()).ifPresent(결제->{
            
            결제 // do something
            repository().save(결제);


         });
        */

    }
}

package food.domain;

import food.domain.DeliveryFinished;
import food.domain.DeliveryStarted;
import food.배달Application;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "배달_table")
@Data
public class 배달 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String orderid;

    private String address;

    private String status;

    @PostPersist
    public void onPostPersist() {
        DeliveryFinished deliveryFinished = new DeliveryFinished(this);
        deliveryFinished.publishAfterCommit();

        DeliveryStarted deliveryStarted = new DeliveryStarted(this);
        deliveryStarted.publishAfterCommit();
    }

    public static 배달Repository repository() {
        배달Repository 배달Repository = 배달Application.applicationContext.getBean(
            배달Repository.class
        );
        return 배달Repository;
    }

    public static void 배달정보발생한다(CookStarted cookStarted) {
        /** Example 1:  new item 
        배달 배달 = new 배달();
        repository().save(배달);

        */

        /** Example 2:  finding and process
        
        repository().findById(cookStarted.get???()).ifPresent(배달->{
            
            배달 // do something
            repository().save(배달);


         });
        */

    }

    public static void 배달정보발생한다(OrderPlaced orderPlaced) {
        /** Example 1:  new item 
        배달 배달 = new 배달();
        repository().save(배달);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(배달->{
            
            배달 // do something
            repository().save(배달);


         });
        */

    }
}

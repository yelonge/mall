package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderCanceled extends AbstractEvent {

    private Long id;
    private String customerId;
    private String itemId;
    private Integer qty;
    private String itemName;
    private String address;

    public OrderCanceled(Order aggregate){
        super(aggregate);
    }
    public OrderCanceled(){
        super();
    }
}

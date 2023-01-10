package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class StockIncreased extends AbstractEvent {

    private Long id;
    private String itemName;
    private String itemImage;
    private String stock;

    public StockIncreased(Stock aggregate){
        super(aggregate);
    }
    public StockIncreased(){
        super();
    }
}

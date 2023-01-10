package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class StockDecreased extends AbstractEvent {

    private Long id;
    private String itemName;
    private String itemImage;
    private String stock;

    public StockDecreased(Stock aggregate){
        super(aggregate);
    }
    public StockDecreased(){
        super();
    }
}

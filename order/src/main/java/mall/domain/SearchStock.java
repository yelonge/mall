package mall.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Entity
@Table(name="SearchStock_table")
@Data
public class SearchStock {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;


}

package mall.infra;

import mall.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="ordernInfomations", path="ordernInfomations")
public interface OrdernInfomationRepository extends PagingAndSortingRepository<OrdernInfomation, Long> {

    

    
}

package mall.infra;

import mall.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="searchStocks", path="searchStocks")
public interface SearchStockRepository extends PagingAndSortingRepository<SearchStock, Long> {

    

    
}

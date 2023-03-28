package food.domain;

import food.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "결제", path = "결제")
public interface 결제Repository
    extends PagingAndSortingRepository<결제, Long> {}

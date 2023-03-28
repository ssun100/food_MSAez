package food.domain;

import food.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "배달", path = "배달")
public interface 배달Repository
    extends PagingAndSortingRepository<배달, Long> {}

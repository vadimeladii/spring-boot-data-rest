package md.springboot.repository;

import io.swagger.annotations.Api;
import md.springboot.entity.CompanyEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@Api(tags = "Company Entity")
@RepositoryRestResource(path = "companies")
public interface CompanyRepository extends PagingAndSortingRepository<CompanyEntity, Long> {
}

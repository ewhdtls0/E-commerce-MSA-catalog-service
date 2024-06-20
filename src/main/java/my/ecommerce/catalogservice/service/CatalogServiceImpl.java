package my.ecommerce.catalogservice.service;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import my.ecommerce.catalogservice.entity.CatalogEntity;
import my.ecommerce.catalogservice.entity.CatalogRepository;
import org.springframework.stereotype.Service;

@Data
@Service
@Slf4j
@RequiredArgsConstructor
public class CatalogServiceImpl implements CatalogService{

    private final CatalogRepository catalogRepository;
    @Override
    public Iterable<CatalogEntity> getAllCatalogs() {
        return catalogRepository.findAll();
    }
}

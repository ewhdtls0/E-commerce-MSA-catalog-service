package my.ecommerce.catalogservice.service;

import my.ecommerce.catalogservice.entity.CatalogEntity;

public interface CatalogService {
    Iterable<CatalogEntity> getAllCatalogs();
}

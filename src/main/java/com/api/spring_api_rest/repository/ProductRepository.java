package com.api.spring_api_rest.repository;

import com.api.spring_api_rest.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, Long>
{
    ProductModel findById(long id);
}

package eu.dcode.mediasupplyecommerce.repository;

import eu.dcode.mediasupplyecommerce.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}

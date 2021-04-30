package eu.dcode.mediasupplyecommerce.repository;

import eu.dcode.mediasupplyecommerce.model.OrderProduct;
import eu.dcode.mediasupplyecommerce.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}

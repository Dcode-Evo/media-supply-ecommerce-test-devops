package eu.dcode.mediasupplyecommerce.repository;

import eu.dcode.mediasupplyecommerce.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}

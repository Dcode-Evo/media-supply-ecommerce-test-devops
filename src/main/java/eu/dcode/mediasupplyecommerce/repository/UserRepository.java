package eu.dcode.mediasupplyecommerce.repository;

import eu.dcode.mediasupplyecommerce.dto.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{}

package uk.co.rgiskardreventlov.forpranav.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uk.co.rgiskardreventlov.forpranav.model.User;

/**
 * Created by rgiskard on 30/06/16.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}

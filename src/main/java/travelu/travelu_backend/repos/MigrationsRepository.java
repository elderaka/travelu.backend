package travelu.travelu_backend.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import travelu.travelu_backend.domain.Migrations;


public interface MigrationsRepository extends JpaRepository<Migrations, Integer> {
}
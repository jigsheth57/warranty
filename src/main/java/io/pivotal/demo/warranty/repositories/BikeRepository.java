package io.pivotal.demo.warranty.repositories;

import io.pivotal.demo.warranty.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository<Bike, Long> {
}

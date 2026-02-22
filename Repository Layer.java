package com.insurance.repository;

import com.insurance.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
}


package com.insurance.repository;

import com.insurance.model.InsurancePolicy;
import com.insurance.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InsurancePolicyRepository extends JpaRepository<InsurancePolicy, Long> {
    List<InsurancePolicy> findByUser(User user);
    List<InsurancePolicy> findByStatus(String status);
}

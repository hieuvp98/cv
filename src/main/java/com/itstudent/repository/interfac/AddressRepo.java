package com.itstudent.repository.interfac;

import com.itstudent.entities.data.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {

    @Query("from Address a where a.id = ?1")
    Optional<Address> findById2(Integer id);
}

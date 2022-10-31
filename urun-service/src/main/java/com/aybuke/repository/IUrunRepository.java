package com.aybuke.repository;
import com.aybuke.repository.entity.Urun;
import com.aybuke.repository.entity.Urun;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface IProductRepository  extends JpaRepository<Urun,Long> {
//    Optional<Urun> findOptionalByUsernameAndPassword(String username, String password);
}


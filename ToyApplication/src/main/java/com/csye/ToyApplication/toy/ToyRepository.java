package com.csye.ToyApplication.toy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ToyRepository extends JpaRepository<Toy, Long> {

    List<Toy> findAllByUserId (long userId);

    @Query("select t from toy t where user_id <> :userid")
    List<Toy> find(@Param("userid") Long id);

}

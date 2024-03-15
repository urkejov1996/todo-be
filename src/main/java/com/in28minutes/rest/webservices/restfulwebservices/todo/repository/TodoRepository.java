package com.in28minutes.rest.webservices.restfulwebservices.todo.repository;

import com.in28minutes.rest.webservices.restfulwebservices.todo.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {


    @Query("select t from Todo t where t.username = ?1")
    List<Todo> findByUsername(String username);
}

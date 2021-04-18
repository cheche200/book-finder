package com.ignite.bookfinder.repository;

import com.ignite.bookfinder.domain.oreilly.Result;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Result, String> {
}

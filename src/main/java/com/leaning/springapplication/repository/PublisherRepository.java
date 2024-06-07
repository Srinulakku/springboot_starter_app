package com.leaning.springapplication.repository;

import com.leaning.springapplication.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Integer> {
}

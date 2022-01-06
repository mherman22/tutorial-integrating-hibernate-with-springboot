package com.mherman22.tutorialintegratinghibernatewithspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mherman22.tutorialintegratinghibernatewithspringboot.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}

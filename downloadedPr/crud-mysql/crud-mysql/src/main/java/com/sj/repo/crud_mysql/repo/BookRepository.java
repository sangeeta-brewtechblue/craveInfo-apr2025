/**
 * 
 */
package com.sj.repo.crud_mysql.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sj.repo.crud_mysql.model.Book;

/**
 * @author sange
 *
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
        List<Book>  findByAuthor(String name);
}

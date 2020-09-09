package telran.ashkelon2020.book.dao;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import telran.ashkelon2020.book.model.Book;

@Repository
public class BookRepositoryImpl implements BookRepository {
	
	@PersistenceContext
	EntityManager em;
	
	@Override
	public void deleteBooksByAuthorsName(String name) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public boolean existsById(String id) {
		return em.find(Book.class, id) != null;
	}

	@Override
	public Book save(Book book) {
		em.persist(book);
		return book;
	}

	@Override
	public Optional<Book> findById(String id) {
		return Optional.ofNullable(em.find(Book.class, id));
	}

	@Override
	public void delete(Book book) {
		em.remove(book);
	}

}

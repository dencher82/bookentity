package telran.ashkelon2020.book.dao;

import java.util.Optional;
import java.util.stream.Stream;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import telran.ashkelon2020.book.model.Publisher;

@Repository
public class PublisherRepositoryImpl implements PublisherRepository {
	
	@PersistenceContext
	EntityManager em;
	
	@Override
	public Stream<Publisher> findDistinctByBooksAuthorsName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Publisher> findById(String publisherName) {
		return Optional.ofNullable(em.find(Publisher.class, publisherName));
	}

	@Override
	public Publisher save(Publisher publisher) {
		em.persist(publisher);
		return publisher;
	}

}

package telran.ashkelon2020.book.dao;

import java.util.Optional;
import java.util.stream.Stream;

import telran.ashkelon2020.book.model.Publisher;

public interface PublisherRepository {
	
	Stream<Publisher> findDistinctByBooksAuthorsName(String name);

	Optional<Publisher> findById(String id);
	
	Publisher save(Publisher publisher);
	
}

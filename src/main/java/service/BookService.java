package service;

import entity.Book;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.awt.print.Book;


@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;
    private final ModelMapper modelMapper
    public List<Book> getAll() {
        return bookRepository.findAll();
    }
    public Book update(Book product) {
        return bookRepository.save(product);
    }
    public void delete(Long id) {
        bookRepository.deleteById(id);
    }
    public Book create(BookDTO dto) {
       return bookRepository.save(mapToBook(dto));
    }
    private Book mapToBook(BookDTO dto){
        return modelMapper.map(dto, Book.class);
    }

}

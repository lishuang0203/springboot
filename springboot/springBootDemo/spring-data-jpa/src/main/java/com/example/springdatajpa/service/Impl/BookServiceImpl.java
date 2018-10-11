package com.example.springdatajpa.service.Impl;

import com.example.springdatajpa.dao.BookRepository;
import com.example.springdatajpa.entity.Book;
import com.example.springdatajpa.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Resource
    private BookRepository bookRepository;

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book getId(int id) {
        return bookRepository.findById(id).get();
    }

    @Override
    public void delete(int id) {

    }
}

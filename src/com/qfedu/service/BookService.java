package com.qfedu.service;

import com.qfedu.entity.Book;

import java.util.List;

public interface BookService {
    public List<Book> selectBook(int pageNo, int pageSize);
}

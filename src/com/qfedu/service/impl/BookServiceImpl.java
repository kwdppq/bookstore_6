package com.qfedu.service.impl;

import com.qfedu.dao.BookDao;
import com.qfedu.dao.impl.BookDaoImpl;
import com.qfedu.entity.Book;
import com.qfedu.service.BookService;

import java.util.List;

public class BookServiceImpl implements BookService {
    @Override
    public List<Book> selectBook(int pageNo, int pageSize) {
        BookDao bookDao = new BookDaoImpl();
        List<Book> books = bookDao.selectBook(pageNo, pageSize);
        return books;
    }
}

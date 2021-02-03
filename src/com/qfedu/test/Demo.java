package com.qfedu.test;

import com.qfedu.dao.impl.BookDaoImpl;
import com.qfedu.entity.Book;
import com.qfedu.service.impl.BookServiceImpl;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        BookServiceImpl bookService = new BookServiceImpl();
        BookDaoImpl bookDao = new BookDaoImpl();
        List<Book> books = bookDao.selectBook(1, 10);
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

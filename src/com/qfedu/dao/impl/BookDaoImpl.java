package com.qfedu.dao.impl;

import com.qfedu.dao.BookDao;
import com.qfedu.entity.Book;
import com.qfedu.util.BaseDao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl extends BaseDao implements BookDao {

    @Override
    public List<Book> selectBook(int pageNo, int pageSize) {
        String sql = "select * from book limit ?, ?";
        Object[] objs = {(pageNo - 1) * pageSize, pageSize};
        List<Book> books = new ArrayList<>();
        try {
            ResultSet resultSet = this.select(sql, objs);
            while (resultSet.next()) {
                Book book = new Book();
                book.setBid(resultSet.getString("bid"));
                book.setBname(resultSet.getString("bname"));
                book.setAuthor(resultSet.getString("author"));
                book.setPrice(resultSet.getDouble("price"));
                book.setCid(resultSet.getString("cid"));
                book.setImage(resultSet.getString("image"));
                books.add(book);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return books;
    }
}

package com.qfedu.controller;

import com.qfedu.entity.Book;
import com.qfedu.service.BookService;
import com.qfedu.service.impl.BookServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/BookServlet")
public class BookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        BookService bookService = new BookServiceImpl();
        List<Book> books = bookService.selectBook(1, 10);
        request.setAttribute("bookList", books);
        request.getRequestDispatcher("/jsps/book/list.jsp").forward(request, response);
    }
}

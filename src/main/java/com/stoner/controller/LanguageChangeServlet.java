package com.stoner.controller;

import com.stoner.util.StoneFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/en_ua")
public class LanguageChangeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String message = "";

        if (StoneFactory.getIndexLanguage() == 1) {
            StoneFactory.setIndexLanguage(0);
            message = "Language was changed to EN";
        } else {
            StoneFactory.setIndexLanguage(1);
            message = "Language was changed to UA";
        }

        resp.getWriter().println(message);
    }
}

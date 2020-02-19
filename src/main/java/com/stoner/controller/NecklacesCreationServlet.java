package com.stoner.controller;

import com.stoner.service.ChainService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class NecklacesCreationServlet extends HttpServlet {
    private static final ChainService SERVICE = new ChainService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //SERVICE.save(new Chain());
    }
}

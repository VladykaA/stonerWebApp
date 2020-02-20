package com.stoner.controller;

import com.stoner.entity.Chain;
import com.stoner.service.ChainService;
import com.stoner.util.ChainStorage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/createNecklaces")
public class NecklacesCreationServlet extends HttpServlet {
    private static final ChainService SERVICE = new ChainService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Chain chain = SERVICE.getChain();

        ChainStorage.addChain(chain);

        PrintWriter writer = resp.getWriter();

        writer.println("<p>Created " + chain.getName() + " chain</p>");
    }
}

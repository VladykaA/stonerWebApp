package com.stoner.controller;

import com.google.gson.Gson;
import com.stoner.entity.Chain;
import com.stoner.service.ChainService;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StonesListServlet extends HttpServlet {
    private static final ChainService SERVICE = new ChainService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Chain chain = SERVICE.getChain();

        Gson gson = new Gson();

        String json = gson.toJson(chain);

        resp.setHeader("chain", json);
    }
}

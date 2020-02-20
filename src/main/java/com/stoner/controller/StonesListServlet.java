package com.stoner.controller;

import com.google.gson.Gson;
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
import java.util.List;

@WebServlet(urlPatterns = "/stonesList")
public class StonesListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        List<Chain> chains = ChainStorage.getChains();

        Gson gson = new Gson();

        String json = gson.toJson(chains);

        PrintWriter writer = resp.getWriter();

        writer.println(json);

    }
}

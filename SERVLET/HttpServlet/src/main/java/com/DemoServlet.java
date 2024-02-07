package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/http")
public class DemoServlet extends HttpServlet {
//post get put delete
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		PrintWriter out = resp.getWriter();
        
		out.print("<h1>Post method</h1>");
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		PrintWriter out = resp.getWriter();

		out.print("<h1>get method</h1>");
	}
}

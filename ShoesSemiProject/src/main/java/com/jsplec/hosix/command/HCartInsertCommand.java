package com.jsplec.hosix.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.hosix.dao.CartDao;

public class HCartInsertCommand implements HCommand {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        // TODO Auto-generated method stub
        
//      String customer_cId = request.getParameter("customer_cId");
        String customer_cId = "hotwo";
        int product_pId = Integer.parseInt(request.getParameter("product_pId"));
        String oAddress = request.getParameter("oAddress");
        int cQty = Integer.parseInt(request.getParameter("cQty"));
        
        System.out.println(customer_cId);
        System.out.println(product_pId);
        System.out.println(cQty);
        
        CartDao dao = new CartDao();
        dao.insertCart(customer_cId, product_pId, cQty);

    }

}
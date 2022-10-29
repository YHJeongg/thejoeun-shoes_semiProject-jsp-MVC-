package com.jsplec.hosix.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.hosix.dao.ManageTakeDao;

public class HMTakeActionCommand implements HCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String manager_mId = "kimsin"; // request.getSession("manager_mId") *********변경하기
		String manufacturer_mfId = request.getParameter("mfId"); // ********변경하기
		String tPrice = request.getParameter("mfPrice");
		int tQty = Integer.parseInt(request.getParameter("tQty"));
		int take_tOrderid;
		String mfBrand = request.getParameter("mfBrand");
		String mfProductname = request.getParameter("mfProductname"); 
		int mfPrice = Integer.parseInt(request.getParameter("mfPrice"));
		String mfCategory = request.getParameter("mfCategory");
		String mfSize = request.getParameter("mfSize");
		int check = 0;

		System.out.println("<><><><><><>");
		
		ManageTakeDao dao = new ManageTakeDao();
		dao.takeInsertTake(manager_mId, manufacturer_mfId, tPrice, tQty);
		take_tOrderid = dao.checkTakeOrderId();
		System.out.println(take_tOrderid);
		check = dao.checkProduct(take_tOrderid);
		if (check == 0) {
			dao.takeInsertProduct(take_tOrderid, mfBrand, mfProductname, mfPrice, mfCategory, mfSize, tQty);
		} else {
			dao.takeUpdateProduct(tQty, take_tOrderid);
		}

	}

}

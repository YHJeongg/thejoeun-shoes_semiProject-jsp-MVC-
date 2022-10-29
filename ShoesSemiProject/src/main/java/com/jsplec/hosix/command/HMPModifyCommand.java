package com.jsplec.hosix.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.hosix.dao.HManageProductDao;

public class HMPModifyCommand implements HCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String pId=request.getParameter("pId");
		String pBrand=request.getParameter("pBrand");//write_view에 입력한 값을 가져옴
		String pName=request.getParameter("pName");//write_view에 입력한 값을 가져옴
		String pPrice=request.getParameter("pPrice");//write_view에 입력한 값을 가져옴
		String pCategory=request.getParameter("pCategory");
		String pSize=request.getParameter("pSize");
//		String pStockdate=request.getParameter("pStockdate");
		String pStock=request.getParameter("pStock");
		String pImage=request.getParameter("pImage");
		String pInformation=request.getParameter("pInformation");
		
		
		HManageProductDao dao=new HManageProductDao();
		dao.modify(pId, pBrand, pName, pPrice,pCategory,pSize,pStock,pImage,pInformation);//db에 넣을 수 있도록
	}
//Update 문
}

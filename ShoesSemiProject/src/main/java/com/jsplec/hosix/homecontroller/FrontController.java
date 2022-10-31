//package com.jsplec.hosix.homecontroller;
//
//import java.io.IOException;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import com.jsplec.hosix.command.HCategoryPListCommand;
//import com.jsplec.hosix.command.HCommand;
//import com.jsplec.hosix.command.HLoginSelectCommand;
//import com.jsplec.hosix.command.HMypageDeleteCommand;
//import com.jsplec.hosix.command.HMypageModifyCommand;
//import com.jsplec.hosix.command.HMypageSelectCommand;
//import com.jsplec.hosix.command.HPListCommand;
//import com.jsplec.hosix.command.HSignupInsertCommand;
//
///**
// * Servlet implementation class FrontController
// */
//@WebServlet("*.do")
//public class FrontController extends HttpServlet {
//    private static final long serialVersionUID = 1L;
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public FrontController() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//    /**
//     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//     */
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        // TODO Auto-generated method stub
//        actionDo(request, response);
//    }
//
//    /**
//     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//     */
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        // TODO Auto-generated method stub
//        actionDo(request, response);
//    }
//    
//    private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setCharacterEncoding("utf-8");
//        
//        HttpSession session = request.getSession();
//        String viewPage = null;
//        HCommand command = null;
//        
//        String uri = request.getRequestURI();
//        String conPath = request.getContextPath();
//        String com = uri.substring(conPath.length());
//        
//        switch(com) {
//        
//        
//        // ----------- 성진 컨트롤러 Start ------------------------
//    	case("/mypage_infoselect.do"):
//			command = new HMypageSelectCommand();
//			command.execute(request, response);
//			viewPage = "mypage_info.jsp";
//		break;
//		
//    	case("/mypage_modify.do"):
//			command = new HMypageModifyCommand();
//			command.execute(request, response);
//			viewPage = "mypage_infoselect.do";
//		break;
//		
//    	case("/mypage_delete.do"):
//			command = new HMypageDeleteCommand();
//			command.execute(request, response);
//			viewPage = "index.jsp";
//		break;
//		
//    	case("/productList.do"):
//            command = new HPListCommand();
//            command.execute(request, response);
//            viewPage = "productList.jsp";
//        break;
//        
//        case("/productListCategory.do"):
//        	command = new HCategoryPListCommand();
//            command.execute(request, response);
//            viewPage = "productList.jsp";
//        break;
//        // ----------- 성진 컨트롤러 End ------------------------
//        // ----------- 수빈 컨트롤러 Start ------------------------
//		case ("/signup.do"):
//			System.out.println("signup.do");
//			command = new HSignupInsertCommand();
//			command.execute(request, response);
//			viewPage = "login.jsp";
//			break;
//
//		case ("/login.do"):
//			System.out.println("login.do");
//			command = new HLoginSelectCommand();
//			command.execute(request, response);
//			// session.setAttribute("cId", request.getAttribute("cId")); // 로그아웃OR화면종료시
//			// 인벨리드?해주기
//			//
//			// System.out.println(session.getAttribute("cId"));
//			break;
//
//		case ("/login_check.do"):
//			session.setAttribute("cId", request.getAttribute("cId"));
//			System.out.println(session.getAttribute("cId"));
//			viewPage = "index.jsp";
//			break;
//
//		case ("/login_fail.do"):
//			viewPage = "login_fail.jsp";
//			break;
//
//		case ("/logout.do"):
//			System.out.println("logout");
//			session.invalidate();
//	    // ----------- 수빈 컨트롤러 End ------------------------
//        }
//        
//        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
//        dispatcher.forward(request, response);
//        
//    }
//
//    
//} // End
//

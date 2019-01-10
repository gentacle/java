package example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LifecycleServlet")
public class LifecycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LifecycleServlet() {
		System.out.println("LifecycleServlet 생성!!");
	}

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init test 호출!!");
	}

	public void destroy() {
		System.out.println("destroy 호출!!");
	}

//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//    	System.out.println("service 호출!!");
//	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8;");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head><title>form</title></head>");
		out.println("<body>");
		out.println("<form method='post' action='/first-web-app/LifecycleServlet'>");
		out.println("name : <input type='text' name='name'><br>");
		out.println("<input type='submit' value='ok'><br>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//한번 거치고 나오면서 인코딩이 바뀌는지 한글이 출력되지않음. 이를 재정의
		req.setCharacterEncoding("UTF-8");
		
		resp.setContentType("text/html;charset=utf-8;");
		PrintWriter out = resp.getWriter();
		String name = req.getParameter("name");
		out.println("<h1>Hello " + name +"</h1>");
		out.close();
		
	}

}

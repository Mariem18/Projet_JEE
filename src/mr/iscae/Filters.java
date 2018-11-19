package mr.iscae;

import java.io.IOException;

import javax.servlet.*;

public class Filters implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest reqt, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		chain.doFilter(reqt, resp);
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}



}

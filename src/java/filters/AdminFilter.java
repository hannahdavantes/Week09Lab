/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filters;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 *
 * @author 652343
 */
@WebFilter(filterName = "AdminFilter", servletNames =
  {
    "UserServlet"
  })
public class AdminFilter implements Filter
  {

    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException
      {

        chain.doFilter(request, response);

      }

    public void destroy()
      {
      }

    public void init(FilterConfig filterConfig)
      {

      }
  }

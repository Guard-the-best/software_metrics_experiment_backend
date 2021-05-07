package cn.edu.csu.smproject;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;
import java.util.Scanner;

//@Component
//@Order(1)
public class DebugFilter implements Filter{
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        ServletRequest req = servletRequest;
        Scanner scanner = new Scanner(servletRequest.getReader());
        System.out.println("-------------info-------------");
        System.out.println("------------------------------");
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
        System.out.println("------------------------------");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}

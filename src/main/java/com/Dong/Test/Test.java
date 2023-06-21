package com.Dong.Test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 测试
 *
 * @author 董仁涛
 * @version 1.0 on   2023-01-10 14:46
 */
public class Test{
    public static void main(String[] args) {
        int i=1;
        int p=(++i)+(++i);
        System.out.println(p);
    }
}

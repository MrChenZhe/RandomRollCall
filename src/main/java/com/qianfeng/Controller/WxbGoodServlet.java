package com.qianfeng.Controller;



import com.qianfeng.Bean.TbStudent;
import com.qianfeng.Listener.SpringApplicationContextUtils;
import com.qianfeng.Service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

public class WxbGoodServlet extends BaseServlet {
   private StudentService studentService = SpringApplicationContextUtils.getApplicationContext().getBean(StudentService.class);

    public void stuList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<TbStudent> students = studentService.selectAllStu();
        req.setAttribute("students",students);
        req.getRequestDispatcher("RandomCall.jsp").forward(req,resp);
    }

    /**
     * 添加
     */
    public void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException{

    }


    /**
     * 删除
     */
    public void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException{

    }
}
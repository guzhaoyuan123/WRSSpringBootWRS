package com.niit.vhrend.controller;

import com.niit.vhrend.config.KaptchaConfig;
import com.niit.vhrend.model.RespBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * @author : 顾兆远
 * @program: vhr-end
 * @description:
 * @date : 2020-05-05 09:03
 **/
@RestController
public class LoginController {
    @GetMapping("/login")
    public RespBean login() {
        return RespBean.error("尚未登录，请登录!");
    }

    @GetMapping("/verifyCode")
    public void verifyCode(HttpServletRequest request, HttpServletResponse resp) throws IOException {
        KaptchaConfig code = new KaptchaConfig();
        BufferedImage image = code.getImage();
        String text = code.getText();
        HttpSession session = request.getSession(true);
        session.setAttribute("verify_code", text);
        KaptchaConfig.output(image,resp.getOutputStream());
    }
}
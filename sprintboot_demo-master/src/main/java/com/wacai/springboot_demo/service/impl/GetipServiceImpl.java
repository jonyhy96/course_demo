package com.wacai.springboot_demo.service.impl;

import com.wacai.springboot_demo.service.GetipService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;

@Service
@Slf4j
public class GetipServiceImpl implements GetipService {
    @Override
    public void getip(HttpServletRequest request) {
        log.info(System.getenv("HOSTNAME")+"Accept connection from:"+getIpAddr(request));
    }

    private String getIpAddr(HttpServletRequest request) {
        String ip = request.getRemoteAddr();
        return ip;
    }
}

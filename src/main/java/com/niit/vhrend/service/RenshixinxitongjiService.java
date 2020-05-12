package com.niit.vhrend.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

/**
 * @author : 顾兆远
 * @program: vhr-end
 * @description:
 * @date : 2020-05-10 13:26
 **/
@Service
public class RenshixinxitongjiService {
    @Autowired
    com.niit.vhrend.mapper.RenshixinxitongjiMapper RenshixinxitongjiMapper;
    @Autowired
    RabbitTemplate rabbitTemplate;
    @Autowired
    MailSendLogService mailSendLogService;
    public final static Logger logger = LoggerFactory.getLogger(RenshixinxitongjiService.class);
    SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
    SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
    DecimalFormat decimalFormat = new DecimalFormat("##.00");

}
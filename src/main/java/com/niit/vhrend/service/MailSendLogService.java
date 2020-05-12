package com.niit.vhrend.service;

import com.niit.vhrend.mapper.MailSendLogMapper;
import com.niit.vhrend.model.MailSendLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author : 顾兆远
 * @program: vhr-end
 * @description:
 * @date : 2020-04-29 10:43
 **/
@Service
public class MailSendLogService {
    @Autowired
    MailSendLogMapper mailSendLogMapper;
    public Integer updateMailSendLogStatus(String msgId, Integer status) {
        return mailSendLogMapper.updateMailSendLogStatus(msgId, status);
    }

    public Integer insert(MailSendLog mailSendLog) {
        return mailSendLogMapper.insert(mailSendLog);
    }

    public List<MailSendLog> getMailSendLogsByStatus() {
        return mailSendLogMapper.getMailSendLogsByStatus();
    }

    public Integer updateCount(String msgId, Date date) {
        return mailSendLogMapper.updateCount(msgId,date);
    }
}
package com.itianyi.modules.email.dao;

import java.util.Date;

import com.itianyi.core.disruptor.email.EmailDao;
import com.itianyi.core.disruptor.email.EmailData;
import com.itianyi.core.utils.StringUtils;
import com.itianyi.core.utils.email.EmailResult;
import com.itianyi.modules.email.service.IEmailSendLogService;
import org.springframework.beans.factory.annotation.Autowired;
import com.itianyi.core.disruptor.email.EmailDao;
import com.itianyi.core.disruptor.email.EmailData;
import com.itianyi.core.utils.StringUtils;
import com.itianyi.core.utils.email.EmailResult;
import com.itianyi.modules.email.entity.EmailSendLog;
import com.itianyi.modules.email.service.IEmailSendLogService;

/**
 * 
 * All rights Reserved, Designed By www.jeeweb.cn
 * 
 * @title: EmailDaoIml.java
 * @package com.itianyi.modules.email.dao
 * @description: 邮件信息返回
 * @author
 * @date: 2017年6月8日 上午11:20:04
 * @version V1.0
 * @copyright: 2017 www.jeeweb.cn Inc. All rights reserved.
 *
 */
public class EmailDaoIml implements EmailDao {
	@Autowired
	private IEmailSendLogService emailSendLogService;

	@Override
	public void doStart() {

	}

	@Override
	public void doSend(String eventId, EmailData emailData) {
		EmailSendLog emailSendLog = new EmailSendLog();
		emailSendLog.setId(eventId);
		emailSendLog.setBusinessType(emailData.getBusinessType());
		emailSendLog.setSubject(emailData.getSubject());
		emailSendLog.setContent(emailData.getContent());
		emailSendLog.setEmail(emailData.getEmail());
		emailSendLog.setSenddata(StringUtils.join(emailData.getDatas(), ","));
		emailSendLog.setStatus("0");
		emailSendLogService.insert(emailSendLog);
	}

	@Override
	public void doResult(String eventId, EmailData emailData, EmailResult emailResult) {
		EmailSendLog emailSendLog = emailSendLogService.selectById(eventId);
		emailSendLog.setMsg(emailResult.getMsg());
		if (emailResult.isSuccess()) {
			emailSendLog.setStatus("1");
		} else {
			emailSendLog.setStatus("0");
		}
		emailSendLog.setResponseDate(new Date());
		emailSendLogService.insertOrUpdate(emailSendLog);
	}

	@Override
	public void doShutdown() {

	}

}

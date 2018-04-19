package com.itianyi.modules.email.service.impl;

import com.itianyi.core.disruptor.email.EmailEvent.EmailHandlerCallBack;
import com.itianyi.core.disruptor.email.EmailHelper;
import com.itianyi.core.utils.SpringContextHolder;
import com.itianyi.core.utils.email.EmailResult;
import com.itianyi.modules.email.entity.EmailTemplate;
import com.itianyi.modules.email.service.IEmailSendService;
import com.itianyi.modules.email.service.IEmailTemplateService;

import com.itianyi.core.disruptor.email.EmailEvent;
import com.itianyi.core.disruptor.email.EmailHelper;
import com.itianyi.core.utils.SpringContextHolder;
import com.itianyi.core.utils.email.EmailResult;
import org.apache.commons.lang3.StringEscapeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.baomidou.mybatisplus.mapper.EntityWrapper;

/**
 * @Title: 邮件模版
 * @Description: 邮件模版
 * @author jeeweb
 * @date 2017-06-08 10:50:52
 * @version V1.0
 *
 */
@Transactional
@Service("emailSendService")
public class EmailSendServiceImpl implements IEmailSendService {
	@Autowired
	private IEmailTemplateService emailTemplateService;

	@Override
	public void sendAsyncEmailByCode(String email, String code, String... datas) {
		sendAsyncEmailByCode(email, code, null, datas);
	}

	@Override
	public void sendAsyncEmailByCode(String email, String code, EmailEvent.EmailHandlerCallBack callBack, String... datas) {
		EmailTemplate emailTemplate = emailTemplateService
				.selectOne(new EntityWrapper<EmailTemplate>().eq("code", code));
		String templateSubject = emailTemplate.getTemplateSubject();
		String templateContent = emailTemplate.getTemplateContent();
		templateContent = StringEscapeUtils.unescapeHtml4(StringEscapeUtils.unescapeHtml4(templateContent));
		SpringContextHolder.getBean(EmailHelper.class).sendAsyncEmail(email, templateSubject, templateContent, callBack,
				datas);
	}

	@Override
	public EmailResult sendSyncEmailByCode(String email, String code, String... datas) {
		EmailTemplate emailTemplate = emailTemplateService
				.selectOne(new EntityWrapper<EmailTemplate>().eq("code", code));
		String templateSubject = emailTemplate.getTemplateSubject();
		String templateContent = emailTemplate.getTemplateContent();
		templateContent = StringEscapeUtils.unescapeHtml4(StringEscapeUtils.unescapeHtml4(templateContent));
		return SpringContextHolder.getBean(EmailHelper.class).sendSyncEmail(email, templateSubject, templateContent,
				datas);
	}

	@Override
	public void sendAsyncEmail(String email, String subject, String content, String... datas) {
		SpringContextHolder.getBean(EmailHelper.class).sendAsyncEmail(email, subject, content, datas);
	}

	@Override
	public void sendAsyncEmail(String email, String subject, String content, EmailEvent.EmailHandlerCallBack callBack,
			String... datas) {
		SpringContextHolder.getBean(EmailHelper.class).sendAsyncEmail(email, subject, content, callBack, datas);
	}

	@Override
	public EmailResult sendSyncEmail(String email, String subject, String content, String... datas) {
		return SpringContextHolder.getBean(EmailHelper.class).sendSyncEmail(email, subject, content, datas);
	}

}

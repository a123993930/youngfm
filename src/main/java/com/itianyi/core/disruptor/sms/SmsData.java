package com.itianyi.core.disruptor.sms;

import java.io.Serializable;

import com.itianyi.core.utils.sms.data.SmsTemplate;

@SuppressWarnings("serial")
public class SmsData implements Serializable {
	private String phone;
	private SmsTemplate smsTemplate;
	private String[] datas;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public SmsTemplate getSmsTemplate() {
		return smsTemplate;
	}

	public void setSmsTemplate(SmsTemplate smsTemplate) {
		this.smsTemplate = smsTemplate;
	}

	public String[] getDatas() {
		return datas;
	}

	public void setDatas(String[] datas) {
		this.datas = datas;
	}

}

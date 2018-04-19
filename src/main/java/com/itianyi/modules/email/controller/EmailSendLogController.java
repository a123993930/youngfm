package com.itianyi.modules.email.controller;


import com.itianyi.core.common.controller.BaseCRUDController;
import com.itianyi.core.security.shiro.authz.annotation.RequiresPathPermission;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itianyi.core.common.controller.BaseCRUDController;
import com.itianyi.core.security.shiro.authz.annotation.RequiresPathPermission;
import com.itianyi.modules.email.entity.EmailSendLog;

/**   
 * @Title: 邮件发送日志
 * @Description: 邮件发送日志
 * @author jeeweb
 * @date 2017-06-10 07:46:06
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("${admin.url.prefix}/email/emailsendlog")
@RequiresPathPermission("email:emailsendlog")
public class EmailSendLogController extends BaseCRUDController<EmailSendLog, String> {

}

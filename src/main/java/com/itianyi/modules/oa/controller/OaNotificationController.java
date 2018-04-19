package com.itianyi.modules.oa.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itianyi.core.common.controller.BaseCRUDController;
import com.itianyi.core.security.shiro.authz.annotation.RequiresPathPermission;
import com.itianyi.modules.oa.entity.OaNotification;

/**   
 * @Title: 通知公告
 * @Description: 通知公告
 * @author jeeweb
 * @date 2017-06-10 17:15:17
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("${admin.url.prefix}/oa/oanotification")
@RequiresPathPermission("oa:oanotification")
public class OaNotificationController extends BaseCRUDController<OaNotification, String> {

}

package com.itianyi.modules.codegen.controller;

import com.itianyi.core.common.controller.BaseCRUDController;
import com.itianyi.core.security.shiro.authz.annotation.RequiresPathPermission;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itianyi.core.common.controller.BaseCRUDController;
import com.itianyi.core.security.shiro.authz.annotation.RequiresPathPermission;
import com.itianyi.modules.codegen.entity.Column;
@Controller
@RequestMapping("${admin.url.prefix}/codegen/column")
@RequiresPathPermission("codegen:column")
public class ColumnController extends BaseCRUDController<Column, String> {
 
}

package com.itianyi.modules.codegen.codegenerator.utils;

import com.itianyi.core.utils.PropertiesUtil;
import com.itianyi.core.utils.PropertiesUtil;

public class CodeGenUtils {

	public static String getDbType() {
		PropertiesUtil propertiesUtil = new PropertiesUtil("dbconfig.properties");
		String dbType = propertiesUtil.getString("connection.dbType");
		return dbType.toLowerCase();
	}
}

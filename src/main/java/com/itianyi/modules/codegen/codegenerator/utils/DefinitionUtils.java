package com.itianyi.modules.codegen.codegenerator.utils;

import com.itianyi.core.mapper.JaxbMapper;
import com.itianyi.modules.codegen.codegenerator.xml.definition.Definition;
import com.itianyi.core.mapper.JaxbMapper;

public class DefinitionUtils {
	public static DefinitionUtils definitionUtils = null;
	public Definition definition = null;

	public static DefinitionUtils getDefinitionUtils() {
		if (definitionUtils == null) {
			definitionUtils = new DefinitionUtils();
		}
		return definitionUtils;
	}

	public Definition getDefinition() {
		return definition;
	}

	public DefinitionUtils() {
		String dbType = CodeGenUtils.getDbType().toLowerCase();
		definition = JaxbMapper.fromLocation("codegen/mapper/" + dbType + "_definition.xml", Definition.class);
	}
}

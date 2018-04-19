package com.itianyi.modules.codegen.codegenerator.generator;

import java.io.IOException;
import java.util.Map;

import com.itianyi.modules.codegen.codegenerator.data.GeneratorInfo;
import com.itianyi.modules.codegen.codegenerator.exception.GenerationException;
import com.itianyi.modules.codegen.codegenerator.exception.GenerationException;

public interface IGenerator {
	void generate(GeneratorInfo generatorInfo,Map<String, Object> dataMap) throws IOException,
            GenerationException;
}

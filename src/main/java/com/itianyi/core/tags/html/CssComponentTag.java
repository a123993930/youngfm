package com.itianyi.core.tags.html;

@SuppressWarnings("serial")
public class CssComponentTag extends AbstractHtmlTag {
	private static final String[] SUPPORT_TYPES = { "CSS" };

	@Override
	public String[] getSupportTypes() {
		return SUPPORT_TYPES;
	}

}

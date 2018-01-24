
package com.zhongwang.cloud.platform.service.org.exception;

import com.zhongwang.cloud.platform.service.org.common.OrgConst;

public class OrgServiceException extends OrgAbstractException {
	
	private static final long serialVersionUID = 1L;
	
	public OrgServiceException(Enum<?> code) {
		super(code);
	}
	
	public OrgServiceException(Enum<?> code, String message) {
		super(code, message);
	}
	
	public String messageResourceBaseName() {
		return "exception.common";
	}
	
	public String moduleName() {
		return OrgConst.MODULE_NAME + "_" + this.getClass().getSimpleName().toUpperCase();
	}
	
	public enum Error {
		NOT_FOUND_DIMENSION,
		NOT_LEGAL_PARAMETERS,
		NOT_FOUND_RULE_VALUE;
	}
}

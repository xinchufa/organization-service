
package com.zhongwang.cloud.platform.service.org.exception;

import com.zhongwang.cloud.platform.service.org.common.OrgConst;

public class OrgControllerException extends OrgAbstractException {

    private static final long serialVersionUID = 1L;

    public OrgControllerException(Enum<?> code, String message) {
        super(code, message);
    }

    public String messageResourceBaseName() {
        return "exception.common";
    }

    public String moduleName() {
        return OrgConst.MODULE_NAME + "_" + this.getClass().getSimpleName().toUpperCase();
    }

    public enum Error {
        TRIM_FORMAT_LENGTH_TOO_LONG,
        DATE_FORMAT_WRONG;
    }
}

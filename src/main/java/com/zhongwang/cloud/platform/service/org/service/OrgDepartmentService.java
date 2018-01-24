package com.zhongwang.cloud.platform.service.org.service;

import com.zhongwang.cloud.platform.service.org.entity.OrgDepartment;
import com.zhongwang.cloud.platform.service.org.exception.OrgAbstractException;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @Author :  zhujinhua
 * @Date : 2017-12-26 15:57
 */
public interface OrgDepartmentService {
	
	Page<OrgDepartment> listOrgDepartments(int page, int size, String lastUpdateTime, String dimension) throws OrgAbstractException;

}

package com.zhongwang.cloud.platform.service.org.service;

import com.zhongwang.cloud.platform.service.org.entity.OrgUser;
import com.zhongwang.cloud.platform.service.org.exception.OrgAbstractException;
import org.springframework.data.domain.Page;

/**
 * @Author :  zhujinhua
 * @Date : 2017-12-26 15:57
 */
public interface OrgUserService {
	
	Page<OrgUser> listOrgUsers(int page, int size, String lastUpdateTime, String dimension) throws OrgAbstractException;
	
}

package com.zhongwang.cloud.platform.service.org.service.impl;

import com.zhongwang.cloud.platform.service.org.entity.OrgUser;
import com.zhongwang.cloud.platform.service.org.exception.OrgAbstractException;
import com.zhongwang.cloud.platform.service.org.service.OrgUserService;
import com.zhongwang.cloud.platform.service.org.service.impl.base.OrgServiceBaseImpl;
import com.zhongwang.cloud.platform.service.org.util.DateFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @Author :  zhujinhua
 * @Date : 2017-12-26 16:12
 */
@Service
public class OrgUserServiceImpl extends OrgServiceBaseImpl implements OrgUserService {
	
	private static final Logger logger = LoggerFactory.getLogger(OrgUserServiceImpl.class);
	
	@Override
	public Page<OrgUser> listOrgUsers(int page, int size, String lastUpdateTime, String dimension) throws OrgAbstractException {
		return getOrgUserProvider(dimension).find(page - 1, size, StringUtils.isEmpty(lastUpdateTime) ? null : DateFormat.parseStringToDate(lastUpdateTime, DateFormat.DATE_24_YYYY_MM_DD_HH_MM_SS));
	}
	
}

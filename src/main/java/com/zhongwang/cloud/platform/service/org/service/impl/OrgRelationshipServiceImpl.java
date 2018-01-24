package com.zhongwang.cloud.platform.service.org.service.impl;

import com.zhongwang.cloud.platform.service.org.entity.OrgRelationship;
import com.zhongwang.cloud.platform.service.org.exception.OrgAbstractException;
import com.zhongwang.cloud.platform.service.org.service.OrgRelationshipService;
import com.zhongwang.cloud.platform.service.org.service.impl.base.OrgServiceBaseImpl;
import com.zhongwang.cloud.platform.service.org.util.DateFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * 关系表
 *
 * @Author :  zhujinhua
 * @Date : 2017-12-26 16:12
 */
@Service
public class OrgRelationshipServiceImpl extends OrgServiceBaseImpl implements OrgRelationshipService {
	
	private static final Logger logger = LoggerFactory.getLogger(OrgRelationshipServiceImpl.class);
	
	@Override
	public Page<OrgRelationship> listOrgRelationships(int page, int size, String lastUpdateTime, String dimension) throws OrgAbstractException {
		return getOrgRelationshipProvider(dimension).find(page - 1, size, StringUtils.isEmpty(lastUpdateTime) ? null : StringUtils.isEmpty(lastUpdateTime) ? null : DateFormat.parseStringToDate(lastUpdateTime, DateFormat.DATE_24_YYYY_MM_DD_HH_MM_SS));
	}
	
}

package com.zhongwang.cloud.platform.service.org.service.impl.base;

import com.zhongwang.cloud.platform.service.org.exception.OrgAbstractException;
import com.zhongwang.cloud.platform.service.org.exception.OrgServiceException;
import com.zhongwang.cloud.platform.service.org.provider.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * service 实现类 父类
 *
 * @Author :  zhujinhua
 * @Date : 2017-12-27 14:56
 */
public abstract class OrgServiceBaseImpl {
	
	@Autowired
	private List<OrgProvider> orgProviderList;
	
	/**
	 * 根据维度获得用户提供者
	 *
	 * @param dimension
	 * @return OrgProvider
	 */
	protected OrgUserProvider getOrgUserProvider(String dimension) throws OrgAbstractException {
		if (StringUtils.isEmpty(dimension)) {
			throw new OrgServiceException(OrgServiceException.Error.NOT_FOUND_DIMENSION);
		}
		for (OrgProvider orgProvider : orgProviderList) {
			if (dimension.equals(orgProvider.dimension())) {
				return orgProvider.orgUserProvider();
			}
		}
		throw new OrgServiceException(OrgServiceException.Error.NOT_FOUND_DIMENSION);
	}
	
	/**
	 * 根据维度获得部门提供者
	 *
	 * @param dimension
	 * @return OrgProvider
	 */
	protected OrgDepartmentProvider getOrgDepartmentProvider(String dimension) throws OrgAbstractException {
		if (StringUtils.isEmpty(dimension)) {
			throw new OrgServiceException(OrgServiceException.Error.NOT_FOUND_DIMENSION);
		}
		for (OrgProvider orgProvider : orgProviderList) {
			if (dimension.equals(orgProvider.dimension())) {
				return orgProvider.orgDepartmentProvider();
			}
		}
		throw new OrgServiceException(OrgServiceException.Error.NOT_FOUND_DIMENSION);
	}
	
	/**
	 * 根据维度获得岗位提供者
	 *
	 * @param dimension
	 * @return OrgProvider
	 */
	protected OrgPostProvider getOrgPostProvider(String dimension) throws OrgAbstractException {
		if (StringUtils.isEmpty(dimension)) {
			throw new OrgServiceException(OrgServiceException.Error.NOT_FOUND_DIMENSION);
		}
		for (OrgProvider orgProvider : orgProviderList) {
			if (dimension.equals(orgProvider.dimension())) {
				return orgProvider.orgPostProvider();
			}
		}
		throw new OrgServiceException(OrgServiceException.Error.NOT_FOUND_DIMENSION);
	}
	
	/**
	 * 根据维度获得关系表提供者
	 *
	 * @param dimension
	 * @return OrgProvider
	 */
	protected OrgRelationshipProvider getOrgRelationshipProvider(String dimension) throws OrgAbstractException {
		if (StringUtils.isEmpty(dimension)) {
			throw new OrgServiceException(OrgServiceException.Error.NOT_FOUND_DIMENSION);
		}
		for (OrgProvider orgProvider : orgProviderList) {
			if (dimension.equals(orgProvider.dimension())) {
				return orgProvider.orgRelationshipProvider();
			}
		}
		throw new OrgServiceException(OrgServiceException.Error.NOT_FOUND_DIMENSION);
	}
}

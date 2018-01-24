package com.zhongwang.cloud.platform.service.organization.service;

import com.github.pagehelper.PageHelper;
import com.zhongwang.cloud.platform.service.organization.dao.ZwUserMapper;
import com.zhongwang.cloud.platform.service.organization.domain.ZwUser;
import com.zhongwang.common.paging.PageWapper;
import com.zhongwang.common.service.base.BaseStatefulService;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * organization 
 * @author zhongwang 
 */
@Service
public class ZwUserService<K extends ZwUser> extends BaseStatefulService<ZwUser> {

	/**
	 * 查询方法
	 * @param page 分页
	 * @param condition 检索条件
	 * @return 查询结果
	 */
	public PageWapper<ZwUser> listZwUser(PageWapper<ZwUser> page, ZwUser condition) {
		int pageNum = page.getPageNum();
		int pageSize = page.getPageSize();
		PageHelper.startPage(pageNum, pageSize, page.getOrderBy());
		List<ZwUser> selectedRes = ((ZwUserMapper) zWMapper).selectZwUser(condition);
		page.setList(selectedRes);
		return toPage(page, selectedRes);

	}
}
package com.zhongwang.cloud.platform.service.organization.api;

import com.zhongwang.cloud.platform.service.org.entity.OrgUser;
import com.zhongwang.cloud.platform.service.org.entity.vo.EntityQuery;
import com.zhongwang.cloud.platform.service.org.exception.OrgAbstractException;
import com.zhongwang.cloud.platform.service.org.service.OrgUserService;
import com.zhongwang.cloud.platform.service.organization.domain.ZwUser;
import com.zhongwang.cloud.platform.service.organization.service.ZwUserService;
import com.zhongwang.common.paging.PageWapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户
 *
 * @Author :  zhujinhua
 * @Date : 2017-12-26 13:18
 */
@RestController
@RequestMapping("/zw/users/")
public class ZwUserController {
	
	@Autowired
	private ZwUserService zwUserService;
	
	@PostMapping("query")
	public PageWapper<ZwUser> listZwUsers(@RequestBody EntityQuery entityQuery) throws OrgAbstractException {
		PageWapper<ZwUser> pageWapper = new PageWapper<>();
		pageWapper.setPageSize(entityQuery.getSize());
		pageWapper.setPageNum(entityQuery.getPage());
		ZwUser condition = new ZwUser();
		return zwUserService.listZwUser(pageWapper, condition);
	}
	
	@PostMapping("user")
	public int listZwUsers(@RequestBody ZwUser zwUser) throws OrgAbstractException {
		return zwUserService.insert(zwUser);
	}
	
}

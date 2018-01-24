package com.zhongwang.cloud.platform.service.org.api;

import com.zhongwang.cloud.platform.service.org.entity.OrgUser;
import com.zhongwang.cloud.platform.service.org.entity.vo.EntityQuery;
import com.zhongwang.cloud.platform.service.org.exception.OrgAbstractException;
import com.zhongwang.cloud.platform.service.org.service.OrgUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

/**
 * 用户
 * @Author :  zhujinhua
 * @Date : 2017-12-26 13:18
 */
@RestController
@RequestMapping("/org/users/")
public class OrgUserController {

	@Autowired
	private OrgUserService orgUserService;
	
	@PostMapping("query")
	public Page<OrgUser> listOrgUsers(@RequestBody EntityQuery entityQuery) throws OrgAbstractException {
		return orgUserService.listOrgUsers(entityQuery.getPage(), entityQuery.getSize(), entityQuery.getLastUpdateTime(), entityQuery.getDimension());
	}

}

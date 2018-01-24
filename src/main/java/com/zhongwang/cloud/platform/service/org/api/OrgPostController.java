package com.zhongwang.cloud.platform.service.org.api;

import com.zhongwang.cloud.platform.service.org.entity.OrgPost;
import com.zhongwang.cloud.platform.service.org.entity.vo.EntityQuery;
import com.zhongwang.cloud.platform.service.org.exception.OrgAbstractException;
import com.zhongwang.cloud.platform.service.org.service.OrgPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author :  zhujinhua
 * @Date : 2017-12-26 13:18
 */
@RestController
@RequestMapping("/org/posts/")
public class OrgPostController {

	@Autowired
	private OrgPostService orgPostService;
	
	@PostMapping("query")
	public Page<OrgPost> listOrgPosts(@RequestBody EntityQuery entityQuery) throws OrgAbstractException {
		return orgPostService.listOrgPosts(entityQuery.getPage(), entityQuery.getSize(), entityQuery.getLastUpdateTime(), entityQuery.getDimension());
	}

}

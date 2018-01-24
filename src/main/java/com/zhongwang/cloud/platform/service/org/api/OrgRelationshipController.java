package com.zhongwang.cloud.platform.service.org.api;

import com.zhongwang.cloud.platform.service.org.entity.OrgRelationship;
import com.zhongwang.cloud.platform.service.org.entity.vo.EntityQuery;
import com.zhongwang.cloud.platform.service.org.exception.OrgAbstractException;
import com.zhongwang.cloud.platform.service.org.service.OrgRelationshipService;
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
@RequestMapping("/org/relationships/")
public class OrgRelationshipController {

	@Autowired
	private OrgRelationshipService orgRelationshipService;
	
	@PostMapping("query")
	public Page<OrgRelationship> listOrgRelationships(@RequestBody EntityQuery entityQuery) throws OrgAbstractException {
		return orgRelationshipService.listOrgRelationships(entityQuery.getPage(), entityQuery.getSize(), entityQuery.getLastUpdateTime(), entityQuery.getDimension());
	}

}

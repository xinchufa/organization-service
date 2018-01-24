package com.zhongwang.cloud.platform.service.organization.dao;

import com.zhongwang.cloud.platform.service.organization.domain.ZwUser;
import com.zhongwang.common.mapper.ZWMapper;
import org.springframework.context.annotation.Lazy;

import java.util.List;

/**
 * Mapper 接口
 *
 * @author zhongwang
 */
@Lazy
public interface ZwUserMapper extends ZWMapper<ZwUser> {
	List<ZwUser> selectZwUser(ZwUser condition);
}
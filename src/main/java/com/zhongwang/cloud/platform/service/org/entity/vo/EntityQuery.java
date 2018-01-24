package com.zhongwang.cloud.platform.service.org.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @Author :  zhujinhua
 * @Date : 2017-12-29 16:18
 */
@Data
@EqualsAndHashCode
public class EntityQuery implements Serializable {
	
	// 分页
	private Integer page;
	
	// 分页
	private Integer size;
	
	// 所属维度
	private String dimension;
	
	// 更新时间戳
	private String lastUpdateTime;

//	public Integer getPage() {
//		return page;
//	}
//
//	public void setPage(Integer page) {
//		this.page = page;
//	}
//
//	public Integer getSize() {
//		return size;
//	}
//
//	public void setSize(Integer size) {
//		this.size = size;
//	}
//
//	public String getDimension() {
//		return dimension;
//	}
//
//	public void setDimension(String dimension) {
//		this.dimension = dimension;
//	}
//
//	public String getLastUpdateTime() {
//		return lastUpdateTime;
//	}
//
//	public void setLastUpdateTime(String lastUpdateTime) {
//		this.lastUpdateTime = lastUpdateTime;
//	}
}

package com.zhongwang.cloud.platform.service.organization.domain;

import com.zhongwang.common.domain.base.BaseDomain;
import javax.persistence.Column;
import javax.persistence.Table;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * ZW_USER 
 * @author zhongwang 
 */
@Table(name = "zw_user")
public class ZwUser extends BaseDomain {
	private static final long serialVersionUID = -1L;

	@NotEmpty(message = "{validator.common.empty.error}")
	@Length(max = 10, message = "{validator.common.length.error}")
	@Column(name = "mid")
	private String mid;

	@NotEmpty(message = "{validator.common.empty.error}")
	@Length(max = 85, message = "{validator.common.length.error}")
	@Column(name = "user_name")
	private String userName;

	@NotEmpty(message = "{validator.common.empty.error}")
	@Length(max = 85, message = "{validator.common.length.error}")
	@Column(name = "user_realm")
	private String userRealm;

	@NotEmpty(message = "{validator.common.empty.error}")
	@Length(max = 85, message = "{validator.common.length.error}")
	@Column(name = "user_realname")
	private String userRealname;

	@NotEmpty(message = "{validator.common.empty.error}")
	@Length(max = 0, message = "{validator.common.length.error}")
	@Column(name = "user_sex")
	private String userSex;

	@NotEmpty(message = "{validator.common.empty.error}")
	@Length(max = 85, message = "{validator.common.length.error}")
	@Column(name = "user_avatar")
	private String userAvatar;

	@NotEmpty(message = "{validator.common.empty.error}")
	@Length(max = 85, message = "{validator.common.length.error}")
	@Column(name = "user_organization")
	private String userOrganization;

	@NotEmpty(message = "{validator.common.empty.error}")
	@Length(max = 85, message = "{validator.common.length.error}")
	@Column(name = "user_password")
	private String userPassword;

	@NotEmpty(message = "{validator.common.empty.error}")
	@Length(max = 40, message = "{validator.common.length.error}")
	@Column(name = "user_password_salt")
	private String userPasswordSalt;

	/**
	 * null
	 * @return mid null
	 */
	public String getMid() {
		return mid;
	}

	/**
	 * null
	 * @param mid null
	 */
	public void setMid(String mid) {
		this.mid = mid;
	}

	/**
	 * null
	 * @return userName null
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * null
	 * @param userName null
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * null
	 * @return userRealm null
	 */
	public String getUserRealm() {
		return userRealm;
	}

	/**
	 * null
	 * @param userRealm null
	 */
	public void setUserRealm(String userRealm) {
		this.userRealm = userRealm;
	}

	/**
	 * null
	 * @return userRealname null
	 */
	public String getUserRealname() {
		return userRealname;
	}

	/**
	 * null
	 * @param userRealname null
	 */
	public void setUserRealname(String userRealname) {
		this.userRealname = userRealname;
	}

	/**
	 * null
	 * @return userSex null
	 */
	public String getUserSex() {
		return userSex;
	}

	/**
	 * null
	 * @param userSex null
	 */
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	/**
	 * null
	 * @return userAvatar null
	 */
	public String getUserAvatar() {
		return userAvatar;
	}

	/**
	 * null
	 * @param userAvatar null
	 */
	public void setUserAvatar(String userAvatar) {
		this.userAvatar = userAvatar;
	}

	/**
	 * null
	 * @return userOrganization null
	 */
	public String getUserOrganization() {
		return userOrganization;
	}

	/**
	 * null
	 * @param userOrganization null
	 */
	public void setUserOrganization(String userOrganization) {
		this.userOrganization = userOrganization;
	}

	/**
	 * null
	 * @return userPassword null
	 */
	public String getUserPassword() {
		return userPassword;
	}

	/**
	 * null
	 * @param userPassword null
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	/**
	 * null
	 * @return userPasswordSalt null
	 */
	public String getUserPasswordSalt() {
		return userPasswordSalt;
	}

	/**
	 * null
	 * @param userPasswordSalt null
	 */
	public void setUserPasswordSalt(String userPasswordSalt) {
		this.userPasswordSalt = userPasswordSalt;
	}
}
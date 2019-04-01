package com.zcsoft.rc.user.model.entity;


import com.sharingif.cube.components.monitor.IObjectDateOperationHistory;
import com.sharingif.cube.components.password.IPassword;
import com.sharingif.cube.components.sequence.Sequence;
import com.sharingif.cube.core.user.ICoreUser;
import com.sharingif.cube.security.authentication.authority.IAuthorityRepertory;

import java.util.Date;
import java.util.TreeMap;

public class User implements java.io.Serializable, IObjectDateOperationHistory, ICoreUser, IPassword, IAuthorityRepertory<TreeMap<String, String>> {

	/**
	 * 用户类型(00:系统用户)
	 */
	public static final String USER_TYPE_SYS = "00";
	/**
	 * 用户类型(01:注册用户)
	 */
	public static final String USER_TYPE_REGISTER = "01";

	/**
	 * 施工人员状态(00:入场)
	 */
	public static final String BUILDER_STATUS_IN = "00";
	/**
	 * 施工人员状态(00:入场、01:出厂)
	 */
	public static final String BUILDER_STATUS_OUT = "01";

	/**
	 * 用户状态(NORMAL:正常)
	 */
	public static final String STATUS_NORMAL = "NORMAL";

	//columns START
    /**
     * id			db_column: ID 
     */
	@Sequence(ref="uuidSequenceGenerator")
	private String id;
    /**
     * 用户名			db_column: USERNAME 
     */	
	private String username;
    /**
     * 密码			db_column: PASSWORD 
     */	
	private String password;
    /**
     * 昵称			db_column: NICK 
     */	
	private String nick;
    /**
     * 手机前缀			db_column: MOBILE_PREFIX 
     */	
	private String mobilePrefix;
    /**
     * 手机			db_column: MOBILE 
     */	
	private String mobile;
    /**
     * 用户类型(00:系统用户、01:注册用户)			db_column: USER_TYPE 
     */	
	private String userType;
    /**
     * 施工人员类型(00:机车、01:列车、02:施工人员、03:安全防护员、04:作业负责人、05:监理、06:其它人员)			db_column: BUILDER_USER_TYPE 
     */	
	private String builderUserType;
    /**
     * 施工人员状态(00:入场、01:出场)			db_column: BUILDER_STATUS 
     */	
	private String builderStatus;
    /**
     * 入场时间			db_column: ADMISSION_DATE 
     */	
	private Date admissionDate;
    /**
     * 离场时间			db_column: LEAVE_DATE 
     */	
	private Date leaveDate;
    /**
     * 手环编码			db_column: WRIST_STRAP_CODE 
     */	
	private String wristStrapCode;
    /**
     * 用户状态(NORMAL:正常)			db_column: STATUS 
     */	
	private String status;
    /**
     * 登录TOKEN			db_column: LOGIN_TOKEN 
     */	
	private String loginToken;
    /**
     * 登录TOKEN失效时间			db_column: LOGIN_TOKEN_EXPIRAT_TIME 
     */	
	private Date loginTokenExpiratTime;
    /**
     * 登录设备编号			db_column: LOGIN_DEVICE_CODE 
     */	
	private String loginDeviceCode;
    /**
     * 最后登录IP			db_column: LAST_LOGIN_IP 
     */	
	private String lastLoginIp;
    /**
     * 登录失败次数			db_column: FAIL_LOGIN_COUNTER 
     */	
	private Integer failLoginCounter;
    /**
     * 组织id			db_column: ORGANIZATION_ID 
     */	
	private String organizationId;
    /**
     * 用户图片			db_column: USER_PICTURE 
     */	
	private String userPicture;
    /**
     * 创建时间			db_column: CREATE_TIME 
     */	
	private Date createTime;
    /**
     * 修改时间			db_column: MODIFY_TIME 
     */	
	private Date modifyTime;
	//columns END

	private TreeMap<String, String> authorities;
	private Boolean follow;

	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsername() {
		return this.username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return this.password;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getNick() {
		return this.nick;
	}
	public void setMobilePrefix(String mobilePrefix) {
		this.mobilePrefix = mobilePrefix;
	}
	public String getMobilePrefix() {
		return this.mobilePrefix;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMobile() {
		return this.mobile;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getUserType() {
		return this.userType;
	}
	public void setBuilderUserType(String builderUserType) {
		this.builderUserType = builderUserType;
	}
	public String getBuilderUserType() {
		return this.builderUserType;
	}
	public void setBuilderStatus(String builderStatus) {
		this.builderStatus = builderStatus;
	}
	public String getBuilderStatus() {
		return this.builderStatus;
	}
	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}
	public Date getAdmissionDate() {
		return this.admissionDate;
	}
	public void setLeaveDate(Date leaveDate) {
		this.leaveDate = leaveDate;
	}
	public Date getLeaveDate() {
		return this.leaveDate;
	}
	public void setWristStrapCode(String wristStrapCode) {
		this.wristStrapCode = wristStrapCode;
	}
	public String getWristStrapCode() {
		return this.wristStrapCode;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return this.status;
	}
	public void setLoginToken(String loginToken) {
		this.loginToken = loginToken;
	}
	public String getLoginToken() {
		return this.loginToken;
	}
	public void setLoginTokenExpiratTime(Date loginTokenExpiratTime) {
		this.loginTokenExpiratTime = loginTokenExpiratTime;
	}
	public Date getLoginTokenExpiratTime() {
		return this.loginTokenExpiratTime;
	}
	public void setLoginDeviceCode(String loginDeviceCode) {
		this.loginDeviceCode = loginDeviceCode;
	}
	public String getLoginDeviceCode() {
		return this.loginDeviceCode;
	}
	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}
	public String getLastLoginIp() {
		return this.lastLoginIp;
	}
	public void setFailLoginCounter(Integer failLoginCounter) {
		this.failLoginCounter = failLoginCounter;
	}
	public Integer getFailLoginCounter() {
		return this.failLoginCounter;
	}
	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}
	public String getOrganizationId() {
		return this.organizationId;
	}
	public void setUserPicture(String userPicture) {
		this.userPicture = userPicture;
	}
	public String getUserPicture() {
		return this.userPicture;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getCreateTime() {
		return this.createTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	public Date getModifyTime() {
		return this.modifyTime;
	}

	@Override
	public String getUniqueId() {
		return getId();
	}

	@Override
	public void setUniqueId(String uniqueId) {
		setId(uniqueId);
	}


	@Override
	public TreeMap<String, String> getAuthorities() {
		return this.authorities;
	}

	public void setAuthorities(TreeMap<String, String> authorities) {
		this.authorities = authorities;
	}

	public Boolean getFollow() {
		return follow;
	}

	public void setFollow(Boolean follow) {
		this.follow = follow;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getUniqueId() == null) ? 0 : getUniqueId().hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ICoreUser other = (ICoreUser) obj;
		if (getUniqueId() == null) {
			if (other.getUniqueId() != null)
				return false;
		} else if (!getUniqueId().equals(other.getUniqueId()))
			return false;
		return true;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("User{");
		sb.append("id='").append(id).append('\'');
		sb.append(", username='").append(username).append('\'');
		sb.append(", password='").append(password).append('\'');
		sb.append(", nick='").append(nick).append('\'');
		sb.append(", mobilePrefix='").append(mobilePrefix).append('\'');
		sb.append(", mobile='").append(mobile).append('\'');
		sb.append(", userType='").append(userType).append('\'');
		sb.append(", builderUserType='").append(builderUserType).append('\'');
		sb.append(", builderStatus='").append(builderStatus).append('\'');
		sb.append(", admissionDate=").append(admissionDate);
		sb.append(", leaveDate=").append(leaveDate);
		sb.append(", wristStrapCode='").append(wristStrapCode).append('\'');
		sb.append(", status='").append(status).append('\'');
		sb.append(", loginToken='").append(loginToken).append('\'');
		sb.append(", loginTokenExpiratTime=").append(loginTokenExpiratTime);
		sb.append(", loginDeviceCode='").append(loginDeviceCode).append('\'');
		sb.append(", lastLoginIp='").append(lastLoginIp).append('\'');
		sb.append(", failLoginCounter=").append(failLoginCounter);
		sb.append(", organizationId='").append(organizationId).append('\'');
		sb.append(", userPicture='").append(userPicture).append('\'');
		sb.append(", createTime=").append(createTime);
		sb.append(", modifyTime=").append(modifyTime);
		sb.append('}');
		return sb.toString();
	}
}


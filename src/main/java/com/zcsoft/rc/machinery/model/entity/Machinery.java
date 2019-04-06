package com.zcsoft.rc.machinery.model.entity;


import com.sharingif.cube.components.monitor.IObjectDateOperationHistory;
import com.sharingif.cube.components.sequence.Sequence;

import java.util.Date;

public class Machinery implements java.io.Serializable, IObjectDateOperationHistory {
	
	//columns START
    /**
     * id			db_column: ID 
     */
	@Sequence(ref="uuidSequenceGenerator")
	private String id;
    /**
     * 车牌号			db_column: PLATE_NUMBER 
     */	
	private String plateNumber;
    /**
     * 机械名称			db_column: MACHINERY_NAME 
     */	
	private String machineryName;
    /**
     * 机械类型(SMALL:小型、MEDIUM:中型、LARGE:大型)			db_column: MACHINERY_TYPE 
     */	
	private String machineryType;
    /**
     * 用户id			db_column: USER_ID 
     */	
	private String userId;
    /**
     * 司机			db_column: NICK 
     */	
	private String nick;
    /**
     * 手机			db_column: MOBILE 
     */	
	private String mobile;
    /**
     * 作业半径			db_column: WORK_RADIUS 
     */	
	private Integer workRadius;
    /**
     * 手环编码			db_column: WRIST_STRAP_CODE 
     */	
	private String wristStrapCode;
    /**
     * 创建时间			db_column: CREATE_TIME 
     */	
	private Date createTime;
    /**
     * 修改时间			db_column: MODIFY_TIME 
     */	
	private Date modifyTime;
	//columns END

	private Boolean follow;
	/**
	 * 用户图片
	 */
	private String userPicture;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public String getMachineryName() {
		return machineryName;
	}

	public void setMachineryName(String machineryName) {
		this.machineryName = machineryName;
	}

	public String getMachineryType() {
		return machineryType;
	}

	public void setMachineryType(String machineryType) {
		this.machineryType = machineryType;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Integer getWorkRadius() {
		return workRadius;
	}

	public void setWorkRadius(Integer workRadius) {
		this.workRadius = workRadius;
	}

	public String getWristStrapCode() {
		return wristStrapCode;
	}

	public void setWristStrapCode(String wristStrapCode) {
		this.wristStrapCode = wristStrapCode;
	}

	@Override
	public Date getCreateTime() {
		return createTime;
	}

	@Override
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public Date getModifyTime() {
		return modifyTime;
	}

	@Override
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Boolean getFollow() {
		return follow;
	}

	public void setFollow(Boolean follow) {
		this.follow = follow;
	}

	public String getUserPicture() {
		return userPicture;
	}

	public void setUserPicture(String userPicture) {
		this.userPicture = userPicture;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Machinery{");
		sb.append("id='").append(id).append('\'');
		sb.append(", plateNumber='").append(plateNumber).append('\'');
		sb.append(", machineryName='").append(machineryName).append('\'');
		sb.append(", machineryType='").append(machineryType).append('\'');
		sb.append(", userId='").append(userId).append('\'');
		sb.append(", nick='").append(nick).append('\'');
		sb.append(", mobile='").append(mobile).append('\'');
		sb.append(", workRadius=").append(workRadius);
		sb.append(", wristStrapCode='").append(wristStrapCode).append('\'');
		sb.append(", createTime=").append(createTime);
		sb.append(", modifyTime=").append(modifyTime);
		sb.append(", follow=").append(follow);
		sb.append(", userPicture='").append(userPicture).append('\'');
		sb.append('}');
		return sb.toString();
	}
}


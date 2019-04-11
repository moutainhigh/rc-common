package com.zcsoft.rc.notice.model.entity;


import com.sharingif.cube.components.monitor.IObjectDateOperationHistory;
import com.sharingif.cube.components.sequence.Sequence;

import java.util.Date;

public class Notice implements java.io.Serializable, IObjectDateOperationHistory {

	/**
	 * 通知类型(00:接近警告线)
	 */
	public static final String TYPE_CORDON = "00";

	/**
	 * 状态(UNTREATED:未处理)
	 */
	public static final String STATUS_UNTREATED = "UNTREATED";
	/**
	 * 状态(PROCESSING:处理中)
	 */
	public static final String STATUS_PROCESSING = "PROCESSING";
	/**
	 * 状态(SUCCESS:成功)
	 */
	public static final String STATUS_SUCCESS = "SUCCESS";

	//columns START
    /**
     * id			db_column: ID 
     */
	@Sequence(ref="uuidSequenceGenerator")
	private String id;
    /**
     * 通知类型(00:接近警告线)			db_column: TYPE 
     */	
	private String type;
    /**
     * 通知内容			db_column: CONTENT 
     */	
	private String content;
    /**
     * 数据ID			db_column: DATA_ID 
     */	
	private String dataId;
    /**
     * 消息推送Token			db_column: MESSAGING_TOKEN 
     */	
	private String messagingToken;
    /**
     * 状态(UNTREATED:未处理、PROCESSING:处理中、SUCCESS:成功、FAIL:失败)			db_column: STATUS 
     */	
	private String status;
    /**
     * 创建时间			db_column: CREATE_TIME 
     */	
	private Date createTime;
    /**
     * 修改时间			db_column: MODIFY_TIME 
     */	
	private Date modifyTime;
	//columns END

	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return this.type;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getContent() {
		return this.content;
	}
	public void setDataId(String dataId) {
		this.dataId = dataId;
	}
	public String getDataId() {
		return this.dataId;
	}
	public void setMessagingToken(String messagingToken) {
		this.messagingToken = messagingToken;
	}
	public String getMessagingToken() {
		return this.messagingToken;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return this.status;
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

	public String toString() {
		return new StringBuilder("Notice [")
			.append("Id=").append(getId()).append(", ")
					.append("Type=").append(getType()).append(", ")
					.append("Content=").append(getContent()).append(", ")
					.append("DataId=").append(getDataId()).append(", ")
					.append("MessagingToken=").append(getMessagingToken()).append(", ")
					.append("Status=").append(getStatus()).append(", ")
					.append("CreateTime=").append(getCreateTime()).append(", ")
					.append("ModifyTime=").append(getModifyTime())
		.append("]").toString();
	}
	
}

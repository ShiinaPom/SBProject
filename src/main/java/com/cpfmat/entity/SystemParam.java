package com.cpfmat.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * <p>
 * 
 * </p>
 *
 * @author ChenMeng
 * @since 2018-07-11
 */
@TableName("SYSTEM_PARAM")
public class SystemParam implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 学号
	 */
	@TableId(type = IdType.UUID)
	@TableField(value="SEQ_ID")
	private String seqId;
	
	@TableField(value="PARAM_TYPE")
	private String paramType;
	
	@TableField(value="PARAM_KEY")
	private String paramKey;
	
	@TableField(value="PARAM_VALUE")
	private String paramValue;
	
	@TableField(value="INSERT_TIME")
	private String insertTime;
	
	@TableField(value="UPDATE_TIME")
	private String updateTime;
	
	@TableField(value="UPDATE_COUNTS")
	private String updateCounts;
	
	@TableField(value="DEL_FLAG")
	private String delFlag;

	public String getSeqId() {
		return seqId;
	}

	public void setSeqId(String seqId) {
		this.seqId = seqId;
	}

	public String getParamType() {
		return paramType;
	}

	public void setParamType(String paramType) {
		this.paramType = paramType;
	}

	public String getParamKey() {
		return paramKey;
	}

	public void setParamKey(String paramKey) {
		this.paramKey = paramKey;
	}

	public String getParamValue() {
		return paramValue;
	}

	public void setParamValue(String paramValue) {
		this.paramValue = paramValue;
	}

	public String getInsertTime() {
		return insertTime;
	}

	public void setInsertTime(String insertTime) {
		this.insertTime = insertTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getUpdateCounts() {
		return updateCounts;
	}

	public void setUpdateCounts(String updateCounts) {
		this.updateCounts = updateCounts;
	}

	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
}

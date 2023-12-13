package com.eppixcomm.eppix.base.utils;

public class TargetGroupMigrate {

	String originalName;
	String targetType;
	Integer targetGroup;
	String targetUser;
	String targetName;
	
	boolean divert = false;
	public boolean isDivert() {
		return divert;
	}
	public void setDivert(boolean divert) {
		this.divert = divert;
	}
	public String getOriginalName() {
		return originalName;
	}
	public void setOriginalName(String originalName) {
		this.originalName = originalName;
	}
	public String getTargetType() {
		return targetType;
	}
	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}
	public Integer getTargetGroup() {
		return targetGroup;
	}
	public void setTargetGroup(Integer targetGroup) {
		this.targetGroup = targetGroup;
	}
	public String getTargetUser() {
		return targetUser;
	}
	public void setTargetUser(String targetUser) {
		this.targetUser = targetUser;
	}
	public String getTargetName() {
		return targetName;
	}
	public void setTargetName(String targetName) {
		this.targetName = targetName;
	}
}

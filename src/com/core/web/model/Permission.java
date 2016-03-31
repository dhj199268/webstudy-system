package com.core.web.model;

public class Permission {
	private Long id;

	private String permissionName;

	private String permissionSign;

	private String description;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPermissionName() {
		return permissionName;
	}

	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}

	public String getPermissionSign() {
		return permissionSign;
	}

	public void setPermissionSign(String permissionSign) {
		this.permissionSign = permissionSign;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Permission [id=" + id + ", permissionName=" + permissionName + ", permissionSign=" + permissionSign
				+ ", description=" + description + "]";
	}

}

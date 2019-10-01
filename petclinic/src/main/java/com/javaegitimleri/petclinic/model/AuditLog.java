package com.javaegitimleri.petclinic.model;

import java.util.Date;


public class AuditLog extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	private String message;
	
	private Long entityId;
	
	@SuppressWarnings("rawtypes")
	private Class entityClass;
	
	private String username;
	
	private Date auditDate;

	AuditLog() {}

	public AuditLog(String message,
						  Long entityId,
						  @SuppressWarnings("rawtypes") Class entityClass,
						  String username) {
		this.message = message;
		this.entityId = entityId;
		this.entityClass = entityClass;
		this.username = username;
		this.auditDate = new Date();
	}
    


	public String getMessage() {
		return message;
	}

	public Long getEntityId() {
		return entityId;
	}

	@SuppressWarnings("rawtypes")
	public Class getEntityClass() {
		return entityClass;
	}

	public String getUsername() {
		return username;
	}

	public Date getAuditDate() {
		return auditDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((auditDate == null) ? 0 : auditDate.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + ((entityClass == null) ? 0 : entityClass.hashCode());
		result = prime * result + ((entityId == null) ? 0 : entityId.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		AuditLog other = (AuditLog) obj;
		if (auditDate == null) {
			if (other.auditDate != null)
				return false;
		} else if (!auditDate.equals(other.auditDate))
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (entityClass == null) {
			if (other.entityClass != null)
				return false;
		} else if (!entityClass.equals(other.entityClass))
			return false;
		if (entityId == null) {
			if (other.entityId != null)
				return false;
		} else if (!entityId.equals(other.entityId))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	
    @Override
	public String toString() {
		return "AuditLog [message=" + message + ", entityId=" + entityId + ", entityClass="
				+ entityClass + ", username=" + username + ", auditDate=" + auditDate + ", getId()=" + getId()
				+ ", getVersion()=" + getVersion() + "]";
	}
}

package com.fnic.mybatis.thingsboard.model;

public class Event {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event.body
     *
     * @mbg.generated
     */
    private String body;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event.entity_id
     *
     * @mbg.generated
     */
    private String entityId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event.entity_type
     *
     * @mbg.generated
     */
    private String entityType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event.event_type
     *
     * @mbg.generated
     */
    private String eventType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event.event_uid
     *
     * @mbg.generated
     */
    private String eventUid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column event.tenant_id
     *
     * @mbg.generated
     */
    private String tenantId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column event.id
     *
     * @return the value of event.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column event.id
     *
     * @param id the value for event.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column event.body
     *
     * @return the value of event.body
     *
     * @mbg.generated
     */
    public String getBody() {
        return body;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column event.body
     *
     * @param body the value for event.body
     *
     * @mbg.generated
     */
    public void setBody(String body) {
        this.body = body == null ? null : body.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column event.entity_id
     *
     * @return the value of event.entity_id
     *
     * @mbg.generated
     */
    public String getEntityId() {
        return entityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column event.entity_id
     *
     * @param entityId the value for event.entity_id
     *
     * @mbg.generated
     */
    public void setEntityId(String entityId) {
        this.entityId = entityId == null ? null : entityId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column event.entity_type
     *
     * @return the value of event.entity_type
     *
     * @mbg.generated
     */
    public String getEntityType() {
        return entityType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column event.entity_type
     *
     * @param entityType the value for event.entity_type
     *
     * @mbg.generated
     */
    public void setEntityType(String entityType) {
        this.entityType = entityType == null ? null : entityType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column event.event_type
     *
     * @return the value of event.event_type
     *
     * @mbg.generated
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column event.event_type
     *
     * @param eventType the value for event.event_type
     *
     * @mbg.generated
     */
    public void setEventType(String eventType) {
        this.eventType = eventType == null ? null : eventType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column event.event_uid
     *
     * @return the value of event.event_uid
     *
     * @mbg.generated
     */
    public String getEventUid() {
        return eventUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column event.event_uid
     *
     * @param eventUid the value for event.event_uid
     *
     * @mbg.generated
     */
    public void setEventUid(String eventUid) {
        this.eventUid = eventUid == null ? null : eventUid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column event.tenant_id
     *
     * @return the value of event.tenant_id
     *
     * @mbg.generated
     */
    public String getTenantId() {
        return tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column event.tenant_id
     *
     * @param tenantId the value for event.tenant_id
     *
     * @mbg.generated
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId == null ? null : tenantId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Event other = (Event) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBody() == null ? other.getBody() == null : this.getBody().equals(other.getBody()))
            && (this.getEntityId() == null ? other.getEntityId() == null : this.getEntityId().equals(other.getEntityId()))
            && (this.getEntityType() == null ? other.getEntityType() == null : this.getEntityType().equals(other.getEntityType()))
            && (this.getEventType() == null ? other.getEventType() == null : this.getEventType().equals(other.getEventType()))
            && (this.getEventUid() == null ? other.getEventUid() == null : this.getEventUid().equals(other.getEventUid()))
            && (this.getTenantId() == null ? other.getTenantId() == null : this.getTenantId().equals(other.getTenantId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBody() == null) ? 0 : getBody().hashCode());
        result = prime * result + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        result = prime * result + ((getEntityType() == null) ? 0 : getEntityType().hashCode());
        result = prime * result + ((getEventType() == null) ? 0 : getEventType().hashCode());
        result = prime * result + ((getEventUid() == null) ? 0 : getEventUid().hashCode());
        result = prime * result + ((getTenantId() == null) ? 0 : getTenantId().hashCode());
        return result;
    }
}
package com.fnic.mybatis.model;

public class Dashboard {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dashboard.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dashboard.configuration
     *
     * @mbg.generated
     */
    private String configuration;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dashboard.customer_id
     *
     * @mbg.generated
     */
    private String customerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dashboard.search_text
     *
     * @mbg.generated
     */
    private String searchText;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dashboard.tenant_id
     *
     * @mbg.generated
     */
    private String tenantId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dashboard.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dashboard.id
     *
     * @return the value of dashboard.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dashboard.id
     *
     * @param id the value for dashboard.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dashboard.configuration
     *
     * @return the value of dashboard.configuration
     *
     * @mbg.generated
     */
    public String getConfiguration() {
        return configuration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dashboard.configuration
     *
     * @param configuration the value for dashboard.configuration
     *
     * @mbg.generated
     */
    public void setConfiguration(String configuration) {
        this.configuration = configuration == null ? null : configuration.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dashboard.customer_id
     *
     * @return the value of dashboard.customer_id
     *
     * @mbg.generated
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dashboard.customer_id
     *
     * @param customerId the value for dashboard.customer_id
     *
     * @mbg.generated
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dashboard.search_text
     *
     * @return the value of dashboard.search_text
     *
     * @mbg.generated
     */
    public String getSearchText() {
        return searchText;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dashboard.search_text
     *
     * @param searchText the value for dashboard.search_text
     *
     * @mbg.generated
     */
    public void setSearchText(String searchText) {
        this.searchText = searchText == null ? null : searchText.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dashboard.tenant_id
     *
     * @return the value of dashboard.tenant_id
     *
     * @mbg.generated
     */
    public String getTenantId() {
        return tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dashboard.tenant_id
     *
     * @param tenantId the value for dashboard.tenant_id
     *
     * @mbg.generated
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId == null ? null : tenantId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dashboard.title
     *
     * @return the value of dashboard.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dashboard.title
     *
     * @param title the value for dashboard.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dashboard
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
        Dashboard other = (Dashboard) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getConfiguration() == null ? other.getConfiguration() == null : this.getConfiguration().equals(other.getConfiguration()))
            && (this.getCustomerId() == null ? other.getCustomerId() == null : this.getCustomerId().equals(other.getCustomerId()))
            && (this.getSearchText() == null ? other.getSearchText() == null : this.getSearchText().equals(other.getSearchText()))
            && (this.getTenantId() == null ? other.getTenantId() == null : this.getTenantId().equals(other.getTenantId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dashboard
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        result = prime * result + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        result = prime * result + ((getSearchText() == null) ? 0 : getSearchText().hashCode());
        result = prime * result + ((getTenantId() == null) ? 0 : getTenantId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        return result;
    }
}
package com.fnic.mybatis.thingsboard.model;

public class UserCredentials {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_credentials.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_credentials.activate_token
     *
     * @mbg.generated
     */
    private String activateToken;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_credentials.enabled
     *
     * @mbg.generated
     */
    private Boolean enabled;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_credentials.password
     *
     * @mbg.generated
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_credentials.reset_token
     *
     * @mbg.generated
     */
    private String resetToken;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_credentials.user_id
     *
     * @mbg.generated
     */
    private String userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_credentials.id
     *
     * @return the value of user_credentials.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_credentials.id
     *
     * @param id the value for user_credentials.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_credentials.activate_token
     *
     * @return the value of user_credentials.activate_token
     *
     * @mbg.generated
     */
    public String getActivateToken() {
        return activateToken;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_credentials.activate_token
     *
     * @param activateToken the value for user_credentials.activate_token
     *
     * @mbg.generated
     */
    public void setActivateToken(String activateToken) {
        this.activateToken = activateToken == null ? null : activateToken.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_credentials.enabled
     *
     * @return the value of user_credentials.enabled
     *
     * @mbg.generated
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_credentials.enabled
     *
     * @param enabled the value for user_credentials.enabled
     *
     * @mbg.generated
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_credentials.password
     *
     * @return the value of user_credentials.password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_credentials.password
     *
     * @param password the value for user_credentials.password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_credentials.reset_token
     *
     * @return the value of user_credentials.reset_token
     *
     * @mbg.generated
     */
    public String getResetToken() {
        return resetToken;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_credentials.reset_token
     *
     * @param resetToken the value for user_credentials.reset_token
     *
     * @mbg.generated
     */
    public void setResetToken(String resetToken) {
        this.resetToken = resetToken == null ? null : resetToken.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_credentials.user_id
     *
     * @return the value of user_credentials.user_id
     *
     * @mbg.generated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_credentials.user_id
     *
     * @param userId the value for user_credentials.user_id
     *
     * @mbg.generated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_credentials
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
        UserCredentials other = (UserCredentials) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getActivateToken() == null ? other.getActivateToken() == null : this.getActivateToken().equals(other.getActivateToken()))
            && (this.getEnabled() == null ? other.getEnabled() == null : this.getEnabled().equals(other.getEnabled()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getResetToken() == null ? other.getResetToken() == null : this.getResetToken().equals(other.getResetToken()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_credentials
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getActivateToken() == null) ? 0 : getActivateToken().hashCode());
        result = prime * result + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getResetToken() == null) ? 0 : getResetToken().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return result;
    }
}
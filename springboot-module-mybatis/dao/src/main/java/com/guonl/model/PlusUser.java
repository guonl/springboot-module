package com.guonl.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class PlusUser {
    private Integer id;

    private String username;

    private String mobile;

    private String openid;

    private String mallCode;

    private Date activeTime;

    private Integer plusLevelId;

    private String plusLevelName;

    private Integer plusStatus;

    private Integer operateStatus;

    private Date createdAt;

    private Date updatedAt;

    private Boolean isDel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getMallCode() {
        return mallCode;
    }

    public void setMallCode(String mallCode) {
        this.mallCode = mallCode == null ? null : mallCode.trim();
    }

    public Date getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(Date activeTime) {
        this.activeTime = activeTime;
    }

    public Integer getPlusLevelId() {
        return plusLevelId;
    }

    public void setPlusLevelId(Integer plusLevelId) {
        this.plusLevelId = plusLevelId;
    }

    public String getPlusLevelName() {
        return plusLevelName;
    }

    public void setPlusLevelName(String plusLevelName) {
        this.plusLevelName = plusLevelName == null ? null : plusLevelName.trim();
    }

    public Integer getPlusStatus() {
        return plusStatus;
    }

    public void setPlusStatus(Integer plusStatus) {
        this.plusStatus = plusStatus;
    }

    public Integer getOperateStatus() {
        return operateStatus;
    }

    public void setOperateStatus(Integer operateStatus) {
        this.operateStatus = operateStatus;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    public static PlusUser.Builder builder() {
        return new PlusUser.Builder();
    }

    public static class Builder {
        private PlusUser obj;

        public Builder() {
            this.obj = new PlusUser();
        }

        public Builder id(Integer id) {
            obj.setId(id);
            return this;
        }

        public Builder username(String username) {
            obj.setUsername(username);
            return this;
        }

        public Builder mobile(String mobile) {
            obj.setMobile(mobile);
            return this;
        }

        public Builder openid(String openid) {
            obj.setOpenid(openid);
            return this;
        }

        public Builder mallCode(String mallCode) {
            obj.setMallCode(mallCode);
            return this;
        }

        public Builder activeTime(Date activeTime) {
            obj.setActiveTime(activeTime);
            return this;
        }

        public Builder plusLevelId(Integer plusLevelId) {
            obj.setPlusLevelId(plusLevelId);
            return this;
        }

        public Builder plusLevelName(String plusLevelName) {
            obj.setPlusLevelName(plusLevelName);
            return this;
        }

        public Builder plusStatus(Integer plusStatus) {
            obj.setPlusStatus(plusStatus);
            return this;
        }

        public Builder operateStatus(Integer operateStatus) {
            obj.setOperateStatus(operateStatus);
            return this;
        }

        public Builder createdAt(Date createdAt) {
            obj.setCreatedAt(createdAt);
            return this;
        }

        public Builder updatedAt(Date updatedAt) {
            obj.setUpdatedAt(updatedAt);
            return this;
        }

        public Builder isDel(Boolean isDel) {
            obj.setIsDel(isDel);
            return this;
        }

        public PlusUser build() {
            return this.obj;
        }
    }

    public enum Column {
        id("id", "id", "INTEGER", false),
        username("username", "username", "VARCHAR", false),
        mobile("mobile", "mobile", "VARCHAR", false),
        openid("openid", "openid", "VARCHAR", false),
        mallCode("mall_code", "mallCode", "VARCHAR", false),
        activeTime("active_time", "activeTime", "TIMESTAMP", false),
        plusLevelId("plus_level_id", "plusLevelId", "INTEGER", false),
        plusLevelName("plus_level_name", "plusLevelName", "VARCHAR", false),
        plusStatus("plus_status", "plusStatus", "INTEGER", false),
        operateStatus("operate_status", "operateStatus", "INTEGER", false),
        createdAt("created_at", "createdAt", "TIMESTAMP", false),
        updatedAt("updated_at", "updatedAt", "TIMESTAMP", false),
        isDel("is_del", "isDel", "BIT", false);

        private static final String BEGINNING_DELIMITER = "\"";

        private static final String ENDING_DELIMITER = "\"";

        private final String column;

        private final boolean isColumnNameDelimited;

        private final String javaProperty;

        private final String jdbcType;

        public String value() {
            return this.column;
        }

        public String getValue() {
            return this.column;
        }

        public String getJavaProperty() {
            return this.javaProperty;
        }

        public String getJdbcType() {
            return this.jdbcType;
        }

        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}
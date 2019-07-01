package com.guonl.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class PlusOrders {
    private Integer id;

    private String username;

    private String mobile;

    private String openid;

    private String orderNo;

    private String orderStatus;

    private Integer plusGiftId;

    private String remark;

    private String createBy;

    private String createByName;

    private Date createdAt;

    private String updateBy;

    private String updateByName;

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

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public Integer getPlusGiftId() {
        return plusGiftId;
    }

    public void setPlusGiftId(Integer plusGiftId) {
        this.plusGiftId = plusGiftId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public String getCreateByName() {
        return createByName;
    }

    public void setCreateByName(String createByName) {
        this.createByName = createByName == null ? null : createByName.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public String getUpdateByName() {
        return updateByName;
    }

    public void setUpdateByName(String updateByName) {
        this.updateByName = updateByName == null ? null : updateByName.trim();
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

    public static PlusOrders.Builder builder() {
        return new PlusOrders.Builder();
    }

    public static class Builder {
        private PlusOrders obj;

        public Builder() {
            this.obj = new PlusOrders();
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

        public Builder orderNo(String orderNo) {
            obj.setOrderNo(orderNo);
            return this;
        }

        public Builder orderStatus(String orderStatus) {
            obj.setOrderStatus(orderStatus);
            return this;
        }

        public Builder plusGiftId(Integer plusGiftId) {
            obj.setPlusGiftId(plusGiftId);
            return this;
        }

        public Builder remark(String remark) {
            obj.setRemark(remark);
            return this;
        }

        public Builder createBy(String createBy) {
            obj.setCreateBy(createBy);
            return this;
        }

        public Builder createByName(String createByName) {
            obj.setCreateByName(createByName);
            return this;
        }

        public Builder createdAt(Date createdAt) {
            obj.setCreatedAt(createdAt);
            return this;
        }

        public Builder updateBy(String updateBy) {
            obj.setUpdateBy(updateBy);
            return this;
        }

        public Builder updateByName(String updateByName) {
            obj.setUpdateByName(updateByName);
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

        public PlusOrders build() {
            return this.obj;
        }
    }

    public enum Column {
        id("id", "id", "INTEGER", false),
        username("username", "username", "VARCHAR", false),
        mobile("mobile", "mobile", "VARCHAR", false),
        openid("openid", "openid", "VARCHAR", false),
        orderNo("order_no", "orderNo", "VARCHAR", false),
        orderStatus("order_status", "orderStatus", "VARCHAR", false),
        plusGiftId("plus_gift_id", "plusGiftId", "INTEGER", false),
        remark("remark", "remark", "VARCHAR", false),
        createBy("create_by", "createBy", "VARCHAR", false),
        createByName("create_by_name", "createByName", "VARCHAR", false),
        createdAt("created_at", "createdAt", "TIMESTAMP", false),
        updateBy("update_by", "updateBy", "VARCHAR", false),
        updateByName("update_by_name", "updateByName", "VARCHAR", false),
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
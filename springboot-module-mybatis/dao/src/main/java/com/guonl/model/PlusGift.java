package com.guonl.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class PlusGift {
    private Integer id;

    private String giftName;

    private String giftImgUrl;

    private Integer giftStatus;

    private Integer stock;

    private Integer remaining;

    private Integer receive;

    private String giftModel;

    private BigDecimal standardPrice;

    private Integer deliveryAreaId;

    private String detailImgUrl;

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

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName == null ? null : giftName.trim();
    }

    public String getGiftImgUrl() {
        return giftImgUrl;
    }

    public void setGiftImgUrl(String giftImgUrl) {
        this.giftImgUrl = giftImgUrl == null ? null : giftImgUrl.trim();
    }

    public Integer getGiftStatus() {
        return giftStatus;
    }

    public void setGiftStatus(Integer giftStatus) {
        this.giftStatus = giftStatus;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getRemaining() {
        return remaining;
    }

    public void setRemaining(Integer remaining) {
        this.remaining = remaining;
    }

    public Integer getReceive() {
        return receive;
    }

    public void setReceive(Integer receive) {
        this.receive = receive;
    }

    public String getGiftModel() {
        return giftModel;
    }

    public void setGiftModel(String giftModel) {
        this.giftModel = giftModel == null ? null : giftModel.trim();
    }

    public BigDecimal getStandardPrice() {
        return standardPrice;
    }

    public void setStandardPrice(BigDecimal standardPrice) {
        this.standardPrice = standardPrice;
    }

    public Integer getDeliveryAreaId() {
        return deliveryAreaId;
    }

    public void setDeliveryAreaId(Integer deliveryAreaId) {
        this.deliveryAreaId = deliveryAreaId;
    }

    public String getDetailImgUrl() {
        return detailImgUrl;
    }

    public void setDetailImgUrl(String detailImgUrl) {
        this.detailImgUrl = detailImgUrl == null ? null : detailImgUrl.trim();
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

    public static PlusGift.Builder builder() {
        return new PlusGift.Builder();
    }

    public static class Builder {
        private PlusGift obj;

        public Builder() {
            this.obj = new PlusGift();
        }

        public Builder id(Integer id) {
            obj.setId(id);
            return this;
        }

        public Builder giftName(String giftName) {
            obj.setGiftName(giftName);
            return this;
        }

        public Builder giftImgUrl(String giftImgUrl) {
            obj.setGiftImgUrl(giftImgUrl);
            return this;
        }

        public Builder giftStatus(Integer giftStatus) {
            obj.setGiftStatus(giftStatus);
            return this;
        }

        public Builder stock(Integer stock) {
            obj.setStock(stock);
            return this;
        }

        public Builder remaining(Integer remaining) {
            obj.setRemaining(remaining);
            return this;
        }

        public Builder receive(Integer receive) {
            obj.setReceive(receive);
            return this;
        }

        public Builder giftModel(String giftModel) {
            obj.setGiftModel(giftModel);
            return this;
        }

        public Builder standardPrice(BigDecimal standardPrice) {
            obj.setStandardPrice(standardPrice);
            return this;
        }

        public Builder deliveryAreaId(Integer deliveryAreaId) {
            obj.setDeliveryAreaId(deliveryAreaId);
            return this;
        }

        public Builder detailImgUrl(String detailImgUrl) {
            obj.setDetailImgUrl(detailImgUrl);
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

        public PlusGift build() {
            return this.obj;
        }
    }

    public enum Column {
        id("id", "id", "INTEGER", false),
        giftName("gift_name", "giftName", "VARCHAR", false),
        giftImgUrl("gift_img_url", "giftImgUrl", "VARCHAR", false),
        giftStatus("gift_status", "giftStatus", "INTEGER", false),
        stock("stock", "stock", "INTEGER", false),
        remaining("remaining", "remaining", "INTEGER", false),
        receive("receive", "receive", "INTEGER", false),
        giftModel("gift_model", "giftModel", "VARCHAR", false),
        standardPrice("standard_price", "standardPrice", "DECIMAL", false),
        deliveryAreaId("delivery_area_id", "deliveryAreaId", "INTEGER", false),
        detailImgUrl("detail_img_url", "detailImgUrl", "VARCHAR", false),
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
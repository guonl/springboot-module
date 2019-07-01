package com.guonl.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class PlusPrivilege {
    private Integer id;

    private String name;

    private String imgUrl;

    private Integer pType;

    private Integer levelScope;

    private Integer levelId;

    private String levelName;

    private String describe;

    private Integer openStatus;

    private Integer onlineStatus;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public Integer getpType() {
        return pType;
    }

    public void setpType(Integer pType) {
        this.pType = pType;
    }

    public Integer getLevelScope() {
        return levelScope;
    }

    public void setLevelScope(Integer levelScope) {
        this.levelScope = levelScope;
    }

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName == null ? null : levelName.trim();
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    public Integer getOpenStatus() {
        return openStatus;
    }

    public void setOpenStatus(Integer openStatus) {
        this.openStatus = openStatus;
    }

    public Integer getOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(Integer onlineStatus) {
        this.onlineStatus = onlineStatus;
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

    public static PlusPrivilege.Builder builder() {
        return new PlusPrivilege.Builder();
    }

    public static class Builder {
        private PlusPrivilege obj;

        public Builder() {
            this.obj = new PlusPrivilege();
        }

        public Builder id(Integer id) {
            obj.setId(id);
            return this;
        }

        public Builder name(String name) {
            obj.setName(name);
            return this;
        }

        public Builder imgUrl(String imgUrl) {
            obj.setImgUrl(imgUrl);
            return this;
        }

        public Builder pType(Integer pType) {
            obj.setpType(pType);
            return this;
        }

        public Builder levelScope(Integer levelScope) {
            obj.setLevelScope(levelScope);
            return this;
        }

        public Builder levelId(Integer levelId) {
            obj.setLevelId(levelId);
            return this;
        }

        public Builder levelName(String levelName) {
            obj.setLevelName(levelName);
            return this;
        }

        public Builder describe(String describe) {
            obj.setDescribe(describe);
            return this;
        }

        public Builder openStatus(Integer openStatus) {
            obj.setOpenStatus(openStatus);
            return this;
        }

        public Builder onlineStatus(Integer onlineStatus) {
            obj.setOnlineStatus(onlineStatus);
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

        public PlusPrivilege build() {
            return this.obj;
        }
    }

    public enum Column {
        id("id", "id", "INTEGER", false),
        name("name", "name", "VARCHAR", false),
        imgUrl("img_url", "imgUrl", "VARCHAR", false),
        pType("p_type", "pType", "INTEGER", false),
        levelScope("level_scope", "levelScope", "INTEGER", false),
        levelId("level_id", "levelId", "INTEGER", false),
        levelName("level_name", "levelName", "VARCHAR", false),
        describe("describe", "describe", "VARCHAR", false),
        openStatus("open_status", "openStatus", "INTEGER", false),
        onlineStatus("online_status", "onlineStatus", "INTEGER", false),
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
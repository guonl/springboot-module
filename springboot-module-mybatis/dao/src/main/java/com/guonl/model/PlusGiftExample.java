package com.guonl.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlusGiftExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlusGiftExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public PlusGiftExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public PlusGiftExample orderBy(String ... orderByClauses) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < orderByClauses.length; i++) {
            sb.append(orderByClauses[i]);
            if (i < orderByClauses.length - 1) {
                sb.append(" , ");
            }
        }
        this.setOrderByClause(sb.toString());
        return this;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public static Criteria newAndCreateCriteria() {
        PlusGiftExample example = new PlusGiftExample();
        return example.createCriteria();
    }

    public PlusGiftExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public PlusGiftExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
        if (condition) {
            then.example(this);
        } else {
            otherwise.example(this);
        }
        return this;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGiftNameIsNull() {
            addCriterion("gift_name is null");
            return (Criteria) this;
        }

        public Criteria andGiftNameIsNotNull() {
            addCriterion("gift_name is not null");
            return (Criteria) this;
        }

        public Criteria andGiftNameEqualTo(String value) {
            addCriterion("gift_name =", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("gift_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGiftNameNotEqualTo(String value) {
            addCriterion("gift_name <>", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameNotEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("gift_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGiftNameGreaterThan(String value) {
            addCriterion("gift_name >", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameGreaterThanColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("gift_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGiftNameGreaterThanOrEqualTo(String value) {
            addCriterion("gift_name >=", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameGreaterThanOrEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("gift_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGiftNameLessThan(String value) {
            addCriterion("gift_name <", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameLessThanColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("gift_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGiftNameLessThanOrEqualTo(String value) {
            addCriterion("gift_name <=", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameLessThanOrEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("gift_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGiftNameLike(String value) {
            addCriterion("gift_name like", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameNotLike(String value) {
            addCriterion("gift_name not like", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameIn(List<String> values) {
            addCriterion("gift_name in", values, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameNotIn(List<String> values) {
            addCriterion("gift_name not in", values, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameBetween(String value1, String value2) {
            addCriterion("gift_name between", value1, value2, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameNotBetween(String value1, String value2) {
            addCriterion("gift_name not between", value1, value2, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftImgUrlIsNull() {
            addCriterion("gift_img_url is null");
            return (Criteria) this;
        }

        public Criteria andGiftImgUrlIsNotNull() {
            addCriterion("gift_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andGiftImgUrlEqualTo(String value) {
            addCriterion("gift_img_url =", value, "giftImgUrl");
            return (Criteria) this;
        }

        public Criteria andGiftImgUrlEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("gift_img_url = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGiftImgUrlNotEqualTo(String value) {
            addCriterion("gift_img_url <>", value, "giftImgUrl");
            return (Criteria) this;
        }

        public Criteria andGiftImgUrlNotEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("gift_img_url <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGiftImgUrlGreaterThan(String value) {
            addCriterion("gift_img_url >", value, "giftImgUrl");
            return (Criteria) this;
        }

        public Criteria andGiftImgUrlGreaterThanColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("gift_img_url > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGiftImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("gift_img_url >=", value, "giftImgUrl");
            return (Criteria) this;
        }

        public Criteria andGiftImgUrlGreaterThanOrEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("gift_img_url >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGiftImgUrlLessThan(String value) {
            addCriterion("gift_img_url <", value, "giftImgUrl");
            return (Criteria) this;
        }

        public Criteria andGiftImgUrlLessThanColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("gift_img_url < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGiftImgUrlLessThanOrEqualTo(String value) {
            addCriterion("gift_img_url <=", value, "giftImgUrl");
            return (Criteria) this;
        }

        public Criteria andGiftImgUrlLessThanOrEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("gift_img_url <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGiftImgUrlLike(String value) {
            addCriterion("gift_img_url like", value, "giftImgUrl");
            return (Criteria) this;
        }

        public Criteria andGiftImgUrlNotLike(String value) {
            addCriterion("gift_img_url not like", value, "giftImgUrl");
            return (Criteria) this;
        }

        public Criteria andGiftImgUrlIn(List<String> values) {
            addCriterion("gift_img_url in", values, "giftImgUrl");
            return (Criteria) this;
        }

        public Criteria andGiftImgUrlNotIn(List<String> values) {
            addCriterion("gift_img_url not in", values, "giftImgUrl");
            return (Criteria) this;
        }

        public Criteria andGiftImgUrlBetween(String value1, String value2) {
            addCriterion("gift_img_url between", value1, value2, "giftImgUrl");
            return (Criteria) this;
        }

        public Criteria andGiftImgUrlNotBetween(String value1, String value2) {
            addCriterion("gift_img_url not between", value1, value2, "giftImgUrl");
            return (Criteria) this;
        }

        public Criteria andGiftStatusIsNull() {
            addCriterion("gift_status is null");
            return (Criteria) this;
        }

        public Criteria andGiftStatusIsNotNull() {
            addCriterion("gift_status is not null");
            return (Criteria) this;
        }

        public Criteria andGiftStatusEqualTo(Integer value) {
            addCriterion("gift_status =", value, "giftStatus");
            return (Criteria) this;
        }

        public Criteria andGiftStatusEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("gift_status = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGiftStatusNotEqualTo(Integer value) {
            addCriterion("gift_status <>", value, "giftStatus");
            return (Criteria) this;
        }

        public Criteria andGiftStatusNotEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("gift_status <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGiftStatusGreaterThan(Integer value) {
            addCriterion("gift_status >", value, "giftStatus");
            return (Criteria) this;
        }

        public Criteria andGiftStatusGreaterThanColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("gift_status > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGiftStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("gift_status >=", value, "giftStatus");
            return (Criteria) this;
        }

        public Criteria andGiftStatusGreaterThanOrEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("gift_status >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGiftStatusLessThan(Integer value) {
            addCriterion("gift_status <", value, "giftStatus");
            return (Criteria) this;
        }

        public Criteria andGiftStatusLessThanColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("gift_status < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGiftStatusLessThanOrEqualTo(Integer value) {
            addCriterion("gift_status <=", value, "giftStatus");
            return (Criteria) this;
        }

        public Criteria andGiftStatusLessThanOrEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("gift_status <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGiftStatusIn(List<Integer> values) {
            addCriterion("gift_status in", values, "giftStatus");
            return (Criteria) this;
        }

        public Criteria andGiftStatusNotIn(List<Integer> values) {
            addCriterion("gift_status not in", values, "giftStatus");
            return (Criteria) this;
        }

        public Criteria andGiftStatusBetween(Integer value1, Integer value2) {
            addCriterion("gift_status between", value1, value2, "giftStatus");
            return (Criteria) this;
        }

        public Criteria andGiftStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("gift_status not between", value1, value2, "giftStatus");
            return (Criteria) this;
        }

        public Criteria andStockIsNull() {
            addCriterion("stock is null");
            return (Criteria) this;
        }

        public Criteria andStockIsNotNull() {
            addCriterion("stock is not null");
            return (Criteria) this;
        }

        public Criteria andStockEqualTo(Integer value) {
            addCriterion("stock =", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("stock = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockNotEqualTo(Integer value) {
            addCriterion("stock <>", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("stock <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockGreaterThan(Integer value) {
            addCriterion("stock >", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("stock > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock >=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("stock >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockLessThan(Integer value) {
            addCriterion("stock <", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThanColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("stock < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualTo(Integer value) {
            addCriterion("stock <=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("stock <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockIn(List<Integer> values) {
            addCriterion("stock in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotIn(List<Integer> values) {
            addCriterion("stock not in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockBetween(Integer value1, Integer value2) {
            addCriterion("stock between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotBetween(Integer value1, Integer value2) {
            addCriterion("stock not between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andRemainingIsNull() {
            addCriterion("remaining is null");
            return (Criteria) this;
        }

        public Criteria andRemainingIsNotNull() {
            addCriterion("remaining is not null");
            return (Criteria) this;
        }

        public Criteria andRemainingEqualTo(Integer value) {
            addCriterion("remaining =", value, "remaining");
            return (Criteria) this;
        }

        public Criteria andRemainingEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("remaining = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemainingNotEqualTo(Integer value) {
            addCriterion("remaining <>", value, "remaining");
            return (Criteria) this;
        }

        public Criteria andRemainingNotEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("remaining <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemainingGreaterThan(Integer value) {
            addCriterion("remaining >", value, "remaining");
            return (Criteria) this;
        }

        public Criteria andRemainingGreaterThanColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("remaining > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemainingGreaterThanOrEqualTo(Integer value) {
            addCriterion("remaining >=", value, "remaining");
            return (Criteria) this;
        }

        public Criteria andRemainingGreaterThanOrEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("remaining >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemainingLessThan(Integer value) {
            addCriterion("remaining <", value, "remaining");
            return (Criteria) this;
        }

        public Criteria andRemainingLessThanColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("remaining < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemainingLessThanOrEqualTo(Integer value) {
            addCriterion("remaining <=", value, "remaining");
            return (Criteria) this;
        }

        public Criteria andRemainingLessThanOrEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("remaining <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemainingIn(List<Integer> values) {
            addCriterion("remaining in", values, "remaining");
            return (Criteria) this;
        }

        public Criteria andRemainingNotIn(List<Integer> values) {
            addCriterion("remaining not in", values, "remaining");
            return (Criteria) this;
        }

        public Criteria andRemainingBetween(Integer value1, Integer value2) {
            addCriterion("remaining between", value1, value2, "remaining");
            return (Criteria) this;
        }

        public Criteria andRemainingNotBetween(Integer value1, Integer value2) {
            addCriterion("remaining not between", value1, value2, "remaining");
            return (Criteria) this;
        }

        public Criteria andReceiveIsNull() {
            addCriterion("receive is null");
            return (Criteria) this;
        }

        public Criteria andReceiveIsNotNull() {
            addCriterion("receive is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveEqualTo(Integer value) {
            addCriterion("receive =", value, "receive");
            return (Criteria) this;
        }

        public Criteria andReceiveEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("receive = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiveNotEqualTo(Integer value) {
            addCriterion("receive <>", value, "receive");
            return (Criteria) this;
        }

        public Criteria andReceiveNotEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("receive <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiveGreaterThan(Integer value) {
            addCriterion("receive >", value, "receive");
            return (Criteria) this;
        }

        public Criteria andReceiveGreaterThanColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("receive > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("receive >=", value, "receive");
            return (Criteria) this;
        }

        public Criteria andReceiveGreaterThanOrEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("receive >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiveLessThan(Integer value) {
            addCriterion("receive <", value, "receive");
            return (Criteria) this;
        }

        public Criteria andReceiveLessThanColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("receive < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiveLessThanOrEqualTo(Integer value) {
            addCriterion("receive <=", value, "receive");
            return (Criteria) this;
        }

        public Criteria andReceiveLessThanOrEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("receive <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReceiveIn(List<Integer> values) {
            addCriterion("receive in", values, "receive");
            return (Criteria) this;
        }

        public Criteria andReceiveNotIn(List<Integer> values) {
            addCriterion("receive not in", values, "receive");
            return (Criteria) this;
        }

        public Criteria andReceiveBetween(Integer value1, Integer value2) {
            addCriterion("receive between", value1, value2, "receive");
            return (Criteria) this;
        }

        public Criteria andReceiveNotBetween(Integer value1, Integer value2) {
            addCriterion("receive not between", value1, value2, "receive");
            return (Criteria) this;
        }

        public Criteria andGiftModelIsNull() {
            addCriterion("gift_model is null");
            return (Criteria) this;
        }

        public Criteria andGiftModelIsNotNull() {
            addCriterion("gift_model is not null");
            return (Criteria) this;
        }

        public Criteria andGiftModelEqualTo(String value) {
            addCriterion("gift_model =", value, "giftModel");
            return (Criteria) this;
        }

        public Criteria andGiftModelEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("gift_model = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGiftModelNotEqualTo(String value) {
            addCriterion("gift_model <>", value, "giftModel");
            return (Criteria) this;
        }

        public Criteria andGiftModelNotEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("gift_model <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGiftModelGreaterThan(String value) {
            addCriterion("gift_model >", value, "giftModel");
            return (Criteria) this;
        }

        public Criteria andGiftModelGreaterThanColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("gift_model > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGiftModelGreaterThanOrEqualTo(String value) {
            addCriterion("gift_model >=", value, "giftModel");
            return (Criteria) this;
        }

        public Criteria andGiftModelGreaterThanOrEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("gift_model >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGiftModelLessThan(String value) {
            addCriterion("gift_model <", value, "giftModel");
            return (Criteria) this;
        }

        public Criteria andGiftModelLessThanColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("gift_model < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGiftModelLessThanOrEqualTo(String value) {
            addCriterion("gift_model <=", value, "giftModel");
            return (Criteria) this;
        }

        public Criteria andGiftModelLessThanOrEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("gift_model <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGiftModelLike(String value) {
            addCriterion("gift_model like", value, "giftModel");
            return (Criteria) this;
        }

        public Criteria andGiftModelNotLike(String value) {
            addCriterion("gift_model not like", value, "giftModel");
            return (Criteria) this;
        }

        public Criteria andGiftModelIn(List<String> values) {
            addCriterion("gift_model in", values, "giftModel");
            return (Criteria) this;
        }

        public Criteria andGiftModelNotIn(List<String> values) {
            addCriterion("gift_model not in", values, "giftModel");
            return (Criteria) this;
        }

        public Criteria andGiftModelBetween(String value1, String value2) {
            addCriterion("gift_model between", value1, value2, "giftModel");
            return (Criteria) this;
        }

        public Criteria andGiftModelNotBetween(String value1, String value2) {
            addCriterion("gift_model not between", value1, value2, "giftModel");
            return (Criteria) this;
        }

        public Criteria andStandardPriceIsNull() {
            addCriterion("standard_price is null");
            return (Criteria) this;
        }

        public Criteria andStandardPriceIsNotNull() {
            addCriterion("standard_price is not null");
            return (Criteria) this;
        }

        public Criteria andStandardPriceEqualTo(BigDecimal value) {
            addCriterion("standard_price =", value, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("standard_price = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStandardPriceNotEqualTo(BigDecimal value) {
            addCriterion("standard_price <>", value, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceNotEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("standard_price <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStandardPriceGreaterThan(BigDecimal value) {
            addCriterion("standard_price >", value, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceGreaterThanColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("standard_price > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStandardPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("standard_price >=", value, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceGreaterThanOrEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("standard_price >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStandardPriceLessThan(BigDecimal value) {
            addCriterion("standard_price <", value, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceLessThanColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("standard_price < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStandardPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("standard_price <=", value, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceLessThanOrEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("standard_price <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStandardPriceIn(List<BigDecimal> values) {
            addCriterion("standard_price in", values, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceNotIn(List<BigDecimal> values) {
            addCriterion("standard_price not in", values, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("standard_price between", value1, value2, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("standard_price not between", value1, value2, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryAreaIdIsNull() {
            addCriterion("delivery_area_id is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryAreaIdIsNotNull() {
            addCriterion("delivery_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryAreaIdEqualTo(Integer value) {
            addCriterion("delivery_area_id =", value, "deliveryAreaId");
            return (Criteria) this;
        }

        public Criteria andDeliveryAreaIdEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("delivery_area_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeliveryAreaIdNotEqualTo(Integer value) {
            addCriterion("delivery_area_id <>", value, "deliveryAreaId");
            return (Criteria) this;
        }

        public Criteria andDeliveryAreaIdNotEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("delivery_area_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeliveryAreaIdGreaterThan(Integer value) {
            addCriterion("delivery_area_id >", value, "deliveryAreaId");
            return (Criteria) this;
        }

        public Criteria andDeliveryAreaIdGreaterThanColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("delivery_area_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeliveryAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("delivery_area_id >=", value, "deliveryAreaId");
            return (Criteria) this;
        }

        public Criteria andDeliveryAreaIdGreaterThanOrEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("delivery_area_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeliveryAreaIdLessThan(Integer value) {
            addCriterion("delivery_area_id <", value, "deliveryAreaId");
            return (Criteria) this;
        }

        public Criteria andDeliveryAreaIdLessThanColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("delivery_area_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeliveryAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("delivery_area_id <=", value, "deliveryAreaId");
            return (Criteria) this;
        }

        public Criteria andDeliveryAreaIdLessThanOrEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("delivery_area_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeliveryAreaIdIn(List<Integer> values) {
            addCriterion("delivery_area_id in", values, "deliveryAreaId");
            return (Criteria) this;
        }

        public Criteria andDeliveryAreaIdNotIn(List<Integer> values) {
            addCriterion("delivery_area_id not in", values, "deliveryAreaId");
            return (Criteria) this;
        }

        public Criteria andDeliveryAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("delivery_area_id between", value1, value2, "deliveryAreaId");
            return (Criteria) this;
        }

        public Criteria andDeliveryAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("delivery_area_id not between", value1, value2, "deliveryAreaId");
            return (Criteria) this;
        }

        public Criteria andDetailImgUrlIsNull() {
            addCriterion("detail_img_url is null");
            return (Criteria) this;
        }

        public Criteria andDetailImgUrlIsNotNull() {
            addCriterion("detail_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andDetailImgUrlEqualTo(String value) {
            addCriterion("detail_img_url =", value, "detailImgUrl");
            return (Criteria) this;
        }

        public Criteria andDetailImgUrlEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("detail_img_url = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDetailImgUrlNotEqualTo(String value) {
            addCriterion("detail_img_url <>", value, "detailImgUrl");
            return (Criteria) this;
        }

        public Criteria andDetailImgUrlNotEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("detail_img_url <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDetailImgUrlGreaterThan(String value) {
            addCriterion("detail_img_url >", value, "detailImgUrl");
            return (Criteria) this;
        }

        public Criteria andDetailImgUrlGreaterThanColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("detail_img_url > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDetailImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("detail_img_url >=", value, "detailImgUrl");
            return (Criteria) this;
        }

        public Criteria andDetailImgUrlGreaterThanOrEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("detail_img_url >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDetailImgUrlLessThan(String value) {
            addCriterion("detail_img_url <", value, "detailImgUrl");
            return (Criteria) this;
        }

        public Criteria andDetailImgUrlLessThanColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("detail_img_url < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDetailImgUrlLessThanOrEqualTo(String value) {
            addCriterion("detail_img_url <=", value, "detailImgUrl");
            return (Criteria) this;
        }

        public Criteria andDetailImgUrlLessThanOrEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("detail_img_url <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDetailImgUrlLike(String value) {
            addCriterion("detail_img_url like", value, "detailImgUrl");
            return (Criteria) this;
        }

        public Criteria andDetailImgUrlNotLike(String value) {
            addCriterion("detail_img_url not like", value, "detailImgUrl");
            return (Criteria) this;
        }

        public Criteria andDetailImgUrlIn(List<String> values) {
            addCriterion("detail_img_url in", values, "detailImgUrl");
            return (Criteria) this;
        }

        public Criteria andDetailImgUrlNotIn(List<String> values) {
            addCriterion("detail_img_url not in", values, "detailImgUrl");
            return (Criteria) this;
        }

        public Criteria andDetailImgUrlBetween(String value1, String value2) {
            addCriterion("detail_img_url between", value1, value2, "detailImgUrl");
            return (Criteria) this;
        }

        public Criteria andDetailImgUrlNotBetween(String value1, String value2) {
            addCriterion("detail_img_url not between", value1, value2, "detailImgUrl");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("create_by = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("create_by <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("create_by > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("create_by >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("create_by < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("create_by <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNameIsNull() {
            addCriterion("create_by_name is null");
            return (Criteria) this;
        }

        public Criteria andCreateByNameIsNotNull() {
            addCriterion("create_by_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByNameEqualTo(String value) {
            addCriterion("create_by_name =", value, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("create_by_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateByNameNotEqualTo(String value) {
            addCriterion("create_by_name <>", value, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameNotEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("create_by_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateByNameGreaterThan(String value) {
            addCriterion("create_by_name >", value, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameGreaterThanColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("create_by_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateByNameGreaterThanOrEqualTo(String value) {
            addCriterion("create_by_name >=", value, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameGreaterThanOrEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("create_by_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateByNameLessThan(String value) {
            addCriterion("create_by_name <", value, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameLessThanColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("create_by_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateByNameLessThanOrEqualTo(String value) {
            addCriterion("create_by_name <=", value, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameLessThanOrEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("create_by_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateByNameLike(String value) {
            addCriterion("create_by_name like", value, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameNotLike(String value) {
            addCriterion("create_by_name not like", value, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameIn(List<String> values) {
            addCriterion("create_by_name in", values, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameNotIn(List<String> values) {
            addCriterion("create_by_name not in", values, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameBetween(String value1, String value2) {
            addCriterion("create_by_name between", value1, value2, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameNotBetween(String value1, String value2) {
            addCriterion("create_by_name not between", value1, value2, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("created_at = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("created_at <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("created_at > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("created_at >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("created_at < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("created_at <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("update_by = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("update_by <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("update_by > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("update_by >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("update_by < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("update_by <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNameIsNull() {
            addCriterion("update_by_name is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByNameIsNotNull() {
            addCriterion("update_by_name is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByNameEqualTo(String value) {
            addCriterion("update_by_name =", value, "updateByName");
            return (Criteria) this;
        }

        public Criteria andUpdateByNameEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("update_by_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateByNameNotEqualTo(String value) {
            addCriterion("update_by_name <>", value, "updateByName");
            return (Criteria) this;
        }

        public Criteria andUpdateByNameNotEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("update_by_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateByNameGreaterThan(String value) {
            addCriterion("update_by_name >", value, "updateByName");
            return (Criteria) this;
        }

        public Criteria andUpdateByNameGreaterThanColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("update_by_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateByNameGreaterThanOrEqualTo(String value) {
            addCriterion("update_by_name >=", value, "updateByName");
            return (Criteria) this;
        }

        public Criteria andUpdateByNameGreaterThanOrEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("update_by_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateByNameLessThan(String value) {
            addCriterion("update_by_name <", value, "updateByName");
            return (Criteria) this;
        }

        public Criteria andUpdateByNameLessThanColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("update_by_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateByNameLessThanOrEqualTo(String value) {
            addCriterion("update_by_name <=", value, "updateByName");
            return (Criteria) this;
        }

        public Criteria andUpdateByNameLessThanOrEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("update_by_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateByNameLike(String value) {
            addCriterion("update_by_name like", value, "updateByName");
            return (Criteria) this;
        }

        public Criteria andUpdateByNameNotLike(String value) {
            addCriterion("update_by_name not like", value, "updateByName");
            return (Criteria) this;
        }

        public Criteria andUpdateByNameIn(List<String> values) {
            addCriterion("update_by_name in", values, "updateByName");
            return (Criteria) this;
        }

        public Criteria andUpdateByNameNotIn(List<String> values) {
            addCriterion("update_by_name not in", values, "updateByName");
            return (Criteria) this;
        }

        public Criteria andUpdateByNameBetween(String value1, String value2) {
            addCriterion("update_by_name between", value1, value2, "updateByName");
            return (Criteria) this;
        }

        public Criteria andUpdateByNameNotBetween(String value1, String value2) {
            addCriterion("update_by_name not between", value1, value2, "updateByName");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("updated_at = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("updated_at <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("updated_at > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("updated_at >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("updated_at < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("updated_at <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("is_del is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("is_del is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(Boolean value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("is_del = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(Boolean value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("is_del <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(Boolean value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("is_del > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("is_del >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(Boolean value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("is_del < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(Boolean value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualToColumn(PlusGift.Column column) {
            addCriterion(new StringBuilder("is_del <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<Boolean> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<Boolean> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(Boolean value1, Boolean value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_del not between", value1, value2, "isDel");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private PlusGiftExample example;

        protected Criteria(PlusGiftExample example) {
            super();
            this.example = example;
        }

        public PlusGiftExample example() {
            return this.example;
        }

        @Deprecated
        public Criteria andIf(boolean ifAdd, ICriteriaAdd add) {
            if (ifAdd) {
                add.add(this);
            }
            return this;
        }

        public Criteria when(boolean condition, ICriteriaWhen then) {
            if (condition) {
                then.criteria(this);
            }
            return this;
        }

        public Criteria when(boolean condition, ICriteriaWhen then, ICriteriaWhen otherwise) {
            if (condition) {
                then.criteria(this);
            } else {
                otherwise.criteria(this);
            }
            return this;
        }

        @Deprecated
        public interface ICriteriaAdd {
            Criteria add(Criteria add);
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }

    public interface ICriteriaWhen {
        void criteria(Criteria criteria);
    }

    public interface IExampleWhen {
        void example(com.guonl.model.PlusGiftExample example);
    }
}
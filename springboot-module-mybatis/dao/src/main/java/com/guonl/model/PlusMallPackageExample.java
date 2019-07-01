package com.guonl.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlusMallPackageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlusMallPackageExample() {
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

    public PlusMallPackageExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public PlusMallPackageExample orderBy(String ... orderByClauses) {
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
        PlusMallPackageExample example = new PlusMallPackageExample();
        return example.createCriteria();
    }

    public PlusMallPackageExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public PlusMallPackageExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andIdEqualToColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(PlusMallPackage.Column column) {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameEqualToColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualToColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualToColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualToColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andMallCodeIsNull() {
            addCriterion("mall_code is null");
            return (Criteria) this;
        }

        public Criteria andMallCodeIsNotNull() {
            addCriterion("mall_code is not null");
            return (Criteria) this;
        }

        public Criteria andMallCodeEqualTo(String value) {
            addCriterion("mall_code =", value, "mallCode");
            return (Criteria) this;
        }

        public Criteria andMallCodeEqualToColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("mall_code = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMallCodeNotEqualTo(String value) {
            addCriterion("mall_code <>", value, "mallCode");
            return (Criteria) this;
        }

        public Criteria andMallCodeNotEqualToColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("mall_code <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMallCodeGreaterThan(String value) {
            addCriterion("mall_code >", value, "mallCode");
            return (Criteria) this;
        }

        public Criteria andMallCodeGreaterThanColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("mall_code > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMallCodeGreaterThanOrEqualTo(String value) {
            addCriterion("mall_code >=", value, "mallCode");
            return (Criteria) this;
        }

        public Criteria andMallCodeGreaterThanOrEqualToColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("mall_code >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMallCodeLessThan(String value) {
            addCriterion("mall_code <", value, "mallCode");
            return (Criteria) this;
        }

        public Criteria andMallCodeLessThanColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("mall_code < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMallCodeLessThanOrEqualTo(String value) {
            addCriterion("mall_code <=", value, "mallCode");
            return (Criteria) this;
        }

        public Criteria andMallCodeLessThanOrEqualToColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("mall_code <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMallCodeLike(String value) {
            addCriterion("mall_code like", value, "mallCode");
            return (Criteria) this;
        }

        public Criteria andMallCodeNotLike(String value) {
            addCriterion("mall_code not like", value, "mallCode");
            return (Criteria) this;
        }

        public Criteria andMallCodeIn(List<String> values) {
            addCriterion("mall_code in", values, "mallCode");
            return (Criteria) this;
        }

        public Criteria andMallCodeNotIn(List<String> values) {
            addCriterion("mall_code not in", values, "mallCode");
            return (Criteria) this;
        }

        public Criteria andMallCodeBetween(String value1, String value2) {
            addCriterion("mall_code between", value1, value2, "mallCode");
            return (Criteria) this;
        }

        public Criteria andMallCodeNotBetween(String value1, String value2) {
            addCriterion("mall_code not between", value1, value2, "mallCode");
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

        public Criteria andStandardPriceEqualToColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("standard_price = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStandardPriceNotEqualTo(BigDecimal value) {
            addCriterion("standard_price <>", value, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceNotEqualToColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("standard_price <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStandardPriceGreaterThan(BigDecimal value) {
            addCriterion("standard_price >", value, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceGreaterThanColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("standard_price > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStandardPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("standard_price >=", value, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceGreaterThanOrEqualToColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("standard_price >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStandardPriceLessThan(BigDecimal value) {
            addCriterion("standard_price <", value, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceLessThanColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("standard_price < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStandardPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("standard_price <=", value, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceLessThanOrEqualToColumn(PlusMallPackage.Column column) {
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

        public Criteria andGradeLevelIsNull() {
            addCriterion("grade_level is null");
            return (Criteria) this;
        }

        public Criteria andGradeLevelIsNotNull() {
            addCriterion("grade_level is not null");
            return (Criteria) this;
        }

        public Criteria andGradeLevelEqualTo(Integer value) {
            addCriterion("grade_level =", value, "gradeLevel");
            return (Criteria) this;
        }

        public Criteria andGradeLevelEqualToColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("grade_level = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGradeLevelNotEqualTo(Integer value) {
            addCriterion("grade_level <>", value, "gradeLevel");
            return (Criteria) this;
        }

        public Criteria andGradeLevelNotEqualToColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("grade_level <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGradeLevelGreaterThan(Integer value) {
            addCriterion("grade_level >", value, "gradeLevel");
            return (Criteria) this;
        }

        public Criteria andGradeLevelGreaterThanColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("grade_level > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGradeLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade_level >=", value, "gradeLevel");
            return (Criteria) this;
        }

        public Criteria andGradeLevelGreaterThanOrEqualToColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("grade_level >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGradeLevelLessThan(Integer value) {
            addCriterion("grade_level <", value, "gradeLevel");
            return (Criteria) this;
        }

        public Criteria andGradeLevelLessThanColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("grade_level < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGradeLevelLessThanOrEqualTo(Integer value) {
            addCriterion("grade_level <=", value, "gradeLevel");
            return (Criteria) this;
        }

        public Criteria andGradeLevelLessThanOrEqualToColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("grade_level <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGradeLevelIn(List<Integer> values) {
            addCriterion("grade_level in", values, "gradeLevel");
            return (Criteria) this;
        }

        public Criteria andGradeLevelNotIn(List<Integer> values) {
            addCriterion("grade_level not in", values, "gradeLevel");
            return (Criteria) this;
        }

        public Criteria andGradeLevelBetween(Integer value1, Integer value2) {
            addCriterion("grade_level between", value1, value2, "gradeLevel");
            return (Criteria) this;
        }

        public Criteria andGradeLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("grade_level not between", value1, value2, "gradeLevel");
            return (Criteria) this;
        }

        public Criteria andSalePriceIsNull() {
            addCriterion("sale_price is null");
            return (Criteria) this;
        }

        public Criteria andSalePriceIsNotNull() {
            addCriterion("sale_price is not null");
            return (Criteria) this;
        }

        public Criteria andSalePriceEqualTo(BigDecimal value) {
            addCriterion("sale_price =", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceEqualToColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("sale_price = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSalePriceNotEqualTo(BigDecimal value) {
            addCriterion("sale_price <>", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotEqualToColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("sale_price <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThan(BigDecimal value) {
            addCriterion("sale_price >", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThanColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("sale_price > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sale_price >=", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThanOrEqualToColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("sale_price >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThan(BigDecimal value) {
            addCriterion("sale_price <", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThanColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("sale_price < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sale_price <=", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThanOrEqualToColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("sale_price <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSalePriceIn(List<BigDecimal> values) {
            addCriterion("sale_price in", values, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotIn(List<BigDecimal> values) {
            addCriterion("sale_price not in", values, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sale_price between", value1, value2, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sale_price not between", value1, value2, "salePrice");
            return (Criteria) this;
        }

        public Criteria andAvaileTimeIsNull() {
            addCriterion("availe_time is null");
            return (Criteria) this;
        }

        public Criteria andAvaileTimeIsNotNull() {
            addCriterion("availe_time is not null");
            return (Criteria) this;
        }

        public Criteria andAvaileTimeEqualTo(Date value) {
            addCriterion("availe_time =", value, "availeTime");
            return (Criteria) this;
        }

        public Criteria andAvaileTimeEqualToColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("availe_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAvaileTimeNotEqualTo(Date value) {
            addCriterion("availe_time <>", value, "availeTime");
            return (Criteria) this;
        }

        public Criteria andAvaileTimeNotEqualToColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("availe_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAvaileTimeGreaterThan(Date value) {
            addCriterion("availe_time >", value, "availeTime");
            return (Criteria) this;
        }

        public Criteria andAvaileTimeGreaterThanColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("availe_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAvaileTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("availe_time >=", value, "availeTime");
            return (Criteria) this;
        }

        public Criteria andAvaileTimeGreaterThanOrEqualToColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("availe_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAvaileTimeLessThan(Date value) {
            addCriterion("availe_time <", value, "availeTime");
            return (Criteria) this;
        }

        public Criteria andAvaileTimeLessThanColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("availe_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAvaileTimeLessThanOrEqualTo(Date value) {
            addCriterion("availe_time <=", value, "availeTime");
            return (Criteria) this;
        }

        public Criteria andAvaileTimeLessThanOrEqualToColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("availe_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAvaileTimeIn(List<Date> values) {
            addCriterion("availe_time in", values, "availeTime");
            return (Criteria) this;
        }

        public Criteria andAvaileTimeNotIn(List<Date> values) {
            addCriterion("availe_time not in", values, "availeTime");
            return (Criteria) this;
        }

        public Criteria andAvaileTimeBetween(Date value1, Date value2) {
            addCriterion("availe_time between", value1, value2, "availeTime");
            return (Criteria) this;
        }

        public Criteria andAvaileTimeNotBetween(Date value1, Date value2) {
            addCriterion("availe_time not between", value1, value2, "availeTime");
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

        public Criteria andCreatedAtEqualToColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("created_at = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualToColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("created_at <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("created_at > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualToColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("created_at >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("created_at < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualToColumn(PlusMallPackage.Column column) {
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

        public Criteria andUpdatedAtEqualToColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("updated_at = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualToColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("updated_at <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("updated_at > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualToColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("updated_at >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("updated_at < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualToColumn(PlusMallPackage.Column column) {
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

        public Criteria andIsDelEqualToColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("is_del = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(Boolean value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualToColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("is_del <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(Boolean value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("is_del > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualToColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("is_del >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(Boolean value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanColumn(PlusMallPackage.Column column) {
            addCriterion(new StringBuilder("is_del < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(Boolean value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualToColumn(PlusMallPackage.Column column) {
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
        private PlusMallPackageExample example;

        protected Criteria(PlusMallPackageExample example) {
            super();
            this.example = example;
        }

        public PlusMallPackageExample example() {
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
        void example(com.guonl.model.PlusMallPackageExample example);
    }
}
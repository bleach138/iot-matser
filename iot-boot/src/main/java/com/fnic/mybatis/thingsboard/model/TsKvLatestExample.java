package com.fnic.mybatis.thingsboard.model;

import java.util.ArrayList;
import java.util.List;

public class TsKvLatestExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ts_kv_latest
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ts_kv_latest
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ts_kv_latest
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ts_kv_latest
     *
     * @mbg.generated
     */
    protected Integer limitStart;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ts_kv_latest
     *
     * @mbg.generated
     */
    protected Integer limitEnd;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_kv_latest
     *
     * @mbg.generated
     */
    public TsKvLatestExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_kv_latest
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_kv_latest
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_kv_latest
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_kv_latest
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_kv_latest
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_kv_latest
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_kv_latest
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_kv_latest
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_kv_latest
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_kv_latest
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_kv_latest
     *
     * @mbg.generated
     */
    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_kv_latest
     *
     * @mbg.generated
     */
    public Integer getLimitStart() {
        return limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_kv_latest
     *
     * @mbg.generated
     */
    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_kv_latest
     *
     * @mbg.generated
     */
    public Integer getLimitEnd() {
        return limitEnd;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ts_kv_latest
     *
     * @mbg.generated
     */
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

        public Criteria andEntityTypeIsNull() {
            addCriterion("entity_type is null");
            return (Criteria) this;
        }

        public Criteria andEntityTypeIsNotNull() {
            addCriterion("entity_type is not null");
            return (Criteria) this;
        }

        public Criteria andEntityTypeEqualTo(String value) {
            addCriterion("entity_type =", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeNotEqualTo(String value) {
            addCriterion("entity_type <>", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeGreaterThan(String value) {
            addCriterion("entity_type >", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeGreaterThanOrEqualTo(String value) {
            addCriterion("entity_type >=", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeLessThan(String value) {
            addCriterion("entity_type <", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeLessThanOrEqualTo(String value) {
            addCriterion("entity_type <=", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeLike(String value) {
            addCriterion("entity_type like", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeNotLike(String value) {
            addCriterion("entity_type not like", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeIn(List<String> values) {
            addCriterion("entity_type in", values, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeNotIn(List<String> values) {
            addCriterion("entity_type not in", values, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeBetween(String value1, String value2) {
            addCriterion("entity_type between", value1, value2, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeNotBetween(String value1, String value2) {
            addCriterion("entity_type not between", value1, value2, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityIdIsNull() {
            addCriterion("entity_id is null");
            return (Criteria) this;
        }

        public Criteria andEntityIdIsNotNull() {
            addCriterion("entity_id is not null");
            return (Criteria) this;
        }

        public Criteria andEntityIdEqualTo(String value) {
            addCriterion("entity_id =", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotEqualTo(String value) {
            addCriterion("entity_id <>", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdGreaterThan(String value) {
            addCriterion("entity_id >", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdGreaterThanOrEqualTo(String value) {
            addCriterion("entity_id >=", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdLessThan(String value) {
            addCriterion("entity_id <", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdLessThanOrEqualTo(String value) {
            addCriterion("entity_id <=", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdLike(String value) {
            addCriterion("entity_id like", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotLike(String value) {
            addCriterion("entity_id not like", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdIn(List<String> values) {
            addCriterion("entity_id in", values, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotIn(List<String> values) {
            addCriterion("entity_id not in", values, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdBetween(String value1, String value2) {
            addCriterion("entity_id between", value1, value2, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotBetween(String value1, String value2) {
            addCriterion("entity_id not between", value1, value2, "entityId");
            return (Criteria) this;
        }

        public Criteria andKeyIsNull() {
            addCriterion("key is null");
            return (Criteria) this;
        }

        public Criteria andKeyIsNotNull() {
            addCriterion("key is not null");
            return (Criteria) this;
        }

        public Criteria andKeyEqualTo(String value) {
            addCriterion("key =", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotEqualTo(String value) {
            addCriterion("key <>", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyGreaterThan(String value) {
            addCriterion("key >", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyGreaterThanOrEqualTo(String value) {
            addCriterion("key >=", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLessThan(String value) {
            addCriterion("key <", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLessThanOrEqualTo(String value) {
            addCriterion("key <=", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLike(String value) {
            addCriterion("key like", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotLike(String value) {
            addCriterion("key not like", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyIn(List<String> values) {
            addCriterion("key in", values, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotIn(List<String> values) {
            addCriterion("key not in", values, "key");
            return (Criteria) this;
        }

        public Criteria andKeyBetween(String value1, String value2) {
            addCriterion("key between", value1, value2, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotBetween(String value1, String value2) {
            addCriterion("key not between", value1, value2, "key");
            return (Criteria) this;
        }

        public Criteria andTsIsNull() {
            addCriterion("ts is null");
            return (Criteria) this;
        }

        public Criteria andTsIsNotNull() {
            addCriterion("ts is not null");
            return (Criteria) this;
        }

        public Criteria andTsEqualTo(Long value) {
            addCriterion("ts =", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotEqualTo(Long value) {
            addCriterion("ts <>", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThan(Long value) {
            addCriterion("ts >", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThanOrEqualTo(Long value) {
            addCriterion("ts >=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThan(Long value) {
            addCriterion("ts <", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThanOrEqualTo(Long value) {
            addCriterion("ts <=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsIn(List<Long> values) {
            addCriterion("ts in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotIn(List<Long> values) {
            addCriterion("ts not in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsBetween(Long value1, Long value2) {
            addCriterion("ts between", value1, value2, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotBetween(Long value1, Long value2) {
            addCriterion("ts not between", value1, value2, "ts");
            return (Criteria) this;
        }

        public Criteria andBoolVIsNull() {
            addCriterion("bool_v is null");
            return (Criteria) this;
        }

        public Criteria andBoolVIsNotNull() {
            addCriterion("bool_v is not null");
            return (Criteria) this;
        }

        public Criteria andBoolVEqualTo(Boolean value) {
            addCriterion("bool_v =", value, "boolV");
            return (Criteria) this;
        }

        public Criteria andBoolVNotEqualTo(Boolean value) {
            addCriterion("bool_v <>", value, "boolV");
            return (Criteria) this;
        }

        public Criteria andBoolVGreaterThan(Boolean value) {
            addCriterion("bool_v >", value, "boolV");
            return (Criteria) this;
        }

        public Criteria andBoolVGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bool_v >=", value, "boolV");
            return (Criteria) this;
        }

        public Criteria andBoolVLessThan(Boolean value) {
            addCriterion("bool_v <", value, "boolV");
            return (Criteria) this;
        }

        public Criteria andBoolVLessThanOrEqualTo(Boolean value) {
            addCriterion("bool_v <=", value, "boolV");
            return (Criteria) this;
        }

        public Criteria andBoolVIn(List<Boolean> values) {
            addCriterion("bool_v in", values, "boolV");
            return (Criteria) this;
        }

        public Criteria andBoolVNotIn(List<Boolean> values) {
            addCriterion("bool_v not in", values, "boolV");
            return (Criteria) this;
        }

        public Criteria andBoolVBetween(Boolean value1, Boolean value2) {
            addCriterion("bool_v between", value1, value2, "boolV");
            return (Criteria) this;
        }

        public Criteria andBoolVNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bool_v not between", value1, value2, "boolV");
            return (Criteria) this;
        }

        public Criteria andStrVIsNull() {
            addCriterion("str_v is null");
            return (Criteria) this;
        }

        public Criteria andStrVIsNotNull() {
            addCriterion("str_v is not null");
            return (Criteria) this;
        }

        public Criteria andStrVEqualTo(String value) {
            addCriterion("str_v =", value, "strV");
            return (Criteria) this;
        }

        public Criteria andStrVNotEqualTo(String value) {
            addCriterion("str_v <>", value, "strV");
            return (Criteria) this;
        }

        public Criteria andStrVGreaterThan(String value) {
            addCriterion("str_v >", value, "strV");
            return (Criteria) this;
        }

        public Criteria andStrVGreaterThanOrEqualTo(String value) {
            addCriterion("str_v >=", value, "strV");
            return (Criteria) this;
        }

        public Criteria andStrVLessThan(String value) {
            addCriterion("str_v <", value, "strV");
            return (Criteria) this;
        }

        public Criteria andStrVLessThanOrEqualTo(String value) {
            addCriterion("str_v <=", value, "strV");
            return (Criteria) this;
        }

        public Criteria andStrVLike(String value) {
            addCriterion("str_v like", value, "strV");
            return (Criteria) this;
        }

        public Criteria andStrVNotLike(String value) {
            addCriterion("str_v not like", value, "strV");
            return (Criteria) this;
        }

        public Criteria andStrVIn(List<String> values) {
            addCriterion("str_v in", values, "strV");
            return (Criteria) this;
        }

        public Criteria andStrVNotIn(List<String> values) {
            addCriterion("str_v not in", values, "strV");
            return (Criteria) this;
        }

        public Criteria andStrVBetween(String value1, String value2) {
            addCriterion("str_v between", value1, value2, "strV");
            return (Criteria) this;
        }

        public Criteria andStrVNotBetween(String value1, String value2) {
            addCriterion("str_v not between", value1, value2, "strV");
            return (Criteria) this;
        }

        public Criteria andLongVIsNull() {
            addCriterion("long_v is null");
            return (Criteria) this;
        }

        public Criteria andLongVIsNotNull() {
            addCriterion("long_v is not null");
            return (Criteria) this;
        }

        public Criteria andLongVEqualTo(Long value) {
            addCriterion("long_v =", value, "longV");
            return (Criteria) this;
        }

        public Criteria andLongVNotEqualTo(Long value) {
            addCriterion("long_v <>", value, "longV");
            return (Criteria) this;
        }

        public Criteria andLongVGreaterThan(Long value) {
            addCriterion("long_v >", value, "longV");
            return (Criteria) this;
        }

        public Criteria andLongVGreaterThanOrEqualTo(Long value) {
            addCriterion("long_v >=", value, "longV");
            return (Criteria) this;
        }

        public Criteria andLongVLessThan(Long value) {
            addCriterion("long_v <", value, "longV");
            return (Criteria) this;
        }

        public Criteria andLongVLessThanOrEqualTo(Long value) {
            addCriterion("long_v <=", value, "longV");
            return (Criteria) this;
        }

        public Criteria andLongVIn(List<Long> values) {
            addCriterion("long_v in", values, "longV");
            return (Criteria) this;
        }

        public Criteria andLongVNotIn(List<Long> values) {
            addCriterion("long_v not in", values, "longV");
            return (Criteria) this;
        }

        public Criteria andLongVBetween(Long value1, Long value2) {
            addCriterion("long_v between", value1, value2, "longV");
            return (Criteria) this;
        }

        public Criteria andLongVNotBetween(Long value1, Long value2) {
            addCriterion("long_v not between", value1, value2, "longV");
            return (Criteria) this;
        }

        public Criteria andDblVIsNull() {
            addCriterion("dbl_v is null");
            return (Criteria) this;
        }

        public Criteria andDblVIsNotNull() {
            addCriterion("dbl_v is not null");
            return (Criteria) this;
        }

        public Criteria andDblVEqualTo(Double value) {
            addCriterion("dbl_v =", value, "dblV");
            return (Criteria) this;
        }

        public Criteria andDblVNotEqualTo(Double value) {
            addCriterion("dbl_v <>", value, "dblV");
            return (Criteria) this;
        }

        public Criteria andDblVGreaterThan(Double value) {
            addCriterion("dbl_v >", value, "dblV");
            return (Criteria) this;
        }

        public Criteria andDblVGreaterThanOrEqualTo(Double value) {
            addCriterion("dbl_v >=", value, "dblV");
            return (Criteria) this;
        }

        public Criteria andDblVLessThan(Double value) {
            addCriterion("dbl_v <", value, "dblV");
            return (Criteria) this;
        }

        public Criteria andDblVLessThanOrEqualTo(Double value) {
            addCriterion("dbl_v <=", value, "dblV");
            return (Criteria) this;
        }

        public Criteria andDblVIn(List<Double> values) {
            addCriterion("dbl_v in", values, "dblV");
            return (Criteria) this;
        }

        public Criteria andDblVNotIn(List<Double> values) {
            addCriterion("dbl_v not in", values, "dblV");
            return (Criteria) this;
        }

        public Criteria andDblVBetween(Double value1, Double value2) {
            addCriterion("dbl_v between", value1, value2, "dblV");
            return (Criteria) this;
        }

        public Criteria andDblVNotBetween(Double value1, Double value2) {
            addCriterion("dbl_v not between", value1, value2, "dblV");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ts_kv_latest
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ts_kv_latest
     *
     * @mbg.generated
     */
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
}
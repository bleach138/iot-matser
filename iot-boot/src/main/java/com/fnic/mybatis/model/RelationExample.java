package com.fnic.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class RelationExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table relation
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table relation
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table relation
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table relation
     *
     * @mbg.generated
     */
    protected Integer limitStart;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table relation
     *
     * @mbg.generated
     */
    protected Integer limitEnd;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table relation
     *
     * @mbg.generated
     */
    public RelationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table relation
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table relation
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table relation
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table relation
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table relation
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table relation
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table relation
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
     * This method corresponds to the database table relation
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
     * This method corresponds to the database table relation
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table relation
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
     * This method corresponds to the database table relation
     *
     * @mbg.generated
     */
    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table relation
     *
     * @mbg.generated
     */
    public Integer getLimitStart() {
        return limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table relation
     *
     * @mbg.generated
     */
    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table relation
     *
     * @mbg.generated
     */
    public Integer getLimitEnd() {
        return limitEnd;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table relation
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

        public Criteria andFromIdIsNull() {
            addCriterion("from_id is null");
            return (Criteria) this;
        }

        public Criteria andFromIdIsNotNull() {
            addCriterion("from_id is not null");
            return (Criteria) this;
        }

        public Criteria andFromIdEqualTo(String value) {
            addCriterion("from_id =", value, "fromId");
            return (Criteria) this;
        }

        public Criteria andFromIdNotEqualTo(String value) {
            addCriterion("from_id <>", value, "fromId");
            return (Criteria) this;
        }

        public Criteria andFromIdGreaterThan(String value) {
            addCriterion("from_id >", value, "fromId");
            return (Criteria) this;
        }

        public Criteria andFromIdGreaterThanOrEqualTo(String value) {
            addCriterion("from_id >=", value, "fromId");
            return (Criteria) this;
        }

        public Criteria andFromIdLessThan(String value) {
            addCriterion("from_id <", value, "fromId");
            return (Criteria) this;
        }

        public Criteria andFromIdLessThanOrEqualTo(String value) {
            addCriterion("from_id <=", value, "fromId");
            return (Criteria) this;
        }

        public Criteria andFromIdLike(String value) {
            addCriterion("from_id like", value, "fromId");
            return (Criteria) this;
        }

        public Criteria andFromIdNotLike(String value) {
            addCriterion("from_id not like", value, "fromId");
            return (Criteria) this;
        }

        public Criteria andFromIdIn(List<String> values) {
            addCriterion("from_id in", values, "fromId");
            return (Criteria) this;
        }

        public Criteria andFromIdNotIn(List<String> values) {
            addCriterion("from_id not in", values, "fromId");
            return (Criteria) this;
        }

        public Criteria andFromIdBetween(String value1, String value2) {
            addCriterion("from_id between", value1, value2, "fromId");
            return (Criteria) this;
        }

        public Criteria andFromIdNotBetween(String value1, String value2) {
            addCriterion("from_id not between", value1, value2, "fromId");
            return (Criteria) this;
        }

        public Criteria andFromTypeIsNull() {
            addCriterion("from_type is null");
            return (Criteria) this;
        }

        public Criteria andFromTypeIsNotNull() {
            addCriterion("from_type is not null");
            return (Criteria) this;
        }

        public Criteria andFromTypeEqualTo(String value) {
            addCriterion("from_type =", value, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeNotEqualTo(String value) {
            addCriterion("from_type <>", value, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeGreaterThan(String value) {
            addCriterion("from_type >", value, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeGreaterThanOrEqualTo(String value) {
            addCriterion("from_type >=", value, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeLessThan(String value) {
            addCriterion("from_type <", value, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeLessThanOrEqualTo(String value) {
            addCriterion("from_type <=", value, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeLike(String value) {
            addCriterion("from_type like", value, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeNotLike(String value) {
            addCriterion("from_type not like", value, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeIn(List<String> values) {
            addCriterion("from_type in", values, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeNotIn(List<String> values) {
            addCriterion("from_type not in", values, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeBetween(String value1, String value2) {
            addCriterion("from_type between", value1, value2, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeNotBetween(String value1, String value2) {
            addCriterion("from_type not between", value1, value2, "fromType");
            return (Criteria) this;
        }

        public Criteria andToIdIsNull() {
            addCriterion("to_id is null");
            return (Criteria) this;
        }

        public Criteria andToIdIsNotNull() {
            addCriterion("to_id is not null");
            return (Criteria) this;
        }

        public Criteria andToIdEqualTo(String value) {
            addCriterion("to_id =", value, "toId");
            return (Criteria) this;
        }

        public Criteria andToIdNotEqualTo(String value) {
            addCriterion("to_id <>", value, "toId");
            return (Criteria) this;
        }

        public Criteria andToIdGreaterThan(String value) {
            addCriterion("to_id >", value, "toId");
            return (Criteria) this;
        }

        public Criteria andToIdGreaterThanOrEqualTo(String value) {
            addCriterion("to_id >=", value, "toId");
            return (Criteria) this;
        }

        public Criteria andToIdLessThan(String value) {
            addCriterion("to_id <", value, "toId");
            return (Criteria) this;
        }

        public Criteria andToIdLessThanOrEqualTo(String value) {
            addCriterion("to_id <=", value, "toId");
            return (Criteria) this;
        }

        public Criteria andToIdLike(String value) {
            addCriterion("to_id like", value, "toId");
            return (Criteria) this;
        }

        public Criteria andToIdNotLike(String value) {
            addCriterion("to_id not like", value, "toId");
            return (Criteria) this;
        }

        public Criteria andToIdIn(List<String> values) {
            addCriterion("to_id in", values, "toId");
            return (Criteria) this;
        }

        public Criteria andToIdNotIn(List<String> values) {
            addCriterion("to_id not in", values, "toId");
            return (Criteria) this;
        }

        public Criteria andToIdBetween(String value1, String value2) {
            addCriterion("to_id between", value1, value2, "toId");
            return (Criteria) this;
        }

        public Criteria andToIdNotBetween(String value1, String value2) {
            addCriterion("to_id not between", value1, value2, "toId");
            return (Criteria) this;
        }

        public Criteria andToTypeIsNull() {
            addCriterion("to_type is null");
            return (Criteria) this;
        }

        public Criteria andToTypeIsNotNull() {
            addCriterion("to_type is not null");
            return (Criteria) this;
        }

        public Criteria andToTypeEqualTo(String value) {
            addCriterion("to_type =", value, "toType");
            return (Criteria) this;
        }

        public Criteria andToTypeNotEqualTo(String value) {
            addCriterion("to_type <>", value, "toType");
            return (Criteria) this;
        }

        public Criteria andToTypeGreaterThan(String value) {
            addCriterion("to_type >", value, "toType");
            return (Criteria) this;
        }

        public Criteria andToTypeGreaterThanOrEqualTo(String value) {
            addCriterion("to_type >=", value, "toType");
            return (Criteria) this;
        }

        public Criteria andToTypeLessThan(String value) {
            addCriterion("to_type <", value, "toType");
            return (Criteria) this;
        }

        public Criteria andToTypeLessThanOrEqualTo(String value) {
            addCriterion("to_type <=", value, "toType");
            return (Criteria) this;
        }

        public Criteria andToTypeLike(String value) {
            addCriterion("to_type like", value, "toType");
            return (Criteria) this;
        }

        public Criteria andToTypeNotLike(String value) {
            addCriterion("to_type not like", value, "toType");
            return (Criteria) this;
        }

        public Criteria andToTypeIn(List<String> values) {
            addCriterion("to_type in", values, "toType");
            return (Criteria) this;
        }

        public Criteria andToTypeNotIn(List<String> values) {
            addCriterion("to_type not in", values, "toType");
            return (Criteria) this;
        }

        public Criteria andToTypeBetween(String value1, String value2) {
            addCriterion("to_type between", value1, value2, "toType");
            return (Criteria) this;
        }

        public Criteria andToTypeNotBetween(String value1, String value2) {
            addCriterion("to_type not between", value1, value2, "toType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeGroupIsNull() {
            addCriterion("relation_type_group is null");
            return (Criteria) this;
        }

        public Criteria andRelationTypeGroupIsNotNull() {
            addCriterion("relation_type_group is not null");
            return (Criteria) this;
        }

        public Criteria andRelationTypeGroupEqualTo(String value) {
            addCriterion("relation_type_group =", value, "relationTypeGroup");
            return (Criteria) this;
        }

        public Criteria andRelationTypeGroupNotEqualTo(String value) {
            addCriterion("relation_type_group <>", value, "relationTypeGroup");
            return (Criteria) this;
        }

        public Criteria andRelationTypeGroupGreaterThan(String value) {
            addCriterion("relation_type_group >", value, "relationTypeGroup");
            return (Criteria) this;
        }

        public Criteria andRelationTypeGroupGreaterThanOrEqualTo(String value) {
            addCriterion("relation_type_group >=", value, "relationTypeGroup");
            return (Criteria) this;
        }

        public Criteria andRelationTypeGroupLessThan(String value) {
            addCriterion("relation_type_group <", value, "relationTypeGroup");
            return (Criteria) this;
        }

        public Criteria andRelationTypeGroupLessThanOrEqualTo(String value) {
            addCriterion("relation_type_group <=", value, "relationTypeGroup");
            return (Criteria) this;
        }

        public Criteria andRelationTypeGroupLike(String value) {
            addCriterion("relation_type_group like", value, "relationTypeGroup");
            return (Criteria) this;
        }

        public Criteria andRelationTypeGroupNotLike(String value) {
            addCriterion("relation_type_group not like", value, "relationTypeGroup");
            return (Criteria) this;
        }

        public Criteria andRelationTypeGroupIn(List<String> values) {
            addCriterion("relation_type_group in", values, "relationTypeGroup");
            return (Criteria) this;
        }

        public Criteria andRelationTypeGroupNotIn(List<String> values) {
            addCriterion("relation_type_group not in", values, "relationTypeGroup");
            return (Criteria) this;
        }

        public Criteria andRelationTypeGroupBetween(String value1, String value2) {
            addCriterion("relation_type_group between", value1, value2, "relationTypeGroup");
            return (Criteria) this;
        }

        public Criteria andRelationTypeGroupNotBetween(String value1, String value2) {
            addCriterion("relation_type_group not between", value1, value2, "relationTypeGroup");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIsNull() {
            addCriterion("relation_type is null");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIsNotNull() {
            addCriterion("relation_type is not null");
            return (Criteria) this;
        }

        public Criteria andRelationTypeEqualTo(String value) {
            addCriterion("relation_type =", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeNotEqualTo(String value) {
            addCriterion("relation_type <>", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeGreaterThan(String value) {
            addCriterion("relation_type >", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("relation_type >=", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeLessThan(String value) {
            addCriterion("relation_type <", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeLessThanOrEqualTo(String value) {
            addCriterion("relation_type <=", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeLike(String value) {
            addCriterion("relation_type like", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeNotLike(String value) {
            addCriterion("relation_type not like", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIn(List<String> values) {
            addCriterion("relation_type in", values, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeNotIn(List<String> values) {
            addCriterion("relation_type not in", values, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeBetween(String value1, String value2) {
            addCriterion("relation_type between", value1, value2, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeNotBetween(String value1, String value2) {
            addCriterion("relation_type not between", value1, value2, "relationType");
            return (Criteria) this;
        }

        public Criteria andAdditionalInfoIsNull() {
            addCriterion("additional_info is null");
            return (Criteria) this;
        }

        public Criteria andAdditionalInfoIsNotNull() {
            addCriterion("additional_info is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionalInfoEqualTo(String value) {
            addCriterion("additional_info =", value, "additionalInfo");
            return (Criteria) this;
        }

        public Criteria andAdditionalInfoNotEqualTo(String value) {
            addCriterion("additional_info <>", value, "additionalInfo");
            return (Criteria) this;
        }

        public Criteria andAdditionalInfoGreaterThan(String value) {
            addCriterion("additional_info >", value, "additionalInfo");
            return (Criteria) this;
        }

        public Criteria andAdditionalInfoGreaterThanOrEqualTo(String value) {
            addCriterion("additional_info >=", value, "additionalInfo");
            return (Criteria) this;
        }

        public Criteria andAdditionalInfoLessThan(String value) {
            addCriterion("additional_info <", value, "additionalInfo");
            return (Criteria) this;
        }

        public Criteria andAdditionalInfoLessThanOrEqualTo(String value) {
            addCriterion("additional_info <=", value, "additionalInfo");
            return (Criteria) this;
        }

        public Criteria andAdditionalInfoLike(String value) {
            addCriterion("additional_info like", value, "additionalInfo");
            return (Criteria) this;
        }

        public Criteria andAdditionalInfoNotLike(String value) {
            addCriterion("additional_info not like", value, "additionalInfo");
            return (Criteria) this;
        }

        public Criteria andAdditionalInfoIn(List<String> values) {
            addCriterion("additional_info in", values, "additionalInfo");
            return (Criteria) this;
        }

        public Criteria andAdditionalInfoNotIn(List<String> values) {
            addCriterion("additional_info not in", values, "additionalInfo");
            return (Criteria) this;
        }

        public Criteria andAdditionalInfoBetween(String value1, String value2) {
            addCriterion("additional_info between", value1, value2, "additionalInfo");
            return (Criteria) this;
        }

        public Criteria andAdditionalInfoNotBetween(String value1, String value2) {
            addCriterion("additional_info not between", value1, value2, "additionalInfo");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table relation
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
     * This class corresponds to the database table relation
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
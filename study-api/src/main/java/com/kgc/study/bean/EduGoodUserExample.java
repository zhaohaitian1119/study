package com.kgc.study.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EduGoodUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EduGoodUserExample() {
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

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGoodUserImgIsNull() {
            addCriterion("good_user_img is null");
            return (Criteria) this;
        }

        public Criteria andGoodUserImgIsNotNull() {
            addCriterion("good_user_img is not null");
            return (Criteria) this;
        }

        public Criteria andGoodUserImgEqualTo(String value) {
            addCriterion("good_user_img =", value, "goodUserImg");
            return (Criteria) this;
        }

        public Criteria andGoodUserImgNotEqualTo(String value) {
            addCriterion("good_user_img <>", value, "goodUserImg");
            return (Criteria) this;
        }

        public Criteria andGoodUserImgGreaterThan(String value) {
            addCriterion("good_user_img >", value, "goodUserImg");
            return (Criteria) this;
        }

        public Criteria andGoodUserImgGreaterThanOrEqualTo(String value) {
            addCriterion("good_user_img >=", value, "goodUserImg");
            return (Criteria) this;
        }

        public Criteria andGoodUserImgLessThan(String value) {
            addCriterion("good_user_img <", value, "goodUserImg");
            return (Criteria) this;
        }

        public Criteria andGoodUserImgLessThanOrEqualTo(String value) {
            addCriterion("good_user_img <=", value, "goodUserImg");
            return (Criteria) this;
        }

        public Criteria andGoodUserImgLike(String value) {
            addCriterion("good_user_img like", value, "goodUserImg");
            return (Criteria) this;
        }

        public Criteria andGoodUserImgNotLike(String value) {
            addCriterion("good_user_img not like", value, "goodUserImg");
            return (Criteria) this;
        }

        public Criteria andGoodUserImgIn(List<String> values) {
            addCriterion("good_user_img in", values, "goodUserImg");
            return (Criteria) this;
        }

        public Criteria andGoodUserImgNotIn(List<String> values) {
            addCriterion("good_user_img not in", values, "goodUserImg");
            return (Criteria) this;
        }

        public Criteria andGoodUserImgBetween(String value1, String value2) {
            addCriterion("good_user_img between", value1, value2, "goodUserImg");
            return (Criteria) this;
        }

        public Criteria andGoodUserImgNotBetween(String value1, String value2) {
            addCriterion("good_user_img not between", value1, value2, "goodUserImg");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGoodUserSchoolIsNull() {
            addCriterion("good_user_school is null");
            return (Criteria) this;
        }

        public Criteria andGoodUserSchoolIsNotNull() {
            addCriterion("good_user_school is not null");
            return (Criteria) this;
        }

        public Criteria andGoodUserSchoolEqualTo(String value) {
            addCriterion("good_user_school =", value, "goodUserSchool");
            return (Criteria) this;
        }

        public Criteria andGoodUserSchoolNotEqualTo(String value) {
            addCriterion("good_user_school <>", value, "goodUserSchool");
            return (Criteria) this;
        }

        public Criteria andGoodUserSchoolGreaterThan(String value) {
            addCriterion("good_user_school >", value, "goodUserSchool");
            return (Criteria) this;
        }

        public Criteria andGoodUserSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("good_user_school >=", value, "goodUserSchool");
            return (Criteria) this;
        }

        public Criteria andGoodUserSchoolLessThan(String value) {
            addCriterion("good_user_school <", value, "goodUserSchool");
            return (Criteria) this;
        }

        public Criteria andGoodUserSchoolLessThanOrEqualTo(String value) {
            addCriterion("good_user_school <=", value, "goodUserSchool");
            return (Criteria) this;
        }

        public Criteria andGoodUserSchoolLike(String value) {
            addCriterion("good_user_school like", value, "goodUserSchool");
            return (Criteria) this;
        }

        public Criteria andGoodUserSchoolNotLike(String value) {
            addCriterion("good_user_school not like", value, "goodUserSchool");
            return (Criteria) this;
        }

        public Criteria andGoodUserSchoolIn(List<String> values) {
            addCriterion("good_user_school in", values, "goodUserSchool");
            return (Criteria) this;
        }

        public Criteria andGoodUserSchoolNotIn(List<String> values) {
            addCriterion("good_user_school not in", values, "goodUserSchool");
            return (Criteria) this;
        }

        public Criteria andGoodUserSchoolBetween(String value1, String value2) {
            addCriterion("good_user_school between", value1, value2, "goodUserSchool");
            return (Criteria) this;
        }

        public Criteria andGoodUserSchoolNotBetween(String value1, String value2) {
            addCriterion("good_user_school not between", value1, value2, "goodUserSchool");
            return (Criteria) this;
        }

        public Criteria andGoodUserSalaryIsNull() {
            addCriterion("good_user_salary is null");
            return (Criteria) this;
        }

        public Criteria andGoodUserSalaryIsNotNull() {
            addCriterion("good_user_salary is not null");
            return (Criteria) this;
        }

        public Criteria andGoodUserSalaryEqualTo(Long value) {
            addCriterion("good_user_salary =", value, "goodUserSalary");
            return (Criteria) this;
        }

        public Criteria andGoodUserSalaryNotEqualTo(Long value) {
            addCriterion("good_user_salary <>", value, "goodUserSalary");
            return (Criteria) this;
        }

        public Criteria andGoodUserSalaryGreaterThan(Long value) {
            addCriterion("good_user_salary >", value, "goodUserSalary");
            return (Criteria) this;
        }

        public Criteria andGoodUserSalaryGreaterThanOrEqualTo(Long value) {
            addCriterion("good_user_salary >=", value, "goodUserSalary");
            return (Criteria) this;
        }

        public Criteria andGoodUserSalaryLessThan(Long value) {
            addCriterion("good_user_salary <", value, "goodUserSalary");
            return (Criteria) this;
        }

        public Criteria andGoodUserSalaryLessThanOrEqualTo(Long value) {
            addCriterion("good_user_salary <=", value, "goodUserSalary");
            return (Criteria) this;
        }

        public Criteria andGoodUserSalaryIn(List<Long> values) {
            addCriterion("good_user_salary in", values, "goodUserSalary");
            return (Criteria) this;
        }

        public Criteria andGoodUserSalaryNotIn(List<Long> values) {
            addCriterion("good_user_salary not in", values, "goodUserSalary");
            return (Criteria) this;
        }

        public Criteria andGoodUserSalaryBetween(Long value1, Long value2) {
            addCriterion("good_user_salary between", value1, value2, "goodUserSalary");
            return (Criteria) this;
        }

        public Criteria andGoodUserSalaryNotBetween(Long value1, Long value2) {
            addCriterion("good_user_salary not between", value1, value2, "goodUserSalary");
            return (Criteria) this;
        }

        public Criteria andGoodUserCompanyIsNull() {
            addCriterion("good_user_company is null");
            return (Criteria) this;
        }

        public Criteria andGoodUserCompanyIsNotNull() {
            addCriterion("good_user_company is not null");
            return (Criteria) this;
        }

        public Criteria andGoodUserCompanyEqualTo(String value) {
            addCriterion("good_user_company =", value, "goodUserCompany");
            return (Criteria) this;
        }

        public Criteria andGoodUserCompanyNotEqualTo(String value) {
            addCriterion("good_user_company <>", value, "goodUserCompany");
            return (Criteria) this;
        }

        public Criteria andGoodUserCompanyGreaterThan(String value) {
            addCriterion("good_user_company >", value, "goodUserCompany");
            return (Criteria) this;
        }

        public Criteria andGoodUserCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("good_user_company >=", value, "goodUserCompany");
            return (Criteria) this;
        }

        public Criteria andGoodUserCompanyLessThan(String value) {
            addCriterion("good_user_company <", value, "goodUserCompany");
            return (Criteria) this;
        }

        public Criteria andGoodUserCompanyLessThanOrEqualTo(String value) {
            addCriterion("good_user_company <=", value, "goodUserCompany");
            return (Criteria) this;
        }

        public Criteria andGoodUserCompanyLike(String value) {
            addCriterion("good_user_company like", value, "goodUserCompany");
            return (Criteria) this;
        }

        public Criteria andGoodUserCompanyNotLike(String value) {
            addCriterion("good_user_company not like", value, "goodUserCompany");
            return (Criteria) this;
        }

        public Criteria andGoodUserCompanyIn(List<String> values) {
            addCriterion("good_user_company in", values, "goodUserCompany");
            return (Criteria) this;
        }

        public Criteria andGoodUserCompanyNotIn(List<String> values) {
            addCriterion("good_user_company not in", values, "goodUserCompany");
            return (Criteria) this;
        }

        public Criteria andGoodUserCompanyBetween(String value1, String value2) {
            addCriterion("good_user_company between", value1, value2, "goodUserCompany");
            return (Criteria) this;
        }

        public Criteria andGoodUserCompanyNotBetween(String value1, String value2) {
            addCriterion("good_user_company not between", value1, value2, "goodUserCompany");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteIsNull() {
            addCriterion("logic_delete is null");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteIsNotNull() {
            addCriterion("logic_delete is not null");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteEqualTo(Integer value) {
            addCriterion("logic_delete =", value, "logicDelete");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteNotEqualTo(Integer value) {
            addCriterion("logic_delete <>", value, "logicDelete");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteGreaterThan(Integer value) {
            addCriterion("logic_delete >", value, "logicDelete");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("logic_delete >=", value, "logicDelete");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteLessThan(Integer value) {
            addCriterion("logic_delete <", value, "logicDelete");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("logic_delete <=", value, "logicDelete");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteIn(List<Integer> values) {
            addCriterion("logic_delete in", values, "logicDelete");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteNotIn(List<Integer> values) {
            addCriterion("logic_delete not in", values, "logicDelete");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteBetween(Integer value1, Integer value2) {
            addCriterion("logic_delete between", value1, value2, "logicDelete");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("logic_delete not between", value1, value2, "logicDelete");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
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
}
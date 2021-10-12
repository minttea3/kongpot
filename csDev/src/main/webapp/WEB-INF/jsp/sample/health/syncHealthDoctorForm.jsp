<%--
  Created by IntelliJ IDEA.
  User: kimchangsu
  Date: 2021. 8. 23.
  Time: 오후 8:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <%@ include file="/WEB-INF/jsp/common/header.jsp" %>
</head>
<body>
<jsp:include page="/WEB-INF/jsp/common/nav.jsp" />


<h3>건강 지식 소개 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncHealthDoctorFormSave" method="post">
        <div class="form-group">
            <label for="scnIdx">작성번호</label>
            <input type="text" class="form-control" id="hdIdx" placeholder="작성번호" name="hdIdx" value="${healthDoctor26VO.hdIdx}" <c:if test="${healthDoctor26VO.hdIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="fsiName">닥터이름</label>
            <input type="text" class="form-control" id="hdName" placeholder="닥터이름" name="hdName" value="${healthDoctor26VO.hdName}">
        </div>
        <div class="form-group">
            <label for="hdMedicalField">진료분야</label>
        	<select class="form-control" id="hdMedicalField" name="hdMedicalField" >
        		<option value="내과"<c:if test ="${healthDoctor26VO.hdMedicalField eq '내과'}">selected="selected"</c:if>>내과</option>
        		<option value="일반 외과" <c:if test ="${healthDoctor26VO.hdMedicalField eq '일반 외과'}">selected="selected"</c:if>>일반 외과</option>
        		<option value="신경 외과" <c:if test ="${healthDoctor26VO.hdMedicalField eq '신경 외과'}">selected="selected"</c:if>>신경 외과</option>
        		<option value="피부과" <c:if test ="${healthDoctor26VO.hdMedicalField eq '피부과'}">selected="selected"</c:if>>피부과</option>
        		<option value="응급의학과" <c:if test ="${healthDoctor26VO.hdMedicalField eq '응급의학과'}">selected="selected"</c:if>>응급의학과</option>
        		<option value="소아청소년과" <c:if test ="${healthDoctor26VO.hdMedicalField eq '소아청소년과'}">selected="selected"</c:if>>소아청소년과</option>
        	</select> 
        
        </div>
        <div class="form-group">
            <label for="hdTel">연락처</label>
            <input type="text" class="form-control" id="hdTel" placeholder="연락처" name="hdTel" value="${healthDoctor26VO.hdTel}">
        </div>
        <div class="form-group">
            <label for="hdDate">등록일자</label>
            <input type="date" class="form-control" id="hdDate" placeholder="등록일자" name="hdDate" value="${healthDoctor26VO.hdDate}">
        </div>
        <c:if test="${healthDoctor26VO.hdIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${healthDoctor26VO.hdIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>

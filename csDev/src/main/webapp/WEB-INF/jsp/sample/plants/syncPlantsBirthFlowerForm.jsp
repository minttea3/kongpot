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

<h3>식물 탄생화 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncPlantsBirthFlowerFormSave" method="post">
        <div class="form-group">
            <label for="pbfIdx">고유번호</label>
            <input type="text" class="form-control" id="pbfIdx" placeholder="고유번호를 입력해주세요." name="pbfIdx" value="${plantsBirthFlower29VO.pbfIdx}" <c:if test="${plantsBirthFlower29VO.pbfIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="pbfMonth">월</label>
       		<select class="form-control" id="pbfMonth" name="pbfMonth">
       			<option value="${plantsBirthFlower29VO.pbfMonth}"<c:if test="${plantsBirthFlower29VO.pbfMonth eq '1월' }">selected="selected"</c:if>>1월</option>
       			<option value="${plantsBirthFlower29VO.pbfMonth}"<c:if test="${plantsBirthFlower29VO.pbfMonth eq '2월' }">selected="selected"</c:if>>2월</option>
       			<option value="${plantsBirthFlower29VO.pbfMonth}"<c:if test="${plantsBirthFlower29VO.pbfMonth eq '3월' }">selected="selected"</c:if>>3월</option>
       			<option value="${plantsBirthFlower29VO.pbfMonth}"<c:if test="${plantsBirthFlower29VO.pbfMonth eq '4월' }">selected="selected"</c:if>>4월</option>
       			<option value="${plantsBirthFlower29VO.pbfMonth}"<c:if test="${plantsBirthFlower29VO.pbfMonth eq '5월' }">selected="selected"</c:if>>5월</option>
       			<option value="${plantsBirthFlower29VO.pbfMonth}"<c:if test="${plantsBirthFlower29VO.pbfMonth eq '6월' }">selected="selected"</c:if>>6월</option>
       			<option value="${plantsBirthFlower29VO.pbfMonth}"<c:if test="${plantsBirthFlower29VO.pbfMonth eq '7월' }">selected="selected"</c:if>>7월</option>
       			<option value="${plantsBirthFlower29VO.pbfMonth}"<c:if test="${plantsBirthFlower29VO.pbfMonth eq '8월' }">selected="selected"</c:if>>8월</option>
       			<option value="${plantsBirthFlower29VO.pbfMonth}"<c:if test="${plantsBirthFlower29VO.pbfMonth eq '9월' }">selected="selected"</c:if>>9월</option>
       			<option value="${plantsBirthFlower29VO.pbfMonth}"<c:if test="${plantsBirthFlower29VO.pbfMonth eq '10월' }">selected="selected"</c:if>>10월</option>
       			<option value="${plantsBirthFlower29VO.pbfMonth}"<c:if test="${plantsBirthFlower29VO.pbfMonth eq '11월' }">selected="selected"</c:if>>11월</option>
       			<option value="${plantsBirthFlower29VO.pbfMonth}"<c:if test="${plantsBirthFlower29VO.pbfMonth eq '12월' }">selected="selected"</c:if>>12월</option>
       		</select>
        </div>
        <div class="form-group">
            <label for="userPhone">꽃 종류</label>
            <input type="text" class="form-control" id=pbfType placeholder="종류" name="pbfType" value="${plantsBirthFlower29VO.pbfType}">
        </div>
        <div class="form-group">
            <label for="pbfTitle">제목</label>
            <input type="text" class="form-control" id="pbfTitle" placeholder="제목" name="pbfTitle" value="${plantsBirthFlower29VO.pbfTitle}">
        </div>
        <div class="form-group">
            <label for="userPhone">내용</label>
            <input type="text" class="form-control" id="pbfContent" placeholder="내용" name="pbfContent" value="${plantsBirthFlower29VO.pbfContent}">
        </div>
        <c:if test="${plantsBirthFlower29VO.pbfIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${plantsBirthFlower29VO.pbfIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>

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

<h3>Sample등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncMemeberFormSave" method="post">
        <div class="form-group">
            <label for="userId">회원번호</label>
            <input type="text" class="form-control" id="mIdx" placeholder="회원번호를 입력해주세요." name="mIdx" value="${member1VO.mIdx}" <c:if test="${sampleVO.mIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="userName">회원명</label>
            <input type="text" class="form-control" id="mName" placeholder="회원명" name="mName" required="required" value="${member1VO.mName}">
        </div>
        <div class="form-group">
            <label for="userPhone">성별</label>
            <input type="text" class="form-control" id="mGender" placeholder="성별" name="mGender" value="${member1VO.mGender}">
        </div>
        <div class="form-group">
            <label for="userPhone">연령대</label>
            <input type="text" class="form-control" id="mAge" placeholder="연령대" name="mAge" value="${member1VO.mAge}">
        </div>
        <div class="form-group">
            <label for="userPhone">주소</label>
            <input type="text" class="form-control" id="mAddr" placeholder="주소" name="mAddr" value="${member1VO.mAddr}">
        </div>
        <div class="form-group">
            <label for="userPhone">이메일</label>
            <input type="text" class="form-control" id="mEmail" placeholder="이메일" name="mEmail" value="${member1VO.mEmail}">
        </div>
        <div class="form-group">
            <label for="userPhone">등록일자</label>
            <input type="date" class="form-control" id="mRegistration" placeholder="등록일자" name="mRegistration" value="${member1VO.mRegistration}">
        </div>
        <c:if test="${member1VO.mIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${member1VO.mIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>

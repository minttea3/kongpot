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


<h3>원데이클리스 - 회원 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncOnedayClassMemberFormSave" method="post">
        <div class="form-group">
            <label for="ocmId">아이디</label><br>
            <input type="text" class="form-control" id="ocmId" placeholder="아이디" name="ocmId" value="${onedayClassInfo49VO.ocmId}"/>
        </div>
        <div class="form-group">
            <label for="ocmPw">비밀번호</label>
            <input type="text" class="form-control" id="ocmPw" placeholder="비밀번호" name="ocmPw" value="${onedayClassInfo49VO.ocmPw}">
        </div>
        <div class="form-group">
            <label for="ocmPwQuestion">비밀번호 질문</label>
            <select name="ocmPwQuestion" class="form-control" >
            	<option value="기억에 남는 추억의 장소는?">기억에 남는 추억의 장소는?	</option>
            	<option value="인생 깊게 읽은 책 이름은?">인생 깊게 읽은 책 이름은?</option>
            	<option value="자신의 인생 좌우명은?">자신의 인생 좌우명은?</option>
            	<option value="받았던 선물 중 기억에 남는 독특한 선물은?">받았던 선물 중 기억에 남는 독특한 선물은?</option>
            </select>
        </div>
        <div class="form-group">
            <label for="ocmPwAnswer">비밀번호 답변</label>
            <input type="text" class="form-control" id="ocmPwAnswer" placeholder="비밀번호 답변" name="ocmPwAnswer" value="${onedayClassInfo49VO.ocmPwAnswer}">
        </div>
        <div class="form-group">
            <label for="ocmGender">성별</label>
             <div class="form-check">
	        	<input type="radio" name="ocmGender" id="ocmGender1" value="M" >
	        	<label for="ocmGender1" >남자</label> &nbsp;&nbsp;
	        	<input type="radio" name="ocmGender" id="ocmGender2" value="W">
	        	<label for="ocmGender2" >여자</label>
        	</div>
        </div>
        <div class="form-group">
            <label for="ocmTermsInfoYn">개인정보 동의</label>
              <div class="form-check">
       	    <%--  <input type="date" class="form-control" id="ocmTermsInfoYn" placeholder="개인정보 동의" name="ocmTermsInfoYn" value="${onedayClassInfo49VO.ocmTermsInfoYn}"> --%>
       		 <input type="checkbox" name="ocmTermsinfoYn" value="Y">
       		 </div>
        </div>
      <%--   <c:if test="${onedayClassInfo49VO.ociIdx eq null}"> --%>
            <button name="action"  type="submit" class="btn btn-success">등록</button><!-- value="insert" -->
        <%-- </c:if>
        <c:if test="${onedayClassInfo49VO.ociIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if> --%>
    </form:form>
</body>

</html>

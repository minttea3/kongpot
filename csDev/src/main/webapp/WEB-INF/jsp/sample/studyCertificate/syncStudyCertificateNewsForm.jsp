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


<h3>공부/자격증 뉴스기사 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncStudyCertificateNewsFormSave" method="post">
        <div class="form-group">
            <label for="scnIdx">작성번호</label>
            <input type="text" class="form-control" id="scnsIdx" placeholder="작성번호" name="scnsIdx" value="${studyCertificateNews15VO.scnsIdx}" <c:if test="${studyCertificateNews15VO.scnsIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="scnsName">작성자</label>
            <input type="text" class="form-control" id="scnsName" placeholder="작성자" name="scnsName" value="${studyCertificateNews15VO.scnsName}">
        </div>
        <div class="form-group">
            <label for="scnsTitle">제목</label>
            <input type="text" class="form-control" id="scnsTitle" placeholder="제목" name="scnsTitle" value="${studyCertificateNews15VO.scnsTitle}">
        </div>
        <div class="form-group">
            <label for="scnsContent">내용</label>
            <input type="text" class="form-control" id="scnsContent" placeholder="내용" name="scnsContent" value="${studyCertificateNews15VO.scnsContent}">
        </div>
        <div class="form-group">
            <label for="scnsImage">이미지(수정 불가)</label>
         <c:if test="${studyCertificateNews15VO.scnsImage eq ''}">
             <input type="text" class="form-control" id="scnsImage1"  name="scnsImage1" value="🌹" readonly="readonly">
             <input type="hidden" class="form-control" id="scnsImage"  name="scnsImage" value="" >
         
         </c:if>
         <c:if test="${studyCertificateNews15VO.scnsImage ne ''}">
             <image src ="${studyCertificateNews15VO.scnsImage}" class="form-control" id="scnsImage"  name="scnsImage" style="width:300px; height:300px;" readonly>
        </c:if>
        </div>

        <div class="form-group">
            <label for="scnsWriteDay">등록일</label>
             <input type="date" class="form-control" id="scnsWriteDay"  name="scnsWriteDay" value="${studyCertificateNews15VO.scnsWriteDay}">
        </div>
       
        
        <c:if test="${studyCertificateNews15VO.scnsIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${studyCertificateNews15VO.scnsIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
</body>

</html>

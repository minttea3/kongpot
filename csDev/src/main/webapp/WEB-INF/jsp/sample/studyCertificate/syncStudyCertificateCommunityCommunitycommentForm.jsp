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


<h3>공부/자격증 커뮤니티 댓글 등록</h3>
<br />


    <form:form id="frm" name="frm" action="/syncStudyCertificateCommunityCommunitycommentFormSave" method="post">
        <div class="form-group">
            <label for="scccIdx">작성번호</label>
            <input type="text" class="form-control" id="scccIdx" placeholder="작성번호" name="scccIdx" value="${studyCertificateCommunityComment18VO.scccIdx}" <c:if test="${studyCertificateCommunityComment18VO.scccIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="sccIdx">커뮤니티 고유번호</label>
            <input type="text" class="form-control" id="sccIdx" placeholder="커뮤니티 고유번호" name=sccIdx value="${studyCertificateCommunityComment18VO.sccIdx}" readonly="readonly">
        </div>
        <div class="form-group">
            <label for="scccName">작성자</label>
            <input type="text" class="form-control" id="scccName" placeholder="작성자" name="scccName" value="${studyCertificateCommunityComment18VO.scccName}">
        </div>
        <div class="form-group">
            <label for="scccContent">내용</label>
            <input type="text" class="form-control" id="scccContent" placeholder="내용" name="scccContent" value="${studyCertificateCommunityComment18VO.scccContent}">
        </div>
    

        <div class="form-group">
            <label for="scccWriteDay">등록일</label>
             <input type="date" class="form-control" id="scccWriteDay"  name="scccWriteDay" value="${studyCertificateCommunityComment18VO.scccWriteDay}">
        </div>
       
        
        <c:if test="${studyCertificateCommunityComment18VO.sccIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${studyCertificateCommunityComment18VO.sccIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
  
</body>

</html>

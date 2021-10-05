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
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <meta charset="utf-8">
    <%@ include file="/WEB-INF/jsp/common/header.jsp" %>
</head>
<body>
<jsp:include page="/WEB-INF/jsp/common/nav.jsp" />

<h3>공부/자격증 뉴스기사 리스트</h3>

<br />

<form:form action="/studyCertificateNewsList" method="get">
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="scnsIdx">번호</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">번호</div>
                </div>
                <input type="text" class="form-control" id="scnsIdx" placeholder="번호" name="scnsIdx" value="${studyCertificateQnA16VO.scnsIdx}">
            </div>
        </div>
        <div class="col-auto">
            <label class="sr-only" for="scnsName">작성자</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">작성자</div>
                </div>
                <input type="text" class="form-control" id="scnsName" placeholder="작성자" name="scnsName" value="${studyCertificateQnA16VO.scnsName}">
            </div>
        </div>
        <div class="col-auto">
            <label class="sr-only" for="scnsTitle">제목</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">제목</div>
                </div>
                <input type="text" class="form-control" id="scnsTitle" placeholder="제목" name="scnsTitle" value="${studyCertificateQnA16VO.scnsTitle}">
            </div>
        </div>
        <div class="col-auto">
            <button name="action" class="btn btn-info" type="submit">조회</button>
        </div>
    </div>
</form:form>
<br /><br />
    <table class="table table-striped">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">작성번호</th>
            <th scope="col">작성자</th>
            <th scope="col">제목</th>
            <th scope="col">이미지</th>
            <th scope="col">내용</th>
            <th scope="col">작성일자</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach var="map" items="${studyCertificateRelatedInfoList}" varStatus="status">
                <tr>
                    <td scope="row"><c:out value="${status.count}" /></td>
                    <td>${map.scnsIdx}</td>
                    <td>${map.scnsName}</td>
                    <td><a href="<c:url value='/syncStudyCertificateNewsForm?scnsIdx=${map.scnsIdx}' />">${map.scnsTitle}</a></td>
                    
                     <c:if test="${map.scnsImage ==''}">
             			<td style="text-align: center;" >	🌹</td>
        			 </c:if>
                     <c:if test="${map.scnsImage != ''}">
             			<td><image src="${map.scnsImage}" alt="이미지" width="100px" height="100px"></td>
        			 </c:if>
                    
                    <td>${map.scnsContent}</td>
                    <td>${map.scnsWriteDay}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>

</html>

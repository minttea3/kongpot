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
    <meta charset="utf-8">
    <%@ include file="/WEB-INF/jsp/common/header.jsp" %>
</head>
<body>
<jsp:include page="/WEB-INF/jsp/common/nav.jsp" />

<h3>개발자 채용 정보 리스트</h3>

<br />

<form:form action="/codingJobList" method="get">
    <div class="form-row align-items-center">
        <div class="col-auto">
            <label class="sr-only" for="cjIdx">번호</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">번호</div>
                </div>
                <input type="text" class="form-control" id="cjIdx" placeholder="번호" name="cjIdx" value="${codingJob5VO.cjIdx}">
            </div>
        </div>
        <div class="col-auto">
            <label class="sr-only" for="cjCompany">회사명</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">회사명</div>
                </div>
                <input type="text" class="form-control" id="cjCompany" placeholder="회사명" name="cjCompany" value="${codingJob5VO.cjCompany}">
            </div>
        </div>
        <div class="col-auto">
            <label class="sr-only" for="cjTitle">공고명</label>
            <div class="input-group mb-2">
                <div class="input-group-prepend">
                    <div class="input-group-text">공고명</div>
                </div>
                <input type="text" class="form-control" id="cjTitle" placeholder="공고명" name="cjTitle" value="${codingJob5VO.cjTitle}">
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
            <th scope="col">공고 번호</th>
            <th scope="col">회사명</th>
            <th scope="col">작성자</th>
            <th scope="col">연락처</th>
            <th scope="col">이메일</th>
            <th scope="col">공고명</th>
            <th scope="col">내용</th>
            <th scope="col">작성일자</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach var="map" items="${selectCodingJobList}" varStatus="status">
                <tr>
                    <td scope="row"><c:out value="${status.count}" /></td>
                    <td>${map.cjIdx}</td>
                    <td><a href="<c:url value='/syncCodingJobForm?cjIdx=${map.cjIdx}' />">${map.cjCompany}</a></td>
                    <td>${map.cjName}</td>
                    <td>${map.cjTel}</td>
                    <td>${map.cjEmail}</td>
                    <td>${map.cjTitle}</td>
                    <td>${map.cjContent}</td>
                    <td>${map.cjDate}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>

</html>

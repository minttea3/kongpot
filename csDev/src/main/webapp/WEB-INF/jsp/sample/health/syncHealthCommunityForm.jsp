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
    <form:form id="frm" name="frm" action="/syncHealthCommunityFormSave" method="post">
    	<!-- 여기는 커뮤니티 본문글 -->
    	<div class="form-group"><strong>본문글</strong></div>
        <div class="form-group">
            <label for="hcIdx">작성번호</label>
            <input type="text" class="form-control" id="hcIdx" placeholder="작성번호" name="hcIdx" value="${healthCommunity27VO.hcIdx}" <c:if test="${healthCommunity27VO.hcIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="hcName">작성자</label>
            <input type="text" class="form-control" id="hcName" placeholder="작성자" name="hcName" value="${healthCommunity27VO.hcName}">
        </div>
       
        <div class="form-group">
            <label for="hcTitle">제목</label>
            <input type="text" class="form-control" id="hcTitle" placeholder="제목" name="hcTitle" value="${healthCommunity27VO.hcTitle}">
        </div>
        <div class="form-group">
            <label for="hcContent">내용</label>
            <input type="text" class="form-control" id="hcContent" placeholder="내용" name="hcContent" value="${healthCommunity27VO.hcContent}">
        </div>
        <hr>
        
        <!-- 여기부턴 댓글 -->
        
    	<div class="form-group"><strong>댓글</strong></div>
    	<div class="form-group">
            <label for="hccName">작성자</label>
            <input type="text" class="form-control" id="hccName" placeholder="작성자" name="hccName">
        </div>
       <div class="form-group">
            <label for="hccContent">내용</label>
            <input type="text" class="form-control" id="hccContent" placeholder="내용" name="hccContent" >
        </div>
            <button name="action" value="insertComment" type="submit" class="btn btn-success">댓글 등록</button>
    	

    <hr>
    	<div class="form-group"><strong>댓글 리스트</strong></div>  
    <table class="table table-striped">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">작성번호</th>
            <th scope="col">글쓴이</th>
            <th scope="col">내용</th>
        </tr>
      
        </thead>
        <tbody>
            <c:forEach var="map" items="${healthCommunityCommentSelectOne}" varStatus="status">
                <tr>
                	<td><input type="text" class="form-control" value="${status.count}" readonly="readonly"></td>
                	<td><input type="text" class="form-control" value="${map.hccIdx}" readonly="readonly"></td>
                	<td><input type="text" class="form-control" value="${map.hccName}" name="hccName"></td>
                	<td><input type="text" class="form-control" value="${map.hccContent}" ></td>
                </tr>
            </c:forEach>
       	</tbody>
    </table> 	
    <hr>
    
            <c:if test="${healthCommunity27VO.hcIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${healthCommunity27VO.hcIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
    </form:form>
    
    
</body>

</html>

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


<h3>공부/자격증 커뮤니티 등록</h3>
<br />

<div>
    <form:form id="frm" name="frm" action="/syncStudyCertificateCommunityFormSave" method="post">
        <div class="form-group">
            <label for="sccIdx">작성번호</label>
            <input type="text" class="form-control" id="sccIdx" placeholder="작성번호" name="sccIdx" value="${StudyCertificateCommunity17VO.sccIdx}" <c:if test="${StudyCertificateCommunity17VO.sccIdx ne null}"> readonly="readonly"</c:if>/>
        </div>
        <div class="form-group">
            <label for="sccName">작성자</label>
            <input type="text" class="form-control" id="sccName" placeholder="작성자" name="sccName" value="${StudyCertificateCommunity17VO.sccName}">
        </div>
        <div class="form-group">
            <label for="sccTitle">제목</label>
            <input type="text" class="form-control" id="sccTitle" placeholder="제목" name="sccTitle" value="${StudyCertificateCommunity17VO.sccTitle}">
        </div>
        <div class="form-group">
            <label for="sccContent">내용</label>
            <input type="text" class="form-control" id="sccContent" placeholder="내용" name="sccContent" value="${StudyCertificateCommunity17VO.sccContent}">
        </div>
       
        
        <c:if test="${StudyCertificateCommunity17VO.sccIdx eq null}">
            <button name="action" value="insert" type="submit" class="btn btn-success">등록</button>
        </c:if>
        <c:if test="${StudyCertificateCommunity17VO.sccIdx ne null}">
            <button name="action" value="update" type="submit" class="btn btn-success">수정</button>
            <button name="action" value="delete" type="submit" class="btn btn-danger">삭제</button>
        </c:if>
         <!-- 여기부턴 댓글 -->
  	 <c:if test="${StudyCertificateCommunity17VO.sccIdx ne null}">   
    	<div class="form-group"><strong>댓글</strong></div>
    	<div class="form-group">
            <label for="hccName">작성자</label>
            <input type="text" class="form-control" id="scccName" placeholder="작성자" name="scccName" value="${studyCertificateCommunityComment18VO.scccName}">
            <input type="hidden" class="form-control" id="scccIdx" placeholder="댓 고유번호" name="scccIdx" value="${studyCertificateCommunityComment18VO.scccIdx}">
        </div>
       <div class="form-group">
       <%--  <input type="hidden" id="hcIdx" placeholder="본문 고유번호" name="hcIdx" value="${healthCommunity27VO.hcIdx}"> --%>
            <label for="scccContent">내용</label>
            <input type="text" class="form-control" id="scccContent" placeholder="내용" name="scccContent" value="${studyCertificateCommunityComment18VO.scccContent}">
        </div> 
       <div class="form-group">
       <%--  <input type="text" id="hcIdx" placeholder="본문 고유번호" name="hcIdx" value="${healthCommunity27VO.hcIdx}"> --%>
            <label for="scccWriteDay">작성일자</label>
            <input type="date" class="form-control" id="scccWriteDay" placeholder="작성일자" name="scccWriteDay" value="${studyCertificateCommunityComment18VO.scccWriteDay}">
        </div> 
          <c:if test="${studyCertificateCommunityComment18VO.scccIdx eq null}">
            <button name="action" value="insertComment" type="submit" class="btn btn-success">댓글 등록</button>
         </c:if> 
         <c:if test="${studyCertificateCommunityComment18VO.scccIdx ne null}">
            <button name="action" value="updateComment" type="submit" class="btn btn-success">댓글 수정</button>
            <button name="action" value="deleteComment" type="submit" class="btn btn-success">댓글 삭제</button>
   		 </c:if> 
   </c:if>
    <hr>
    </form:form>
    
    <%-- <c:forEach var="map2" items="${studyCertificateCommunityCommentList}" varStatus="status2">
    <strong>댓글</strong>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href="/syncStudyCertificateCommunityCommunitycommentForm?sccIdx=${map2.sccIdx}"> 댓글 등록</a>
     </c:forEach>
    <table class="table table-striped">
    <tr>
    	<th scope="col">#</th>
    	<th scope="col">댓글 번호</th>
    	<th scope="col">커뮤니티 고유번호</th>
    	<th scope="col">이름</th>
    	<th scope="col">내용</th>
    	<th scope="col">날짜</th>
    </tr>
     <c:forEach var="map2" items="${studyCertificateCommunityCommentList}" varStatus="status2">
       	<tr>
           <td scope="row"><c:out value="${status2.count}" /></td>
    	   <td>${map2.scccIdx}</td>
    	   <td>${map2.sccIdx}</td>
    	     <td><a href="<c:url value='/syncStudyCertificateCommunityCommunitycommentForm?sccIdx=${map2.sccIdx}&&scccIdx=${map2.scccIdx }' />">${map2.scccName}</a></td>
    	   <td>${map2.scccContent}</td>
    	   <td>${map2.scccWriteDay}</td>
       	</tr>
     </c:forEach> --%>
    	
    </table>
    
    
</body>

</html>

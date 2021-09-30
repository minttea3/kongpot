<%--
  Created by IntelliJ IDEA.
  User: kimchangsu
  Date: 2021. 8. 23.
  Time: 오후 8:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-light" style="background-color: #e3f2fd;">
        <a class="navbar-brand" href="/">Home</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
               <!--  <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="nav1" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Sample
                    </a>
                    <div class="dropdown-menu" aria-labelledby="nav1">
                        <a class="dropdown-item" href="/syncSampleList">Sample리스트</a>
                        <a class="dropdown-item" href="/syncSampleForm">Sample등록</a>
                        <a class="dropdown-item" href="/jsstudy/kcs">Js Study</a>
                    </div>
                </li> -->
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="nav2" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        회원 목록
                    </a>
                    <div class="dropdown-menu" aria-labelledby="nav2">
                        <a class="dropdown-item" href="/memberList">회원 리스트</a>
                        <a class="dropdown-item" href="/syncMemberForm">회원 등록</a>
                        
                    </div>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="nav2" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        코딩 관련
                    </a>
                    <div class="dropdown-menu" aria-labelledby="nav2">
                        <a class="dropdown-item" href="/codingQnAList">Q&A 리스트</a>
                        <a class="dropdown-item" href="/syncCodingQnAForm">Q&A 등록</a>
                        <a class="dropdown-item" href="/codingInfoList">정보 리스트</a>
                        <a class="dropdown-item" href="/syncCodingInfoForm">정보 등록</a>
                        <hr>
                        <a class="dropdown-item" href="/codingCommunityList">커뮤니티 리스트</a>
                        <a class="dropdown-item" href="/syncCodingCommunityForm">커뮤니티 등록</a>
                        <a class="dropdown-item" href="/codingJobList">job 리스트</a>
                        <a class="dropdown-item" href="/syncCodingJobForm">job 등록</a>
                    </div>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="nav2" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        서적 관련
                    </a>
                    <div class="dropdown-menu" aria-labelledby="nav2">
                        <a class="dropdown-item" href="/bookKoreanNovelsList">국내소설 소개 리스트</a>
                        <a class="dropdown-item" href="/syncbookKoreanNovelsForm">국내소설 소개 등록</a>
                        <a class="dropdown-item" href="/bookForeignNovelsList">국외소설 소개 리스트</a>
                        <a class="dropdown-item" href="/syncbookForeignNovelsForm">국외소설 소개 등록</a>
                        <hr>
                        <a class="dropdown-item" href="/bookBestSellerInfoList">베스트셀러 소개 리스트</a>
                        <a class="dropdown-item" href="/syncBookBestSellerForm">베스트셀러 소개 등록</a>
                        <hr>
                        <a class="dropdown-item" href="/bookCommunityList">책 커뮤니티  리스트</a>
                        <a class="dropdown-item" href="/syncBookBCommunityForm">책 커뮤니티 등록</a>
                        <hr>
                        <a class="dropdown-item" href="/bookUsedMarketplaceList">중고장터 리스트</a>
                        <a class="dropdown-item" href="/syncBookUsedMarketplaceForm">중고장터 등록</a>
                        <hr>
                        <a class="dropdown-item" href="bookEventList">이달의 행사 소개 리스트</a>
                        <a class="dropdown-item" href="syncBookEventForm">이달의 행사 소개 등록</a>
                    </div>
                </li>
                 <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="nav2" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        공부/자격증
                    </a>
                    <div class="dropdown-menu" aria-labelledby="nav2">
                        <a class="dropdown-item" href="/studyCertificateNoticeList">공지사항 리스트</a>
                        <a class="dropdown-item" href="/syncStudyCertificateNoticeForm">공지사항 등록</a>
                        <hr>
                        <a class="dropdown-item" href="/studyCertificateTestScheduleList">시험 일정 리스트</a>
                        <a class="dropdown-item" href="/syncStudyCertificateTestScheduleForm">시험 일정 등록</a>
                        
                    </div>
                </li>
            </ul>
        </div>
    </nav>
    <hr />
</body>
</html>

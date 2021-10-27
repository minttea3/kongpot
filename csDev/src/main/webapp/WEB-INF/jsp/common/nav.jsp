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
                    <a class="nav-link dropdown-toggle" href="#" id="nav1" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        회원 목록
                    </a>
                    <div class="dropdown-menu" aria-labelledby="nav1">
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
                    <a class="nav-link dropdown-toggle" href="#" id="nav3" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        서적 관련
                    </a>
                    <div class="dropdown-menu" aria-labelledby="nav3">
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
                    <a class="nav-link dropdown-toggle" href="#" id="nav4" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        공부/자격증
                    </a>
                    <div class="dropdown-menu" aria-labelledby="nav4">
                        <a class="dropdown-item" href="/studyCertificateNoticeList">공지사항 리스트</a>
                        <a class="dropdown-item" href="/syncStudyCertificateNoticeForm">공지사항 등록</a>
                        <hr>
                        <a class="dropdown-item" href="/studyCertificateTestScheduleList">시험 일정 리스트</a>
                        <a class="dropdown-item" href="/syncStudyCertificateTestScheduleForm">시험 일정 등록</a>
                        <hr>
                        <a class="dropdown-item" href="/studyCertificateTestRealtedInfoList">공부/시험 정보 리스트</a>
                        <a class="dropdown-item" href="/syncStudyCertificateTestRealtedForm">공부/시험 정보 등록</a>
                        <hr>
                        <a class="dropdown-item" href="/studyCertificateNewsList">공부/시험 뉴스기사 리스트</a>
                        <a class="dropdown-item" href="/syncStudyCertificateNewsForm">공부/시험 뉴스기사 등록</a>
                        <hr>
                        <a class="dropdown-item" href="/studyCertificateQnAList">공부/시험 Q&A 리스트</a>
                        <a class="dropdown-item" href="/syncStudyCertificateQnAForm">공부/시험 Q&A 등록</a>
                        <hr>
                        <a class="dropdown-item" href="/studyCertificateCommunityList">공부/시험 커뮤니티 리스트</a>
                        <a class="dropdown-item" href="/syncStudyCertificateCommunityForm">공부/시험 커뮤니티 등록</a>
                        
                    </div>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="nav5" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        음식
                    </a>
                    <div class="dropdown-menu" aria-labelledby="nav5">
                        <a class="dropdown-item" href="/FoodSeasonInfoList">계절음식 레시피 소개 리스트</a>
                        <a class="dropdown-item" href="/syncFoodSeasonInfoForm">계절음식 레시피 소개 등록</a>
                        <hr>
                        <a class="dropdown-item" href="/foodRecipeList">음식 레시피 소개 리스트</a>
                        <a class="dropdown-item" href="/syncFoodRecipeForm">음식 레시피 소개 등록</a>
                        <hr>
                        <a class="dropdown-item" href="/foodBloggerList">음식 블로거 리스트</a>
                        <a class="dropdown-item" href="/syncFoodBloggerForm">음식 블로거 등록</a>
                        <hr>
                        <a class="dropdown-item" href="/foodBestRestaurantList">맛집 소개 리스트</a>
                        <a class="dropdown-item" href="/syncFoodBestRestaurantForm">맛집 소개 등록</a>
                        
                    </div>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="nav5" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        건강
                    </a>
                    <div class="dropdown-menu" aria-labelledby="nav6">
                        <a class="dropdown-item" href="/healthKnowledgeList">건강 지식 소개 리스트</a>
                        <a class="dropdown-item" href="/syncHealthKnowledgeForm">건강 지식 소개 등록</a>
                        <hr>
                        <a class="dropdown-item" href="/healthQuestionList">건강 문의 리스트</a>
                        <a class="dropdown-item" href="/syncHealthQuestionForm">건강 문의 등록</a>
                        <hr>
                        <a class="dropdown-item" href="/healthNewsList">건강 뉴스 리스트</a>
                        <a class="dropdown-item" href="/syncHealthNewsForm">건강 뉴스 등록</a>
                        <hr>
                        <a class="dropdown-item" href="/healthDoctorList">건강 탁터 리스트</a>
                        <a class="dropdown-item" href="/syncHealthDoctorForm">건강 닥터 등록</a>
                        <hr>
                        <a class="dropdown-item" href="/healthCommunityList">건강 커뮤니티 리스트</a>
                        <a class="dropdown-item" href="/syncHealthCommunityForm">건강 커뮤니티 등록</a>
                    </div>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="nav6" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        식물
                    </a>
                    <div class="dropdown-menu" aria-labelledby="nav6">
                        <a class="dropdown-item" href="/plantsBirthFlowerList">식물 - 탄생화 리스트</a>
                        <a class="dropdown-item" href="/syncPlantsBirthFlowerForm">식물 - 탄생화 등록</a>
                        <hr>
                        <a class="dropdown-item" href="/plantsInfoList">식물 - 소개 리스트</a>
                        <a class="dropdown-item" href="/syncPlantsInfoForm">식물 - 소개 등록</a>
                        <hr>
                        <a class="dropdown-item" href="/plantsCareList">식물 - 식물관리 리스트</a>
                        <a class="dropdown-item" href="/syncPlantsCareForm">식물 - 식물관리 등록</a>
                        <hr>
                        <a class="dropdown-item" href="/plantsBloggerList">식물 - 블로거 리스트</a>
                        <a class="dropdown-item" href="/syncPlantsBloggerForm">식물 - 블로거 등록</a>
                        <hr>
                        <a class="dropdown-item" href="/plantsBlogList">식물 - 블로그 리스트</a>
                        <a class="dropdown-item" href="/syncPlantsBlogForm">식물 - 블로그 등록</a>
                        <hr>
                        <a class="dropdown-item" href="/plantsNewsList">식물 - 뉴스 리스트</a>
                        <a class="dropdown-item" href="/syncPlantsNewsForm">식물 - 뉴스 등록</a>
                        <hr>
                        <a class="dropdown-item" href="/plantsEventList">식물 - 이벤트 리스트</a>
                        <a class="dropdown-item" href="/syncPlantsEventForm">식물 - 이벤트 등록</a>
                        <hr>
                        <a class="dropdown-item" href="/plantsFreeSharingList">식물 - 무료 나눔 리스트</a>
                        <a class="dropdown-item" href="/syncPlantsFreeSharingForm">식물 - 무료 나눔 등록</a>
                    </div>
                </li>
                <li class="nav-item dropdown">
                  <a class="nav-link dropdown-toggle" href="#" id="nav7" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                      물고기
                  </a>
                  <div class="dropdown-menu" aria-labelledby="nav7">
                      <a class="dropdown-item" href="/aquariumfishInfoList">물고기 - 정보 리스트</a>
                      <a class="dropdown-item" href="/syncAquariumfishInfoForm">물고기 - 정보 등록</a>
                      <hr>
                      <a class="dropdown-item" href="/aquariumfishWaterCandleLayoutList">물고기 - 수초 레이아웃 리스트</a>
                      <a class="dropdown-item" href="/syncAquariumfishWaterCandleLayoutForm">물고기 - 수초 레이아웃 등록</a>
                      <hr>
                      <a class="dropdown-item" href="/aquariumfishExpoList">물고기 - 박람회 리스트</a>
                      <a class="dropdown-item" href="/syncAquariumfishExpoForm">물고기 - 박람회 등록</a>
                      <hr>
                      <a class="dropdown-item" href="/aquariumfishExpoGuestbookList">물고기 - 박람회 방명록 리스트</a>
                      <a class="dropdown-item" href="/syncAquariumfishExpoGuestbookForm">물고기 - 박람회 방명록 등록</a>
                      <hr>
                      <a class="dropdown-item" href="/aquariumfishExpoNewsList">물고기 - 뉴스 리스트</a>
                      <a class="dropdown-item" href="/syncAquariumfishExpoNewsForm">물고기 - 뉴스 등록</a>
                      <hr>
                      <a class="dropdown-item" href="/aquariumfishStoreInfoList">물고기 - 수족관 정보 리스트</a>
                      <a class="dropdown-item" href="/syncAquariumfishStoreInfoForm">물고기 - 수족관 정보 등록</a>
                      <hr>
                      <a class="dropdown-item" href="/aquariumfishSellInfoList">물고기 - 수족관 정보 리스트</a>
                      <a class="dropdown-item" href="/syncAquariumfishSellInfoForm">물고기 - 수족관 정보 등록</a>
                  </div>
              </li>
              <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="nav8" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        영화
                    </a>
                    <div class="dropdown-menu" aria-labelledby="nav8">
                        <a class="dropdown-item" href="/movieInfoList">영화 개봉일 관련 리스트</a>
                        <a class="dropdown-item" href="/syncMovieInfoForm">영화 개봉일 관련 등록</a>
                        <hr>
                        <a class="dropdown-item" href="/movieReviewBloggerList">영화 리뷰 블로거 리스트</a>
                        <a class="dropdown-item" href="/syncMovieReviewBloggerForm">영화 리뷰 블로거 관련 등록</a>
                        <hr>
                        <a class="dropdown-item" href="/movieChartList">영화 차트 리스트</a>
                        <a class="dropdown-item" href="/syncMovieChartForm">영화 차트 관련 등록</a>
                        <hr>
                        <a class="dropdown-item" href="/movieComingSoonList">영화 개봉 예정작 리스트</a>
                        <a class="dropdown-item" href="/syncmovieComingSoonForm">영화 개봉 예정작 관련 등록</a>
                    </div>
                </li>
            </ul>
        </div>
    </nav>
    <hr />
</body>
</html>

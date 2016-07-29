<%@page import="member.dto.MemberDTO"%>
<%@page import="main.dto.MainDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="text/javascript"
	src="http://cdnjs.cloudflare.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
<script type="text/javascript"
	src="http://netdna.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<link
	href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link
	href="http://pingendo.github.io/pingendo-bootstrap/themes/default/bootstrap.css"
	rel="stylesheet" type="text/css">
</head>
<body>
<%  MemberDTO user = (MemberDTO)session.getAttribute("user");%>
	<div class="navbar navbar-default navbar-static-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#navbar-ex-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#"><span>뭐 먹고 살지?</span></a>
			</div>
			<div class="collapse navbar-collapse" id="navbar-ex-collapse">
				<ul class="nav navbar-nav navbar-right">					
					<%if(user == null){ %>
					<li><a href="/mylastpro/signup">회원가입</a></li>
					<li><a href="/mylastpro/login">로그인</a></li>
					<%}else{ %>
					<li><%=user.getName() %>님</li>
					<li><a href="/mylastpro/logout">로그아웃</a></li>
					<%} %>
					<li><a href="#">데이터출처</a></li>
					<li><a href="#">사이트맵</a></li>
				</ul>
			</div>
		</div>
	</div>
	<div class="section">
		<div class="container">
			<div class="row">
				<div class="col-md-12 text-center">
					<ul class="nav nav-pills">
						<li><a style="width: 200px" href="#">상권분석</a></li>
						<li><a style="width: 200px" href="#">상권길라잡이</a></li>
						<li><a style="width: 200px" href="#">MyPage</a></li>
						<li><a style="width: 200px" href="#"></a></li>
						<li>
							<div class="input-group" style="width: 300px;">
								<input type="text" class="form-control"
									placeholder="지역구 또는 업종명을 입력하세요"> <span
									class="input-group-btn"> <a class="btn btn-success"
									type="submit">Go</a>
								</span>
							</div>
						</li>
					</ul>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
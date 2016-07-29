<%@page import="member.dto.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  
<style type="text/css">
#container{
		width: 70%;
		margin: auto;
	}
</style>
  
</head>
<body>
<%
	MemberDTO user = (MemberDTO)session.getAttribute("user");
%>
<div id="container">
  <h2>MyPage</h2>
  <form role="form" method="post" action ="/mylastpro/mypageDBUpdate">
    <div class="form-group">
      <label for="id">Id:</label>
      <div><%= user.getId() %><input type="hidden" name="id" value="<%= user.getId() %>" readonly="readonly"></div>
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <div><input type="text" name="pass" value="<%= user.getPass() %>"></div>
    </div>
    <div class="form-group">
      <label for="pwd">Name:</label>
      <div><input type="text" name="name" value="<%= user.getName() %>"></div>
    </div>
    <div class="form-group">
      <label for="pwd">Email:</label>
      <div><input type="text" name="email" value="<%= user.getEmail() %>"></div>
    </div>
    <div class="form-group">
      <label for="pwd">Address:</label>
      <div><input type="text" name="addr" value="<%= user.getAddr() %>"></div>
    </div>
    <div class="form-group">
      <label for="pwd">Concerned Area:</label>
      <div><input type="text" name="concernA" value="<%= user.getConcernA1() %>"></div>
    </div>
    <div class="form-group">
      <label for="pwd">Concerned Business:</label>
      <div><input type="text" name="concernB" value="<%= user.getConcernB1() %>"></div>
    </div>
   
    <input type="submit" class="btn btn-default" value="정보 수정"></input>
    <input type="button" class="btn btn-default" value="회원 탈퇴" onclick="location.href='/mylastpro/mypageDelete'"></input> 
   
   
  </form>
</div>

</body>
</html>
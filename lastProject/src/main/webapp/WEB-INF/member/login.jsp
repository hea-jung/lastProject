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
<div id="container">
  <h2>Login</h2>
  <form role="form" method="post" action ="/mylastpro/login">
    <div class="form-group">
      <label for="id">Id:</label>
      <input type="text" class="form-control" name="id" placeholder="Enter id" required>
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" name="pass" placeholder="Enter password" required>
    </div>
   
    <input type="submit" class="btn btn-default" value="Log in"></input>
    
   
   
  </form>
</div>

</body>
</html>
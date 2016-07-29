<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <script src="/resources/js/jquery.validate.js"></script>
  <script type="text/javascript">
  /* (function($){
	  $(document).ready(function(){
		  $("#id").on("keyup", function(){	
				$.ajax({
					"url":"/mylastpro/idcheck",
					"type":"post",
					"data":{"id":$("#id").val()},
					"dataType":"text",
					"success":success_run				
				});
			});		
		  $('#myform').validate({
			  rules:{
				  id:{required:true},
				  pass:{required:true},
				  name:{required:true},
				  email:{required:true},
				  addr:{required:true},				  
			  }
		  });
	  });	  
  })(jQuery);
  function success_run(txt){				
		var obj = JSON.parse(txt);		
		state = obj.state;
		$("#checkVal").html(obj.result);//이너 html		
	}
	function run(){
		if(state){
		
			myform.submit();
			
		}else{
			alert("이미 사용중인 아이디입니다.")
		}
	}  */
  	var state;
	$(document).ready(function(){			
		$("#id").on("keyup", function(){	
			$.ajax({
				"url":"/mylastpro/idcheck",
				"type":"post",
				"data":{"id":$("#id").val()},
				"dataType":"text",
				"success":success_run				
			});
		});		
	});
		
	function success_run(txt){				
		var obj = JSON.parse(txt);		
		state = obj.state;
		$("#checkVal").html(obj.result);//이너 html		
	}
	function run(){
		if(state){
			myform.submit();
			
		}else{
			alert("이미 사용중인 아이디입니다.")
		}
	}
</script>
<style type="text/css">
#container{
		width: 70%;
		margin: auto;
	}
</style>
  
</head>
<body>
<div id="container">
  <h2>Create your personal account</h2>
  
  <form id="myform" name="myform" role="form" method="post" action ="/mylastpro/signup">
  
    <div class="form-group">
      <label for="id">Id:</label>
      <input type="text" class="form-control" id= "id" name="id" placeholder="Enter id" required>
      <span id="checkVal"></span>
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pass" name="pass" placeholder="Enter password" required>
    </div>
    <div class="form-group">
      <label for="nm">Name:</label>
      <input type="text" class="form-control" id="name" name="name" placeholder="Enter name" required>
    </div>
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="text" class="form-control" id="email" name="email" placeholder="Enter email" required>
    </div>
    <div class="form-group">
      <label for="addr">Address:</label>
      <input type="text" class="form-control" id="addr" name="addr" placeholder="Enter address" required>
    </div>
    <div class="form-group">
      <label for="tel">Concerned Area:</label><br>
      <input type="checkbox" name="concernA1" value="강남구">강남구
      <input type="checkbox" name="concernA1" value="강동구">강동구
       <input type="checkbox" name="concernA1" value="강북구">강북구
      <input type="checkbox" name="concernA1" value="강서구">강서구
      <input type="checkbox" name="concernA1" value="관악구">관악구<br>
      <input type="checkbox" name="concernA1" value="광진구">광진구
      <input type="checkbox" name="concernA1" value="구로구">구로구
      <input type="checkbox" name="concernA1" value="금천구">금천구
      <input type="checkbox" name="concernA1" value="노원구">노원구
      <input type="checkbox" name="concernA1" value="도봉구">도봉구<br>
      <input type="checkbox" name="concernA1" value="동대문구">동대문구
      <input type="checkbox" name="concernA1" value="동작구">동작구
      <input type="checkbox" name="concernA1" value="마포구">마포구
      <input type="checkbox" name="concernA1" value="서대문구">서대문구
      <input type="checkbox" name="concernA1" value="서초구">서초구<br>
      <input type="checkbox" name="concernA1" value="성동구">성동구
      <input type="checkbox" name="concernA1" value="성북구">성북구
      <input type="checkbox" name="concernA1" value="송파구">송파구
      <input type="checkbox" name="concernA1" value="양천구">양천구
      <input type="checkbox" name="concernA1" value="영등포구">영등포구<br>
      <input type="checkbox" name="concernA1" value="용산구">용산구
      <input type="checkbox" name="concernA1" value="은평구">은평구
      <input type="checkbox" name="concernA1" value="종로구">종로구
      <input type="checkbox" name="concernA1" value="중구">중구
      <input type="checkbox" name="concernA1" value="중랑구">중랑구
    </div>
    <div class="form-group">
      <label for="tel">Concerned Business:</label><br>
      <input type="checkbox" name="concernB1" value="한식">한식
      <input type="checkbox" name="concernB1" value="중식">중식
      <input type="checkbox" name="concernB1" value="양식">양식
      <input type="checkbox" name="concernB1" value="일식/수산물">일식/수산물
      <input type="checkbox" name="concernB1" value="분식">분식
      <input type="checkbox" name="concernB1" value="닭/오리요리">닭/오리요리<br>
      <input type="checkbox" name="concernB1" value="별식/퓨전요리">별식/퓨전요리
      <input type="checkbox" name="concernB1" value="부페">부페
      <input type="checkbox" name="concernB1" value="유흥주점">유흥주점
      <input type="checkbox" name="concernB1" value="제과제빵떡케익">제과제빵떡케익
      <input type="checkbox" name="concernB1" value="커피점/카페">커피점/카페
      <input type="checkbox" name="concernB1" value="패스트푸드">패스트푸드
      
      
    </div>
    <div class="check">
      <label for="click">click on "Sign in"</label>
    </div>
    <input type="button" class="btn btn-default" value="Sign up" onclick="run()" ></input>
  </form>
</div>

</body>
</html>
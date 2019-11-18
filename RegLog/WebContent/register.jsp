<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body>
	<div class="container">
 		<div class="row text-center" style="color: grey;">
  			<h2>Register</h2>
 		</div>
 		<hr>
 		<div class="row col-md-10 col-md-offset-3"> 
   			<div class="card card-body">
   			    <h2>User Register Form</h2>
    			<div class="col-md-8 col-md-offset-3">
				    <form action="<%=request.getContextPath()%>/register" method="post">
				    	<div class="form-group">
       						<label for="uname">Username:</label> <input type="text"
        					class="form-control" id="username" placeholder="Username"
        					name="username" required>
      					</div>
						<div class="form-group">
       						<label for="uname">Password:</label> <input type="password"
        					class="form-control" id="password" placeholder="Password"
       						name="password" required>
      					</div>
				   		<button type="submit" class="btn btn-primary">Submit</button>
				    </form>
    			</div>
   			</div>
  		</div>
	</div>
</body>
</html>
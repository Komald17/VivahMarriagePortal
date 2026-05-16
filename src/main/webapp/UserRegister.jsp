<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Signup Page</title>

<style>

body{
    margin:0;
    padding:0;
    font-family:Arial;
    background:#f5f5f5;
}

.container{
    width:1400px;
    height:900px;
    background:white;
    margin:30px auto;
    display:flex;
    border-radius:15px;
    overflow:hidden;
    box-shadow:0px 0px 10px gray;
}

/* Left Side Image */

.left{
    width:50%;
}

.left img{
    width:190%;
    height:100%;
    object-fit:cover;
}

/* Right Side Form */

.right{
    width:180%;
    display:flex;
    justify-content:center;
    align-items:center;
}

.signup-box{
    width:320px;
}

.signup-box h2{
    text-align:center;
    margin-bottom:20px;
    color:#ff4d6d;
}

.input-box{
    margin-bottom:12px;
}

.input-box input,
.input-box select{
    width:200%;
    padding:12px;
    border:1px solid #ccc;
    border-radius:5px;
}

.btn{
    width:100%;
    padding:12px;
    border:none;
    background:#ff4d6d;
    color:white;
    font-size:16px;
    border-radius:5px;
    cursor:pointer;
}

.btn:hover{
    background:#e63956;
}

.login-link{
    text-align:center;
    margin-top:15px;
}

.login-link a{
    text-decoration:none;
    color:#ff4d6d;
    font-weight:bold;
}

</style>

</head>
<body>

<div class="container">

    <!-- Left Side Image -->

    <div class="left">

        <img src="<%=request.getContextPath()%>/signup.avif">

    </div>

    <!-- Right Side Signup Form -->

    <div class="right">

        <div class="signup-box">

            <h2>Vivah Marriage Portal</h2>

           <form action="UserServlet" method="post" enctype="multipart/form-data">

<input type="hidden" name="action" value="add">


                <div class="input-box">
                   <input type="text"
      				 name="first_name"
       				placeholder="Enter First Name"
       				required>
                </div>

                <div class="input-box">
                  <input type="text"
       				name="last_name"
      				placeholder="Enter Last Name"
       				required>
                </div>
                
 				<div class="input-box">
              	  <input type="text"
      				 name="email"
      				 placeholder="Enter Email ID"
      				 required>
      			 </div>

                <div class="input-box">
                    <input type="password" name="password_hash"
                    placeholder="Enter Password" required>
                </div>
                
                
                 <div class="input-box">                 
             	    <input type="text"
    			   	 name="phone"
     			 	 placeholder="Enter Phone Number">
                 </div>
                 
                 
                  <div class="input-box">
                  	<select name="gender">
					<option value="">Select Gender</option>
					<option>Male</option>
					<option>Female</option>
					</select>
                  </div>
                
                     <div class="input-box">
                     	<input type="date"
       					name="date_of_birth">
                     </div>
                
                 <div class="input-box">
                 		<input type="text"
      					 name="caste"
      					 placeholder="Enter Caste">
                 </div>
                 
                 <div class="input-box">
                 		<input type="text"
       					name="sub_caste"
      					placeholder="Enter Sub Caste">
                 </div>
                 
                 <div class="input-box">
                 	<label>
						Choose Profile Picture
					</label>
					<input type="file"
      					 name="profile_picture"
       					accept="image/*">
                 </div>
                
                
                <button type="submit" class="btn">
                    Register User
                </button>

            </form>

            <div class="login-link">

                Already have account?
                <a href="Login.jsp">Login</a>

            </div>

        </div>

    </div>

</div>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Marriage Portal Home Page</title>

<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, sans-serif;
}

body{
    background:#fff5f7;
}

/* Navbar */

.navbar{
    width:100%;
    background:#ff4d6d;
    padding:15px 60px;
    display:flex;
    justify-content:space-between;
    align-items:center;
}

.logo{
    color:white;
    font-size:30px;
    font-weight:bold;
}

.menu a{
    color:white;
    text-decoration:none;
    margin-left:25px;
    font-size:18px;
    transition:0.3s;
}

.menu a:hover{
    color:#ffe6eb;
}

/* Hero Section */

.hero{
    width:100%;
    min-height:90vh;
    display:flex;
    justify-content:center;
    align-items:center;
    padding:40px 80px;
}

/* Left Content */

.hero-text{
    width:50%;
}

.hero-text h1{
    font-size:60px;
    color:#ff4d6d;
    margin-bottom:20px;
}

.hero-text p{
    font-size:22px;
    color:#555;
    line-height:38px;
    margin-bottom:30px;
}

.hero-text .btn{
    display:inline-block;
    padding:15px 35px;
    background:#ff4d6d;
    color:white;
    text-decoration:none;
    border-radius:8px;
    font-size:20px;
    transition:0.3s;
}

.hero-text .btn:hover{
    background:#e63956;
}

/* Right Image */

.hero-image{
    width:50%;
    text-align:center;
}

.hero-image img{
    width:500px;
    max-width:100%;
}

/* Features */

.features{
    width:100%;
    padding:60px 80px;
    background:white;
}

.features h2{
    text-align:center;
    color:#ff4d6d;
    font-size:40px;
    margin-bottom:50px;
}

.feature-boxes{
    display:flex;
    justify-content:space-between;
    gap:20px;
}

.box{
    background:#fff5f7;
    padding:30px;
    border-radius:12px;
    text-align:center;
    box-shadow:0px 0px 10px rgba(0,0,0,0.1);
    flex:1;
}

.box h3{
    color:#ff4d6d;
    margin-bottom:15px;
}

.box p{
    color:#555;
    line-height:28px;
}

/* Footer */

.footer{
    background:#ff4d6d;
    color:white;
    text-align:center;
    padding:18px;
    margin-top:20px;
}

</style>

</head>

<body>

<!-- Navbar -->

<div class="navbar">

    <div class="logo">
        Vivah Marriage Portal
    </div>

    <div class="menu">

       
        <a href="Login.jsp">Login</a>
        <a href="#">About</a>
        <a href="#">Contact</a>

    </div>

</div>

<!-- Hero Section -->

<div class="hero">

    <!-- Left Text -->

    <div class="hero-text">

        <h1>
            Find Your Perfect Match
        </h1>

        <p>
            Welcome to Vivah Marriage Portal.
            Trusted matrimonial platform where brides
            and grooms connect for meaningful relationships
            and happy marriages.
        </p>

        <a href="UserRegister.jsp" class="btn">
            Register Now
        </a>

    </div>

    <!-- Right Image -->

    <div class="hero-image">

        <img src="<%=request.getContextPath()%>/talking.png"
        alt="Marriage Portal">

    </div>

</div>

<!-- Features -->

<div class="features">

    <h2>Why Choose Us?</h2>

    <div class="feature-boxes">

        <div class="box">

            <h3>Verified Profiles</h3>

            <p>
                All profiles are verified for secure and
                trusted matchmaking experience.
            </p>

        </div>

        <div class="box">

            <h3>Easy Communication</h3>

            <p>
                Connect and chat with potential life
                partners easily and safely.
            </p>

        </div>

        <div class="box">

            <h3>Perfect Matches</h3>

            <p>
                Find your ideal partner based on interests,
                preferences, and compatibility.
            </p>

        </div>

    </div>

</div>

<!-- Footer -->

<div class="footer">

    © 2026 Vivah Marriage Portal | All Rights Reserved

</div>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zxx">
<head>
	<title>Bienvenue Demandeur</title>
	<meta charset="UTF-8">
	<meta name="description" content="Real estate HTML Template">
	 

	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	<script src="https://use.fontawesome.com/releases/v5.0.8/js/all.js"></script>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<link href="css/style1.css" rel="stylesheet">
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="icon" type="image/png" href="img/icons/favicon.png" />
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="fonts/iconic/css/material-design-iconic-font.min.css">
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
	<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
	<link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
	<link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
	
	<!-- Favicon -->
	<link href="img/icons/favicon.png" rel="shortcut icon"/>

	<!-- Google font -->
	<link href="https://fonts.googleapis.com/css?family=Lato:400,400i,700,700i,900%7cRoboto:400,400i,500,500i,700,700i&display=swap" rel="stylesheet">

 
	<!-- Stylesheets -->
	<link rel="stylesheet" href="css/bootstrap.min.css"/>
	<link rel="stylesheet" href="css/font-awesome.min.css"/>
	<link rel="stylesheet" href="css/slicknav.min.css"/>

	<!-- Main Stylesheets -->
	<link rel="stylesheet" href="css/style.css"/>


	<!--[if lt IE 9]>
		<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
		<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
	<![endif]-->

</head>
<body>
	<!-- Page Preloder -->
	<div id="preloder">
		<div class="loader"></div>
	</div>

	<!-- Header Section -->
	
		<!--<nav class="header-nav">
			<ul class="main-menu">
				<li><a href="index.html" class="active">Home</a></li>
				<li><a href="about-us.html">About</a></li>
				<li><a href="#">Buy</a></li>
				<li><a href="#">Pages</a>
					<ul class="sub-menu">
						<li><a href="about-us.html">About Us</a></li>
						<li><a href="search-result.html">Search Result</a></li>
						<li><a href="single-property.html">Property</a></li>
					</ul>
				</li>
				<li><a href="news.html">News</a></li>
				<li><a href="contact.html">Contact</a></li>
			</ul>
			<div class="header-right">
				<div class="user-panel">
					<a href="#" class="login">Sign in</a>
					<a href="#" class="register">Join us</a>
				</div>
			</div>
		</nav> -->

		<nav class="navbar navbar-expand-md navbar-light bg-light sticky-top">
			<div class="container-fluid">
				<a class="navbar-brand" href="#"><img src="img/logo.png"></a>
				<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarResponsove">
					<ul class="navbar-nav ml-auto">
						<li class="nav-item">
							<a class="nav-link" href="DemandeurHome">Home</a>
						</li>
						<li class="nav-item">
							<a class="nav-link" href="Team">Qui somme-nous ?</a>
						</li>
						<li class="nav-item">
							<a class="nav-link" href="Service">Services</a>
						</li>
						<li class="nav-item">
							<a class="nav-link" href="Contact">Nous Contacter</a>
						</li>
						<li class="nav-item">
							<a class="nav-link" href="Home">${ sessionScope.email }</a>
						</li>
					</ul>
				</div>
			</div>
		
		</nav>



	<!-- Header Section end -->

	<!-- Hero Section end -->
	<section class="hero-section set-bg" data-setbg="img/bg.jpg">
		<div class="container">
			<div class="hero-warp">
				<form class="main-search-form" action="showModel" method= "POST">
				<div class="search-type">
				<p>Notre cher Consulteur,vous pouvez consulter les annonces et Construire votre propre modèle </p>
						<div class="st-item">
							<a href="DemanderPage" class="btn btn-primary btn-user btn-block">
                  Consulter les annonces
                </a>
						</div>
						<div class="st-item">
							
							<button type="submit" class="btn btn-primary btn-user btn-block">Construire votre modèle</button>
				</div>
				</div>		
					
				</form>
			</div>
		</div>
	</section>
	<!-- Intro Section end -->
	<section class="intro-section spad">
		<div class="container">
			<div class="section-title">
				<h2>Faites confiance à  notre App web pour gérer vos annonces .</h2>
			</div>
			<div class="row intro-first">
				<div class="col-lg-6 order-lg-2">
					<img src="img/about/1.jpg" alt="la confiance">
				</div>
				<div class="col-lg-6 order-lg-1">
					<div class="about-text">
						<h4>La confiance avant tout!!!</h4>
						<h6>Notre cher Offreur, notre application web garantit la publication de vos prestigieuses annonces.
						Ces derniéres seront publiées et affichées dans notre application web lors de la demende du notre cher client.
						
						   Pour toute plus d'information, veuillez nous contater .
						   </h6>
						
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-6">
					<img src="img/about/2.jpg" alt="">
				</div>
				<div class="col-lg-6 ">
					<div class="about-text">
						<h4>Vous envisagez de vendre ou louer votre maison ou votre appartement ?</h4>
						<h6>     Pour vendre ou louer , soignez votre décoration.Une décoration un peu trop 
						rustique peut-étre un véritable frein à une vente immobiliére.
						</h6>
						<h6> De méme, des petits travaux à  réaliser peuvent effrayer vos acheteurs potentiels.
						  Avec Keredes, choisissez un accompagnement personnalisé,et profitez de conseils professionnels afin de vendre votre bien rapidement
					Par exemple, osez effectuer de petits travaux (peinture, joints) qui permettront de mettre en confiance l'acheteur quant à  l'état général du logement. </h6>
					<h6>De la même facon, libérez l'espace en enlevant des meubles trop encombrants, notamment dans des petites piéces. Cela donnera plus de volume Ã  votre bien. Autre astuce : si vous avez un jardin, pensez à  l'entretenir</h6>
					</div>			
				</div>
			</div>
		</div>
	</section>
	
	<footer>
		<div class="container-fluid padding">
			<div class="row text-center">
				<div class="col-md-4">
					<img src="img/w3newbie.png">
					<hr class="light">
					<p>555 555 555</p>
					<p>email@gmail.com</p>
					<p>100 street name</p>
					<p>City, state, zip code</p>
				</div>
	
				<div class="col-md-4">
					<hr class="light">
					<h5>Our hours</h5>
					<hr class="light">
					<p>Monday: 9am - 5pm</p>
					<p>Saturday: 10am - 4pm</p>
					<p>Sunday: Closed</p>
				</div>
	
				<div class="col-md-4 ">
					<hr class="light">
					<h5>Service Area</h5>
					<hr class="light">
					<p>City, state, zip code</p>
					<p>City, state, zip code</p>
					<p>City, state, zip code</p>
					<p>City, state, zip code</p>
				</div>
	
				<div class="col-12">
					<hr class="light-100">
					<h5>&copy; Immobilier.com</h5>
				</div>
	
	
			</div>
		</div>
	</footer>
	<!-- Footer Section end -->
	
	<!--====== Javascripts & Jquery ======-->
	<script src="js/jquery-3.2.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.slicknav.min.js"></script>
	<script src="js/jquery.magnific-popup.min.js"></script>
	<script src="js/main1.js"></script>
	
  

	</body>
</html>
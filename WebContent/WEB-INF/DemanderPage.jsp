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
				<form class="main-search-form" action="showGood" method= "POST">
					<div class="search-type">
						<div class="st-item">
							<input type="radio" name="st" id="buy" checked>
							<label for="buy">Buy</label>
						</div>
						<div class="st-item">
							<input type="radio" name="st" id="rent">
							<label for="rent">Rent</label>
						</div>
						<!-- <div class="st-item">
							<input type="radio" name="st" id="sell">
							<label for="sell">Sell</label>
						</div> -->                                                        
					</div>
					<div class="search-input">
						<input type="text" name="searchBar" placeholder="Recherche par Ville, Type, Statut, Province">
						<button type = "submit" class="site-btn">Search</button>
					</div>
					<p>Vous pouvez rechercher tout les biens qui sont enregistrer dans notre site, et les filtrer par vos exigences dans la recherche</p>
				</form>
			</div>
		</div>
	</section>
	<!-- Hero Section end -->

	<!-- Intro Section end -->
	<section class="intro-section spad">
		<div class="container">
			<div class="section-title">
				<h2>Buy Faster. Save Thousands.</h2>
			</div>
			<div class="row intro-first">
				<div class="col-lg-6 order-lg-2">
					<img src="img/about/1.jpg" alt="">
				</div>
				<div class="col-lg-6 order-lg-1">
					<div class="about-text">
						<h3>We charge 2% total. No hidden fees or upfront costs.</h3>
						<p>Donec eget efficitur ex. Donec eget dolor vitae eros feugiat tristique id vitae massa. Proin vulputate congue rutrum. Fusce lobortis a enim eget tempus. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Suspendisse potenti. Ut gravida mattis magna, non varius lorem sodales nec. In libero orci, ornare non nisl a, auctor euismod purus. Morbi pretium interdum vestibulum. Fusce nec eleifend ipsum. Sed non blandit tellus.</p>
						<a href="#" class="readmore-btn">Find out more</a>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-6">
					<img src="img/about/2.jpg" alt="">
				</div>
				<div class="col-lg-6 ">
					<div class="about-text">
						<h3>How Much Can You Save? We work for you, not commission.</h3>
						<p>Donec eget efficitur ex. Donec eget dolor vitae eros feugiat tristique id vitae massa. Proin vulputate congue rutrum. Fusce lobortis a enim eget tempus. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Suspendisse potenti. Ut gravida mattis magna, non varius lorem sodales nec. In libero orci, ornare non nisl a, auctor euismod purus. Morbi pretium interdum vestibulum. Fusce nec eleifend ipsum. Sed non blandit tellus.</p>
						<a href="#" class="readmore-btn">Find out more</a>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Intro Section end -->

	<!-- Property Section -->
	<section class="property-section">
		<div class="container">
			<div class="section-title">
				<h2>Recently Add Homes</h2>
			</div>
			<div class="row">
				<div class="col-lg-4">
					<div class="property-item">
						<div class="pi-image">
							<img src="img/property/1.jpg" alt="">
							<div class="pi-badge new">New</div>
						</div>
						<h3>$469,000</h3>
						<h5 class ="problem">3 Bedrooms Townhouse</h5>
						<p>Donec eget efficitur ex. Donec eget dolor vitae eros feugiat tristique id vitae massa. Proin vulputate congue rutrum. Fusce lobortis a enim eget tempus. Class aptent taciti sociosqu ad litora.</p>
						<a href="#" class="readmore-btn">Find out more</a>
					</div>
				</div>
				<div class="col-lg-4">
					<div class="property-item">
						<div class="pi-image">
							<img src="img/property/2.jpg" alt="">
							<div class="pi-badge offer">Offer</div>
						</div>
						<h3>$369,000</h3>
						<h5 class = "problem">3 Bedrooms Townhouse</h5>
						<p>Donec eget efficitur ex. Donec eget dolor vitae eros feugiat tristique id vitae massa. Proin vulputate congue rutrum. Fusce lobortis a enim eget tempus. Class aptent taciti sociosqu ad litora.</p>
						<a href="#" class="readmore-btn">Find out more</a>
					</div>
				</div>
				<div class="col-lg-4">
					<div class="property-item">
						<div class="pi-image">
							<img src="img/property/3.jpg" alt="">
							<div class="pi-badge new">New</div>
						</div>
						<h3>$560,000</h3>
						<h5 class = " problem ">3 Bedrooms Townhouse</h5>
						<p>Donec eget efficitur ex. Donec eget dolor vitae eros feugiat tristique id vitae massa. Proin vulputate congue rutrum. Fusce lobortis a enim eget tempus. Class aptent taciti sociosqu ad litora.</p>
						<a href="#" class="readmore-btn">Find out more</a>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Property Section end -->

	<!-- Loan Section end -->
	<section class="loan-section">
		<div class="loan-warp">
			<div class="container">
				<div class="section-title text-white">
					<h2>See If You Qualify for a Mortgage</h2>
					<p>Donec eget efficitur ex. Donec eget dolor vitae eros feugiat tristique id vitae massa. Proin vulputate congue rutrum. Fusce lobortis a enim eget tempus. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Suspendisse potenti. Ut gravida mattis magna, non varius lorem sodales nec. In libero orci, ornare non nisl a, auctor euismod purus. Morbi pretium interdum vestibulum. Fusce nec eleifend ipsum. Sed non blandit tellus. </p>
				</div>
				<form class="loan-form">
					<input type="text" placeholder="Your income">
					<input type="text" placeholder="Amount needed">
					<button class="site-btn">Submit</button>
				</form>
			</div>
		</div>
	</section>
	<!-- Loan Section end -->

	<!-- Stories Section end -->
	<section class="stories-section spad">
		<div class="container">
			<div class="row ">
				<div class="col-lg-5 order-lg-2">
					<img class="w-100" src="img/about/3.jpg" alt="">
				</div>
				<div class="col-lg-7 order-lg-1">
					<div class="about-text">
						<h2>Seller Success Stories</h2>
						<p>Fusce lobortis a enim eget tempus. Class aptent taciti sociosqu ad litora. Donec eget efficitur ex. Donec eget dolor vitae eros feugiat tristique id vitae massa. Proin vulputate congue rutrum. Fusce lobortis a enim eget tempus. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Suspendisse potenti. Ut gravida mattis magna, non varius lorem sodales nec. In libero orci, ornare non nisl a, auctor euismod purus. Morbi pretium interdum vestibulum. Fusce nec eleifend ipsum. Sed non blandit tellus. </p>
						<a href="#" class="readmore-btn">Find out more</a>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Stories Section end -->

	<!-- Footer Section -->
<!--	<footer class="footer-section">
		<div class="container">
			<div class="row text-white">
				<div class="col-lg-4">
					<div class="footer-widger">
						<div class="about-widget">
							<div class="aw-text">
								<img src="img/footer-logo.png" alt="">
								<p>Donec eget efficitur ex. Donec eget dolor vitae eros feugiat tristique id vitae massa. Proin vulputate cong ue rutrum. Fusce lobortis a enim eget tempus. </p>
								<a href="#" class="site-btn">we are hiring</a>
							</div>
						</div>
					</div>
				</div>
				<div class="col-lg-2 col-md-3 col-sm-6">
					<div class="footer-widger">
						<h2>Company</h2>
						<ul>
							<li><a href="#">About us</a></li>
							<li><a href="#">Services</a></li>
							<li><a href="#">Clients</a></li>
							<li><a href="#">Testimonials</a></li>
							<li><a href="#">Carrers</a></li>
						</ul>
					</div>
				</div>
				<div class="col-lg-2 col-md-3 col-sm-6">
					<div class="footer-widger">
						<h2>For Buyers</h2>
						<ul>
							<li><a href="#">Buy with us</a></li>
							<li><a href="#">Papers</a></li>
							<li><a href="#">Clients</a></li>
							<li><a href="#">Testimonials</a></li>
							<li><a href="#">Homes</a></li>
						</ul>
					</div>
				</div>
				<div class="col-lg-2 col-md-3 col-sm-6">
					<div class="footer-widger">
						<h2>For Sellers</h2>
						<ul>
							<li><a href="#">Seel With us</a></li>
							<li><a href="#">What do You Need</a></li>
							<li><a href="#">Clients</a></li>
							<li><a href="#">Testimonials</a></li>
							<li><a href="#">Guideline</a></li>
						</ul>
					</div>
				</div>
				<div class="col-lg-2 col-md-3 col-sm-6">
					<div class="footer-widger">
						<h2>For Renters</h2>
						<ul>
							<li><a href="#">Rent with us</a></li>
							<li><a href="#">Guidelines</a></li>
							<li><a href="#">Apartments</a></li>
							<li><a href="#">Flats</a></li>
							<li><a href="#">Houses</a></li>
						</ul>
					</div>
				</div>
			</div>
			
	</footer> -->

<footer>
    <div class="container-fluid padding">
        <div class="row text-center">
            <div class="col-md-4">
                <img src="img/w3newbie.png">
                <hr class="light">
                <p>0566473892</p>
                <p>immobiliermaroc@gmail.com</p>
                <p>21, Avenue de abtal</p>
                <p>Agdal, Rabat</p>
            </div>
            
            <div class="col-md-4">
                <hr class="light">
                <h5>Our hours</h5>
                <hr class="light">
                <p>Monday: 9am - 5pm</p>
                <p>Saturday: 10am - 4pm</p>
                <p>Sunday: Closed</p>
            </div>

            <div class="col-md-4">
                <hr class="light">
                <h5>Service Area</h5>
                <hr class="light">
                <p>Rabat,  10000</p>
                <p>Meknes, 40000</p>
                <p>Tanger, 50000</p>
                <p>Marrakech, 60000</p>
            </div>

            <div class="col-12">
                <hr class="light-100">
                <h5>&copy; Tous droits réservées - le 1er site immobilier du maroc</h5>
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
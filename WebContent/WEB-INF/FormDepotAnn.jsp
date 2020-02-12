<%@page contentType="text/html" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>

<head>
<title>formulaireDepotAnn</title>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <!-- Custom fonts for this template-->
  <link href="vendor1/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="css1/sb-admin-2.css" rel="stylesheet">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	<script src="https://use.fontawesome.com/releases/v5.0.8/js/all.js"></script>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<link href="css/style1.css" rel="stylesheet">
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

	<!-- Page Preloder -->
	<div id="preloder">
		<div class="loader"></div>
	</div>


<body class="bg-gradient-primary">
	<nav class="navbar navbar-expand-md navbar-light bg-light sticky-top">
			<div class="container-fluid">
				<a class="navbar-brand" href="#"><img src="img/logo.png"></a>
				<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarResponsove">
					<ul class="navbar-nav ml-auto">
						<li class="nav-item">
							<a class="nav-link" href="homeoffreur">Home</a>
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
  

  <div class="container">

    <div class="card o-hidden border-0 shadow-lg my-5">
      <div class="card-body p-0">
        <!-- Nested Row within Card Body -->
        <div class="row">
          <div class="col-lg-5 d-none d-lg-block bg-password-image ">
          
          </div>
          <div class="col-lg-7">
            <div class="p-5">
              <div class="text-center">
                <h1 class="h4 text-gray-900 mb-4">Formulaire Dépôt d'Annonce</h1>
              </div>
              <form class="user" action="controleur" method="post" enctype="multipart/form-data">
                <div class="form-group row">
                  <div class="col-sm-6 mb-3 mb-sm-0">
                    <input type="text" class="form-control form-control-user" name="nom_imm" placeholder="Nom " required="required"/>
                  </div>
                  <div class="col-sm-6">
                    <select   class="btn btn-secondary btn-user btn-block"   name="type_imm">
                    	<option value="">selectionnez type immobilier</option>
    					<option value="appartement">Appartement</option>
    					<option value="terrain">Terrain</option>
    					<option value="villa">Villa</option>
  					</select>
                   
                  </div>
                </div>
                <div class="form-group row">
                  <div class="col-sm-6 mb-3 mb-sm-0">
                    <input type="text" class="form-control form-control-user" name="prix" placeholder="Prix en DH" required="required"/>
                  </div>
                  <div class="col-sm-6">
                    <input type="text" class="form-control form-control-user" name="superficie" placeholder=" Superficie en m2" required="required"/>
                  </div>
                </div>
                <div class="form-group">
                  <input type="text" class="form-control form-control-user" name="address_imm" placeholder="Addresse" required="required"/>
                </div>
                <div class="form-group row">
                  <div class="col-sm-6 mb-3 mb-sm-0">
                    <input type="text" class="form-control form-control-user" name="description" placeholder="Description" required="required"/>
                  </div>
                  <div class="col-sm-6">
                  <input type="radio"  name="statut"  value="location" checked >  location<br>
                  <input type="radio"  name="statut"  value="vente" >  vente
                  
                  </div>
                </div>
                 
               
                 <div class="form-group">
                 <input type="file" name="file"  class="btn btn-primary btn-user btn-block" multiple="multiple"/>
                </div>
              
                
                <div class="text-center">
  
                <h6 >Vérifiez munitieusement les infos avant d'enregistrer.</h6>
              </div>
                <input type="submit" name="action" value="Enregistrer" class="btn btn-primary btn-user btn-block"/>
                 
                
              </form>
              <hr>
            
            </div>
          </div>
        </div>
      </div>
    </div>

  </div>
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
	<!-- Intro Section end -->
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

  <!-- Bootstrap core JavaScript-->
  <script src="vendor1/jquery/jquery.min.js"></script>
  <script src="vendor1/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Core plugin JavaScript-->
  <script src="vendor1/jquery-easing/jquery.easing.min.js"></script>

  <!-- Custom scripts for all pages-->
  <script src="js1/sb-admin-2.min.js"></script>
  

</body>

</html>

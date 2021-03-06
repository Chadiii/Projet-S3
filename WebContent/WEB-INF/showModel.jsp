<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
 <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Immobilier</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="https://use.fontawesome.com/releases/v5.0.8/js/all.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link href="css/style.css" rel="stylesheet">
    <link href="css/12.c8b2ecec.css" rel="stylesheet">
    <link rel="icon" type="image/png" href="img/icons/favicon.png" />
    
    <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
   <style type="text/css">
    
    .jumbotron {
      color: #2c3e50;
      background: #ecf0f1;

    }
    .navbar-inverse {
      background: #2c3e50;
      color: white;
    }
    .navbar-inverse .navbar-brand, .navbar-inverse a{
      color:white;
    }
    .navbar-inverse .navbar-nav>li>a {
      color: white;
    } 

  </style>
    
    
</head>
<body>

<nav class="navbar navbar-expand-md navbar-light bg-light sticky-top">
 <div class="container-fluid">
     <a class="navbar-brand" href="#"><img src="img/logo.png"></a>
     <button class="navbar-toggler" type="button" data-toggle="collapse"
     data-target="#navbarResponsive">
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

 
<div class="container">

  <div class="jumbotron">
    <h1><i class="fa fa-camera-retro"></i>  Gallery des Modeles </h1>
    <p>Choississez le modèle que vous voulez réserver pour votre terrain</p> 
  </div>

    <div class="row">
      
      
      <c:forEach items="${ listModel }" var="model" varStatus="status">
    	
    	<div class="col-lg-4 col-sm-6">
        <div class="thumbnail">
          <img src="img_upload_model/<c:out value = "${ model.imageName }" />">
          <a href="goodDetail1.jsp?id=<c:out value = "${ model.id }" />&nomImage=<c:out value = "${ model.imageName }" />&nom=<c:out value = "${ model.nom }" />&type=<c:out value = "${ model.typeModel }" />&description=<c:out value = "${ model.description }" />&superficie=<c:out value = "${ model.superficie}" />&prix=<c:out value = "${ model.prix }" />">
						<div class="nc-CardSearch-content">
								
								<h3 class="nc-CardSearch-title"><c:out value="${ model.nom }" /></h3>
								<p class="nc-CardSearch-subtitle"><c:out value="${ model.description }" /></p>
								<p class="nc-CardSearch-subtitle"><c:out value="${ model.superficie }" /> m2  </p>
								<span class="nc-CardSearch-priceFrom">À partir de</span>
								<strong class="nc-CardSearch-price"><c:out value="${ model.prix } MAD" /></strong>
						</div>
		  </a>
        </div>
      </div>
</c:forEach>
      
  </div>
</div>
<script src="https://code.jquery.com/jquery-2.1.4.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
 
 
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




</body>
</html>
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
                <a class="nav-link" href="DemanderPage">Home</a>
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
<div class="text-left">
<a href="DemanderPage" class="btn btn-dark">Revenir en arrière </a>
</div>

<br>

  <div class="jumbotron">
  	
  	<center>
  	<img src="img_upload/<c:out value = "${ param.nomImage }" />" width="650" height="400" >
  	</center>
  	<h3><i class="fa fa-camera-retro"></i> Nom : <c:out value="${ param.nom }"></c:out></h3>
  	<h3> Type : <c:out value="${ param.type }"></c:out> mise en <c:out value="${ param.statut }"></c:out></h3>
  	<h4> Address : <c:out value="${ param.address }"></c:out> </h4>
  	<h4> Description :  <c:out value="${ param.description }"></c:out> </h4>
  	<h4> Superficie :    <c:out value="${ param.superficie }"></c:out> m2</h4>
  	<h5> Ajouté le :    <c:out value="${ param.date }"></c:out>  </h5>
  	<h3 > Prix :   <c:out value="${ param.prix }"></c:out>  </h3>
  	<center>
  	<h4> <a href="successController?code_immo=<c:out value = "${ param.id }" />&code_user=<c:out value = "${ sessionScope.id_user }" />" class="btn btn-dark" >Reserver </a> </h4>
  	</center>
  <!--  
    <h1><i class="fa fa-camera-retro"></i>  Gallery des Biens </h1>
    <p>A bunch of beautiful images that I didn't take (except for the first one!)</p> 
   -->
  </div>
</div>



</body>

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

</html>
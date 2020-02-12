<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">

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

</head>

<body>
    
    <!-- Navbar -->
    <nav class="navbar navbar-expand-md navbar-light bg-light sticky-top">
        <div class="container-fluid">
            <a class="navbar-brand" href="#"><img src="img/logo.png"></a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarResponsove">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="Home">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Qui somme-nous ?</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Services</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Nous Contacter</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="connexion">Connexion</a>
                    </li>
                </ul>
            </div>
        </div>
    
    </nav>

    <div class="limiter">
        <div class="container-login100">
            <div class="wrap-login100">
                <form action="SignUp" method="POST" class="login100-form validate-form">
                    <span class="login100-form-title p-b-26">
                        Welcome
                    </span>
                    
                    <div class="wrap-input100 validate-input input-group mb-3" data-validate="Choisissez une Option">
                        <select class="input100 custom-select" id="inputGroupSelect02" name="type_user">
                        	<option selected>Choisissez votre Option</option>
                        	<option value="demandeur">Demandeur</option>
                        	<option value="offreur">Offreur</option>
                        </select>
                        
                        <span class="focus-input100" ></span>
                    </div>
                    
                    <div class="wrap-input100 validate-input" data-validate="Enter Nom">
                        <input class="input100" type="text" name="nom">
                        <span class="focus-input100" data-placeholder="Nom"></span>
                    </div>

                    <div class="wrap-input100 validate-input" data-validate="Enter Prenom">
                        <input class="input100" type="text" name="prenom">
                        <span class="focus-input100" data-placeholder="Prenom"></span>
                    </div>
                    
                     <div class="wrap-input100 validate-input" data-validate="Enter Numéro">
                        <input class="input100" type="text" name="gsm">
                        <span class="focus-input100" data-placeholder="Numéro de téléphone"></span>
                    </div>

                    
                    <div class="wrap-input100 validate-input" data-validate="Valid email is: a@b.c">
                        <input class="input100" type="text" name="email">
                        <span class="focus-input100" data-placeholder="Email"></span>
                    </div>
    
                    <div class="wrap-input100 validate-input" data-validate="Enter password">
                        <span class="btn-show-pass">
                            <i class="zmdi zmdi-eye"></i>
                        </span>
                        <input class="input100" type="password" name="pass">
                        <span class="focus-input100" data-placeholder="Password"></span>
                    </div>

                    <div class="wrap-input100 validate-input" data-validate="Enter Confirm password">
                        <span class="btn-show-pass">
                            <i class="zmdi zmdi-eye"></i>
                        </span>
                        <input class="input100" type="password" name="confpass">
                        <span class="focus-input100" data-placeholder="Confirm Password"></span>
                    </div>
    
                    <div class="container-login100-form-btn">
                        <div class="wrap-login100-form-btn">
                            <div class="login100-form-bgbtn"></div>
                            <button type="submit" class="login100-form-btn">Sign Up</button>
                               
                        </div>
                        <br>
                        <br>
                        <p><c:if test="${ !empty signForm.erreur }"><p><c:out value="${ signForm.erreur }"></c:out></p></c:if>
						</p>                   
                    </div>
                    
                    
                    </form>
    
                    <div class="text-center p-t-115">
                        <span class="txt1">
                            Don’t have an account?
                        </span>
    
                        <a class="txt2" href="SignUp">
                            Sign Up
                        </a>
                    </div>
            </div>
        </div>
    </div>
    
    
    <div id="dropDownSelect1"></div>
    <script src="vendor/jquery/jquery-3.2.1.min.js"></script>
    <script src="vendor/animsition/js/animsition.min.js"></script>
    <script src="vendor/bootstrap/js/popper.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.min.js"></script>
    <script src="vendor/select2/select2.min.js"></script>
    <script src="vendor/daterangepicker/moment.min.js"></script>
    <script src="vendor/daterangepicker/daterangepicker.js"></script>
    <script src="vendor/countdowntime/countdowntime.js"></script>
    <script src="js/main.js"></script>

    <!-- Footer -->
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
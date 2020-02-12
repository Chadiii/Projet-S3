<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Gestion des annonces</title>

  <!-- Custom fonts for this template -->
  <link href="vendor2/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="css2/sb-admin-2.min.css" rel="stylesheet">

  <!-- Custom styles for this page -->
  <link href="vendor2/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">
  <script type="text/javascript">
  function confirmer(url){
	  var rep=confirm("Etes-vous sûr de vouloir de supprimer cette annonce ?");
	  if(rep==true){
		  document.location=url;
	  }
  }
  </script>
  

</head>


<body id="page-top">

	<nav class="navbar navbar-expand-md navbar-light bg-light sticky-top">
			<div class="container-fluid">
				<a class="navbar-brand" href="#"><img src="img/logo.png"></a>
				<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarResponsove">
					<ul class="navbar-nav ml-auto">
						<li class="nav-item">
							<a class="nav-link" href="Home_Admin">Home</a>
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
						
						
					</ul>
				</div>
			</div>
		
		</nav>

  <!-- Page Wrapper -->
 
        <!-- Begin Page Content -->
        <div class="container-fluid">

          <!-- Page Heading -->
          <h1 class="h3 mb-2 text-gray-800">Table de gestion des annonces</h1>
         
          <!-- DataTales Example -->
          <div class="card shadow mb-4">
            <div class="card-header py-3">
              <h6 class="m-0 font-weight-bold text-primary"><strong>Annonces des biens immobiliéres</strong></h6>
            </div>
            
            <div class="card-body">
              <div class="table-responsive">  
              <form action="annonce" method="post">      
                <table class="table table-bordered" id="dataTable" >
                  <thead>
                    <tr>
                      <th><strong>Nom</strong></th>
                      <th><strong>type</strong></th>
                      <th><strong>prix en MAD</strong></th>
                      <th><strong>superficie en m2</strong></th>
                      <th><strong>address</strong></th>
                      <th><strong>description</strong></th>
                      <th><strong>statut</strong></th>
                      <th><strong>date</strong></th>
                      <th><strong>action</strong></th>
                    </tr>
                  </thead>
  
                  <tbody>
                  <%! int i = 0; %>
                  <c:forEach items="${model.imm}" var="p" >
                    <tr>
                      <td>${p.nom_imm}</td>
                      <td>${p.type_imm}</td>
                      <td>${p.prix}</td>
                      <td>${p.superficie}</td>
                      <td>${p.address_imm}</td>
                      <td>${p.description}</td>
                      <td>${p.statut}</td>
                      <td>${p.date}</td>
                      <td><a href="javascript:confirmer('annonce?action=delete&cod=${p.code_imm}')"> Supprimer</a></td>
                    </tr>
                    
                    <% i=i+1; %>
                    
                    </c:forEach>
                  </tbody>
                 
                </table>
                 </form>
                 
                </div>
                </div>
               
              </div>
            </div>
            <div class="card shadow mb-4">
            <div class="card-header py-3">
              <h6 class="m-0 font-weight-bold text-primary" style="color:#4169E1"><strong>Statistique des annonces</strong></h6>
            </div>
            
            <div class="card-body">
              <div class="table-responsive">       
                <table class="table table-bordered" id="dataTable" >
                  <thead>
                    <tr style="color:#FF5733">
                      <th>Total Publiée(s)</th>
                      <th>Par appartement</th>
                      <th>Par terrain</th>
                      <th>Par villa</th>
                      <th>Supprimée(s)</th>
                  </tr>
                  </thead>
  
                  <tbody>
                  <tr style="color:#FF5733">
                   <td><strong><%=i %> annonce(s) </strong></td> 
                   <td><strong><c:out value="${model2} "/>  annonce(s) </strong></td> 
                   <td><strong><c:out value="${model4} "/> annonce(s) </strong></td> 
                   <td><strong><c:out value="${model3} "/> annonce(s) </strong></td>              
                   <td><strong><c:out value="${model1} "/> annonce(s) </strong></td>
                   </tr>
                  </tbody>              
                </table>
                <% i=0; %>
                </div>
                </div>
               
              </div>
          
            

        
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
      <!-- End of Footer -->

   
    <!-- End of Content Wrapper -->


  <!-- End of Page Wrapper -->

  <!-- Scroll to Top Button-->
  <a class="scroll-to-top rounded" href="#page-top">
    <i class="fas fa-angle-up"></i>
  </a>

  <!-- Logout Modal-->
  <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
          <button class="close" type="button" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">×</span>
          </button>
        </div>
        <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
        <div class="modal-footer">
          <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
          <a class="btn btn-primary" href="login.html">Logout</a>
        </div>
      </div>
    </div>
  </div>

  <!-- Bootstrap core JavaScript-->
  <script src="vendor2/jquery/jquery.min.js"></script>
  <script src="vendor2/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Core plugin JavaScript-->
  <script src="vendor2/jquery-easing/jquery.easing.min.js"></script>

  <!-- Custom scripts for all pages-->
  <script src="js2/sb-admin-2.min.js"></script>

  <!-- Page level plugins -->
  <script src="vendor2/datatables/jquery.dataTables.min.js"></script>
  <script src="vendor2/datatables/dataTables.bootstrap4.min.js"></script>

  <!-- Page level custom scripts -->
  <script src="js2/demo/datatables-demo.js"></script>

</body>

</html>

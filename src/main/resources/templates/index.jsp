<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="http://www.thymeleaf.org"
	xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3"
	xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout">
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<title>Login</title>
<link
	href="https://fonts.googleapis.com/css?family=Roboto:300,400&display=swap"
	rel="stylesheet">
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="" th:href="@{/css/bootstrap.min.css}" />
<!-- Style -->
<link rel="stylesheet" href="" th:href="@{/externalCss/index.css}" />
</head>
<body>
	<form name="f" th:action="@{/login}" method="post">
		<div class="row no-gutters ">

			<div class="col-md-5 no-gutters mt-5 mb-4 pl-4">
				<div class="leftside">
					<img src="" th:src="@{/images/riverside_logo.png}" class=""
						alt="Riverside" height="40px" width="200px"> <br />
					<div class="jumbotron mt-5 box">

						<h1 class="logintext">Login</h1>
						<div class="form-group">
							<label for="username">Username</label> <input
								class="form-control input" type="text"
								placeholder="Email address">
						</div>

						<div class="form-group">
							<label for="password">Password</label> <input
								class="form-control input" type="password"
								placeholder="Password">
						</div>

						<button type="button" id="button" class="btn btn-rounded ">Submit</button>

					</div>
				</div>
			</div>
			<div class="col-md-7 no-gutters mt-5 mb-4 ">
				<div class="rightside">
					<img src="" th:src="@{/images/background-image.jpg}" class="img"
						alt="Riverside" height="435px" width="850px">
				</div>
			</div>
		</div>
	</form>

	<footer class="page-footer font-small teal pt-1 footer">
		<div class="container-fluid text-center text-md-left">
			<div class="row">
				<div class="col-md-4 p-4">
					<img src="" th:src="@{/images/riverside_footer_logo.png}" class=""
						alt="Riverside" height="40px" width="200px">
					<p>Our Mission to care for the others we would care for those
						we love drives us to support a number health, education and
						community programs.</p>

				</div>
				<div class="vl"></div>

				<div class="col-md-4 p-4">
					<h5 class="text-uppercase font-weight-bold">News Center</h5>
					<p>Riverside Foundation</p>

				</div>
				<div class="vl"></div>

				<div class="col-md-3 p-4">
					<h5 class="text-uppercase font-weight-bold">Need help?</h5>
					<p>For the help in finding a physician, making appointments and
						general information call River side Nurse.</p>

				</div>
			</div>
		</div>
		<div class="footer-copyright text-center py-3">© 2020 Copyright:
		</div>
	</footer>

	<script src="" th:src="@{/js/jquery-3.3.1.min.js}"></script>
	<script src="" th:src="@{/js/popper.min.js}"></script>
	<script src="" th:src="@{/js/bootstrap.min.js}"></script>
</body>
</html>

<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="http://www.thymeleaf.org"
	xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3"
	xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout">
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<title>Profile</title>
<link
	href="https://fonts.googleapis.com/css?family=Roboto:300,400&display=swap"
	rel="stylesheet">
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="" th:href="@{/css/bootstrap.min.css}" />
<!-- Style -->
<link rel="stylesheet" href=""
	th:href="@{/externalCss/profileDisplay.css}" />
<link rel="stylesheet" href="" th:href="@{/externalCss/main.css}" />
</head>
<body>
	<form name="f" th:action="@{/login}" method="post" modelAttribute="User">
		<body class="body">
			<form>
				<div class="container-fuilds">
					<div class="row">
						<div class="col-md-12">
							<div class="form-row">
								<div class="form-group col-md-6 mt-4 p-4">
									<img src="images/riverside_logo.png" class="" alt="Riverside"
										height="40px" width="200px">
								</div>
								<div class="form-group col-md-6 mt-4 p-4 ">

									<img src="images/bg3.jpg" class="img" alt="ProfilePic">
									<div id="namecorner">Robert filla</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="jumbotron" id="outerBox">
								<div class="form-row">
									<div class="form-group col-md 6 p-5">
										<div>Welcome,</div>
										<h1>Robert Filla</h1>
										<p>Lorem ipsum dolor, sit amet consectetur adipisicing
											elit. Cum iste voluptatum omnis laborum recusandae velit ad
											vero. Eveniet, sequi assumenda? Deleniti expedita sit
											quisquam voluptate incidunt rem saepe perspiciatis porro.</p>

										<div class="jumbotron mt-5" id="innerBox">
											<div class="form-row mb-0 inputbox">
												<div class="form-group col-md-4">
													<Label class="label">Employee ID</Label>
												</div>
												<div class="form-group col-md-8">
													<Label class="Text">#4A1</Label>
												</div>
											</div>
											<div class="form-row mt-0 inputbox">
												<div class="form-group col-md-4">
													<Label class="label">Employee Name</Label>
												</div>
												<div class="form-group col-md-8">
													<input class="form-control input" type="text"
														placeholder="Robert Filla">
												</div>
											</div>
											<div class="form-row">
												<div class="form-group col-md-4">
													<Label class="label">Email</Label>
												</div>
												<div class="form-group col-md-8">
													<input class="form-control input" type="text"
														placeholder="Robertfilla@gmail.com">
												</div>
											</div>
											<div class="form-row">
												<div class="form-group col-md-4">
													<Label class="label">Contact-No.</Label>
												</div>
												<div class="form-group col-md-8">
													<input class="form-control input" type="text"
														placeholder="" value="${details.home_phone}"></input>
												</div>
											</div>
											<div class="form-row">
												<div class="form-group col-md-4">
													<Label class="label">Type</Label>
												</div>
												<div class="form-group col-md-8">
													<input class="form-control input" type="text"
														placeholder="WorkDay">
												</div>
											</div>
											<div class="form-row">
												<button type="button" id="button" class="btn btn-rounded ">Submit</button>
											</div>


										</div>
									</div>

									<div class="form-group col-md-4 p-5">
										<button type="button" id="button" class="btn btn-rounded">
											<i class="fa fa-edit"></i> Edit Profile
										</button>
									</div>

								</div>

							</div>
						</div>


					</div>
				</div>
			</form>
			<footer class="page-footer font-small teal pt-1 footer">
				<div class="container-fluid text-center text-md-left">
					<div class="row">
						<div class="col-md-4 p-4">
							<img src="" th:src="@{/images/riverside_footer_logo.png}"
								class="" alt="Riverside" height="40px" width="200px"></img>
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
							<p>For the help in finding a physician, making appointments
								and general information call River side Nurse.</p>

						</div>
					</div>
				</div>
				<div class="footer-copyright text-center py-3">© 2020
					Copyright:</div>
			</footer>

			<script src="" th:src="@{/js/jquery-3.3.1.min.js}"></script>
			<script src="" th:src="@{/js/popper.min.js}"></script>
			<script src="" th:src="@{/js/bootstrap.min.js}"></script>
		</body>
</html>
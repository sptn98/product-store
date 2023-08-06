<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>


<body class="text-center">

	<main class="form-signin">
		<form action="login" method="post">
			
			<h1 class="h3 mb-3 fw-normal">Please sign in</h1>
			<br> <br>


			<div class="form-floating">
				<input type="email"  name="email" class="form-control" id="floatingInput"
					placeholder="name@example.com"> <label for="floatingInput">Email
					address</label> <br> <br>
			</div>
			<div class="form-floating">
				<input type="password"  name="pwd" class="form-control" id="floatingPassword"
					placeholder="Password"> <label for="floatingPassword">Password</label>
			</div>

			<br> <br>
			<button class="w-100 btn btn-lg btn-primary" type="submit">Sign
				in</button>

		</form>
	</main>





</body>

</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Details - Result</title>
</head>
<body>

	<h2>Details</h2>

	<form>
		<input type="hidden" name="stid"
			value="<%=request.getParameter("id")%>">

		<table>
			<tr>
				<td>ID:</td>
				<td><%=request.getParameter("id")%></td>
			</tr>
			<tr>
				<td>First Name:</td>
				<td><%=request.getParameter("first")%></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><%=request.getParameter("last")%></td>
			</tr>
			<tr>
				<td>Address:</td>
				<td><%=request.getParameter("address1")%></td>
			</tr>
			<tr />
		</table>
		<br />
	</form>
	<br />
	<input type="button" value="Update data" onclick="update()" />
	<br />
	<input type="button" value="Return to Home"
		onclick="window.location.href='Home.jsp'" />

</body>

<script language="javascript" type="text/javascript">
	function update() {
		var sid = document.forms[0].elements['stid'].value;
		window.location.href = "Update.jsp?id=" + sid;
	}
</script>
</html>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.dxc.jsp.ConnectionHelper"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="3">
		<tr>
			<th>Employ No</th>
			<th>Employ Name</th>
			<th>Department</th>
			<th>Designation</th>
			<th>Salary</th>
		</tr>
		<%
		Connection con = ConnectionHelper.getConnection();
		String cmd = "SELECT * FROM Employ";
		PreparedStatement pst = con.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
		%>
		<tr>
		<td> <%=rs.getInt("empno") %> </td>
		<td> <%=rs.getString("name") %> </td>
		<td> <%=rs.getString("dept") %> </td>
		<td> <%=rs.getString("desig") %> </td>
		<td> <%=rs.getInt("basic") %> </td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>
<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidad de La Frontera
License Type: Academic-->
<html>
<head><title>Reserva List</title>
</head>
<body>
<center>
<h1>Reserva List</h1>
<table border="1" width="80%">
	<tr>
		<td>Id(PK)</td>
		<td>Fecha</td>
		<td>Persona_id_ingresa_reserva(FK)</td>
		<td>Paciente(FK)</td>
		<td></td>
	</tr>
<%
orm.Reserva[] reservas = orm.ReservaDAO.listReservaByQuery(null, null);
for(int i = 0; i < reservas.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(reservas[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(reservas[i].getFecha());
		out.println("</td>");
		
		orm.Persona persona_id_ingresa_reserva = reservas[i].getPersona_id_ingresa_reserva();
		if(persona_id_ingresa_reserva != null) {
			out.print("<td>");
			out.print("<a href=\"Persona.jsp?action=search&id=");
			out.print(persona_id_ingresa_reserva.getORMID());
			out.print("\">");
			out.print(persona_id_ingresa_reserva.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		
		orm.Paciente paciente = reservas[i].getPaciente();
		if(paciente != null) {
			out.print("<td>");
			out.print("<a href=\"Paciente.jsp?action=search&id=");
			out.print(paciente.getORMID());
			out.print("\">");
			out.print(paciente.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		out.print("<td>");
		out.print("<a href=\"Reserva.jsp?action=search&id=");
		out.print(reservas[i].getORMID());
		out.print("\">");
		out.print("Edit");
		out.print("</a>");
		out.print("</td>");
		out.println("</td>");
		out.println("</tr>");
}

%>
</table><br>
<a href="index.html">Index page</a>
 | 
<a href="Reserva.jsp">Add Reserva</a>
</center>
</body>
</html>

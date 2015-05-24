<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidad de La Frontera
License Type: Academic-->
<html>
<head><title>Reserva_bloque List</title>
</head>
<body>
<center>
<h1>Reserva_bloque List</h1>
<table border="1" width="80%">
	<tr>
		<td>Id(PK)</td>
		<td>Tipo_hora(FK)</td>
		<td>Reserva(FK)</td>
		<td>Hora_medica(FK)</td>
		<td></td>
	</tr>
<%
orm.Reserva_bloque[] reserva_bloques = orm.Reserva_bloqueDAO.listReserva_bloqueByQuery(null, null);
for(int i = 0; i < reserva_bloques.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(reserva_bloques[i].getORMID());
		out.print("</td>");
		
		orm.Tipo_hora tipo_hora = reserva_bloques[i].getTipo_hora();
		if(tipo_hora != null) {
			out.print("<td>");
			out.print("<a href=\"Tipo_hora.jsp?action=search&id=");
			out.print(tipo_hora.getORMID());
			out.print("\">");
			out.print(tipo_hora.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		
		orm.Reserva reserva = reserva_bloques[i].getReserva();
		if(reserva != null) {
			out.print("<td>");
			out.print("<a href=\"Reserva.jsp?action=search&id=");
			out.print(reserva.getORMID());
			out.print("\">");
			out.print(reserva.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		
		orm.Hora_medica hora_medica = reserva_bloques[i].getHora_medica();
		if(hora_medica != null) {
			out.print("<td>");
			out.print("<a href=\"Hora_medica.jsp?action=search&id=");
			out.print(hora_medica.getORMID());
			out.print("\">");
			out.print(hora_medica.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		out.print("<td>");
		out.print("<a href=\"Reserva_bloque.jsp?action=search&id=");
		out.print(reserva_bloques[i].getORMID());
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
<a href="Reserva_bloque.jsp">Add Reserva_bloque</a>
</center>
</body>
</html>

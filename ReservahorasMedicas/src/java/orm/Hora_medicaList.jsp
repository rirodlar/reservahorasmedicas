<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidad de La Frontera
License Type: Academic-->
<html>
<head><title>Hora_medica List</title>
</head>
<body>
<center>
<h1>Hora_medica List</h1>
<table border="1" width="80%">
	<tr>
		<td>Id(PK)</td>
		<td>Hora_inicio</td>
		<td>Tiempo_periodo</td>
		<td>Box(FK)</td>
		<td>Medico(FK)</td>
		<td>Reserva_bloque(FK)</td>
		<td></td>
	</tr>
<%
orm.Hora_medica[] hora_medicas = orm.Hora_medicaDAO.listHora_medicaByQuery(null, null);
for(int i = 0; i < hora_medicas.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(hora_medicas[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(hora_medicas[i].getHora_inicio());
		out.println("</td>");
		out.print("<td>");
		out.print(hora_medicas[i].getTiempo_periodo());
		out.println("</td>");
		
		orm.Box box = hora_medicas[i].getBox();
		if(box != null) {
			out.print("<td>");
			out.print("<a href=\"Box.jsp?action=search&id_box=");
			out.print(box.getORMID());
			out.print("\">");
			out.print(box.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		
		orm.Medico medico = hora_medicas[i].getMedico();
		if(medico != null) {
			out.print("<td>");
			out.print("<a href=\"Medico.jsp?action=search&id=");
			out.print(medico.getORMID());
			out.print("\">");
			out.print(medico.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		
		orm.Reserva_bloque reserva_bloque = hora_medicas[i].getReserva_bloque();
		if(reserva_bloque != null) {
			out.print("<td>");
			out.print("<a href=\"Reserva_bloque.jsp?action=search&id=");
			out.print(reserva_bloque.getORMID());
			out.print("\">");
			out.print(reserva_bloque.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		out.print("<td>");
		out.print("<a href=\"Hora_medica.jsp?action=search&id=");
		out.print(hora_medicas[i].getORMID());
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
<a href="Hora_medica.jsp">Add Hora_medica</a>
</center>
</body>
</html>

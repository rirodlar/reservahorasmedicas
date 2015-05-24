<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidad de La Frontera
License Type: Academic-->
<html>
<head><title>Especialidad_medico List</title>
</head>
<body>
<center>
<h1>Especialidad_medico List</h1>
<table border="1" width="80%">
	<tr>
		<td>Id(PK)</td>
		<td>Medico(FK)</td>
		<td>Especialidad(FK)</td>
		<td></td>
	</tr>
<%
orm.Especialidad_medico[] especialidad_medicos = orm.Especialidad_medicoDAO.listEspecialidad_medicoByQuery(null, null);
for(int i = 0; i < especialidad_medicos.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(especialidad_medicos[i].getORMID());
		out.print("</td>");
		
		orm.Medico medico = especialidad_medicos[i].getMedico();
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
		
		
		orm.Especialidad especialidad = especialidad_medicos[i].getEspecialidad();
		if(especialidad != null) {
			out.print("<td>");
			out.print("<a href=\"Especialidad.jsp?action=search&id=");
			out.print(especialidad.getORMID());
			out.print("\">");
			out.print(especialidad.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		out.print("<td>");
		out.print("<a href=\"Especialidad_medico.jsp?action=search&id=");
		out.print(especialidad_medicos[i].getORMID());
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
<a href="Especialidad_medico.jsp">Add Especialidad_medico</a>
</center>
</body>
</html>

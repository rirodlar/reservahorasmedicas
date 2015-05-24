<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidad de La Frontera
License Type: Academic-->
<html>
<head><title>Persona List</title>
</head>
<body>
<center>
<h1>Persona List</h1>
<table border="1" width="80%">
	<tr>
		<td>Id(PK)</td>
		<td>Rut</td>
		<td>Nombres</td>
		<td>Apellido_paterno</td>
		<td>Apellido_materno</td>
		<td>Email</td>
		<td>Fecha_nacimiento</td>
		<td>Medico(FK)</td>
		<td>Paciente(FK)</td>
		<td>Director(FK)</td>
		<td></td>
	</tr>
<%
orm.Persona[] personas = orm.PersonaDAO.listPersonaByQuery(null, null);
for(int i = 0; i < personas.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(personas[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(personas[i].getRut());
		out.println("</td>");
		out.print("<td>");
		out.print(personas[i].getNombres());
		out.println("</td>");
		out.print("<td>");
		out.print(personas[i].getApellido_paterno());
		out.println("</td>");
		out.print("<td>");
		out.print(personas[i].getApellido_materno());
		out.println("</td>");
		out.print("<td>");
		out.print(personas[i].getEmail());
		out.println("</td>");
		out.print("<td>");
		out.print(personas[i].getFecha_nacimiento());
		out.println("</td>");
		
		orm.Medico medico = personas[i].getMedico();
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
		
		
		orm.Paciente paciente = personas[i].getPaciente();
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
		
		
		orm.Director director = personas[i].getDirector();
		if(director != null) {
			out.print("<td>");
			out.print("<a href=\"Director.jsp?action=search&id=");
			out.print(director.getORMID());
			out.print("\">");
			out.print(director.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		out.print("<td>");
		out.print("<a href=\"Persona.jsp?action=search&id=");
		out.print(personas[i].getORMID());
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
<a href="Persona.jsp">Add Persona</a>
</center>
</body>
</html>

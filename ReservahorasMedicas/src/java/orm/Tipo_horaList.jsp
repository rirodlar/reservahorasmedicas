<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidad de La Frontera
License Type: Academic-->
<html>
<head><title>Tipo_hora List</title>
</head>
<body>
<center>
<h1>Tipo_hora List</h1>
<table border="1" width="80%">
	<tr>
		<td>Id(PK)</td>
		<td>Descripcion</td>
		<td></td>
	</tr>
<%
orm.Tipo_hora[] tipo_horas = orm.Tipo_horaDAO.listTipo_horaByQuery(null, null);
for(int i = 0; i < tipo_horas.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(tipo_horas[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(tipo_horas[i].getDescripcion());
		out.println("</td>");
		out.print("<td>");
		out.print("<a href=\"Tipo_hora.jsp?action=search&id=");
		out.print(tipo_horas[i].getORMID());
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
<a href="Tipo_hora.jsp">Add Tipo_hora</a>
</center>
</body>
</html>

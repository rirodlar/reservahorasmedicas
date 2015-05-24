<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidad de La Frontera
License Type: Academic-->
<html>
<jsp:useBean id="PersonaBean" scope="page" class="orm.PersonaProcessor" />
<jsp:setProperty name="PersonaBean" property="*" />
<% String result = PersonaBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'PersonaList.jsp';
		return true;
	}
// -->
</script>
<head><title>Persona</title>
</head>
<body>
<h1>Persona</h1>
<form method="POST" name="form1" action=Persona.jsp>
	<table>
		<tr>
			<td>*Id : </td>
			<td><input type=text name="id" value="<jsp:getProperty name="PersonaBean" property="id"/>" /></td>
		</tr>
		<tr>
			<td>Rut : </td>
			<td><input type=text name="rut" value="<jsp:getProperty name="PersonaBean" property="rut"/>" /></td>
		</tr>
		<tr>
			<td>Nombres : </td>
			<td><input type=text name="nombres" value="<jsp:getProperty name="PersonaBean" property="nombres"/>" /></td>
		</tr>
		<tr>
			<td>Apellido_paterno : </td>
			<td><input type=text name="apellido_paterno" value="<jsp:getProperty name="PersonaBean" property="apellido_paterno"/>" /></td>
		</tr>
		<tr>
			<td>Apellido_materno : </td>
			<td><input type=text name="apellido_materno" value="<jsp:getProperty name="PersonaBean" property="apellido_materno"/>" /></td>
		</tr>
		<tr>
			<td>Email : </td>
			<td><input type=text name="email" value="<jsp:getProperty name="PersonaBean" property="email"/>" /></td>
		</tr>
		<tr>
			<td>Fecha_nacimiento : </td>
			<td><input type=text name="fecha_nacimiento" value="<jsp:getProperty name="PersonaBean" property="fecha_nacimiento"/>" /></td>
		</tr>
		<tr>
			<td>Medico_medicoid : </td>
			<td><input type=text name="medico_medicoid" value="<jsp:getProperty name="PersonaBean" property="medico_medicoid"/>" /></td>
		</tr>
		<tr>
			<td>Paciente_pacienteid : </td>
			<td><input type=text name="paciente_pacienteid" value="<jsp:getProperty name="PersonaBean" property="paciente_pacienteid"/>" /></td>
		</tr>
		<tr>
			<td>Director_directorid : </td>
			<td><input type=text name="director_directorid" value="<jsp:getProperty name="PersonaBean" property="director_directorid"/>" /></td>
		</tr>
	</table>
	<INPUT type="hidden" name="action" value="">
	<hr>
	<INPUT type="button" value="List All" onclick="return listAll();">
	<INPUT type="button" value="Search" onclick="return perform('search');">
	<INPUT type="button" value="Insert" onclick="return perform('insert');">
	<INPUT type="button" value="Update" onclick="return perform('update');">
	<INPUT type="button" value="Delete" onclick="return perform('delete');">
	<INPUT type="reset">
</form>
<hr>
<h3><b>Result :</b><%=result%></h3>
</body>
</html>

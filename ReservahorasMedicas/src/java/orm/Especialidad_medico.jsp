<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidad de La Frontera
License Type: Academic-->
<html>
<jsp:useBean id="Especialidad_medicoBean" scope="page" class="orm.Especialidad_medicoProcessor" />
<jsp:setProperty name="Especialidad_medicoBean" property="*" />
<% String result = Especialidad_medicoBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'Especialidad_medicoList.jsp';
		return true;
	}
// -->
</script>
<head><title>Especialidad_medico</title>
</head>
<body>
<h1>Especialidad_medico</h1>
<form method="POST" name="form1" action=Especialidad_medico.jsp>
	<table>
		<tr>
			<td>*Id : </td>
			<td><input type=text name="id" value="<jsp:getProperty name="Especialidad_medicoBean" property="id"/>" /></td>
		</tr>
		<tr>
			<td>Medico_medicoid : </td>
			<td><input type=text name="medico_medicoid" value="<jsp:getProperty name="Especialidad_medicoBean" property="medico_medicoid"/>" /></td>
		</tr>
		<tr>
			<td>Especialidad_especialidadid : </td>
			<td><input type=text name="especialidad_especialidadid" value="<jsp:getProperty name="Especialidad_medicoBean" property="especialidad_especialidadid"/>" /></td>
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

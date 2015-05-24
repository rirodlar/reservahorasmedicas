<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidad de La Frontera
License Type: Academic-->
<html>
<jsp:useBean id="Hora_medicaBean" scope="page" class="orm.Hora_medicaProcessor" />
<jsp:setProperty name="Hora_medicaBean" property="*" />
<% String result = Hora_medicaBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'Hora_medicaList.jsp';
		return true;
	}
// -->
</script>
<head><title>Hora_medica</title>
</head>
<body>
<h1>Hora_medica</h1>
<form method="POST" name="form1" action=Hora_medica.jsp>
	<table>
		<tr>
			<td>*Id : </td>
			<td><input type=text name="id" value="<jsp:getProperty name="Hora_medicaBean" property="id"/>" /></td>
		</tr>
		<tr>
			<td>Hora_inicio : </td>
			<td><input type=text name="hora_inicio" value="<jsp:getProperty name="Hora_medicaBean" property="hora_inicio"/>" /></td>
		</tr>
		<tr>
			<td>Tiempo_periodo : </td>
			<td><input type=text name="tiempo_periodo" value="<jsp:getProperty name="Hora_medicaBean" property="tiempo_periodo"/>" /></td>
		</tr>
		<tr>
			<td>Box_boxid_box : </td>
			<td><input type=text name="box_boxid_box" value="<jsp:getProperty name="Hora_medicaBean" property="box_boxid_box"/>" /></td>
		</tr>
		<tr>
			<td>Medico_medicoid : </td>
			<td><input type=text name="medico_medicoid" value="<jsp:getProperty name="Hora_medicaBean" property="medico_medicoid"/>" /></td>
		</tr>
		<tr>
			<td>Reserva_bloque_reserva_bloqueid : </td>
			<td><input type=text name="reserva_bloque_reserva_bloqueid" value="<jsp:getProperty name="Hora_medicaBean" property="reserva_bloque_reserva_bloqueid"/>" /></td>
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

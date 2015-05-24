<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidad de La Frontera
License Type: Academic-->
<html>
<jsp:useBean id="Reserva_bloqueBean" scope="page" class="orm.Reserva_bloqueProcessor" />
<jsp:setProperty name="Reserva_bloqueBean" property="*" />
<% String result = Reserva_bloqueBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'Reserva_bloqueList.jsp';
		return true;
	}
// -->
</script>
<head><title>Reserva_bloque</title>
</head>
<body>
<h1>Reserva_bloque</h1>
<form method="POST" name="form1" action=Reserva_bloque.jsp>
	<table>
		<tr>
			<td>*Id : </td>
			<td><input type=text name="id" value="<jsp:getProperty name="Reserva_bloqueBean" property="id"/>" /></td>
		</tr>
		<tr>
			<td>Tipo_hora_tipo_horaid : </td>
			<td><input type=text name="tipo_hora_tipo_horaid" value="<jsp:getProperty name="Reserva_bloqueBean" property="tipo_hora_tipo_horaid"/>" /></td>
		</tr>
		<tr>
			<td>Reserva_reservaid : </td>
			<td><input type=text name="reserva_reservaid" value="<jsp:getProperty name="Reserva_bloqueBean" property="reserva_reservaid"/>" /></td>
		</tr>
		<tr>
			<td>Hora_medica_hora_medicaid : </td>
			<td><input type=text name="hora_medica_hora_medicaid" value="<jsp:getProperty name="Reserva_bloqueBean" property="hora_medica_hora_medicaid"/>" /></td>
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

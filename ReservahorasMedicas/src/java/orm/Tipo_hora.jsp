<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidad de La Frontera
License Type: Academic-->
<html>
<jsp:useBean id="Tipo_horaBean" scope="page" class="orm.Tipo_horaProcessor" />
<jsp:setProperty name="Tipo_horaBean" property="*" />
<% String result = Tipo_horaBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'Tipo_horaList.jsp';
		return true;
	}
// -->
</script>
<head><title>Tipo_hora</title>
</head>
<body>
<h1>Tipo_hora</h1>
<form method="POST" name="form1" action=Tipo_hora.jsp>
	<table>
		<tr>
			<td>*Id : </td>
			<td><input type=text name="id" value="<jsp:getProperty name="Tipo_horaBean" property="id"/>" /></td>
		</tr>
		<tr>
			<td>Descripcion : </td>
			<td><input type=text name="descripcion" value="<jsp:getProperty name="Tipo_horaBean" property="descripcion"/>" /></td>
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

<%
	if (session.getAttribute("login") != "true"){
		session.setAttribute("mensagem","Acesso Proibido! Por favor, fa�a o login novamente.");
%>
<jsp:forward page="/login.jsp"></jsp:forward>
<%
	}
%>
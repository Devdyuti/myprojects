<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h3>home Page!</h3>

<c:url value="/logout" var="logoutUrl" />
<form id="logout" action="${logoutUrl}" method="post" >
  <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
</form>
<c:if test="${pageContext.request.userPrincipal.name != null}">
	<a href="javascript:document.getElementById('logout').submit()">Logout</a>
</c:if>

<h4><i>Spring-mvc-Tutorial v4</i></h4>
<a href="employee/getAllEmployees">getAllEmployees</a>
<br>
<a href="employee/addEmployee">add a employee</a>
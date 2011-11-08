<%@ page import="br.com.gonow.dojo.domain.Person" %>
<%@ page import="java.util.Enumeration" %>
<%@ page import="java.util.List" %>

<ul>
<%
    for (Person person : (List<Person>) request.getAttribute("personList")) {

%>
<li><a href="/people/<%=person.getId() %>"><%=person.toString() %></a><a href="/people/<%=person.getId() %>/edit">editar</a></li>
<%
    }
%>
</ul>
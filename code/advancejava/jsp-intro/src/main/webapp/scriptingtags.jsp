
 
<%   // local code which gets added isnide service method after translation (jsp to servlet) 
	int a = 10; // local varaible
	System.out.println(a*a);
	
	if(a>100) {
		System.out.println("Hi....");
	} else {
		System.out.println("Hello....");
	}
	
%>

<%= a*a  %>

<%
	int x = 10;
	int y = 20;
%>

<br>
<%= "Addition : " + (x+y) %>
<br>
<%= "Sub : " + (x-y) %>
<br>
<%= "Mul : " + (x*y) %>
<br>
<%= "Div : " + (x/y) %>


<%!
int a = 10; // Instance Varaible
public void display() {

}
%>






























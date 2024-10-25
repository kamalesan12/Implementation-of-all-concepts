<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>


<h1>CUSTOMER REGISTERATION USING ACTION</h1>
<html:form action="register">
<pre>

<bean:message key="id"/> : <html:text property="id"></html:text><html:errors property="id_e"/>
<bean:message key="name"/>:<html:text property="name"></html:text><html:errors property="name_e"/>
<bean:message key="email"/> :<html:text property="email"></html:text><html:errors property="email_e"/>

<html:submit value="REGISTER HERE"></html:submit>

</pre>
</html:form>



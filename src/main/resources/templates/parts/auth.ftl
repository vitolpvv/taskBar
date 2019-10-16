<#macro login path>
<form method="post" action="${path}">
    <input type="hidden" name="_csrf" value="${_csrf.token}"/>
    <div><label>Login: <input type="text" name="username"/></label></div>
    <div><label>Password: <input type="password" name="password"/></label></div>
    <div><input type="submit" value="Sign In"/></div>
</form>
</#macro>

<#macro logout>
<form action="/logout" method="post">
    <input type="hidden" name="_csrf" value="${_csrf.token}" />
    <input type="submit" value="Sign Out"/>
</form>
</#macro>
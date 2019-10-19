<#import "parts/common.ftl" as c>
<#import "parts/auth.ftl" as l>

<@c.page>
<#if error??>
<div>Invalid username and password</div>
</#if>
<#if logout??>
    <div>You have been logged out</div>
</#if>
<@l.login path="/login" />
<a href="/registration">Регистрация</a>
</@c.page>
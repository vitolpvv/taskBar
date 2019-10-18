<#-- Remove when real views will be added -->
<#import "parts/common.ftl" as c>
<#import "parts/auth.ftl" as l>

<@c.page>
<div>Hello, this is temporary main page!</div>
<a href="/main">Main Page</a>
<#if (Session.SPRING_SECURITY_CONTEXT.authentication.isAuthenticated()??)!false>
<@l.logout/>
<#else>
</#if>
</@c.page>
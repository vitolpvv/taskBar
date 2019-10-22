<#import "parts/cssform.ftl" as c>

<@c.page>

<div id="action_form">
    <form method="post" action="/registration">
        <h4>Добавить нового пользователя</h4>
        <label for="summary">Логин</label>
        <input id="summary" name="username" type="text" >
        <br />
        <label for="password">Пароль</label>
        <input id="password" name="password" type="password" >
        <input type="hidden" name="_csrf" value="${_csrf.token}" />
        <p><button type="submit">Добавить</button></p>
    </form>
</div>

<p>
    ${message?ifExists}
</p>
</@c.page>
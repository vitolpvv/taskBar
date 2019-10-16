<#import "parts/auth.ftl" as l>
<#import "parts/cssform.ftl" as c>

<@c.page>
<@l.logout/>

<div id="action_form">
    <form method="post" action="/add">
        <h4>Добавить задачу</h4>
        <label for="summary">Тема</label>
        <input id="summary" name="title" type="text" value="">
        <br />
        <label for="summary">Описание</label>
        <textarea id="description" name="description"></textarea>

        <input type="hidden" name="_csrf" value="${_csrf.token}" />
        <p><button type="submit">Добавить</button></p>
    </form>
</div>

</@c.page>
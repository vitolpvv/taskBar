<#import "parts/common.ftl" as c>

<@c.page>
<a href="/edit">Добавить контакт</a>
<div>Список задач</div>
<#list tasks as task>
<div>
    <b>${task.id}</b>
    <span>${task.title}</span>
    <form action="edit" method="get" style="display:inline;">
        <input type="hidden" name="_csrf" value="${_csrf.token}"/>
        <input type="hidden" name="id" value="${task.id}"/>
        <button type="submit">Редактировать</button>
    </form>

    <form action="delete" method="post" style="display:inline;">
        <input type="hidden" name="_csrf" value="${_csrf.token}"/>
        <input type="hidden" name="id" value="${task.id}"/>
        <button type="submit">Удалить</button>
    </form>
</div>
<#else>
Пока нет задач.
</#list>
</@c.page>
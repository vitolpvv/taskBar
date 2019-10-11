<#import "parts/common.ftl" as c>

<@c.page>
<div>
    <div>Добавить задачу</div>
    <form method="post">
        <label for="summary">Тема</label>
        <input id="summary" name="title" type="text" value="">

        <label for="summary">Описание</label>
        <input id="description" name="description" type="text" value="">

        <input type="hidden" name="_csrf" value="${_csrf.token}" />
        <button type="submit">Добавить</button>
    </form>
</div>
<div>Список задач</div>
<#list contacts as contact>
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
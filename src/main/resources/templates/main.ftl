<#import "parts/common.ftl" as c>
<#import "parts/auth.ftl" as l>

<@c.page>
<@l.logout/>
<br>
<a href="/add">Добавить задачу</a>
<br/>
<div>Список задач</div>
<ul>
<#list tasks as task>
    <li>
        <div>
            <b>${task.title}</b>
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
    </li>
<#else>
Пока нет задач.

</#list>

</ul>
</@c.page>
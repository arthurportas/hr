<#list regions as r>
<option value="${r.regionId}">${r.name?string?cap_first}</option>
</#list>
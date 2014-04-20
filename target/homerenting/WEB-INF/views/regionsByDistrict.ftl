<#list regions as r>
<option value="${r.regionId}">${r.regionName?string?cap_first}</option>
</#list>
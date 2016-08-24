
<#assign keys = {"String":"name", "int":"age", "String":"gender"}?keys>
<#list keys as key>
    private ${key} ${{"String":"name", "int":"age", "String":"gender"}[key]};
</#list>

<#--
name = mouse; price = 50;
-->
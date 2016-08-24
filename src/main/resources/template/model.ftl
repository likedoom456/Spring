package model;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = true)
public class ${model} extends BaseModel {
<#assign keys = properties?keys>
<#list keys as key>
    private ${properties[key]} ${key};
</#list>
}
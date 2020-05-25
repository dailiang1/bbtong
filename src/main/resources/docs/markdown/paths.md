
<a name="paths"></a>
## 资源

<a name="entrust-controller_resource"></a>
### Entrust-controller
Entrust Controller


<a name="accomplishusingpost"></a>
#### Accomplish
```
POST /entrust/accomplish
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**entrustReturnMoney**  <br>*可选*|entrustReturnMoney|number (double)|
|**Query**|**entrustReturnTime**  <br>*可选*|entrustReturnTime|integer (int32)|
|**Query**|**newUserId**  <br>*可选*|newUserId|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/accomplish
```


###### 请求 query
```
json :
{
  "entrustId" : 0,
  "entrustReturnMoney" : 0.0,
  "entrustReturnTime" : 0,
  "newUserId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="accomplishusingget"></a>
#### Accomplish
```
GET /entrust/accomplish
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**entrustReturnMoney**  <br>*可选*|entrustReturnMoney|number (double)|
|**Query**|**entrustReturnTime**  <br>*可选*|entrustReturnTime|integer (int32)|
|**Query**|**newUserId**  <br>*可选*|newUserId|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/accomplish
```


###### 请求 query
```
json :
{
  "entrustId" : 0,
  "entrustReturnMoney" : 0.0,
  "entrustReturnTime" : 0,
  "newUserId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="accomplishusingput"></a>
#### Accomplish
```
PUT /entrust/accomplish
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**entrustReturnMoney**  <br>*可选*|entrustReturnMoney|number (double)|
|**Query**|**entrustReturnTime**  <br>*可选*|entrustReturnTime|integer (int32)|
|**Query**|**newUserId**  <br>*可选*|newUserId|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/accomplish
```


###### 请求 query
```
json :
{
  "entrustId" : 0,
  "entrustReturnMoney" : 0.0,
  "entrustReturnTime" : 0,
  "newUserId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="accomplishusingdelete"></a>
#### Accomplish
```
DELETE /entrust/accomplish
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**entrustReturnMoney**  <br>*可选*|entrustReturnMoney|number (double)|
|**Query**|**entrustReturnTime**  <br>*可选*|entrustReturnTime|integer (int32)|
|**Query**|**newUserId**  <br>*可选*|newUserId|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/accomplish
```


###### 请求 query
```
json :
{
  "entrustId" : 0,
  "entrustReturnMoney" : 0.0,
  "entrustReturnTime" : 0,
  "newUserId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="accomplishusingpatch"></a>
#### Accomplish
```
PATCH /entrust/accomplish
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**entrustReturnMoney**  <br>*可选*|entrustReturnMoney|number (double)|
|**Query**|**entrustReturnTime**  <br>*可选*|entrustReturnTime|integer (int32)|
|**Query**|**newUserId**  <br>*可选*|newUserId|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/accomplish
```


###### 请求 query
```
json :
{
  "entrustId" : 0,
  "entrustReturnMoney" : 0.0,
  "entrustReturnTime" : 0,
  "newUserId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="accomplishusinghead"></a>
#### Accomplish
```
HEAD /entrust/accomplish
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**entrustReturnMoney**  <br>*可选*|entrustReturnMoney|number (double)|
|**Query**|**entrustReturnTime**  <br>*可选*|entrustReturnTime|integer (int32)|
|**Query**|**newUserId**  <br>*可选*|newUserId|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/accomplish
```


###### 请求 query
```
json :
{
  "entrustId" : 0,
  "entrustReturnMoney" : 0.0,
  "entrustReturnTime" : 0,
  "newUserId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="accomplishusingoptions"></a>
#### Accomplish
```
OPTIONS /entrust/accomplish
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**entrustReturnMoney**  <br>*可选*|entrustReturnMoney|number (double)|
|**Query**|**entrustReturnTime**  <br>*可选*|entrustReturnTime|integer (int32)|
|**Query**|**newUserId**  <br>*可选*|newUserId|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/accomplish
```


###### 请求 query
```
json :
{
  "entrustId" : 0,
  "entrustReturnMoney" : 0.0,
  "entrustReturnTime" : 0,
  "newUserId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="daaffirmusingpost"></a>
#### DaAffirm
```
POST /entrust/daaffirm
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/daaffirm
```


###### 请求 query
```
json :
{
  "entrustId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="daaffirmusingget"></a>
#### DaAffirm
```
GET /entrust/daaffirm
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/daaffirm
```


###### 请求 query
```
json :
{
  "entrustId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="daaffirmusingput"></a>
#### DaAffirm
```
PUT /entrust/daaffirm
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/daaffirm
```


###### 请求 query
```
json :
{
  "entrustId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="daaffirmusingdelete"></a>
#### DaAffirm
```
DELETE /entrust/daaffirm
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/daaffirm
```


###### 请求 query
```
json :
{
  "entrustId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="daaffirmusingpatch"></a>
#### DaAffirm
```
PATCH /entrust/daaffirm
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/daaffirm
```


###### 请求 query
```
json :
{
  "entrustId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="daaffirmusinghead"></a>
#### DaAffirm
```
HEAD /entrust/daaffirm
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/daaffirm
```


###### 请求 query
```
json :
{
  "entrustId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="daaffirmusingoptions"></a>
#### DaAffirm
```
OPTIONS /entrust/daaffirm
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/daaffirm
```


###### 请求 query
```
json :
{
  "entrustId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="daparticularsusingpost"></a>
#### DaParticulars
```
POST /entrust/daparticulars
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/daparticulars
```


###### 请求 query
```
json :
{
  "entrustId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="daparticularsusingget"></a>
#### DaParticulars
```
GET /entrust/daparticulars
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/daparticulars
```


###### 请求 query
```
json :
{
  "entrustId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="daparticularsusingput"></a>
#### DaParticulars
```
PUT /entrust/daparticulars
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/daparticulars
```


###### 请求 query
```
json :
{
  "entrustId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="daparticularsusingdelete"></a>
#### DaParticulars
```
DELETE /entrust/daparticulars
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/daparticulars
```


###### 请求 query
```
json :
{
  "entrustId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="daparticularsusingpatch"></a>
#### DaParticulars
```
PATCH /entrust/daparticulars
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/daparticulars
```


###### 请求 query
```
json :
{
  "entrustId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="daparticularsusinghead"></a>
#### DaParticulars
```
HEAD /entrust/daparticulars
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/daparticulars
```


###### 请求 query
```
json :
{
  "entrustId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="daparticularsusingoptions"></a>
#### DaParticulars
```
OPTIONS /entrust/daparticulars
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/daparticulars
```


###### 请求 query
```
json :
{
  "entrustId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="daselectentrustusingpost"></a>
#### DaSelectEntrust
```
POST /entrust/daselect
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**index**  <br>*可选*|index|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResultPage](#resultpage)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/daselect
```


###### 请求 query
```
json :
{
  "index" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "count" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "index" : 0,
  "message" : "string",
  "pageCount" : 0,
  "size" : 0
}
```


<a name="daselectentrustusingget"></a>
#### DaSelectEntrust
```
GET /entrust/daselect
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**index**  <br>*可选*|index|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResultPage](#resultpage)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/daselect
```


###### 请求 query
```
json :
{
  "index" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "count" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "index" : 0,
  "message" : "string",
  "pageCount" : 0,
  "size" : 0
}
```


<a name="daselectentrustusingput"></a>
#### DaSelectEntrust
```
PUT /entrust/daselect
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**index**  <br>*可选*|index|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResultPage](#resultpage)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/daselect
```


###### 请求 query
```
json :
{
  "index" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "count" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "index" : 0,
  "message" : "string",
  "pageCount" : 0,
  "size" : 0
}
```


<a name="daselectentrustusingdelete"></a>
#### DaSelectEntrust
```
DELETE /entrust/daselect
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**index**  <br>*可选*|index|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResultPage](#resultpage)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/daselect
```


###### 请求 query
```
json :
{
  "index" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "count" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "index" : 0,
  "message" : "string",
  "pageCount" : 0,
  "size" : 0
}
```


<a name="daselectentrustusingpatch"></a>
#### DaSelectEntrust
```
PATCH /entrust/daselect
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**index**  <br>*可选*|index|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResultPage](#resultpage)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/daselect
```


###### 请求 query
```
json :
{
  "index" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "count" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "index" : 0,
  "message" : "string",
  "pageCount" : 0,
  "size" : 0
}
```


<a name="daselectentrustusinghead"></a>
#### DaSelectEntrust
```
HEAD /entrust/daselect
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**index**  <br>*可选*|index|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResultPage](#resultpage)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/daselect
```


###### 请求 query
```
json :
{
  "index" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "count" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "index" : 0,
  "message" : "string",
  "pageCount" : 0,
  "size" : 0
}
```


<a name="daselectentrustusingoptions"></a>
#### DaSelectEntrust
```
OPTIONS /entrust/daselect
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**index**  <br>*可选*|index|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResultPage](#resultpage)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/daselect
```


###### 请求 query
```
json :
{
  "index" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "count" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "index" : 0,
  "message" : "string",
  "pageCount" : 0,
  "size" : 0
}
```


<a name="haveentrustusingpost"></a>
#### haveEntrust
```
POST /entrust/have
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResultHave](#resulthave)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/have
```


###### 请求 query
```
json :
{
  "entrustId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="haveentrustusingget"></a>
#### haveEntrust
```
GET /entrust/have
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResultHave](#resulthave)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/have
```


###### 请求 query
```
json :
{
  "entrustId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="haveentrustusingput"></a>
#### haveEntrust
```
PUT /entrust/have
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResultHave](#resulthave)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/have
```


###### 请求 query
```
json :
{
  "entrustId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="haveentrustusingdelete"></a>
#### haveEntrust
```
DELETE /entrust/have
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResultHave](#resulthave)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/have
```


###### 请求 query
```
json :
{
  "entrustId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="haveentrustusingpatch"></a>
#### haveEntrust
```
PATCH /entrust/have
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResultHave](#resulthave)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/have
```


###### 请求 query
```
json :
{
  "entrustId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="haveentrustusinghead"></a>
#### haveEntrust
```
HEAD /entrust/have
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResultHave](#resulthave)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/have
```


###### 请求 query
```
json :
{
  "entrustId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="haveentrustusingoptions"></a>
#### haveEntrust
```
OPTIONS /entrust/have
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResultHave](#resulthave)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/have
```


###### 请求 query
```
json :
{
  "entrustId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="issuerecordusingpost"></a>
#### IssueRecord
```
POST /entrust/issue
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/issue
```


###### 请求 query
```
json :
{
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="issuerecordusingget"></a>
#### IssueRecord
```
GET /entrust/issue
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/issue
```


###### 请求 query
```
json :
{
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="issuerecordusingput"></a>
#### IssueRecord
```
PUT /entrust/issue
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/issue
```


###### 请求 query
```
json :
{
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="issuerecordusingdelete"></a>
#### IssueRecord
```
DELETE /entrust/issue
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/issue
```


###### 请求 query
```
json :
{
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="issuerecordusingpatch"></a>
#### IssueRecord
```
PATCH /entrust/issue
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/issue
```


###### 请求 query
```
json :
{
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="issuerecordusinghead"></a>
#### IssueRecord
```
HEAD /entrust/issue
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/issue
```


###### 请求 query
```
json :
{
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="issuerecordusingoptions"></a>
#### IssueRecord
```
OPTIONS /entrust/issue
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/issue
```


###### 请求 query
```
json :
{
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="offintentionusingpost"></a>
#### OffIntention
```
POST /entrust/offintention
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/offintention
```


###### 请求 query
```
json :
{
  "entrustId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="offintentionusingget"></a>
#### OffIntention
```
GET /entrust/offintention
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/offintention
```


###### 请求 query
```
json :
{
  "entrustId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="offintentionusingput"></a>
#### OffIntention
```
PUT /entrust/offintention
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/offintention
```


###### 请求 query
```
json :
{
  "entrustId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="offintentionusingdelete"></a>
#### OffIntention
```
DELETE /entrust/offintention
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/offintention
```


###### 请求 query
```
json :
{
  "entrustId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="offintentionusingpatch"></a>
#### OffIntention
```
PATCH /entrust/offintention
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/offintention
```


###### 请求 query
```
json :
{
  "entrustId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="offintentionusinghead"></a>
#### OffIntention
```
HEAD /entrust/offintention
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/offintention
```


###### 请求 query
```
json :
{
  "entrustId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="offintentionusingoptions"></a>
#### OffIntention
```
OPTIONS /entrust/offintention
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/offintention
```


###### 请求 query
```
json :
{
  "entrustId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="orderrecordusingpost"></a>
#### OrderRecord
```
POST /entrust/order
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/order
```


###### 请求 query
```
json :
{
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="orderrecordusingget"></a>
#### OrderRecord
```
GET /entrust/order
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/order
```


###### 请求 query
```
json :
{
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="orderrecordusingput"></a>
#### OrderRecord
```
PUT /entrust/order
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/order
```


###### 请求 query
```
json :
{
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="orderrecordusingdelete"></a>
#### OrderRecord
```
DELETE /entrust/order
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/order
```


###### 请求 query
```
json :
{
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="orderrecordusingpatch"></a>
#### OrderRecord
```
PATCH /entrust/order
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/order
```


###### 请求 query
```
json :
{
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="orderrecordusinghead"></a>
#### OrderRecord
```
HEAD /entrust/order
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/order
```


###### 请求 query
```
json :
{
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="orderrecordusingoptions"></a>
#### OrderRecord
```
OPTIONS /entrust/order
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/order
```


###### 请求 query
```
json :
{
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="queryentrustusingpost"></a>
#### QueryEntrust
```
POST /entrust/queryentrust
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResultHave](#resulthave)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/queryentrust
```


###### 请求 query
```
json :
{
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="queryentrustusingget"></a>
#### QueryEntrust
```
GET /entrust/queryentrust
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResultHave](#resulthave)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/queryentrust
```


###### 请求 query
```
json :
{
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="queryentrustusingput"></a>
#### QueryEntrust
```
PUT /entrust/queryentrust
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResultHave](#resulthave)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/queryentrust
```


###### 请求 query
```
json :
{
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="queryentrustusingdelete"></a>
#### QueryEntrust
```
DELETE /entrust/queryentrust
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResultHave](#resulthave)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/queryentrust
```


###### 请求 query
```
json :
{
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="queryentrustusingpatch"></a>
#### QueryEntrust
```
PATCH /entrust/queryentrust
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResultHave](#resulthave)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/queryentrust
```


###### 请求 query
```
json :
{
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="queryentrustusinghead"></a>
#### QueryEntrust
```
HEAD /entrust/queryentrust
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResultHave](#resulthave)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/queryentrust
```


###### 请求 query
```
json :
{
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="queryentrustusingoptions"></a>
#### QueryEntrust
```
OPTIONS /entrust/queryentrust
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResultHave](#resulthave)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/queryentrust
```


###### 请求 query
```
json :
{
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="userselectdeliveryorderusingpost"></a>
#### UserSelectDeliveryOrder
```
POST /entrust/selectdeliveryorder
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/selectdeliveryorder
```


###### 请求 query
```
json :
{
  "entrustId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="userselectdeliveryorderusingget"></a>
#### UserSelectDeliveryOrder
```
GET /entrust/selectdeliveryorder
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/selectdeliveryorder
```


###### 请求 query
```
json :
{
  "entrustId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="userselectdeliveryorderusingput"></a>
#### UserSelectDeliveryOrder
```
PUT /entrust/selectdeliveryorder
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/selectdeliveryorder
```


###### 请求 query
```
json :
{
  "entrustId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="userselectdeliveryorderusingdelete"></a>
#### UserSelectDeliveryOrder
```
DELETE /entrust/selectdeliveryorder
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/selectdeliveryorder
```


###### 请求 query
```
json :
{
  "entrustId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="userselectdeliveryorderusingpatch"></a>
#### UserSelectDeliveryOrder
```
PATCH /entrust/selectdeliveryorder
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/selectdeliveryorder
```


###### 请求 query
```
json :
{
  "entrustId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="userselectdeliveryorderusinghead"></a>
#### UserSelectDeliveryOrder
```
HEAD /entrust/selectdeliveryorder
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/selectdeliveryorder
```


###### 请求 query
```
json :
{
  "entrustId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="userselectdeliveryorderusingoptions"></a>
#### UserSelectDeliveryOrder
```
OPTIONS /entrust/selectdeliveryorder
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/selectdeliveryorder
```


###### 请求 query
```
json :
{
  "entrustId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="sendordersusingpost"></a>
#### SendOrders
```
POST /entrust/sendorders
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**InsuranceCompanyName**  <br>*可选*|InsuranceCompanyName|string|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**finallyUserId**  <br>*可选*|finallyUserId|integer (int32)|
|**Query**|**friendName**  <br>*可选*|friendName|string|
|**Query**|**friendPhone**  <br>*可选*|friendPhone|string|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResultPage](#resultpage)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/sendorders
```


###### 请求 query
```
json :
{
  "InsuranceCompanyName" : "string",
  "entrustId" : 0,
  "finallyUserId" : 0,
  "friendName" : "string",
  "friendPhone" : "string",
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "count" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "index" : 0,
  "message" : "string",
  "pageCount" : 0,
  "size" : 0
}
```


<a name="sendordersusingget"></a>
#### SendOrders
```
GET /entrust/sendorders
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**InsuranceCompanyName**  <br>*可选*|InsuranceCompanyName|string|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**finallyUserId**  <br>*可选*|finallyUserId|integer (int32)|
|**Query**|**friendName**  <br>*可选*|friendName|string|
|**Query**|**friendPhone**  <br>*可选*|friendPhone|string|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResultPage](#resultpage)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/sendorders
```


###### 请求 query
```
json :
{
  "InsuranceCompanyName" : "string",
  "entrustId" : 0,
  "finallyUserId" : 0,
  "friendName" : "string",
  "friendPhone" : "string",
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "count" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "index" : 0,
  "message" : "string",
  "pageCount" : 0,
  "size" : 0
}
```


<a name="sendordersusingput"></a>
#### SendOrders
```
PUT /entrust/sendorders
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**InsuranceCompanyName**  <br>*可选*|InsuranceCompanyName|string|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**finallyUserId**  <br>*可选*|finallyUserId|integer (int32)|
|**Query**|**friendName**  <br>*可选*|friendName|string|
|**Query**|**friendPhone**  <br>*可选*|friendPhone|string|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResultPage](#resultpage)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/sendorders
```


###### 请求 query
```
json :
{
  "InsuranceCompanyName" : "string",
  "entrustId" : 0,
  "finallyUserId" : 0,
  "friendName" : "string",
  "friendPhone" : "string",
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "count" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "index" : 0,
  "message" : "string",
  "pageCount" : 0,
  "size" : 0
}
```


<a name="sendordersusingdelete"></a>
#### SendOrders
```
DELETE /entrust/sendorders
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**InsuranceCompanyName**  <br>*可选*|InsuranceCompanyName|string|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**finallyUserId**  <br>*可选*|finallyUserId|integer (int32)|
|**Query**|**friendName**  <br>*可选*|friendName|string|
|**Query**|**friendPhone**  <br>*可选*|friendPhone|string|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResultPage](#resultpage)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/sendorders
```


###### 请求 query
```
json :
{
  "InsuranceCompanyName" : "string",
  "entrustId" : 0,
  "finallyUserId" : 0,
  "friendName" : "string",
  "friendPhone" : "string",
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "count" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "index" : 0,
  "message" : "string",
  "pageCount" : 0,
  "size" : 0
}
```


<a name="sendordersusingpatch"></a>
#### SendOrders
```
PATCH /entrust/sendorders
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**InsuranceCompanyName**  <br>*可选*|InsuranceCompanyName|string|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**finallyUserId**  <br>*可选*|finallyUserId|integer (int32)|
|**Query**|**friendName**  <br>*可选*|friendName|string|
|**Query**|**friendPhone**  <br>*可选*|friendPhone|string|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResultPage](#resultpage)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/sendorders
```


###### 请求 query
```
json :
{
  "InsuranceCompanyName" : "string",
  "entrustId" : 0,
  "finallyUserId" : 0,
  "friendName" : "string",
  "friendPhone" : "string",
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "count" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "index" : 0,
  "message" : "string",
  "pageCount" : 0,
  "size" : 0
}
```


<a name="sendordersusinghead"></a>
#### SendOrders
```
HEAD /entrust/sendorders
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**InsuranceCompanyName**  <br>*可选*|InsuranceCompanyName|string|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**finallyUserId**  <br>*可选*|finallyUserId|integer (int32)|
|**Query**|**friendName**  <br>*可选*|friendName|string|
|**Query**|**friendPhone**  <br>*可选*|friendPhone|string|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResultPage](#resultpage)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/sendorders
```


###### 请求 query
```
json :
{
  "InsuranceCompanyName" : "string",
  "entrustId" : 0,
  "finallyUserId" : 0,
  "friendName" : "string",
  "friendPhone" : "string",
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "count" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "index" : 0,
  "message" : "string",
  "pageCount" : 0,
  "size" : 0
}
```


<a name="sendordersusingoptions"></a>
#### SendOrders
```
OPTIONS /entrust/sendorders
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**InsuranceCompanyName**  <br>*可选*|InsuranceCompanyName|string|
|**Query**|**entrustId**  <br>*可选*|entrustId|integer (int32)|
|**Query**|**finallyUserId**  <br>*可选*|finallyUserId|integer (int32)|
|**Query**|**friendName**  <br>*可选*|friendName|string|
|**Query**|**friendPhone**  <br>*可选*|friendPhone|string|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResultPage](#resultpage)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/sendorders
```


###### 请求 query
```
json :
{
  "InsuranceCompanyName" : "string",
  "entrustId" : 0,
  "finallyUserId" : 0,
  "friendName" : "string",
  "friendPhone" : "string",
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "count" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "index" : 0,
  "message" : "string",
  "pageCount" : 0,
  "size" : 0
}
```


<a name="useralsousingpost"></a>
#### UserAlso
```
POST /entrust/useralso
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**deliveryOrderMoney**  <br>*可选*|deliveryOrderMoney|number (double)|
|**Query**|**deliveryOrderNumber**  <br>*可选*|deliveryOrderNumber|string|
|**Query**|**newUserId**  <br>*可选*|newUserId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResultHave](#resulthave)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/useralso
```


###### 请求 query
```
json :
{
  "deliveryOrderMoney" : 0.0,
  "deliveryOrderNumber" : "string",
  "newUserId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="useralsousingget"></a>
#### UserAlso
```
GET /entrust/useralso
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**deliveryOrderMoney**  <br>*可选*|deliveryOrderMoney|number (double)|
|**Query**|**deliveryOrderNumber**  <br>*可选*|deliveryOrderNumber|string|
|**Query**|**newUserId**  <br>*可选*|newUserId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResultHave](#resulthave)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/useralso
```


###### 请求 query
```
json :
{
  "deliveryOrderMoney" : 0.0,
  "deliveryOrderNumber" : "string",
  "newUserId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="useralsousingput"></a>
#### UserAlso
```
PUT /entrust/useralso
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**deliveryOrderMoney**  <br>*可选*|deliveryOrderMoney|number (double)|
|**Query**|**deliveryOrderNumber**  <br>*可选*|deliveryOrderNumber|string|
|**Query**|**newUserId**  <br>*可选*|newUserId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResultHave](#resulthave)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/useralso
```


###### 请求 query
```
json :
{
  "deliveryOrderMoney" : 0.0,
  "deliveryOrderNumber" : "string",
  "newUserId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="useralsousingdelete"></a>
#### UserAlso
```
DELETE /entrust/useralso
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**deliveryOrderMoney**  <br>*可选*|deliveryOrderMoney|number (double)|
|**Query**|**deliveryOrderNumber**  <br>*可选*|deliveryOrderNumber|string|
|**Query**|**newUserId**  <br>*可选*|newUserId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResultHave](#resulthave)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/useralso
```


###### 请求 query
```
json :
{
  "deliveryOrderMoney" : 0.0,
  "deliveryOrderNumber" : "string",
  "newUserId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="useralsousingpatch"></a>
#### UserAlso
```
PATCH /entrust/useralso
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**deliveryOrderMoney**  <br>*可选*|deliveryOrderMoney|number (double)|
|**Query**|**deliveryOrderNumber**  <br>*可选*|deliveryOrderNumber|string|
|**Query**|**newUserId**  <br>*可选*|newUserId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResultHave](#resulthave)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/useralso
```


###### 请求 query
```
json :
{
  "deliveryOrderMoney" : 0.0,
  "deliveryOrderNumber" : "string",
  "newUserId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="useralsousinghead"></a>
#### UserAlso
```
HEAD /entrust/useralso
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**deliveryOrderMoney**  <br>*可选*|deliveryOrderMoney|number (double)|
|**Query**|**deliveryOrderNumber**  <br>*可选*|deliveryOrderNumber|string|
|**Query**|**newUserId**  <br>*可选*|newUserId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResultHave](#resulthave)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/useralso
```


###### 请求 query
```
json :
{
  "deliveryOrderMoney" : 0.0,
  "deliveryOrderNumber" : "string",
  "newUserId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="useralsousingoptions"></a>
#### UserAlso
```
OPTIONS /entrust/useralso
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**deliveryOrderMoney**  <br>*可选*|deliveryOrderMoney|number (double)|
|**Query**|**deliveryOrderNumber**  <br>*可选*|deliveryOrderNumber|string|
|**Query**|**newUserId**  <br>*可选*|newUserId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResultHave](#resulthave)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/useralso
```


###### 请求 query
```
json :
{
  "deliveryOrderMoney" : 0.0,
  "deliveryOrderNumber" : "string",
  "newUserId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="userintentionusingpost"></a>
#### UserIntention
```
POST /entrust/userintention
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResultHave](#resulthave)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/userintention
```


###### 请求 query
```
json :
{
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="userintentionusingget"></a>
#### UserIntention
```
GET /entrust/userintention
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResultHave](#resulthave)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/userintention
```


###### 请求 query
```
json :
{
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="userintentionusingput"></a>
#### UserIntention
```
PUT /entrust/userintention
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResultHave](#resulthave)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/userintention
```


###### 请求 query
```
json :
{
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="userintentionusingdelete"></a>
#### UserIntention
```
DELETE /entrust/userintention
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResultHave](#resulthave)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/userintention
```


###### 请求 query
```
json :
{
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="userintentionusingpatch"></a>
#### UserIntention
```
PATCH /entrust/userintention
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResultHave](#resulthave)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/userintention
```


###### 请求 query
```
json :
{
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="userintentionusinghead"></a>
#### UserIntention
```
HEAD /entrust/userintention
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResultHave](#resulthave)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/userintention
```


###### 请求 query
```
json :
{
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```


<a name="userintentionusingoptions"></a>
#### UserIntention
```
OPTIONS /entrust/userintention
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**userId**  <br>*可选*|userId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResultHave](#resulthave)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/entrust/userintention
```


###### 请求 query
```
json :
{
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "datas" : [ "object" ],
  "message" : "string"
}
```




function register()
{
	 var url="http://localhost:8070/sdppro/register";
	 var data=JSON.stringify({
		  "id":t1.value,
		  "name":t2.value,
		  "email":t3.value,
		  "phone":t4.value,
		  "poojaname":t5.value,
		  "date":t6.value,
		  "time":t7.value,
	 });
	 
	 callApi("POST",url,data,getResponse);
}
function update()
{
	var url="http://localhost:8070/sdppro/update/"+t1.value+"/"+t5.value;
	callApi("PUT",url,"",getResponse);
}
function deleteData()
{
	var url="http://localhost:8070/sdppro/delete/"+t1.value;
	callApi("DELETE",url,"",getResponse);
}
function view()
{
	var url="http://localhost:8070/sdppro/read";
	callApi("GET",url,"",getResponseTable);
}
function getResponseTable(res)
{
	var data=JSON.parse(res);
	var table=`<table border="1">
				<tr>
					<th>ID</th>
					<th>NAME</th>
					<th>EMAIL</th>
					<th>PHONE</th>
					<th>POOJA</th>
					<th>DATE</th>
					<th>TIME</th>
				</tr>`;
			for(var x in data)
			{
				table+=`<tr>
							<td>` + data[x].id + `</td>
							<td>` + data[x].name + `</td>
							<td>` + data[x].email + `</td>
							<td>` + data[x].phone + `</td>
							<td>` + data[x].poojaname + `</td>
							<td>` + data[x].date + `</td>
							<td>` + data[x].time + `</td>
						</tr>`;
			}
			table+=`</table>`
	viewData.innerHTML=table;
}
function getResponse(res)
{
 	l1.innerText=res;
}
function callApi(METHOD,URL,DATA,SUCCESS)
{
	 var xhttp=new XMLHttpRequest();
	 xhttp.open(METHOD,URL,true)
	 xhttp.setRequestHeader('Content-Type','application/json');
	 xhttp.onreadystatechange=function()
	 {
	 	if(this.readyState == 4)
	  	{
		   	if(this.status == 200)
		    	SUCCESS(this.responseText);
		   	else
		    	alert("404: Service unavailable"); 
		   
		}
		  
	 };
	 xhttp.send(DATA);
}
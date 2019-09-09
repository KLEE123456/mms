// 浏览医生信息begin
function RDMclick(){
    if(access.indexOf("数据报表功能") < 0 ){
        $.messager.alert('警告','该用户没有此功能');
        event.stopPropagation();
    }
    if(!$('#output').tabs('exists','医生数据报表')) {
        $('#output').tabs('add',{

            title:'医生数据报表',

            href:'./tabs/doctor/Report.html',
            closable:true
        });
    }
    else
    {
        $('#output').tabs('select', '医生数据报表');
    }
}
// 浏览医生信息end
// 删除药品类别信息begin
function DMTMclick(){
    if(access.indexOf("信息删除功能") < 0 ){
        $.messager.alert('警告','该用户没有此功能');
        event.stopPropagation();
    }

    if(!$('#output').tabs('exists','删除药品类别信息')) {
        $('#output').tabs('add',{
            title:'删除药品类别信息',
            href:'./tabs/medtype/Delete.html',
            closable:true
        });
    }
    else
    {
        $('#output').tabs('select', '删除药品类别信息');
    }
}
//删除药品类别信息end
function loadTable(tid,url,columns) {

    $('#'+tid).bootstrapTable({
        url:url,        //请求后台的URL（*）
        method: 'post',                      //请求方式（*）
        dataType: "json",
        contentType: "application/x-www-form-urlencoded",
        striped: true,// 隔行变色
        cache: false, // 是否使用缓存
        showColumns: false,// 列
        toobar: '#toolbar',
        pagination: true, // 分页
        paginationLoop: false,
        paginationPreText: '上一页',
        paginationNextText: '下一页',
        showFooter: true,// 显示列脚
        showRefresh: true,// 显示刷新
        showPaginationSwitch: false,// 是否显示数据条数选择框
        sortable: false, // 是否启用排序
        singleSelect: false,
        search: false, // 显示搜索框
        buttonsAlign: "right", // 按钮对齐方式
        showRefresh: false,// 是否显示刷新按钮
        sidePagination: "server", // 服务端处理分页
        pageNumber: 1,
        pageSize: 5,
        pageList: [5, 10, 25, 50, 100],
        undefinedText: '--',
        uniqueId: "uuid", // 每一行的唯一标识，一般为主键列
        queryParamsType: '',
        queryParams: queryParams,// 传递参数（*）
        columns: columns
    });
}

function bootstrapSelect(o) {
    $.ajax({
        url: o.url,
        // 是否是异步 false 同步
        async: false,
        type: "post",
        success: function (data) {
            var op="<option value=''>--请选择--</option>";
            $.each(data,function (i,e) {
                op+="<option value='"+e[o.valueField]+"'>"+e[o.textField]+"</option>"
            })
            $("#"+o.tid).append(op);
            $("#"+o.tid).selectpicker("refresh");

        },
        dataType:"json"
    });
}

layui.use(['element','layer'], function(){
	var element = layui.element,
		layer = layui.layer,
		$ = layui.$;
	
	var version = layui.data("dtree-version").versionCls;
	var versionCls = layui.data("dtree-version-now").versionClsNow;
	var flag = false;
	// 根据versionCls的值来选择需要显示的元素
	for(var key in version){
		if(key != versionCls) {
			if(flag){
				$("*[data-vs='"+key+"']").show();
			}
			continue;
		}
		$("*[data-vs='"+key+"']").show();
		flag = true;
	}
	// 根据versionCls的值来选择不需要显示的元素
	// 选择log标题
	for(var key in version){
		if(key != versionCls) {
			continue;
		}
		$("*[data-vlog='"+key+"']").show();
		$(".version-title").html(version[key] + " 新增内容提示（如文档中有引用，请注意版本问题！）：")
	}
});
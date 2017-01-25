;(function(){

//提交
/*
$('#J_recharge_form').ajaxForm({
	dataType : 'json',
	success : function(data){
		if(data.state == 'success') {
	        //替换连接中&amp
	        data.data.url = (data.data.url).replace(/&amp;/g,'&');
			//支付跳转
			window.location.href = decodeURIComponent(data.data.url);//todo
			//window.location.href = data.referer;
		}else if(data.state == 'fail'){
			//global.js
			Wind.Util.resultTip({
				error : true,
				msg : data.message
			});
		}
	}
});

$('#J_award_form').ajaxForm({
	dataType : 'json',
	success : function(data){
		if(data.state == 'success') {
	        //替换连接中&amp
	        data.data.url = (data.data.url).replace(/&amp;/g,'&');
			//支付跳转
			window.location.href = decodeURIComponent(data.data.url);//todo
			//window.location.href = data.referer;
		}else if(data.state == 'fail'){
			//global.js
			Wind.Util.resultTip({
				error : true,
				msg : data.message
			});
		}
	}
}
*/
	var award_wrap = $('#J_award_wrap');
	var wxpay_wrap = $('#J_wxpay_wrap');
	
	var pay_input = award_wrap.find('input.J_award_pay_input');
	//award_wrap.draggable( { handle : '.J_pop_handle'} );

	$('a.J_close').on('click', function(e){
		e.preventDefault();
		award_wrap.hide();
		wxpay_wrap.hide();
	});

	$('a.J_award').on('click', function(e){
		e.preventDefault();

		//表单重置
		//$('form.J_award_form').resetForm();
		//pay_input.text='';	
		
		Wind.Util.popPos(award_wrap);
		
		//award_wrap.find('input:text:visible').first().focus();
		pay_input.focus();

	});

	$('button.J_award_submit').on('click', function(e){
		//var js_paymethod = $("input[name='paymethod']:checked").val();
		$('#J_award_wrap').hide();
		/*
		if(5 == js_paymethod){ //如果是微信支付
			//e.preventDefault();
			//Wind.Util.popPos(wxpay_wrap);
		}
		*/

	});





})();
// viva do 1.0.1

$(function() {

	var is = LorSTN.is,
		run = LorSTN.run;

	// 如果是 右侧边栏A
	if( is.sbarA ) {
		run.sbarA_slideShowA();   // 运行 A的 焦点图切换
		run.sbarA_TabsA();        // 运行 A的 Tabs切换
	};
	// 如果是 右侧边栏B
	if( is.sbarB ) {
		run.read_tabsC();         // 运行 B的 Tabs切换
	};
	// 如果是 Cate页
	if( is.cate ) {
		run.cate_btmTabs();       // 运行 底部Tabs推送
	};
	/* 重写
	// 如果是 阅读页
	if( is.read ) {
		run.read_shareTo();       // 运行阅读页分享到
	};
	*/

/* var scrollbar_width_t = window.innerWidth -  document.documentElement.clientWidth,
	scrollbar_width = scrollbar_width_t === 0 ? 17 : scrollbar_width_t,
	resizeValue = [[1320,1350-scrollbar_width],[1140,1170-scrollbar_width],[960]],
	resizeValueLog = [1350-scrollbar_width, 1170-scrollbar_width], */
var scrollbar_width_t = window.innerWidth -  document.documentElement.clientWidth,
	scrollbar_width = scrollbar_width_t === 0 ? 17 : scrollbar_width_t,
	resizeValue = [1320,1350-scrollbar_width],
	resizeValueLog = [1350-scrollbar_width],

// 头部 发帖按钮 菜单
fix106_head_postMenu = function(){
	$('#J_head_forum_post_fix106').lorShowMenu({
		dogs         : '#J_head_forum_pop',
		delta        : '.arrow',
		resize       : resizeValue,
		aniRange     : 50,
		onshowEnd    : function(){
			Wind.js(GV.JS_ROOT +'pages/common/headMain.js?v='+ GV.JS_VERSION);
		}
	})
},
// 头部 消息菜单
fix106_head_msgMenu = function(){
	var btn = $('#J_head_msg_btn_fix106'),
		rtn = $('#J_head_msg_returnBtn');

	btn.lorShowMenu({
		dogs         : '#J_head_msg_pop',
		delta        : '.arrow',
		resize       : resizeValue,
		aniRange     : 50,
		onshowStart  : function(){
			Wind.js(GV.JS_ROOT+ 'pages/common/headMain.js?v='+ GV.JS_VERSION);
			//点击消息遮罩的图片 隐藏列表
			$('#J_head_pl_hm').off('click').on('click', function(e){
				e.preventDefault();
				list.hide();
				
				$('#J_emotions_pop').hide();
				$('#J_hm_home').show().siblings().remove();
			});	
		},
		onhideStart    : function(){
			$('#J_emotions_pop').hide();
			$('#J_hm_home').show().siblings().remove();
			btn.data('licli', 'h');
			rtn.stop(true).hide(0);
		}
	});
},
// 头部 用户头像
fix106_head_userPanel = function(){
	var btn = $('#J_head_user_a_fix106');
	if(btn.length) {
		$('#J_head_user_a_fix106').lorShowMenu({
			active       : 'both',
			dogs         : '#J_head_user_menu',
			delta        : '.arrow',
			resize       : resizeValue,
			aniRange     : 30,
			hoverDelay   : 100,
			onshowStart  : function(){
				$('#J_head_pl_user').off('click').on('click', function(e){
					e.preventDefault();
					list.hide();
				});
				$('#J_head_user_a_fix106').addClass('clicked');
			},
			onhideEnd    : function(){
				$('#J_head_user_a_fix106').removeClass('clicked');
			}
		});

	}
};


console.log( window.innerWidth, document.documentElement.clientWidth );


fix106_head_postMenu();
fix106_head_msgMenu();
fix106_head_userPanel();

});

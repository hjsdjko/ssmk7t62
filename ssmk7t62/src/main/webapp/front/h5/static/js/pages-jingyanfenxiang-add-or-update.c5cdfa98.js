(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-jingyanfenxiang-add-or-update"],{"21cc":function(r,t,e){var i=e("7421");"string"===typeof i&&(i=[[r.i,i,""]]),i.locals&&(r.exports=i.locals);var a=e("4f06").default;a("5ecda080",i,!0,{sourceMap:!1,shadowMode:!1})},7421:function(r,t,e){var i=e("24fb");t=i(!1),t.push([r.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.container[data-v-6296fbc8]{padding:%?20?%}.content[data-v-6296fbc8]:after{position:fixed;top:0;right:0;left:0;bottom:0;content:"";background-attachment:fixed;background-size:cover;background-position:50%}uni-textarea[data-v-6296fbc8]{border:%?1?% solid #eee;border-radius:%?20?%;padding:%?20?%}.title[data-v-6296fbc8]{width:%?180?%}.avator[data-v-6296fbc8]{width:%?150?%;height:%?60?%}.right-input[data-v-6296fbc8]{-webkit-box-flex:1;-webkit-flex:1;flex:1;text-align:left;padding:0 %?24?%}.cu-form-group.active[data-v-6296fbc8]{-webkit-box-pack:justify;-webkit-justify-content:space-between;justify-content:space-between}.btn[data-v-6296fbc8]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;-webkit-box-pack:center;-webkit-justify-content:center;justify-content:center;-webkit-flex-wrap:wrap;flex-wrap:wrap;padding:%?20?% 0}.cu-form-group[data-v-6296fbc8]{padding:0 %?24?%;background-color:initial;min-height:inherit}.cu-form-group + .cu-form-group[data-v-6296fbc8]{border:0}.cu-form-group uni-input[data-v-6296fbc8]{padding:0 %?30?%}.uni-input[data-v-6296fbc8]{padding:0 %?30?%}.cu-form-group uni-textarea[data-v-6296fbc8]{padding:%?30?%;margin:0}.cu-form-group uni-picker[data-v-6296fbc8]::after{line-height:%?88?%}.select .uni-input[data-v-6296fbc8]{line-height:%?88?%}.input .right-input[data-v-6296fbc8]{line-height:%?88?%}',""]),r.exports=t},"780d":function(r,t,e){"use strict";var i=e("21cc"),a=e.n(i);a.a},"82a5":function(r,t,e){"use strict";e.r(t);var i=e("9775"),a=e.n(i);for(var n in i)"default"!==n&&function(r){e.d(t,r,(function(){return i[r]}))}(n);t["default"]=a.a},9775:function(r,t,e){"use strict";var i=e("4ea4");Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0,e("ac6a"),e("96cf");var a=i(e("3b8d")),n=i(e("e2b1")),o={data:function(){return{ruleForm:{biaoti:"",tupian:"",sunhuaiyuanyin:"",weixiufangfa:"",faburiqi:"",zhanghao:"",xingming:""},user:{},ro:{biaoti:!1,tupian:!1,sunhuaiyuanyin:!1,weixiufangfa:!1,faburiqi:!1,zhanghao:!1,xingming:!1}}},components:{wPicker:n.default},computed:{},onLoad:function(){var r=(0,a.default)(regeneratorRuntime.mark((function r(t){var e,i,a,n;return regeneratorRuntime.wrap((function(r){while(1)switch(r.prev=r.next){case 0:return e=uni.getStorageSync("nowTable"),r.next=3,this.$api.session(e);case 3:if(i=r.sent,this.user=i.data,this.ruleForm.userid=uni.getStorageSync("userid"),t.refid&&(this.ruleForm.refid=t.refid),!t.id){r.next=13;break}return this.ruleForm.id=t.id,r.next=11,this.$api.info("jingyanfenxiang",this.ruleForm.id);case 11:i=r.sent,this.ruleForm=i.data;case 13:if(!t.cross){r.next=48;break}a=uni.getStorageSync("crossObj"),r.t0=regeneratorRuntime.keys(a);case 16:if((r.t1=r.t0()).done){r.next=48;break}if(n=r.t1.value,"biaoti"!=n){r.next=22;break}return this.ruleForm.biaoti=a[n],this.ro.biaoti=!0,r.abrupt("continue",16);case 22:if("tupian"!=n){r.next=26;break}return this.ruleForm.tupian=a[n],this.ro.tupian=!0,r.abrupt("continue",16);case 26:if("sunhuaiyuanyin"!=n){r.next=30;break}return this.ruleForm.sunhuaiyuanyin=a[n],this.ro.sunhuaiyuanyin=!0,r.abrupt("continue",16);case 30:if("weixiufangfa"!=n){r.next=34;break}return this.ruleForm.weixiufangfa=a[n],this.ro.weixiufangfa=!0,r.abrupt("continue",16);case 34:if("faburiqi"!=n){r.next=38;break}return this.ruleForm.faburiqi=a[n],this.ro.faburiqi=!0,r.abrupt("continue",16);case 38:if("zhanghao"!=n){r.next=42;break}return this.ruleForm.zhanghao=a[n],this.ro.zhanghao=!0,r.abrupt("continue",16);case 42:if("xingming"!=n){r.next=46;break}return this.ruleForm.xingming=a[n],this.ro.xingming=!0,r.abrupt("continue",16);case 46:r.next=16;break;case 48:this.styleChange();case 49:case"end":return r.stop()}}),r,this)})));function t(t){return r.apply(this,arguments)}return t}(),methods:{styleChange:function(){this.$nextTick((function(){}))},faburiqiChange:function(r){this.ruleForm.faburiqi=r.target.value,this.$forceUpdate()},tupianTap:function(){var r=this;this.$api.upload((function(t){r.ruleForm.tupian=r.$base.url+"upload/"+t.file,r.$forceUpdate(),r.$nextTick((function(){r.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var r=(0,a.default)(regeneratorRuntime.mark((function r(){return regeneratorRuntime.wrap((function(r){while(1)switch(r.prev=r.next){case 0:if(this.ruleForm.biaoti){r.next=3;break}return this.$utils.msg("标题不能为空"),r.abrupt("return");case 3:if(!this.ruleForm.id){r.next=8;break}return r.next=6,this.$api.update("jingyanfenxiang",this.ruleForm);case 6:r.next=10;break;case 8:return r.next=10,this.$api.add("jingyanfenxiang",this.ruleForm);case 10:this.$utils.msgBack("提交成功");case 11:case"end":return r.stop()}}),r,this)})));function t(){return r.apply(this,arguments)}return t}(),optionsChange:function(r){this.index=r.target.value},bindDateChange:function(r){this.date=r.target.value},getDate:function(r){var t=new Date,e=t.getFullYear(),i=t.getMonth()+1,a=t.getDate();return"start"===r?e-=60:"end"===r&&(e+=2),i=i>9?i:"0"+i,a=a>9?a:"0"+a,"".concat(e,"-").concat(i,"-").concat(a)},toggleTab:function(r){this.$refs[r].show()}}};t.default=o},aab6:function(r,t,e){"use strict";e.r(t);var i=e("c896"),a=e("82a5");for(var n in a)"default"!==n&&function(r){e.d(t,r,(function(){return a[r]}))}(n);e("780d");var o,u=e("f0c5"),s=Object(u["a"])(a["default"],i["b"],i["c"],!1,null,"6296fbc8",null,!1,i["a"],o);t["default"]=s.exports},c896:function(r,t,e){"use strict";var i,a=function(){var r=this,t=r.$createElement,e=r._self._c||t;return e("v-uni-view",{staticClass:"content"},[e("v-uni-form",{staticClass:"app-update-pv"},[e("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 16rpx rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0 0 020rpx 0",borderWidth:"0",borderStyle:"solid",height:"108rpx"}},[e("v-uni-view",{staticClass:"title",style:{width:"170rpx",fontSize:"28rpx",color:"rgba(255, 153, 0, 1)",textAlign:"left"}},[r._v("标题")]),e("v-uni-input",{style:{boxShadow:"0 0 0px rgba(0,0,0,.6) inset",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(255, 153, 0, 1)",borderRadius:"16rpx",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"},attrs:{disabled:r.ro.biaoti,placeholder:"标题"},model:{value:r.ruleForm.biaoti,callback:function(t){r.$set(r.ruleForm,"biaoti",t)},expression:"ruleForm.biaoti"}})],1),e("v-uni-view",{staticClass:"cu-form-group",class:"left"==r.left?"":"active",style:{boxShadow:"0 0 16rpx rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderWidth:"0",borderStyle:"solid",height:"108rpx"},on:{click:function(t){arguments[0]=t=r.$handleEvent(t),r.tupianTap.apply(void 0,arguments)}}},[e("v-uni-view",{staticClass:"title",style:{width:"170rpx",fontSize:"28rpx",color:"rgba(255, 153, 0, 1)",textAlign:"left"}},[r._v("图片")]),e("v-uni-view",{staticClass:"right-input",staticStyle:{padding:"0"},style:{textAlign:"left"}},[r.ruleForm.tupian?e("v-uni-image",{staticClass:"avator",style:{width:"88rpx",boxShadow:"0 0 16rpx rgba(0,0,0,.3)",borderRadius:"100%",textAlign:"left",height:"88rpx"},attrs:{src:r.ruleForm.tupian,mode:"aspectFill"}}):e("v-uni-image",{staticClass:"avator",style:{width:"88rpx",boxShadow:"0 0 16rpx rgba(0,0,0,.3)",borderRadius:"100%",textAlign:"left",height:"88rpx"},attrs:{src:"../../static/gen/upload.png",mode:"aspectFill"}})],1)],1),e("v-uni-view",{staticClass:"cu-form-group select",style:{boxShadow:"0 0 16rpx rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderWidth:"0",borderStyle:"solid",height:"108rpx"}},[e("v-uni-view",{staticClass:"title",style:{width:"170rpx",fontSize:"28rpx",color:"rgba(255, 153, 0, 1)",textAlign:"left"}},[r._v("发布日期")]),e("v-uni-picker",{attrs:{mode:"date",value:r.ruleForm.faburiqi},on:{change:function(t){arguments[0]=t=r.$handleEvent(t),r.faburiqiChange.apply(void 0,arguments)}}},[e("v-uni-view",{staticClass:"uni-input",style:{boxShadow:"0 0 0px rgba(0,0,0,.6) inset",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(255, 153, 0, 1)",borderRadius:"16rpx",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"}},[r._v(r._s(r.ruleForm.faburiqi?r.ruleForm.faburiqi:"请选择发布日期"))])],1)],1),e("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 16rpx rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0 0 020rpx 0",borderWidth:"0",borderStyle:"solid",height:"108rpx"}},[e("v-uni-view",{staticClass:"title",style:{width:"170rpx",fontSize:"28rpx",color:"rgba(255, 153, 0, 1)",textAlign:"left"}},[r._v("账号")]),e("v-uni-input",{style:{boxShadow:"0 0 0px rgba(0,0,0,.6) inset",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(255, 153, 0, 1)",borderRadius:"16rpx",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"},attrs:{disabled:r.ro.zhanghao,placeholder:"账号"},model:{value:r.ruleForm.zhanghao,callback:function(t){r.$set(r.ruleForm,"zhanghao",t)},expression:"ruleForm.zhanghao"}})],1),e("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 16rpx rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0 0 020rpx 0",borderWidth:"0",borderStyle:"solid",height:"108rpx"}},[e("v-uni-view",{staticClass:"title",style:{width:"170rpx",fontSize:"28rpx",color:"rgba(255, 153, 0, 1)",textAlign:"left"}},[r._v("姓名")]),e("v-uni-input",{style:{boxShadow:"0 0 0px rgba(0,0,0,.6) inset",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(255, 153, 0, 1)",borderRadius:"16rpx",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"},attrs:{disabled:r.ro.xingming,placeholder:"姓名"},model:{value:r.ruleForm.xingming,callback:function(t){r.$set(r.ruleForm,"xingming",t)},expression:"ruleForm.xingming"}})],1),e("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 16rpx rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderWidth:"0",borderStyle:"solid",height:"308rpx"}},[e("v-uni-view",{staticClass:"title",style:{width:"170rpx",fontSize:"28rpx",color:"rgba(255, 153, 0, 1)",textAlign:"left"}},[r._v("损坏原因")]),e("v-uni-textarea",{style:{boxShadow:"0 0 0px rgba(0,0,0,.6) inset",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(255, 153, 0, 1)",borderRadius:"16rpx",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"28rpx",borderStyle:"solid",height:"300rpx"},attrs:{placeholder:"损坏原因"},model:{value:r.ruleForm.sunhuaiyuanyin,callback:function(t){r.$set(r.ruleForm,"sunhuaiyuanyin",t)},expression:"ruleForm.sunhuaiyuanyin"}})],1),e("v-uni-view",{staticClass:"cu-form-group",style:{boxShadow:"0 0 16rpx rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 0.25)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderWidth:"0",borderStyle:"solid",height:"308rpx"}},[e("v-uni-view",{staticClass:"title",style:{width:"170rpx",fontSize:"28rpx",color:"rgba(255, 153, 0, 1)",textAlign:"left"}},[r._v("维修方法")]),e("v-uni-textarea",{style:{boxShadow:"0 0 0px rgba(0,0,0,.6) inset",backgroundColor:"rgba(255, 255, 255, 0)",borderColor:"rgba(255, 153, 0, 1)",borderRadius:"16rpx",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderWidth:"2rpx",fontSize:"28rpx",borderStyle:"solid",height:"300rpx"},attrs:{placeholder:"维修方法"},model:{value:r.ruleForm.weixiufangfa,callback:function(t){r.$set(r.ruleForm,"weixiufangfa",t)},expression:"ruleForm.weixiufangfa"}})],1),e("v-uni-view",{staticClass:"btn"},[e("v-uni-button",{staticClass:"bg-red",style:{boxShadow:"0 0 16rpx rgba(0,0,0,0) inset",backgroundColor:"rgba(255, 153, 0, 1)",borderColor:"rgba(255, 255, 0, 1)",borderRadius:"8rpx",color:"rgba(255, 255, 255, 1)",borderWidth:"1",width:"80%",fontSize:"28rpx",borderStyle:"solid",height:"80rpx"},on:{click:function(t){arguments[0]=t=r.$handleEvent(t),r.onSubmitTap.apply(void 0,arguments)}}},[r._v("提交")])],1)],1)],1)},n=[];e.d(t,"b",(function(){return a})),e.d(t,"c",(function(){return n})),e.d(t,"a",(function(){return i}))}}]);
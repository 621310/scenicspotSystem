(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["about"],{"0965":function(t,e,s){},"49f4":function(t,e,s){"use strict";s.r(e);var n=function(){var t=this,e=t.$createElement;t._self._c;return t._m(0)},a=[function(){var t=this,e=t.$createElement,s=t._self._c||e;return s("div",{staticClass:"MyOrder"},[s("h1",[t._v("我的订单列表")])])}],o={name:"MyOrder",components:{}},i=o,r=s("5511"),l=Object(r["a"])(i,n,a,!1,null,"04453d3f",null);e["default"]=l.exports},"57b0":function(t,e,s){"use strict";s.r(e);var n=function(){var t=this,e=t.$createElement,s=t._self._c||e;return s("div",{staticClass:"scenicList"},[s("el-row",t._l(6,(function(e,n){return s("el-col",{key:e,staticClass:"scenicItem",attrs:{span:8,offset:0}},[s("el-card",{attrs:{shadow:"hover","body-style":{padding:"0px"}}},[s("img",{staticClass:"image",attrs:{src:"https://shadow.elemecdn.com/app/element/hamburger.9cf7b091-55e9-11e9-a976-7f4d0b07eef6.png"}}),s("div",{staticClass:"card_bottom",on:{click:t.goScenicDetail}},[s("div",[s("span",[t._v("武汉市黄鹤楼")]),s("span",{staticClass:"price oldprice"},[t._v("￥998")]),s("span",{staticClass:"price"},[t._v("￥198")])]),s("div",{staticClass:"bottom clearfix"},[s("time",{staticClass:"time"},[t._v("武汉市-武昌区-蛇山西山坡特1号")]),s("el-button",{staticClass:"button",attrs:{type:"text"}},[t._v("查看详情")])],1)])])],1)})),1),s("el-row",{staticClass:"bottom_main"},[s("el-pagination",{attrs:{background:"",layout:"prev, pager, next",total:10}})],1)],1)},a=[],o={name:"scenicList",components:{},data:function(){return{currentDate:new Date}},methods:{goScenicDetail:function(){console.log("dfsa"),this.$router.push({name:"scenicDeatail"})}}},i=o,r=(s("854b"),s("5511")),l=Object(r["a"])(i,n,a,!1,null,"65f8372f",null);e["default"]=l.exports},"6f21":function(t,e,s){"use strict";s.r(e);var n=function(){var t=this,e=t.$createElement;t._self._c;return t._m(0)},a=[function(){var t=this,e=t.$createElement,s=t._self._c||e;return s("div",{staticClass:"touristsHome"},[s("h1",[t._v("我的信息")])])}],o={name:"MyMessage",components:{}},i=o,r=s("5511"),l=Object(r["a"])(i,n,a,!1,null,"4c72a777",null);e["default"]=l.exports},7486:function(t,e,s){"use strict";s.r(e);var n=function(){var t=this,e=t.$createElement,s=t._self._c||e;return s("div",{staticClass:"scenicspotHome"},[s("el-header",[s("h1",[t._v("景区管理平台")])]),s("el-row",{staticClass:"main"},[s("el-col",{attrs:{span:3}},[s("el-menu",{staticClass:"el-menu-vertical-demo",attrs:{"default-active":this.$router.path,router:""},on:{open:t.handleOpen,close:t.handleClose}},[s("el-menu-item",{attrs:{index:"/scenicList"}},[s("i",{staticClass:"el-icon-menu"}),s("span",{attrs:{slot:"title"},slot:"title"},[t._v("管理")])]),s("el-menu-item",{attrs:{index:"2"}},[s("i",{staticClass:"el-icon-s-order"}),s("span",{attrs:{slot:"title"},slot:"title"},[t._v("订单列表")])]),s("el-menu-item",{attrs:{index:"/MyMessage"}},[s("i",{staticClass:"el-icon-user-solid"}),s("span",{attrs:{slot:"title"},slot:"title"},[t._v("我的信息")])])],1)],1),s("el-col",{attrs:{span:21}},[s("transition",{attrs:{name:"fade",mode:"in-out"}},[s("router-view")],1)],1)],1)],1)},a=[],o={name:"scenicspotHome",components:{},data:function(){return{}},methods:{handleOpen:function(t,e){console.log(t,e)},handleClose:function(t,e){console.log(t,e)}}},i=o,r=(s("957b"),s("5511")),l=Object(r["a"])(i,n,a,!1,null,"6593bb64",null);e["default"]=l.exports},"7bc2":function(t,e,s){"use strict";s.r(e);var n=function(){var t=this,e=t.$createElement,s=t._self._c||e;return s("div",{staticClass:"touristsHome"},[s("el-header",[s("h1",[t._v("欢迎！")])]),s("el-row",{staticClass:"main"},[s("el-col",{attrs:{span:3}},[s("el-menu",{staticClass:"el-menu-vertical-demo",attrs:{"default-active":this.$router.path,router:""},on:{open:t.handleOpen,close:t.handleClose}},[s("el-menu-item",{attrs:{index:"/scenicList"}},[s("i",{staticClass:"el-icon-menu"}),s("span",{attrs:{slot:"title"},slot:"title"},[t._v("首页")])]),s("el-menu-item",{attrs:{index:"/MyOrder"}},[s("i",{staticClass:"el-icon-s-order"}),s("span",{attrs:{slot:"title"},slot:"title"},[t._v("我的订单")])]),s("el-menu-item",{attrs:{index:"/MyMessage"}},[s("i",{staticClass:"el-icon-user-solid"}),s("span",{attrs:{slot:"title"},slot:"title"},[t._v("我的信息")])])],1)],1),s("el-col",{attrs:{span:21}},[s("transition",{attrs:{name:"fade",mode:"in-out"}},[s("router-view")],1)],1)],1)],1)},a=[],o={name:"touristsHome",components:{},data:function(){return{}},mounted:function(){},methods:{handleOpen:function(t,e){console.log(t,e)},handleClose:function(t,e){console.log(t,e)}}},i=o,r=(s("9693"),s("5511")),l=Object(r["a"])(i,n,a,!1,null,"213e8dc8",null);e["default"]=l.exports},"821b":function(t,e,s){},8474:function(t,e,s){"use strict";s.r(e);var n=function(){var t=this,e=t.$createElement,s=t._self._c||e;return s("div",[s("el-carousel",{attrs:{"indicator-position":"outside"}},t._l(4,(function(e){return s("el-carousel-item",{key:e},[s("h3",[t._v(t._s(e))])])})),1)],1)},a=[],o={name:"scenicDeatail"},i=o,r=(s("c5a8"),s("5511")),l=Object(r["a"])(i,n,a,!1,null,"3ca3d9f5",null);e["default"]=l.exports},"854b":function(t,e,s){"use strict";var n=s("0965"),a=s.n(n);a.a},"8bc0":function(t,e,s){},"957b":function(t,e,s){"use strict";var n=s("821b"),a=s.n(n);a.a},9693:function(t,e,s){"use strict";var n=s("d776"),a=s.n(n);a.a},a55b:function(t,e,s){"use strict";s.r(e);var n=function(){var t=this,e=t.$createElement,s=t._self._c||e;return s("div",{staticClass:"login"},[s("h1",{staticStyle:{color:"white"}},[t._v("景区订票系统")]),s("div",{staticClass:"panpel"},[s("h2",[t._v("用户登录")]),s("div",{staticClass:"from_input"},[s("el-form",{ref:"form",attrs:{rules:t.rules,model:t.form,"label-width":"80px"}},[s("el-form-item",{attrs:{label:"用户",prop:"phone"}},[s("el-input",{model:{value:t.form.phone,callback:function(e){t.$set(t.form,"phone",e)},expression:"form.phone"}})],1),s("el-form-item",{attrs:{label:"密码",prop:"password"}},[s("el-input",{attrs:{type:"password"},model:{value:t.form.password,callback:function(e){t.$set(t.form,"password",e)},expression:"form.password"}})],1),s("el-form-item",[s("el-button",{attrs:{type:"primary"},on:{click:t.onLogin}},[t._v("登陆")]),s("el-button",{attrs:{type:"primary"},on:{click:t.onLogin2}},[t._v("登陆")]),s("el-button",[t._v("注册")])],1)],1)],1)])])},a=[],o={name:"Login",components:{},data:function(){return{form:{phone:"",password:""},rules:{name:[{required:!0,message:"请输入手机号/邮箱",trigger:"blur"}],password:[{required:!0,message:"请输入密码",trigger:"blur"}]}}},methods:{onLogin:function(){var t=this;this.$axios({method:"post",url:"/api/getUserInfo",data:this.form}).then((function(e){console.log(e),"200"===e.data.code?(t.$message({showClose:!0,message:"登陆成功",type:"success"}),t.$router.push({name:"touristsHome"})):t.$message({showClose:!0,message:"账号或密码错误！",type:"error"})})).catch((function(t){console.log(t)}))},onLogin2:function(){this.$router.push({name:"scenicspotHome"})}}},i=o,r=(s("add8"),s("5511")),l=Object(r["a"])(i,n,a,!1,null,"3d39618e",null);e["default"]=l.exports},add8:function(t,e,s){"use strict";var n=s("f707"),a=s.n(n);a.a},c5a8:function(t,e,s){"use strict";var n=s("8bc0"),a=s.n(n);a.a},d776:function(t,e,s){},f707:function(t,e,s){}}]);
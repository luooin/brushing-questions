(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-news-list"],{"23ae":function(t,e,i){"use strict";var n={"mescroll-uni":i("f05e").default},r=function(){var t=this,e=t.$createElement,i=t._self._c||e;return i("mescroll-uni",{attrs:{up:t.upOption,down:t.downOption},on:{init:function(e){arguments[0]=e=t.$handleEvent(e),t.mescrollInit.apply(void 0,arguments)},down:function(e){arguments[0]=e=t.$handleEvent(e),t.downCallback.apply(void 0,arguments)},up:function(e){arguments[0]=e=t.$handleEvent(e),t.upCallback.apply(void 0,arguments)}}},[i("v-uni-view",{staticClass:"content"},[i("v-uni-view",{style:{width:"100%",padding:"0",position:"relative",background:"#F2F2F2",height:"auto"}},[i("v-uni-view",{staticClass:"cu-bar bg-white search",style:{width:"100%",padding:"20rpx 24rpx 0",background:"none",display:"flex",height:"auto"}},[t.queryList.length>1?i("v-uni-picker",{attrs:{mode:"selector",range:t.queryList,"range-key":"queryName",value:t.queryIndex},on:{change:function(e){arguments[0]=e=t.$handleEvent(e),t.queryChange.apply(void 0,arguments)}}},[i("v-uni-view",{style:{width:"40rpx",height:"auto"}},[i("v-uni-text",{staticClass:"icon iconfont icon-jiantou18",style:{width:"40rpx",fontSize:"40rpx",lineHeight:"80rpx",color:"#666"}})],1)],1):t._e(),0==t.queryIndex?i("v-uni-view",{staticClass:"search-form round",style:{margin:"0 0 0 12rpx",flex:"1",position:"relative"}},[i("v-uni-text",{staticClass:"icon iconfont icon-fangdajing07",style:{color:"rgb(153, 153, 153)",left:"0px",textAlign:"center",width:"80rpx",fontSize:"40rpx",lineHeight:"80rpx",position:"absolute",right:"0px"}}),i("v-uni-input",{style:{border:"0",padding:"12rpx 20rpx 12rpx 80rpx",color:"#333",borderRadius:"10rpx",background:"#F8F8F8",width:"100%",lineHeight:"56rpx",fontSize:"28rpx",height:"80rpx"},attrs:{type:"text",placeholder:"标题"},model:{value:t.searchForm.title,callback:function(e){t.$set(t.searchForm,"title",e)},expression:"searchForm.title"}})],1):t._e(),i("v-uni-button",{staticClass:"cu-btn shadow-blur round",style:{border:"0",padding:"0px",margin:"0 0 0 -136rpx",color:"#fff",borderRadius:"10rpx",background:"#000000",width:"136rpx",lineHeight:"80rpx",fontSize:"28rpx",height:"80rpx",zIndex:"1"},on:{click:function(e){arguments[0]=e=t.$handleEvent(e),t.search.apply(void 0,arguments)}}},[t._v("搜索")])],1),i("v-uni-view",{style:{margin:"20rpx 14rpx",flexWrap:"wrap",justifyContent:"center",display:"flex"}},[i("v-uni-view",{style:{border:"0",padding:"0 40rpx",margin:"0 10rpx",outline:"0",borderRadius:"0",background:"#FEB800",display:"flex",clipPath:"polygon(0 0, 0 70%, 50% 100%,100% 70%, 100% 0 , 0% 0)"},on:{click:function(e){arguments[0]=e=t.$handleEvent(e),t.sortClick("clicknum")}}},[i("v-uni-text",{style:{color:"#333",lineHeight:"80rpx",fontSize:"24rpx"}},[t._v("点击量")]),"clicknum"!=t.listSort||"clicknum"==t.listSort&&"asc"==t.listOrder||"clicknum"==t.listSort&&"desc"==t.listOrder?i("v-uni-text",{staticClass:"icon iconfont icon-xiaoliang13",style:{margin:"0 0 0 10rpx",lineHeight:"80rpx",fontSize:"24rpx",color:"#333"}}):t._e()],1),i("v-uni-view",{style:{border:"0",padding:"0 40rpx",margin:"0 10rpx",outline:"0",borderRadius:"0",background:"#FEB800",display:"flex",clipPath:"polygon(0 0, 0 70%, 50% 100%,100% 70%, 100% 0 , 0% 0)"},on:{click:function(e){arguments[0]=e=t.$handleEvent(e),t.sortClick("addtime")}}},[i("v-uni-text",{style:{color:"#333",lineHeight:"80rpx",fontSize:"24rpx"}},[t._v("按日期")]),"addtime"!=t.listSort||"addtime"==t.listSort&&"asc"==t.listOrder||"addtime"==t.listSort&&"desc"==t.listOrder?i("v-uni-text",{staticClass:"icon iconfont icon-shijian18",style:{margin:"0 0 0 10rpx",lineHeight:"80rpx",fontSize:"24rpx",color:"#333"}}):t._e()],1)],1),i("v-uni-view",{style:{width:"100%",flexWrap:"wrap",background:"none",display:"flex",height:"auto"}},[i("v-uni-scroll-view",{staticClass:"category-two",style:{width:"140rpx",background:"#000",height:"auto"},attrs:{"scroll-y":"true"}},t._l(t.categoryList,(function(e,n){return i("v-uni-view",{key:n,staticClass:"tab",class:t.categoryName===e.typename?"active":"",on:{click:function(i){arguments[0]=i=t.$handleEvent(i),t.categoryClick(e.typename)}}},[t._v(t._s(e.typename))])})),1),i("v-uni-view",{staticClass:"news-box3",style:{padding:"90rpx 20rpx 20rpx",margin:"0",borderRadius:"10rpx",background:"linear-gradient(136deg, #D8D8D8 0%, #343838 0%, #000000 100%)",flex:"1",width:"calc(100% - 160rpx)",backgroundSize:"100% 100%",backgroundPosition:"center center",backgroundRepeat:"no-repeat",height:"auto"}},t._l(t.list,(function(e,n){return i("v-uni-view",{key:n,staticClass:"list-item",style:{padding:"8rpx 40rpx",margin:"0",borderColor:"#000",borderRadius:"0",flexWrap:"wrap",borderWidth:"0 0 2rpx 0",background:"#fff",display:"flex",width:"100%",position:"relative",borderStyle:"solid",height:"auto"},on:{click:function(i){arguments[0]=i=t.$handleEvent(i),t.onDetailTap(e)}}},[i("v-uni-view",{staticClass:"dian",style:{padding:"0",boxShadow:"none",margin:"0",backgroundColor:"rgba(255,0,0,1)",top:"10%",left:"16rpx",width:"6rpx",position:"absolute",height:"80%"}}),i("v-uni-view",{staticClass:"title ",style:{padding:"0 10rpx",whiteSpace:"nowrap",overflow:"hidden",color:"#000",width:"100%",lineHeight:"72rpx",fontSize:"30rpx",textOverflow:"ellipsis",order:"1"}},[t._v(t._s(e.title))]),i("v-uni-view",{style:{width:"100%",padding:"0 10rpx",order:"2"}},[i("v-uni-text",{staticClass:"icon iconfont icon-shijian21",style:{margin:"0 4rpx 0 0",lineHeight:"1.5",fontSize:"20rpx",color:"#6C6C6C"}}),i("v-uni-text",{style:{color:"#6C6C6C",lineHeight:"1.5",fontSize:"20rpx"}},[t._v(t._s(e.addtime))])],1),i("v-uni-view",{style:{width:"100%",padding:"0 10rpx",display:"inline-block",order:"3"}},[i("v-uni-text",{staticClass:"icon iconfont icon-geren16",style:{margin:"0 4rpx 0 0",lineHeight:"1.5",fontSize:"20rpx",color:"#6C6C6C"}}),i("v-uni-text",{style:{color:"#6C6C6C",lineHeight:"1.5",fontSize:"20rpx"}},[t._v(t._s(e.name))])],1),i("v-uni-view",{style:{padding:"0 10rpx",display:"inline-block",order:"4"}},[i("v-uni-text",{staticClass:"icon iconfont icon-zan10",style:{margin:"0 4rpx 0 0",lineHeight:"1.5",fontSize:"20rpx",color:"#6C6C6C"}}),i("v-uni-text",{style:{color:"#6C6C6C",lineHeight:"1.5",fontSize:"20rpx"}},[t._v(t._s(e.thumbsupnum))])],1),i("v-uni-view",{style:{padding:"0 10rpx",display:"inline-block",order:"5"}},[i("v-uni-text",{staticClass:"icon iconfont icon-shoucang10",style:{margin:"0 4rpx 0 0",lineHeight:"1.5",fontSize:"20rpx",color:"#6C6C6C"}}),i("v-uni-text",{style:{color:"#6C6C6C",lineHeight:"1.5",fontSize:"20rpx"}},[t._v(t._s(e.storeupnum))])],1),i("v-uni-view",{style:{padding:"0 10rpx",display:"inline-block",order:"6"}},[i("v-uni-text",{staticClass:"icon iconfont icon-chakan9",style:{margin:"0 4rpx 0 0",lineHeight:"1.5",fontSize:"20rpx",color:"#6C6C6C"}}),i("v-uni-text",{style:{color:"#6C6C6C",lineHeight:"1.5",fontSize:"20rpx"}},[t._v(t._s(e.clicknum))])],1),i("v-uni-view",{staticClass:"cuIcon-right",style:{padding:"0",margin:"-36rpx 0 0 0",top:"50%",color:"#000",width:"32rpx",lineHeight:"72rpx",fontSize:"32rpx",position:"absolute",right:"0"}})],1)})),1)],1)],1),t.userid&&t.isAuth("news","新增")?i("v-uni-button",{staticClass:"add-btn",style:{border:"0",boxShadow:"0 2rpx 12rpx rgba(0,0,0,.3)",color:"rgb(255, 255, 255)",bottom:"80rpx",right:"8rpx",outline:"none",borderRadius:"100%",background:"#FEB800",width:"80rpx",lineHeight:"80rpx",fontSize:"28rpx",position:"absolute",height:"80rpx",zIndex:"999"},on:{click:function(e){arguments[0]=e=t.$handleEvent(e),t.onAddTap()}}},[t._v("新增")]):t._e(),!t.userid&&t.isAuthFront("news","新增")?i("v-uni-button",{staticClass:"add-btn",style:{border:"0",boxShadow:"0 2rpx 12rpx rgba(0,0,0,.3)",color:"rgb(255, 255, 255)",bottom:"80rpx",right:"8rpx",outline:"none",borderRadius:"100%",background:"#FEB800",width:"80rpx",lineHeight:"80rpx",fontSize:"28rpx",position:"absolute",height:"80rpx",zIndex:"999"},on:{click:function(e){arguments[0]=e=t.$handleEvent(e),t.onAddTap()}}},[t._v("新增")]):t._e()],1)],1)},s=[];i.d(e,"b",(function(){return r})),i.d(e,"c",(function(){return s})),i.d(e,"a",(function(){return n}))},"2da7":function(t,e,i){"use strict";var n=i("aa5e"),r=i.n(n);r.a},"38fde":function(t,e,i){"use strict";var n=i("4ea4");Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0,i("c5f6"),i("386d"),i("55dd"),i("96cf");var r=n(i("3b8d")),s={data:function(){return{btnColor:["#409eff","#67c23a","#909399","#e6a23c","#f56c6c","#356c6c","#351c6c","#f093a9","#a7c23a","#104eff","#10441f","#a21233","#503319"],clicknumColor:["#409eff","#67c23a","#909399","#e6a23c","#f56c6c","#356c6c","#351c6c","#f093a9","#a7c23a","#104eff","#10441f","#a21233","#503319"],queryList:[{queryName:"标题"}],queryIndex:0,list:[],lists:[],userid:"",mescroll:null,downOption:{auto:!1},upOption:{noMoreSize:5,textNoMore:"~ 没有更多了 ~"},hasNext:!0,searchForm:{},categoryList:[],categoryName:"全部",CustomBar:"0",listSort:"id",listOrder:"desc"}},watch:{},mounted:function(){},computed:{baseUrl:function(){return this.$base.url}},onShow:function(){var t=(0,r.default)(regeneratorRuntime.mark((function t(){var e;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(this.btnColor=this.btnColor.sort((function(){return.5-Math.random()})),this.clicknumColor=this.clicknumColor.sort((function(){return.5-Math.random()})),e={},!this.userid){t.next=9;break}return t.next=6,this.$api.page("newstype",{page:1,limit:100});case 6:e=t.sent,t.next=12;break;case 9:return t.next=11,this.$api.list("newstype",{page:1,limit:100});case 11:e=t.sent;case 12:e.data.list.splice(0,0,{id:0,typename:"全部"}),this.categoryList=e.data.list,this.hasNext=!0,this.mescroll&&this.mescroll.resetUpScroll();case 16:case"end":return t.stop()}}),t,this)})));function e(){return t.apply(this,arguments)}return e}(),onLoad:function(t){t.userid?this.userid=t.userid:this.userid="",this.hasNext=!0,this.mescroll&&this.mescroll.resetUpScroll()},components:{},methods:{uGetRect:function(t,e){var i=this;return new Promise((function(n){uni.createSelectorQuery().in(i)[e?"selectAll":"select"](t).boundingClientRect((function(t){e&&Array.isArray(t)&&t.length&&n(t),!e&&t&&n(t)})).exec()}))},cloneData:function(t){return JSON.parse(JSON.stringify(t))},sortClick:function(t){this.listSort==t?"desc"==this.listOrder?this.listOrder="asc":this.listOrder="desc":(this.listSort=t,this.listOrder="desc"),this.search()},priceChange:function(t){return Number(t).toFixed(2)},preHttp:function(t){return t&&"http"==t.substr(0,4)},queryChange:function(t){this.queryIndex=t.detail.value,this.searchForm.title=""},categoryClick:function(t){this.categoryName=t,this.mescroll.resetUpScroll()},mescrollInit:function(t){this.mescroll=t},downCallback:function(t){this.hasNext=!0,t.resetUpScroll()},upCallback:function(){var t=(0,r.default)(regeneratorRuntime.mark((function t(e){var i,n,r,s,o;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(i={page:e.num,limit:e.size},i["sort"]=this.listSort,i["order"]=this.listOrder,"全部"!=this.categoryName&&(i.typename=this.categoryName),this.searchForm.title&&(i["title"]="%"+this.searchForm.title+"%"),uni.getStorageSync("appUserid")?JSON.parse(uni.getStorageSync("userSession")):{},n={},!this.userid){t.next=13;break}return t.next=10,this.$api.page("news",i);case 10:n=t.sent,t.next=16;break;case 13:return t.next=15,this.$api.list("news",i);case 15:n=t.sent;case 16:for(1==e.num&&(this.list=[]),this.list=this.list.concat(n.data.list),this.$forceUpdate(),r=Math.ceil(this.list.length/6),s=[],o=0;o<r;o++)s[o]=this.list.slice(6*o,6*(o+1));this.lists=s,0==n.data.list.length&&(this.hasNext=!1),e.endSuccess(e.size,this.hasNext);case 25:case"end":return t.stop()}}),t,this)})));function e(e){return t.apply(this,arguments)}return e}(),onDetailTap:function(t){uni.setStorageSync("useridTag",this.userid),this.$utils.jump("../news-detail/news-detail?id=".concat(t.id))},onUpdate:function(t){this.onUpdateTap(t.currentTarget.dataset.row)},onUpdateTap:function(t){uni.setStorageSync("useridTag",this.userid),this.$utils.jump("./add-or-update?id=".concat(t.id))},onAddTap:function(){uni.setStorageSync("useridTag",this.userid),this.$utils.jump("./add-or-update")},onDelete:function(t){this.onDeleteTap(t.currentTarget.dataset.row.id)},onDeleteTap:function(t){var e=this;uni.showModal({title:"提示",content:"是否确认删除",success:function(){var i=(0,r.default)(regeneratorRuntime.mark((function i(n){var r,s,o;return regeneratorRuntime.wrap((function(i){while(1)switch(i.prev=i.next){case 0:if(!n.confirm){i.next=14;break}return i.next=3,e.$api.del("news",JSON.stringify([t]));case 3:return i.next=5,e.$api.list("storeup",{page:1,limit:100,tablename:"news",refid:t});case 5:if(r=i.sent,!r.data.list.length){i.next=11;break}for(o in s=[],r.data.list)s.push(r.data.list[o].id);return i.next=11,e.$api.del("storeup",JSON.stringify(s));case 11:this.$utils.msg("删除成功"),e.hasNext=!0,e.search();case 14:case"end":return i.stop()}}),i,this)})));function n(t){return i.apply(this,arguments)}return n}()})},search:function(){var t=(0,r.default)(regeneratorRuntime.mark((function t(){var e,i,n,r,s;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(this.mescroll.num=1,e={page:this.mescroll.num,limit:this.mescroll.size},e["sort"]=this.listSort,e["order"]=this.listOrder,this.searchForm.title&&(e["title"]="%"+this.searchForm.title+"%"),i={},!this.userid){t.next=12;break}return t.next=9,this.$api.page("news",e);case 9:i=t.sent,t.next=15;break;case 12:return t.next=14,this.$api.list("news",e);case 14:i=t.sent;case 15:for(1==this.mescroll.num&&(this.list=[]),this.list=this.list.concat(i.data.list),n=Math.ceil(this.list.length/6),r=[],s=0;s<n;s++)r[s]=this.list.slice(6*s,6*(s+1));this.lists=r,0==i.data.list.length&&(this.hasNext=!1),this.mescroll.endSuccess(this.mescroll.size,this.hasNext);case 23:case"end":return t.stop()}}),t,this)})));function e(){return t.apply(this,arguments)}return e}()}};e.default=s},"4c1e":function(t,e,i){var n=i("24fb");e=n(!1),e.push([t.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.content[data-v-cbd6b406]{min-height:calc(100vh - 44px);box-sizing:border-box}.category-one .tab[data-v-cbd6b406]{cursor:pointer;padding:0 %?20?%;color:#fff;background:red;display:inline-block;width:auto;font-size:%?28?%;line-height:%?80?%}.category-one .tab.active[data-v-cbd6b406]{cursor:pointer;padding:0 %?20?%;color:#fff;background:#000;display:inline-block;width:auto;font-size:%?28?%;line-height:%?80?%}.category-two .tab[data-v-cbd6b406]{cursor:pointer;padding:0;color:#fff;background:#000;display:inline-block;width:100%;font-size:%?28?%;line-height:%?100?%;text-align:center}.category-two .tab.active[data-v-cbd6b406]{cursor:pointer;padding:0;-webkit-clip-path:polygon(0 0,0 80%,50% 100%,100% 80%,100% 0,0 0);clip-path:polygon(0 0,0 80%,50% 100%,100% 80%,100% 0,0 0);color:#fff;background:#feb800;display:inline-block;width:100%;font-size:%?28?%;line-height:%?100?%;text-align:center}.category-three .tab[data-v-cbd6b406]{cursor:pointer;padding:0;color:#fff;background:#deb887;display:inline-block;width:100%;font-size:%?28?%;line-height:%?80?%;text-align:center}.category-three .tab.active[data-v-cbd6b406]{cursor:pointer;padding:0;color:#fff;background:#000;display:inline-block;width:100%;font-size:%?28?%;line-height:%?80?%;text-align:center}',""]),t.exports=e},"7f0c":function(t,e,i){"use strict";i.r(e);var n=i("38fde"),r=i.n(n);for(var s in n)"default"!==s&&function(t){i.d(e,t,(function(){return n[t]}))}(s);e["default"]=r.a},aa5e:function(t,e,i){var n=i("4c1e");"string"===typeof n&&(n=[[t.i,n,""]]),n.locals&&(t.exports=n.locals);var r=i("4f06").default;r("d503f846",n,!0,{sourceMap:!1,shadowMode:!1})},cca8:function(t,e,i){"use strict";i.r(e);var n=i("23ae"),r=i("7f0c");for(var s in r)"default"!==s&&function(t){i.d(e,t,(function(){return r[t]}))}(s);i("2da7");var o,a=i("f0c5"),l=Object(a["a"])(r["default"],n["b"],n["c"],!1,null,"cbd6b406",null,!1,n["a"],o);e["default"]=l.exports}}]);
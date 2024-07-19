<template>
<view class="content">
	<view :style='{"width":"100%","flexWrap":"wrap","background":"#F2F2F2","display":"flex","height":"auto"}'>
		<swiper :style='{"width":"100%","background":"#fff","height":"340rpx","order":"1"}' class="swiper" :indicator-dots='false' :autoplay='false' :circular='false' indicator-active-color='#000000' indicator-color='rgba(0, 0, 0, .3)' :duration='500' :interval='5000' :vertical='false'>
			<swiper-item :style='{"width":"100%","background":"#fff","height":"360rpx"}' v-for="(swiper,index) in swiperList" :key="index" @tap="onSwiperTap(swiper)">
				<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"360rpx"}' mode="aspectFill" :src="baseUrl+swiper.img"></image>
				<view v-if="false" :style='{"width":"100%","padding":"0 8rpx","lineHeight":"60rpx","fontSize":"28rpx","color":"#333","background":"#fff"}'>{{ swiper.title }}</view>
			</swiper-item>
		</swiper>
		<!-- menu -->
		<view v-if="true" class="menu" :style='{"padding":"0 10rpx","margin":"40rpx 0","flexWrap":"wrap","background":"none","display":"flex","width":"100%","justifyContent":"flex-start","height":"auto","order":"3"}'>
            <block v-for="(item,index1) in menuList" v-bind:key="item.roleName">
                <block v-if="index1==0" v-bind:key="index" v-for=" (menu,index) in item.frontMenu">
                    <block v-bind:key="sort" v-for=" (child,sort) in menu.child">
                        <block v-bind:key="sort2" v-for=" (button,sort2) in child.buttons">
                            <view :style='{"padding":"20rpx 0","margin":"6rpx","alignItems":"center","borderRadius":"10rpx","background":"linear-gradient(180deg, #FFEDED 0%, #FFFFFF 100%)","display":"flex","width":"calc(100% / 4 - 12rpx)","justifyContent":"center","height":"auto"}' class="menu-list" v-if="button=='查看' && child.tableName!='yifahuodingdan' && child.tableName!='yituikuandingdan' &&child.tableName!='yiquxiaodingdan' && child.tableName!='weizhifudingdan' && child.tableName!='yizhifudingdan' && child.tableName!='yiwanchengdingdan' " @tap="onPageTap2('../'+child.tableName+'/list')">
                                <view class="iconarr" :class="child.appFrontIcon" :style='{"padding":"0","margin":"0px 0","color":"#D2102C","borderRadius":"100%","background":"none","display":"inline-block","width":"auto","fontSize":"36rpx","fontWeight":"bold"}'></view>
                                <view :style='{"padding":"0","margin":"0 0 0 6rpx","color":"#000","textAlign":"left","width":"auto","lineHeight":"28rpx","fontSize":"28rpx"}'>{{child.menu.split("列表")[0]}}</view>
                            </view>
                        </block>
                    </block>
                </block>
            </block>
		</view>
		<!-- menu -->
		<!-- 关于我们 -->
		<view :style='{"padding":"0 40rpx 40rpx","margin":"0 auto 20rpx","flexWrap":"wrap","background-color":"rgba(255,137,28,0.2)","display":"flex","width":"calc(100% - 40rpx)","backgroundSize":"100% 100%","backgroundPosition":"center center","backgroundRepeat":"no-repeat","height":"auto","order":"7"}'>
			<view :style='{"width":"50%","lineHeight":"88rpx","fontSize":"40rpx","color":"#000","textAlign":"left","order":"1"}'>{{aboutUsDetail.title}}</view>
			<view :style='{"margin":"0 0 20rpx","color":"#999","textAlign":"center","display":"none","width":"50%","lineHeight":"1.5","fontSize":"32rpx","order":"2"}'>{{aboutUsDetail.subtitle}}</view>
			<view :style='{"width":"100%","padding":"0 0","flexWrap":"wrap","display":"flex","height":"auto","order":"4"}'>
				<img :style='{"margin":"0 0","objectFit":"cover","borderRadius":"10rpx","flex":1,"display":"block","height":"200rpx"}' v-if="aboutUsDetail.picture1" :src="baseUrl+aboutUsDetail.picture1">
				<img :style='{"margin":"0 10rpx","objectFit":"cover","flex":1,"display":"none","height":"160rpx"}' v-if="aboutUsDetail.picture2" :src="baseUrl+aboutUsDetail.picture2">
				<img :style='{"margin":"0 10rpx","objectFit":"cover","flex":1,"display":"none","height":"160rpx"}' v-if="aboutUsDetail.picture3" :src="baseUrl+aboutUsDetail.picture3">
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 0 0","overflow":"hidden","color":"#000","display":"-webkit-box","width":"100%","lineHeight":"2","fontSize":"28rpx","textOverflow":"ellipsis","-webkit-box-orient":"vertical","-webkit-line-clamp":"4","order":"3"}' v-html="aboutUsDetail.content"></view>
			<view :style='{"border":"0","padding":"0 30rpx","margin":"0 auto","textAlign":"center","background":"#409EFF","display":"none","width":"auto","lineHeight":"56rpx"}'>
			  <text :style='{"color":"#f5f5f5","fontSize":"24rpx"}'>更多</text>
			  <text class="icon iconfont icon-gengduo1" :style='{"color":"#f5f5f5","fontSize":"24rpx"}'></text>
			</view>
			<view :style='{"width":"50%","background-color":"rgba(255,137,28,0.2)","display":"none","height":"160rpx"}' />
			<view :style='{"width":"50%","background-color":"rgba(255,137,28,0.2)","display":"none","height":"160rpx"}' />
		</view>
		<!-- 系统简介 -->
		<view :style='{"padding":"0 40rpx 40rpx","margin":"0 auto 20rpx","flexWrap":"wrap","background-color":"rgba(255,137,28,0.2)","display":"flex","width":"calc(100% - 40rpx)","backgroundSize":"100% 100%","backgroundPosition":"center center","backgroundRepeat":"no-repeat","height":"auto","order":"5"}'>
			<view :style='{"width":"50%","lineHeight":"88rpx","fontSize":"40rpx","color":"#000","textAlign":"left","order":"1"}'>{{systemIntroductionDetail.title}}</view>
			<view :style='{"margin":"0 0 20rpx","color":"#999","textAlign":"center","display":"none","width":"100%","lineHeight":"1.5","fontSize":"32rpx"}'>{{systemIntroductionDetail.subtitle}}</view>
			<view :style='{"width":"100%","padding":"0 0","flexWrap":"wrap","display":"flex","height":"auto","order":"3"}'>
				<img :style='{"margin":"0 0","objectFit":"cover","borderRadius":"10rpx","flex":1,"display":"block","height":"200rpx"}' v-if="systemIntroductionDetail.picture1" :src="baseUrl+systemIntroductionDetail.picture1">
				<img :style='{"margin":"0 10rpx","objectFit":"cover","flex":1,"display":"none","height":"160rpx"}' v-if="systemIntroductionDetail.picture2" :src="baseUrl+systemIntroductionDetail.picture2">
				<img :style='{"margin":"0 10rpx","objectFit":"cover","flex":1,"display":"none","height":"160rpx"}' v-if="systemIntroductionDetail.picture3" :src="baseUrl+systemIntroductionDetail.picture3">
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0","overflow":"hidden","color":"#000","display":"-webkit-box","width":"100%","lineHeight":"2","fontSize":"28rpx","textOverflow":"ellipsis","-webkit-box-orient":"vertical","-webkit-line-clamp":"4","order":"2"}' v-html="systemIntroductionDetail.content"></view>
			<view :style='{"border":"0","padding":"0 30rpx","margin":"0 auto","textAlign":"center","background":"#409EFF","display":"none","width":"auto","lineHeight":"56rpx"}'>
			  <text :style='{"color":"#f5f5f5","fontSize":"24rpx"}'>更多</text>
			  <text class="icon iconfont icon-gengduo1" :style='{"color":"#f5f5f5","fontSize":"24rpx"}'></text>
			</view>
			<view :style='{"width":"50%","background-color":"rgba(255,137,28,0.2)","display":"none","height":"160rpx"}' />
			<view :style='{"width":"50%","background-color":"rgba(255,137,28,0.2)","display":"none","height":"160rpx"}' />
		</view>
		<!-- 商品推荐 -->
		<!-- 商品推荐 -->
		
		<!-- 商品列表 -->
		<view class="listBox list" :style='{"width":"calc(100% - 40rpx)","margin":"0 auto 20rpx","borderRadius":"10rpx","background":"#fff","order":"8"}'>
			<view class="title" :style='{"padding":"0 60rpx","margin":"30rpx auto","background":"url(http://codegen.caihongy.cn/20240104/ed7990985d1c41acb03b95199e7eb367.png)","display":"flex","width":"70%","backgroundSize":"100% 100%","backgroundPosition":"center center","backgroundRepeat":"no-repeat","justifyContent":"space-between"}'>
				<view :style='{"color":"#fff","fontSize":"32rpx","lineHeight":"88rpx"}'>资料信息</view>
				<view :style='{"alignItems":"center","justifyContent":"center","display":"flex"}' @tap="onPageTap('ziliaoxinxi')">
				  <text :style='{"color":"#fff","fontSize":"28rpx"}'>更多</text>
				  <text class="icon iconfont icon-gengduo1" :style='{"color":"#fff","fontSize":"28rpx"}'></text>
				</view>
			</view>
		  <!-- 样式1 -->
		  <view class="list-box style1" :style='{"padding":"0 24rpx","margin":"0","flexWrap":"wrap","display":"flex","width":"100%","justifyContent":"space-between","height":"auto"}'>
			<view @tap="onDetailTap('ziliaoxinxi',product.id)" v-for="(product,index) in homeziliaoxinxilist" :key="index" class="list-item" :style='{"boxShadow":"none","padding":"0 20rpx 20rpx","margin":"0 0 20rpx","alignItems":"center","display":"flex","justifyContent":"center","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20240104/f251fe8ff5ac4c80afbbaad725ab3bbb.png)","width":"48%","backgroundSize":"100% 100%","backgroundPosition":"center center","backgroundRepeat":"no-repeat","height":"auto"}'>
			  <view :style='{"padding":"4rpx 20rpx","overflow":"hidden","whiteSpace":"nowrap","color":"#000","textAlign":"center","width":"100%","lineHeight":"1.8","fontSize":"28rpx","textOverflow":"ellipsis"}' class="list-item-title ">{{product.ziliaomingcheng}}</view>
			  <view :style='{"padding":"4rpx 20rpx","overflow":"hidden","whiteSpace":"nowrap","color":"#000","textAlign":"center","width":"100%","lineHeight":"1.8","fontSize":"28rpx","textOverflow":"ellipsis"}' class="list-item-title ">{{product.ziliaofenlei}}</view>
			  <image :style='{"width":"80%","margin":"0","objectFit":"cover","display":"block","height":"190rpx"}' class="list-item-image" mode="aspectFill" v-if="product.ziliaofengmian.substring(0,4)=='http'" :src="product.ziliaofengmian"></image>
			  <image :style='{"width":"80%","margin":"0","objectFit":"cover","display":"block","height":"190rpx"}' class="list-item-image" mode="aspectFill" v-else :src="product.ziliaofengmian?baseUrl+product.ziliaofengmian.split(',')[0]:''"></image>
			  <view :style='{"padding":"4rpx 20rpx","overflow":"hidden","whiteSpace":"nowrap","color":"#000","textAlign":"center","width":"100%","lineHeight":"1.8","fontSize":"28rpx","textOverflow":"ellipsis"}' class="list-item-title ">{{product.jiangshi}}</view>
			  <view :style='{"width":"100%","padding":"0 10rpx","textAlign":"center"}'>
			    <text class="icon iconfont icon-shijian21" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"20rpx","color":"#323636"}'></text>
			    <text :style='{"color":"#323636","lineHeight":"1.5","fontSize":"20rpx"}'>{{product.addtime}}</text>
			  </view>
			  <view :style='{"padding":"0 10rpx"}'>
			    <text class="icon iconfont icon-shoucang10" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"20rpx","color":"#323636"}'></text>
			    <text :style='{"color":"#323636","lineHeight":"1.5","fontSize":"20rpx"}'>{{product.storeupnum}}</text>
			  </view>
			</view>
		  </view>
		</view>
		<!-- 商品列表 -->
		<!-- 新闻资讯 -->
		<view class="listBox news" :style='{"margin":"0 auto 20rpx","background-color":"rgba(255,137,28,0.2)","width":"calc(100% - 40rpx)","backgroundSize":"100% 100%","backgroundPosition":"center center","backgroundRepeat":"no-repeat","order":"4"}'>
			<view class="title" :style='{"width":"100%","padding":"0 72rpx","margin":"0","background":"none","justifyContent":"space-between","display":"flex"}'>
				<view :style='{"fontSize":"32rpx","lineHeight":"88rpx","color":"#000","fontWeight":"bold"}'>公告资讯</view>
				<view :style='{"alignItems":"center","justifyContent":"center","display":"flex"}' @tap="onPageTap('news')">
				  <text :style='{"color":"#000","fontSize":"28rpx"}'>查看更多</text>
				  <text class="icon iconfont icon-gengduo1" :style='{"color":"#000","fontSize":"28rpx"}'></text>
				</view>
			</view>
		  <!-- 样式6 -->
		  <view class="news-box3" :style='{"width":"100%","padding":"20rpx 30rpx","margin":"0","height":"auto"}'>
			<view @tap="onNewsDetailTap(item.id)" v-for="(item,index) in news" :key="index" class="list-item" :style='{"padding":"8rpx 40rpx","margin":"0","borderColor":"#0F1111","borderRadius":"0","flexWrap":"wrap","borderWidth":"0 0 2rpx 0","display":"flex","width":"100%","position":"relative","borderStyle":"solid","height":"auto"}'>
			  <view :style='{"padding":"0","margin":"-8rpx 0 0 0","backgroundColor":"#D2102C","top":"10%","left":"20rpx","width":"6rpx","position":"absolute","height":"80%"}' class="dian"></view>
			  <view :style='{"padding":"0 10rpx","whiteSpace":"nowrap","overflow":"hidden","color":"#000","width":"100%","lineHeight":"1.5","fontSize":"28rpx","textOverflow":"ellipsis","order":"1"}' class="title ">{{item.title}}</view>
			  <view :style='{"padding":"0 10rpx","margin":"0","whiteSpace":"nowrap","overflow":"hidden","color":"#6C6C6C","width":"100%","lineHeight":"1.5","fontSize":"28rpx","textOverflow":"ellipsis","order":"2"}' class="text">{{item.introduction}}</view>
			  <view :style='{"width":"100%","padding":"0 10rpx","order":"3"}'>
			    <text class="icon iconfont icon-shijian21" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"22rpx","color":"#6C6C6C"}'></text>
			    <text :style='{"color":"#6C6C6C","lineHeight":"1.5","fontSize":"22rpx"}'>{{item.addtime}}</text>
			  </view>
			  <view :style='{"padding":"0 10rpx","order":"7"}'>
			    <text class="icon iconfont icon-geren16" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"22rpx","color":"#6C6C6C"}'></text>
			    <text :style='{"color":"#6C6C6C","lineHeight":"1.5","fontSize":"22rpx"}'>{{item.name}}</text>
			  </view>
			  <view :style='{"padding":"0 10rpx","display":"inline-block","order":"4"}'>
			    <text class="icon iconfont icon-zan10" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"22rpx","color":"#6C6C6C"}'></text>
			    <text :style='{"color":"#6C6C6C","lineHeight":"1.5","fontSize":"22rpx"}'>{{item.thumbsupnum}}</text>
			  </view>
			  <view :style='{"padding":"0 10rpx","display":"inline-block","order":"5"}'>
			    <text class="icon iconfont icon-shoucang10" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"22rpx","color":"#6C6C6C"}'></text>
			    <text :style='{"color":"#6C6C6C","lineHeight":"1.5","fontSize":"22rpx"}'>{{item.storeupnum}}</text>
			  </view>
			  <view :style='{"padding":"0 10rpx","display":"inline-block","order":"6"}'>
			    <text class="icon iconfont icon-chakan9" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"22rpx","color":"#6C6C6C"}'></text>
			    <text :style='{"color":"#6C6C6C","lineHeight":"1.5","fontSize":"22rpx"}'>{{item.clicknum}}</text>
			  </view>
			  <view class="cuIcon-right" :style='{"padding":"0","margin":"-36rpx 0 0 0","top":"50%","color":"#0F1111","width":"32rpx","lineHeight":"72rpx","fontSize":"32rpx","position":"absolute","right":"0"}'></view>
			</view>
		  </view>
		</view>
		<!-- 新闻资讯 -->
	</view>
</view>
</template>

<script>
    import menu from '@/utils/menu'
	import '@/assets/css/global-restaurant.css'
	import uniIcons from "@/components/uni-ui/lib/uni-icons/uni-icons.vue"
	export default {
		components: {
			uniIcons
		},
		data() {
			return {
				options2: {
					effect: 'flip',
					loop : true
				},
				options3: {
					effect: 'cube',
					loop : true,
					cubeEffect: {
						shadow: true,
						slideShadows: true,
						shadowOffset: 20,
						shadowScale: 0.94,
					}
				},
				rows: 2,
				column: 4,
				iconArr: [
				  'cuIcon-same',
				  'cuIcon-deliver',
				  'cuIcon-evaluate',
				  'cuIcon-shop',
				  'cuIcon-ticket',
				  'cuIcon-cascades',
				  'cuIcon-discover',
				  'cuIcon-question',
				  'cuIcon-pic',
				  'cuIcon-filter',
				  'cuIcon-footprint',
				  'cuIcon-pulldown',
				  'cuIcon-pullup',
				  'cuIcon-moreandroid',
				  'cuIcon-refund',
				  'cuIcon-qrcode',
				  'cuIcon-remind',
				  'cuIcon-profile',
				  'cuIcon-home',
				  'cuIcon-message',
				  'cuIcon-link',
				  'cuIcon-lock',
				  'cuIcon-unlock',
				  'cuIcon-vip',
				  'cuIcon-weibo',
				  'cuIcon-activity',
				  'cuIcon-friendadd',
				  'cuIcon-friendfamous',
				  'cuIcon-friend',
				  'cuIcon-goods',
				  'cuIcon-selection'
				],
                role : '',
                aboutUsDetail: {},
                systemIntroductionDetail: {},
                menuList: [],
                swiperMenuList:[],
                user: {},
                tableName:'',

				//轮播
				swiperList: [],
				homeziliaoxinxilist: [],
				news: [],
			}
		},
		watch: {
		},
		mounted() {
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			},
		},
        async onLoad(){
            
        },
		async onShow() {
			this.swiperMenuList = []
			this.role = uni.getStorageSync("appRole");
			let table = uni.getStorageSync("nowTable");
			let res = await this.$api.session(table);
			this.user = res.data;
			this.tableName = table;
			let menus = menu.list();
			this.menuList = menus;
			this.menuList.forEach((item,key) => {
			    if(key==0) {
			        item.frontMenu.forEach((item2,key2) => {
			            if(item2.child[0].buttons.indexOf("查看")>-1) {
			                this.swiperMenuList.push(item2);
			            }
			        })
			    }
			})
            // let res;
			// 轮播图
			let swiperList = []
			res = await this.$api.list('config', {
				page: 1,
				limit: 5
			});
			for (let item of res.data.list) {
				if (item.name.indexOf('picture') >= 0 && item.value && item.value!="" && item.value!=null ) {
					swiperList.push({
						img: item.value,
                        title: item.name,
						url: item.url
					});
				}
			}
			if (swiperList) {
				this.swiperList = swiperList;
			}
			

            this.getAboutUs();
            this.getSystemIntroduction();
			this.getRecommendList()
			this.getHomeList()
			this.getNewsList()
		},
		methods: {
			uGetRect(selector, all) {
				return new Promise(resolve => {
					uni.createSelectorQuery()
					.in(this)
					[all ? 'selectAll' : 'select'](selector)
					.boundingClientRect(rect => {
						if (all && Array.isArray(rect) && rect.length) {
							resolve(rect);
						}
						if (!all && rect) {
							resolve(rect);
						}
					})
					.exec();
				});
			},
			cloneData(data) {
				return JSON.parse(JSON.stringify(data));
			},
			newsTabClick2(index){
				this.newsIndex2 = index
				this.getNewsList()
			},
			async getNewsList(){
				let res;
				let params = {
					page: 1,
					limit: 6,
					sort: 'id',
					order: 'desc',
				}
				// 公告资讯
				res = await this.$api.list('news', params)
				this.news = res.data.list
			},
			homeTabClick2(index,name){
				this['home' + name + 'Index2'] = index
				this.getHomeList()
			},
			async getHomeList(){
				let res;
				let params;
				params = {
					page:1,
					limit: 6,
				}
				res = await this.$api.list('ziliaoxinxi', params);
				this.homeziliaoxinxilist = res.data.list
			},
			recommendTabClick2(index,name){
				this[name + 'Index2'] = index
				this.getRecommendList()
			},
			async getRecommendList(){
				let res;
				let params;
			},
			//轮播图跳转
			onSwiperTap(e) {
				if(e.url) {
					if (e.url.indexOf('https') != -1) {
						window.open(e.url)
					} else {
						this.$utils.jump(e.url)
					}
				}
			},
            async getAboutUs() {
                let res = await this.$api.info('aboutus', 1)
                this.aboutUsDetail = res.data;
            },
            async getSystemIntroduction() {
                let res = await this.$api.info('systemintro', 1)
                this.systemIntroductionDetail = res.data;
            },
			// 新闻详情
			onNewsDetailTap(id) {
				this.$utils.jump(`../news-detail/news-detail?id=${id}`)
			},
			// 推荐列表点击详情
			onDetailTap(tableName, id) {
				this.$utils.jump(`../${tableName}/detail?id=${id}`)
			},
			onPageTap(tableName){

				uni.navigateTo({
					url: `../${tableName}/list`,
					fail: function(){
						uni.switchTab({
							url: `../${tableName}/list`
						});
					}
				});
				// this.$utils.jump(`../${tableName}/list`)
			},
            onPageTap2(url) {
                uni.setStorageSync("useridTag",0);
                uni.navigateTo({
                    url: url,
                    fail: function() {
                        uni.switchTab({
                            url: url
                        });
                    }
                });
            }
		}
	}
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}

</style>

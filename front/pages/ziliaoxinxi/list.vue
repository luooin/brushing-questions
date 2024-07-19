<template>
<!-- category 2 -->
<mescroll-uni @init="mescrollInit" :up="upOption" :down="downOption" @down="downCallback" @up="upCallback">
	<view class="content">
		<view :style='{"width":"100%","padding":"0","position":"relative","background":"#F2F2F2","height":"auto"}'>
			<view class="cu-bar bg-white search" :style='{"width":"100%","padding":"20rpx 24rpx 0","background":"none","display":"flex","height":"auto"}'>
				<picker v-if="queryList.length>1" mode="selector" :range="queryList" range-key="queryName" :value="queryIndex" @change="queryChange">
					<view :style='{"width":"40rpx","height":"auto"}'>
						<text class="icon iconfont icon-jiantou18" :style='{"width":"40rpx","fontSize":"40rpx","lineHeight":"80rpx","color":"#666"}'></text>
					</view>
				</picker>
				<view :style='{"margin":"0 0 0 12rpx","flex":"1","position":"relative"}' v-if="queryIndex==0" class="search-form round">
					<text class="icon iconfont icon-fangdajing07" :style='{"color":"rgb(153, 153, 153)","left":"0px","textAlign":"center","width":"80rpx","fontSize":"40rpx","lineHeight":"80rpx","position":"absolute","right":"0px"}'></text>
					<input :style='{"border":"0","padding":"12rpx 20rpx 12rpx 80rpx","color":"#333","borderRadius":"10rpx","background":"#F8F8F8","width":"100%","lineHeight":"56rpx","fontSize":"28rpx","height":"80rpx"}' v-model="searchForm.ziliaomingcheng" type="text" placeholder="资料名称" ></input>
				</view>
				<view :style='{"margin":"0 0 0 12rpx","flex":"1","position":"relative"}' v-if="queryIndex==1" class="search-form round">
					<text class="icon iconfont icon-fangdajing07" :style='{"color":"rgb(153, 153, 153)","left":"0px","textAlign":"center","width":"80rpx","fontSize":"40rpx","lineHeight":"80rpx","position":"absolute","right":"0px"}'></text>
					<input :style='{"border":"0","padding":"12rpx 20rpx 12rpx 80rpx","color":"#333","borderRadius":"10rpx","background":"#F8F8F8","width":"100%","lineHeight":"56rpx","fontSize":"28rpx","height":"80rpx"}' v-model="searchForm.ziliaofenlei" type="text" placeholder="资料分类" ></input>
				</view>
				<view :style='{"margin":"0 0 0 12rpx","flex":"1","position":"relative"}' v-if="queryIndex==2" class="search-form round">
					<text class="icon iconfont icon-fangdajing07" :style='{"color":"rgb(153, 153, 153)","left":"0px","textAlign":"center","width":"80rpx","fontSize":"40rpx","lineHeight":"80rpx","position":"absolute","right":"0px"}'></text>
					<input :style='{"border":"0","padding":"12rpx 20rpx 12rpx 80rpx","color":"#333","borderRadius":"10rpx","background":"#F8F8F8","width":"100%","lineHeight":"56rpx","fontSize":"28rpx","height":"80rpx"}' v-model="searchForm.jiangshi" type="text" placeholder="讲师" ></input>
				</view>
				<button :style='{"border":"0","padding":"0px","margin":"0 0 0 -136rpx","color":"#fff","borderRadius":"10rpx","background":"rgba(255,137,28,0.2)","width":"136rpx","lineHeight":"80rpx","fontSize":"28rpx","height":"80rpx","zIndex":"1"}' @tap="search" class="cu-btn shadow-blur round">搜索</button>
			</view>
			

			<view :style='{"margin":"20rpx 14rpx","flexWrap":"wrap","justifyContent":"center","display":"flex"}'>
				<view @click="sortClick('addtime')" :style='{"border":"0","padding":"0 40rpx","margin":"0 10rpx","outline":"0","borderRadius":"0","background":"#FEB800","display":"flex","clipPath":"polygon(0 0, 0 70%, 50% 100%,100% 70%, 100% 0 , 0% 0)"}'>
					<text :style='{"color":"#333","lineHeight":"80rpx","fontSize":"24rpx"}'>按日期</text>
					<text v-if="listSort!='addtime'" class="icon iconfont icon-shijian18" :style='{"margin":"0 0 0 10rpx","lineHeight":"80rpx","fontSize":"24rpx","color":"#333"}'></text>
					<text v-else-if="listSort=='addtime'&&listOrder=='asc'" class="icon iconfont icon-shijian18" :style='{"margin":"0 0 0 10rpx","lineHeight":"80rpx","fontSize":"24rpx","color":"#333"}'></text>
					<text v-else-if="listSort=='addtime'&&listOrder=='desc'" class="icon iconfont icon-shijian18" :style='{"margin":"0 0 0 10rpx","lineHeight":"80rpx","fontSize":"24rpx","color":"#333"}'></text>
				</view>
			</view>
			<view :style='{"width":"100%","flexWrap":"wrap","background":"none","display":"flex","height":"auto"}'>
				<scroll-view scroll-y="true" class="category-two" :style='{"width":"140rpx","background":"rgba(255,137,28,0.2)","height":"auto"}'>
					<view :class='categoryName === item.ziliaofenlei ? "active" : ""' class="tab" v-for="(item,index) in categoryList" :key="index" @tap="categoryClick(item.ziliaofenlei)">{{item.ziliaofenlei}}</view>
				</scroll-view>
			<!-- 样式1 -->
			<view class="uni-product-list" :style='{"padding":"10rpx 20rpx","margin":"0 auto","borderRadius":"10rpx","flexWrap":"wrap","background":"#fff","flex":"1","display":"flex","width":"calc(100% - 160rpx)","justifyContent":"space-between","height":"auto"}'>
				<view @tap="onDetailTap(product)" class="uni-product" :style='{"boxShadow":"none","padding":"0 0 10rpx","margin":"0 0 20rpx","flexWrap":"wrap","background":"rgba(255,137,28,0.2)","display":"flex","width":"48%","backgroundSize":"100% 100%","backgroundPosition":"center center","backgroundRepeat":"no-repeat","justifyContent":"center","height":"auto"}' v-for="(product,index) in list" :key="index">
					<view class="uni-product-title" :style='{"width":"100%","padding":"4rpx 20rpx","lineHeight":"60rpx","fontSize":"28rpx","color":"#000","order":"1"}'>{{product.ziliaomingcheng}}</view>
					<view class="uni-product-title" :style='{"width":"100%","padding":"4rpx 20rpx","lineHeight":"60rpx","fontSize":"28rpx","color":"#000","order":"1"}'>{{product.ziliaofenlei}}</view>
					<image :style='{"padding":"0","margin":"0 auto ","objectFit":"cover","display":"block","width":"80%","height":"160rpx","order":"2"}' mode="aspectFill" class="uni-product-image" v-if="preHttp(product.ziliaofengmian)" :src="product.ziliaofengmian.split(',')[0]"></image>
					<image :style='{"padding":"0","margin":"0 auto ","objectFit":"cover","display":"block","width":"80%","height":"160rpx","order":"2"}' mode="aspectFill" class="uni-product-image" v-else :src="product.ziliaofengmian?baseUrl+product.ziliaofengmian.split(',')[0]:''"></image>
					<view class="uni-product-title" :style='{"width":"100%","padding":"4rpx 20rpx","lineHeight":"60rpx","fontSize":"28rpx","color":"#000","order":"1"}'>{{product.jiangshi}}</view>

					<view :style='{"width":"100%","padding":"0 0","textAlign":"center","order":"5"}'>
						<text class="icon iconfont icon-shijian21" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"20rpx","color":"#000"}'></text>
						<text :style='{"color":"#000","lineHeight":"1.5","fontSize":"20rpx"}'>{{product.addtime}}</text>
					</view>
					<view :style='{"padding":"0 10rpx","order":"8"}'>
						<text class="icon iconfont icon-shoucang10" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"20rpx","color":"#000"}'></text>
						<text :style='{"color":"#000","lineHeight":"1.5","fontSize":"20rpx"}'>{{product.storeupnum}}</text>
					</view>
					<!-- #ifdef MP-WEIXIN -->
					<view :style='{"width":"100%","padding":"8rpx 20rpx 20rpx","justifyContent":"space-between","display":"flex","height":"auto","order":"11"}'>
						<view :style='{"display":"flex"}' v-if="(userid && isAuth('ziliaoxinxi','修改')) || (!userid && isAuthFront('ziliaoxinxi','修改'))" @tap.stop.proevent="onUpdate" :data-row="product">
							<text :style='{"margin":"0 8rpx 0 0","fontSize":"28rpx","lineHeight":"1","color":"#666","display":"inline-block"}' class="cuIcon-edit"></text>
							<text :style='{"fontSize":"28rpx","lineHeight":"1","color":"#666","display":"inline-block"}'>修改</text>
						</view>
						<view :style='{"display":"flex"}' v-if="(userid && isAuth('ziliaoxinxi','删除')) || (!userid && isAuthFront('ziliaoxinxi','删除'))" @tap.stop.proevent="onDelete" :data-row="product">
							<text :style='{"margin":"0 8rpx 0 0","fontSize":"28rpx","lineHeight":"1","color":"#666","display":"inline-block"}' class="cuIcon-delete"></text>
							<text :style='{"fontSize":"28rpx","lineHeight":"1","color":"#666","display":"inline-block"}'>删除</text>
						</view>
					</view>
					<!-- #endif -->
					<!-- #ifndef MP-WEIXIN -->
					<view :style='{"width":"100%","padding":"8rpx 20rpx 20rpx","justifyContent":"space-between","display":"flex","height":"auto","order":"11"}'>
						<view :style='{"display":"flex"}' v-if="(userid && isAuth('ziliaoxinxi','修改')) || (!userid && isAuthFront('ziliaoxinxi','修改'))" @tap.stop.proevent="onUpdateTap(product)">
							<text :style='{"margin":"0 8rpx 0 0","fontSize":"28rpx","lineHeight":"1","color":"#666","display":"inline-block"}' class="cuIcon-edit"></text>
							<text :style='{"fontSize":"28rpx","lineHeight":"1","color":"#666","display":"inline-block"}'>修改</text>
						</view>
						<view :style='{"display":"flex"}' v-if="(userid && isAuth('ziliaoxinxi','删除')) || (!userid && isAuthFront('ziliaoxinxi','删除'))" @tap.stop.proevent="onDeleteTap(product.id)">
							<text :style='{"margin":"0 8rpx 0 0","fontSize":"28rpx","lineHeight":"1","color":"#666","display":"inline-block"}' class="cuIcon-delete"></text>
							<text :style='{"fontSize":"28rpx","lineHeight":"1","color":"#666","display":"inline-block"}'>删除</text>
						</view>
					</view>
					<!-- #endif -->
				</view>
			</view>
			</view>
		</view>

		<button :style='{"border":"0","boxShadow":"0 2rpx 12rpx rgba(0,0,0,.3)","color":"rgb(255, 255, 255)","bottom":"80rpx","right":"8rpx","outline":"none","borderRadius":"100%","background":"#FEB800","width":"80rpx","lineHeight":"80rpx","fontSize":"28rpx","position":"absolute","height":"80rpx","zIndex":"999"}' v-if="userid && isAuth('ziliaoxinxi','新增')" class="add-btn" @click="onAddTap()">新增</button>
		<button :style='{"border":"0","boxShadow":"0 2rpx 12rpx rgba(0,0,0,.3)","color":"rgb(255, 255, 255)","bottom":"80rpx","right":"8rpx","outline":"none","borderRadius":"100%","background":"#FEB800","width":"80rpx","lineHeight":"80rpx","fontSize":"28rpx","position":"absolute","height":"80rpx","zIndex":"999"}' v-if="!userid && isAuthFront('ziliaoxinxi','新增')" class="add-btn" @click="onAddTap()">新增</button>
	</view>
</mescroll-uni>
</template>

<script>
	export default {
		data() {
			return {
				btnColor: ['#409eff','#67c23a','#909399','#e6a23c','#f56c6c','#356c6c','#351c6c','#f093a9','#a7c23a','#104eff','#10441f','#a21233','#503319'],
				queryList:[
					{
						queryName:"资料名称",
					},
					{
						queryName:"资料分类",
					},
					{
						queryName:"讲师",
					},
				],
				queryIndex: 0,
				list: [],
				lists: [],
                userid: '',
				mescroll: null, //mescroll实例对象
				downOption: {
					auto: false //是否在初始化后,自动执行下拉回调callback; 默认true
				},
				upOption: {
					noMoreSize: 5, //如果列表已无数据,可设置列表的总数量要大于半页才显示无更多数据;避免列表数据过少(比如只有一条数据),显示无更多数据会不好看; 默认5
					textNoMore: '~ 没有更多了 ~',
				},
				hasNext: true,
				searchForm:{},
				categoryList:[],
				categoryName :'全部',
				CustomBar: '0',
				listSort: 'id',
				listOrder: 'desc',
			};
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
		async onShow() {
            if(uni.getStorageSync("useridTag")==1){
                this.userid=uni.getStorageSync("useridTag");
                uni.removeStorageSync("useridTag");
            } else {
                this.userid = "";
            }
			this.btnColor = this.btnColor.sort(()=> {
				return (0.5-Math.random());
			});
            let res = {};
            if(this.userid) {
                res = await this.$api.page('ziliaofenlei', {page:1,limit:100});
            } else {
                res = await this.$api.list('ziliaofenlei', {page:1,limit:100});
            }
			res.data.list.splice(0,0,{id:0,ziliaofenlei:'全部'})
			this.categoryList = res.data.list;
			this.hasNext = true
			// 重新加载数据
			if (this.mescroll) this.mescroll.resetUpScroll()
		},
		onLoad(options) {
            if(uni.getStorageSync("useridTag")==1){
                this.userid=uni.getStorageSync("useridTag");
                uni.removeStorageSync("useridTag");
            } else {
                this.userid = "";
            }
			this.hasNext = true
			// 重新加载数据
			if (this.mescroll) this.mescroll.resetUpScroll()
		},
		components: {
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
			sortClick(type){
				if(this.listSort==type){
					if(this.listOrder == 'desc'){
						this.listOrder = 'asc'
					}else{
						this.listOrder = 'desc'
					}
				}else{
					this.listSort = type
					this.listOrder = 'desc'
				}
				this.search()
			},
            priceChange(price) {
                return Number(price).toFixed(2);
            },
            preHttp(str) {
                return str && str.substr(0,4)=='http';
            },
			//查询条件切换
			queryChange(e) {
				this.queryIndex=e.detail.value;
				this.searchForm.ziliaomingcheng="";
				this.searchForm.ziliaofenlei="";
				this.searchForm.jiangshi="";
			},
			//类别搜索
			categoryClick(categoryName){
				this.categoryName = categoryName;
				this.mescroll.resetUpScroll();
			},
			// mescroll组件初始化的回调,可获取到mescroll对象
			mescrollInit(mescroll) {
				this.mescroll = mescroll;
			},
			/*下拉刷新的回调 */
			downCallback(mescroll) {
				this.hasNext = true
				// 重置分页参数页数为1
				mescroll.resetUpScroll()
			},
			/*上拉加载的回调: mescroll携带page的参数, 其中num:当前页 从1开始, size:每页数据条数,默认10 */
			async upCallback(mescroll) {
				let params = {
					page: mescroll.num,
					limit: mescroll.size
				}
				params['sort'] = this.listSort;
				params['order'] = this.listOrder;

				if(this.categoryName!='全部'){
					params.ziliaofenlei = '%' + this.categoryName + '%'
				}
				if(this.searchForm.ziliaomingcheng){
					params['ziliaomingcheng'] = '%' + this.searchForm.ziliaomingcheng + '%'
				}
				if(this.searchForm.ziliaofenlei){
					params['ziliaofenlei'] = '%' + this.searchForm.ziliaofenlei + '%'
				}
				if(this.searchForm.jiangshi){
					params['jiangshi'] = '%' + this.searchForm.jiangshi + '%'
				}
				let user = uni.getStorageSync("appUserid")?JSON.parse(uni.getStorageSync('userSession')):{}
                let res = {}
                if(this.userid) {
                    res = await this.$api.page(`ziliaoxinxi`, params);
                } else {
                    res = await this.$api.list(`ziliaoxinxi`, params);
                }

				// 如果是第一页数据置空
				if (mescroll.num == 1) this.list = [];
				this.list = this.list.concat(res.data.list);
				this.$forceUpdate()
				
				let length = Math.ceil(this.list.length/6)
				let arr = [];
				for (let i = 0; i<length; i++){
					arr[i] = this.list.slice(i*6, (i+1)*6)
				}
				this.lists = arr
				if (res.data.list.length == 0) this.hasNext = false;
				mescroll.endSuccess(mescroll.size, this.hasNext);
			},
			// 详情
			onDetailTap(item) {
                uni.setStorageSync("useridTag",this.userid);
				this.$utils.jump(`./detail?id=${item.id}&userid=`+this.userid)
			},
			onUpdate(e){
				this.onUpdateTap(e.currentTarget.dataset.row)
			},
			// 修改
			onUpdateTap(row){
                uni.setStorageSync("useridTag",this.userid);
				this.$utils.jump(`./add-or-update?id=${row.id}`)
			},
			// 添加
			onAddTap(){
                uni.setStorageSync("useridTag",this.userid);
				this.$utils.jump(`./add-or-update`)
			},
			onDelete(e){
				this.onDeleteTap(e.currentTarget.dataset.row.id)
			},
			onDeleteTap(id){
				var _this = this;
				uni.showModal({
					title: '提示',
					content: '是否确认删除',
					success: async function(res) {
						if (res.confirm) {
							await _this.$api.del('ziliaoxinxi', JSON.stringify([id]));
							let obj = await _this.$api.list('storeup',{
								page: 1,
								limit: 100,
								tablename: 'ziliaoxinxi',
								refid: id,
							})
							if(obj.data.list.length){
								let arr = []
								for(let x in obj.data.list){
									arr.push(obj.data.list[x].id)
								}
								await _this.$api.del('storeup',JSON.stringify(arr))
							}
							this.$utils.msg('删除成功');
							_this.hasNext = true
							// 重置分页参数页数为1
							_this.search()
						}
					}
				});
			},
			// 搜索
			async search(){
				this.mescroll.num = 1
				let searchForm = {
					page: this.mescroll.num,
					limit: this.mescroll.size
				}
				searchForm['sort'] = this.listSort;
				searchForm['order'] = this.listOrder;

				if(this.searchForm.ziliaomingcheng){
					searchForm['ziliaomingcheng'] = '%' + this.searchForm.ziliaomingcheng + '%'
				}
				if(this.searchForm.ziliaofenlei){
					searchForm['ziliaofenlei'] = '%' + this.searchForm.ziliaofenlei + '%'
				}
				if(this.searchForm.jiangshi){
					searchForm['jiangshi'] = '%' + this.searchForm.jiangshi + '%'
				}
                let res = {};
                if(this.userid) {
                    res = await this.$api.page(`ziliaoxinxi`, searchForm);
                } else {
                    res = await this.$api.list(`ziliaoxinxi`, searchForm);
                }
				// 如果是第一页数据置空
				if (this.mescroll.num == 1) this.list = [];
				this.list = this.list.concat(res.data.list);
				let length = Math.ceil(this.list.length/6)
				let arr = [];
				for (let i = 0; i<length; i++){
					arr[i] = this.list.slice(i*6, (i+1)*6)
				}
				this.lists = arr
				if (res.data.list.length == 0) this.hasNext = false;
				this.mescroll.endSuccess(this.mescroll.size, this.hasNext);
			}
		}
	};
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
	
	.category-one .tab {
		cursor: pointer;
		padding: 0 20rpx;
		color: #000;
		background: red;
		display: inline-block;
		width: auto;
		font-size: 28rpx;
		line-height: 80rpx;
	}
	
	.category-one .tab.active {
		cursor: pointer;
		padding: 0 20rpx;
		color: #000;
		background: rgba(255,137,28,0.2);
		display: inline-block;
		width: auto;
		font-size: 28rpx;
		line-height: 80rpx;
	}
	
	.category-two .tab {
		cursor: pointer;
		padding: 0;
		color: #000;
		background: rgba(255,137,28,0.2);
		display: inline-block;
		width: 100%;
		font-size: 28rpx;
		line-height: 100rpx;
		text-align: center;
	}
	
	.category-two .tab.active {
		cursor: pointer;
		padding: 0;
		clip-path: polygon(0 0, 0 80%, 50% 100%,100% 80%, 100% 0 , 0% 0);
		color: #000;
		background: #FEB800;
		display: inline-block;
		width: 100%;
		font-size: 28rpx;
		line-height: 100rpx;
		text-align: center;
	}
	
	.category-three .tab {
		cursor: pointer;
		padding: 0;
		color: #000;
		background: burlywood;
		display: inline-block;
		width: 100%;
		font-size: 28rpx;
		line-height: 80rpx;
		text-align: center;
	}
	
	.category-three .tab.active {
		cursor: pointer;
		padding: 0;
		color: #000;
		background: rgba(255,137,28,0.2);
		display: inline-block;
		width: 100%;
		font-size: 28rpx;
		line-height: 80rpx;
		text-align: center;
	}
</style>

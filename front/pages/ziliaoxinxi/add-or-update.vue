<template>
<view class="content">
	<view :style='{"width":"100%","padding":"0","position":"relative","background":"#fff","height":"100%"}'>
		<form :style='{"width":"100%","padding":"24rpx","background":"#fff","display":"block","height":"auto"}' class="app-update-pv">
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#ccc","alignItems":"center","borderWidth":"0","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#808080","textAlign":"right"}' class="title">资料名称</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"#EDEDED","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.ziliaomingcheng" v-model="ruleForm.ziliaomingcheng" placeholder="资料名称"  type="text"></input>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#ccc","alignItems":"center","borderWidth":"0","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class=" select">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#808080","textAlign":"right"}' class="title">资料分类</view>
				<picker :disabled="ro.ziliaofenlei" :style='{"width":"100%","padding":"0 24rpx","borderRadius":"8rpx","flex":"1","background":"#EDEDED","height":"auto"}' @change="ziliaofenleiChange" :value="ziliaofenleiIndex" :range="ziliaofenleiOptions">
					<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#818181"}' class="uni-input">{{ruleForm.ziliaofenlei?ruleForm.ziliaofenlei:"请选择资料分类"}}</view>
				</picker>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#ccc","alignItems":"center","borderWidth":"0","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="" @tap="ziliaofengmianTap">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#808080","textAlign":"right"}' class="title">资料封面</view>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' class="avator" v-if="ruleForm.ziliaofengmian" :src="baseUrl+ruleForm.ziliaofengmian.split(',')[0]" mode="aspectFill"></image>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#ccc","alignItems":"center","borderWidth":"0","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#808080","textAlign":"right"}' class="title">讲师</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"#EDEDED","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.jiangshi" v-model="ruleForm.jiangshi" placeholder="讲师"  type="text"></input>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#ccc","alignItems":"center","borderWidth":"0","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#808080","textAlign":"right"}' class="title">重点难点</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"#EDEDED","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.zhongdiannandian" v-model="ruleForm.zhongdiannandian" placeholder="重点难点"  type="text"></input>
			</view>
 

			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#ccc","alignItems":"center","borderWidth":"0","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#808080","textAlign":"right"}' class="title">资料简介</view>
				<textarea :style='{"border":"0","padding":"24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"#EDEDED","fontSize":"28rpx","height":"240rpx"}' v-model="ruleForm.ziliaojianjie" placeholder="资料简介"></textarea>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#ccc","alignItems":"center","borderWidth":"0","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"padding":"0 20rpx 0 0","color":"#808080","textAlign":"right","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","fontWeight":"500"}' class="title">资料详情</view>
                <xia-editor ref="editor" :style='{"minHeight":"300rpx","border":"0px solid #efefef","padding":"20rpx","flex":"1","background":"#EDEDED","width":"100%","height":"auto"}' v-model="ruleForm.ziliaoxiangqing" placeholder="资料详情" @editorChange="ziliaoxiangqingChange"></xia-editor>
			</view>
			
			<view :style='{"width":"100%","alignItems":"center","flexDirection":"column","justifyContent":"space-between","display":"flex","height":"auto"}' class="btn" >
				<button :style='{"border":"0","padding":"0px","margin":"0 0 20rpx","color":"rgb(255, 255, 255)","borderRadius":"8rpx","background":"#D2102C","width":"48%","lineHeight":"80rpx","fontSize":"28rpx","height":"80rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

	</view>
</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";
    import xiaEditor from '@/components/xia-editor/xia-editor';
    import multipleSelect from "@/components/momo-multipleSelect/momo-multipleSelect";
	export default {
		data() {
			return {
				cross:'',
				ruleForm: {
				ziliaomingcheng: '',
				ziliaofenlei: '',
				ziliaofengmian: '',
				jiangshi: '',
				zhongdiannandian: '',
				ziliaojianjie: '',
				ziliaoxiangqing: '',
				storeupnum: '',
				},
				ziliaofenleiOptions: [],
				ziliaofenleiIndex: 0,
				// 登录用户信息
				user: {},
                ro:{
                   ziliaomingcheng : false,
                   ziliaofenlei : false,
                   ziliaofengmian : false,
                   jiangshi : false,
                   zhongdiannandian : false,
                   ziliaojianjie : false,
                   ziliaoxiangqing : false,
                   storeupnum : false,
                },
			}
		},
		components: {
			wPicker,
            xiaEditor,
            multipleSelect,
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			},



		},
		async onLoad(options) {
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
			// ss读取


			// 下拉框
			res = await this.$api.option(`ziliaofenlei`,`ziliaofenlei`,{});
			this.ziliaofenleiOptions = res.data;
            this.ziliaofenleiOptions.unshift("请选择资料分类");

			// 如果有登录，获取登录后保存的userid
			this.ruleForm.userid = uni.getStorageSync("appUserid")
			if (options.refid) {
				// 如果上一级页面传递了refid，获取改refid数据信息
				this.ruleForm.refid = Number(options.refid);
				this.ruleForm.nickname = uni.getStorageSync("nickname");
			}
			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				res = await this.$api.info(`ziliaoxinxi`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			this.cross = options.cross;
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='ziliaomingcheng'){
					this.ruleForm.ziliaomingcheng = obj[o];
					this.ro.ziliaomingcheng = true;
					continue;
					}
					if(o=='ziliaofenlei'){
					this.ruleForm.ziliaofenlei = obj[o];
					this.ro.ziliaofenlei = true;
					continue;
					}
					if(o=='ziliaofengmian'){
					this.ruleForm.ziliaofengmian = obj[o].split(",")[0];
					this.ro.ziliaofengmian = true;
					continue;
					}
					if(o=='jiangshi'){
					this.ruleForm.jiangshi = obj[o];
					this.ro.jiangshi = true;
					continue;
					}
					if(o=='zhongdiannandian'){
					this.ruleForm.zhongdiannandian = obj[o];
					this.ro.zhongdiannandian = true;
					continue;
					}
					if(o=='ziliaojianjie'){
					this.ruleForm.ziliaojianjie = obj[o];
					this.ro.ziliaojianjie = true;
					continue;
					}
					if(o=='ziliaoxiangqing'){
					this.ruleForm.ziliaoxiangqing = obj[o];
					this.ro.ziliaoxiangqing = true;
					continue;
					}
					if(o=='storeupnum'){
					this.ruleForm.storeupnum = obj[o];
					this.ro.storeupnum = true;
					continue;
					}
				}
			}
			this.styleChange()
            this.$forceUpdate()
			
			if (uni.getStorageSync('raffleType') && uni.getStorageSync('raffleType') != null) {
				uni.removeStorageSync('raffleType')
				setTimeout(() => {
					this.onSubmitTap()
				}, 300)
			}
		},
		methods: {
            ziliaoxiangqingChange(e) {
                this.ruleForm.ziliaoxiangqing = e
            },
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv . .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},

			// 多级联动参数



			// 下拉变化
			ziliaofenleiChange(e) {
				this.ziliaofenleiIndex = e.target.value
				this.ruleForm.ziliaofenlei = this.ziliaofenleiOptions[this.ziliaofenleiIndex]
			},

			ziliaofengmianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.ziliaofengmian = 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(()=>{
						_this.styleChange()
					})
				});
			},

			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {
//跨表计算判断
				var obj;
				if((!this.ruleForm.ziliaomingcheng)){
					this.$utils.msg(`资料名称不能为空`);
					return
				}
				if((!this.ruleForm.ziliaofenlei)){
					this.$utils.msg(`资料分类不能为空`);
					return
				}
				if((!this.ruleForm.jiangshi)){
					this.$utils.msg(`讲师不能为空`);
					return
				}
				if(this.ruleForm.storeupnum&&(!this.$validate.isIntNumer(this.ruleForm.storeupnum))){
					this.$utils.msg(`收藏数应输入整数`);
					return
				}
				//更新跨表属性
				var crossuserid;
				var crossrefid;
				var crossoptnum;
				if(this.cross){
                    uni.setStorageSync('crossCleanType',true);
					var statusColumnName = uni.getStorageSync('statusColumnName');
					var statusColumnValue = uni.getStorageSync('statusColumnValue');
					if(statusColumnName!='') {
                        if(!obj) {
						    obj = uni.getStorageSync('crossObj');
                        }
						if(!statusColumnName.startsWith("[")) {
							for (var o in obj){
								if(o==statusColumnName){
									obj[o] = statusColumnValue;
								}

							}
							var table = uni.getStorageSync('crossTable');
							await this.$api.update(`${table}`, obj);
						} else {
						       crossuserid=Number(uni.getStorageSync('appUserid'));
						       crossrefid=obj['id'];
						       crossoptnum=uni.getStorageSync('statusColumnName');
						       crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
						}
					}
				}
				if(crossrefid && crossuserid) {
					this.ruleForm.crossuserid=crossuserid;
					this.ruleForm.crossrefid=crossrefid;
					let params = {
						page: 1,
						limit:10,
						crossuserid:crossuserid,
						crossrefid:crossrefid,
					}
					let res = await this.$api.list(`ziliaoxinxi`, params);
					if (res.data.total >= crossoptnum) {
						this.$utils.msg(uni.getStorageSync('tips'));
                        uni.removeStorageSync('crossCleanType');
						return false;
					} else {
                //跨表计算
						if(this.ruleForm.id){
							await this.$api.update(`ziliaoxinxi`, this.ruleForm);
						}else{
							await this.$api.add(`ziliaoxinxi`, this.ruleForm);
						}
						this.$utils.msgBack('提交成功');
					}
				} else {
                //跨表计算
					if(this.ruleForm.id){
						await this.$api.update(`ziliaoxinxi`, this.ruleForm);
					}else{
						await this.$api.add(`ziliaoxinxi`, this.ruleForm);
					}
					this.$utils.msgBack('提交成功');
				}
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			bindDateChange(e) {
				this.date = e.target.value
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				if(this.ro[str]){
					return false
				}
				this.$refs[str].show();
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

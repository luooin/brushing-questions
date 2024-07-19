import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
import adminexam from '@/views/modules/exampaperlist/exam'
import news from '@/views/modules/news/list'
import ziliaofenlei from '@/views/modules/ziliaofenlei/list'
import aboutus from '@/views/modules/aboutus/list'
import examfailrecord from '@/views/modules/examfailrecord/list'
import examquestion from '@/views/modules/examquestion/list'
import exampaper from '@/views/modules/exampaper/list'
import storeup from '@/views/modules/storeup/list'
import systemintro from '@/views/modules/systemintro/list'
import yonghu from '@/views/modules/yonghu/list'
import messages from '@/views/modules/messages/list'
import ziliaoxinxi from '@/views/modules/ziliaoxinxi/list'
import config from '@/views/modules/config/list'
import examrecord from '@/views/modules/examrecord/list'
import newstype from '@/views/modules/newstype/list'
import kaoshifenlei from '@/views/modules/kaoshifenlei/list'


//2.配置路由   注意：名字
export const routes = [{
		path: '/',
		name: '系统首页',
		component: Index,
		children: [{
			// 这里不设置值，是把main作为默认页面
			path: '/',
			name: '系统首页',
			component: Home,
			meta: {
				icon: '',
				title: 'center',
				affix: true
			}
		}, {
			path: '/updatePassword',
			name: '修改密码',
			component: UpdatePassword,
			meta: {
				icon: '',
				title: 'updatePassword'
			}
		}, {
			path: '/pay',
			name: '支付',
			component: pay,
			meta: {
				icon: '',
				title: 'pay'
			}
		}, {
			path: '/center',
			name: '个人信息',
			component: center,
			meta: {
				icon: '',
				title: 'center'
			}
		}, {
			path: '/news',
			name: '公告资讯',
			component: news
		}, {
			path: '/ziliaofenlei',
			name: '资料分类',
			component: ziliaofenlei
		}, {
			path: '/aboutus',
			name: '关于我们',
			component: aboutus
		}, {
			path: '/examfailrecord',
			name: '错题本',
			component: examfailrecord
		}, {
			path: '/examquestion',
			name: '试题管理',
			component: examquestion
		}, {
			path: '/exampaper',
			name: '试题库管理',
			component: exampaper
		}, {
			path: '/storeup',
			name: '我的收藏',
			component: storeup
		}, {
			path: '/systemintro',
			name: '系统简介',
			component: systemintro
		}, {
			path: '/yonghu',
			name: '用户',
			component: yonghu
		}, {
			path: '/messages',
			name: '留言板管理',
			component: messages
		}, {
			path: '/ziliaoxinxi',
			name: '资料信息',
			component: ziliaoxinxi
		}, {
			path: '/config',
			name: '轮播图管理',
			component: config
		}, {
			path: '/examrecord',
			name: '答题记录',
			component: examrecord
		}, {
			path: '/newstype',
			name: '公告资讯分类',
			component: newstype
		}, {
			path: '/kaoshifenlei',
			name: '试题库分类',
			component: kaoshifenlei
		}]
	},
	{
		path: '/adminexam',
		name: 'adminexam',
		component: adminexam,
		meta: {
			icon: '',
			title: 'adminexam'
		}
	},
	{
		path: '/login',
		name: 'login',
		component: Login,
		meta: {
			icon: '',
			title: 'login'
		}
	},
	{
		path: '/register',
		name: 'register',
		component: register,
		meta: {
			icon: '',
			title: 'register'
		}
	},
	{
		path: '*',
		component: NotFound
	}
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
	mode: 'hash',
	/*hash模式改为history*/
	routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}
export default router;
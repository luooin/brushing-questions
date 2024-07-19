const menu = {
	list() {
		return [{
			"backMenu": [{
				"child": [{
					"allButtons": ["新增", "查看", "修改", "删除"],
					"appFrontIcon": "cuIcon-camera",
					"buttons": ["新增", "查看", "修改", "删除"],
					"menu": "用户",
					"menuJump": "列表",
					"tableName": "yonghu"
				}],
				"menu": "用户管理"
			}, {
				"child": [{
					"allButtons": ["新增", "查看", "修改", "删除"],
					"appFrontIcon": "cuIcon-news",
					"buttons": ["新增", "查看", "修改", "删除"],
					"menu": "资料分类",
					"menuJump": "列表",
					"tableName": "ziliaofenlei"
				}],
				"menu": "资料分类管理"
			}, {
				"child": [{
					"allButtons": ["新增", "查看", "修改", "删除"],
					"appFrontIcon": "cuIcon-copy",
					"buttons": ["新增", "查看", "修改", "删除"],
					"menu": "资料信息",
					"menuJump": "列表",
					"tableName": "ziliaoxinxi"
				}],
				"menu": "资料信息管理"
			}, {
				"child": [{
					"allButtons": ["查看", "修改", "回复", "删除"],
					"appFrontIcon": "cuIcon-keyboard",
					"buttons": ["查看", "回复", "删除"],
					"menu": "留言板管理",
					"tableName": "messages"
				}],
				"menu": "留言板管理"
			}, {
				"child": [{
					"allButtons": ["新增", "查看", "修改", "删除"],
					"appFrontIcon": "cuIcon-copy",
					"buttons": ["新增", "查看", "修改", "删除"],
					"menu": "试题库分类",
					"tableName": "kaoshifenlei"
				},{
					"allButtons": ["新增", "查看", "修改", "删除", "组卷", "调查统计"],
					"appFrontIcon": "cuIcon-copy",
					"buttons": ["新增", "查看", "修改", "删除"],
					"menu": "试题库管理",
					"tableName": "exampaper"
				}],
				"menu": "试题库管理"
			}, {
				"child": [{
					"allButtons": ["新增", "查看", "修改", "删除", "导出", "打印"],
					"appFrontIcon": "cuIcon-medal",
					"buttons": ["新增", "查看", "修改", "删除"],
					"menu": "试题管理",
					"tableName": "examquestion"
				}],
				"menu": "试题管理"
			}, {
				"child": [{
					"allButtons": ["查看", "修改"],
					"appFrontIcon": "cuIcon-form",
					"buttons": ["查看", "修改"],
					"menu": "关于我们",
					"tableName": "aboutus"
				}, {
					"allButtons": ["查看", "修改"],
					"appFrontIcon": "cuIcon-full",
					"buttons": ["查看", "修改"],
					"menu": "系统简介",
					"tableName": "systemintro"
				}, {
					"allButtons": ["新增", "查看", "修改", "删除"],
					"appFrontIcon": "cuIcon-rank",
					"buttons": ["查看", "修改"],
					"menu": "轮播图管理",
					"tableName": "config"
				}, {
					"allButtons": ["新增", "查看", "修改", "删除"],
					"appFrontIcon": "cuIcon-news",
					"buttons": ["新增", "查看", "修改", "删除"],
					"menu": "公告资讯",
					"tableName": "news"
				}, {
					"allButtons": ["新增", "查看", "修改", "删除"],
					"appFrontIcon": "cuIcon-news",
					"buttons": ["新增", "查看", "修改", "删除"],
					"menu": "公告资讯分类",
					"tableName": "newstype"
				}],
				"menu": "系统管理"
			}, {
				"child": [{
					"allButtons": ["新增", "查看", "修改", "删除", "导出", "打印", "批卷"],
					"appFrontIcon": "cuIcon-read",
					"buttons": ["查看", "删除", "批卷"],
					"menu": "答题记录",
					"tableName": "examrecord"
				}, {
					"allButtons": ["新增", "查看", "修改", "删除"],
					"appFrontIcon": "cuIcon-flashlightopen",
					"buttons": ["查看", "删除"],
					"menu": "错题本",
					"tableName": "examfailrecord"
				}],
				"menu": "答题管理"
			}],
			"frontMenu": [],
			"hasBackLogin": "是",
			"hasBackRegister": "否",
			"hasFrontLogin": "否",
			"hasFrontRegister": "否",
			"roleName": "管理员",
			"tableName": "users"
		}, {
			"backMenu": [{
				"child": [{
					"allButtons": ["新增", "查看", "修改", "删除"],
					"appFrontIcon": "cuIcon-favor",
					"buttons": ["查看", "删除"],
					"menu": "我的收藏",
					"menuJump": "1",
					"tableName": "storeup"
				}],
				"menu": "我的收藏管理"
			}, {
				"child": [{
					"allButtons": ["新增", "查看", "修改", "删除"],
					"appFrontIcon": "cuIcon-flashlightopen",
					"buttons": ["查看", "删除"],
					"menu": "错题本",
					"tableName": "examfailrecord"
				}, {
					"allButtons": ["新增", "查看", "修改", "删除", "导出", "打印", "批卷"],
					"appFrontIcon": "cuIcon-read",
					"buttons": ["查看", "删除"],
					"menu": "答题记录",
					"tableName": "examrecord"
				}],
				"menu": "答题管理"
			}],
			"frontMenu": [],
			"hasBackLogin": "否",
			"hasBackRegister": "否",
			"hasFrontLogin": "是",
			"hasFrontRegister": "是",
			"roleName": "用户",
			"tableName": "yonghu"
		}]
	}
}
export default menu;
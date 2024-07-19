const base = {
    get() {
        return {
            url : "http://localhost:8080/brushingQuestions/",
            name: "brushingQuestions",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/brushingQuestions/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "刷题小程序后台"
        } 
    }
}
export default base

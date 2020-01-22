<template>
    <el-aside width="200px">
        <div class="card">
            <div class="header">
                hi,undefinde
            </div>
            <div class="content">
                <div>今天是：</div>
                {{ nowDate + ' ' + nowTime + ' ' + nowWeek }}
            </div>
        </div>
    </el-aside>
</template>

<script>
    export default {
        name: "card",
        components: {},
        data() {
            return {
                // currentDate: new Date(),
                nowDate: "",    // 当前日期
                nowTime: "",    // 当前时间
                nowWeek: ""     // 当前星期
            };
        },
        mounted() {
            this.currentTime();
        },
        // 销毁定时器
        beforeDestroy: function() {
            if (this.getDate) {
                console.log("销毁定时器")
                clearInterval(this.getDate); // 在Vue实例销毁前，清除时间定时器
            }
        },
        methods:{
            currentTime() {
                setInterval(this.getDate, 500);
            },
            getDate: function() {
                var _this = this;
                let yy = new Date().getFullYear();
                let mm = new Date().getMonth() + 1;
                let dd = new Date().getDate();
                let week = new Date().getDay();
                let hh = new Date().getHours();
                let mf =
                    new Date().getMinutes() < 10
                        ? "0" + new Date().getMinutes()
                        : new Date().getMinutes();
                if (week == 1) {
                    this.nowWeek = "星期一";
                } else if (week == 2) {
                    this.nowWeek = "星期二";
                } else if (week == 3) {
                    this.nowWeek = "星期三";
                } else if (week == 4) {
                    this.nowWeek = "星期四";
                } else if (week == 5) {
                    this.nowWeek = "星期五";
                } else if (week == 6) {
                    this.nowWeek = "星期六";
                } else {
                    this.nowWeek = "星期日";
                }
                _this.nowTime = hh + ":" + mf;
                _this.nowDate = yy + "/" + mm + "/" + dd;
            }
        }
    }
</script>

<style scoped>
    .card{
        width: 99%;
        height: 200px;
        /*background: red;*/
        border-radius: 8px;
        border: #c0c4cc 1px solid;
    }
    .card .header{
        height: 20%;
        border-bottom: 1px solid #c0c4cc;
        text-align: center;
        line-height: 40px;
    }

    .card .content{
        padding: 0.5rem;
        line-height: 30px;
    }
</style>
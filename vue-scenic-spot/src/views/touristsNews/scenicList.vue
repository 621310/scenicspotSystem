<template>
    <div class="scenicList">
        <el-container>
            <card></card>
            <el-main>
                <el-row>
                    <el-col class="scenicItem" :span="8" v-for="(o, index) in 6" :key="o" :offset="index > 0 ? 0 : 0">
                        <el-card shadow="hover" :body-style="{ padding: '0px' }">
                            <img src="https://shadow.elemecdn.com/app/element/hamburger.9cf7b091-55e9-11e9-a976-7f4d0b07eef6.png"
                                 class="image">
                            <div class="card_bottom" @click="goScenicDetail">
                                <div><span>武汉市黄鹤楼</span><span class="price oldprice">￥998</span><span class="price">￥198</span>
                                </div>
                                <div class="bottom clearfix">
                                    <time class="time">武汉市-武昌区-蛇山西山坡特1号</time>
                                    <el-button type="text" class="button">查看详情</el-button>
                                </div>
                            </div>
                        </el-card>
                    </el-col>
                </el-row>

                <el-row class="bottom_main">
                    <el-pagination
                            background
                            layout="prev, pager, next"
                            :total="10">
                    </el-pagination>
                </el-row>
            </el-main>
        </el-container>

    </div>
</template>

<script>
    import card from "../../components/card"
    export default {
        name: 'scenicList',
        components: {
            card:card,
        },
        data() {
            return {

            };
        },
        mounted() {

        },

        methods:{
            goScenicDetail(){
                console.log("dfsa")
                this.$router.push({name: 'scenicDeatail'})
            },
        }
    }
</script>

<style scoped>
    .scenicList {
        margin: 0.5rem;
    }

    .bottom_main {
        /* background: #999; */
        margin-top: 2rem;
        text-align: right;
        padding-right: 5rem;
    }

    .time {
        font-size: 13px;
        color: #999;
    }

    .bottom {
        margin-top: 13px;
        line-height: 12px;
    }

    .scenicItem {
        margin-bottom: 1rem;
        padding-right: 2rem;
    }

    .button {
        padding: 0;
        float: right;
    }

    .image {
        width: 100%;
        height: 15rem;
        display: block;
    }

    .clearfix:before,
    .clearfix:after {
        display: table;
        content: "";
    }

    .clearfix:after {
        clear: both
    }

    .price {
        display: inline-block;
        float: right;
        color: red;
    }

    .oldprice {
        margin-left: 1rem;
        color: #999;
        text-decoration: line-through;
    }
    .card_bottom{
        padding: 14px;
        cursor: pointer;
    }
    .el-main{
        padding-top: 0;
    }
</style>
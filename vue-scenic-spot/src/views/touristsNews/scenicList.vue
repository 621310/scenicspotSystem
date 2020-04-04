<template>
    <div class="scenicList">
        <el-container>
            <card></card>
            <el-main>
                <el-row>
                    <el-col class="scenicItem" :span="8" v-for="(item, index) in scenicList" :key="item.id" :offset="index > 0 ? 0 : 0">
                        <el-card shadow="hover" :body-style="{ padding: '0px' }">
                            <img :src="item.pic"
                                 class="image">
                            <div class="card_bottom" @click="goScenicDetail(item.id)">
                                <div><span>{{item.name}}</span><span class="price oldprice">￥{{item.oldTicketsPrice}}</span><span class="price">￥{{item.ticketsPrice}}</span>
                                </div>
                                <div class="bottom clearfix">
                                    <div class="time">{{item.address}}</div>
                                    <el-button type="text" style="margin-top: 0.5rem" class="button">查看详情</el-button>
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
                scenicList:[],
            };
        },
        mounted() {
            this.getInfo();
        },

        methods:{
            goScenicDetail(id){
                sessionStorage.setItem("scenicId",id)
                this.$router.push({name: 'scenicDeatail'})
            },
            getInfo(){
                // this.$axios({
                //     method: 'post',              //交互方式
                //     // url: '/api/getUserInfo',        //url地址
                //     url: '/api/getScenicSpotList',
                //     data: {}             //需要交互的数据
                // }).then((res) => {
                //     console.log(res)
                //     this.scenicList = res.data.data
                // }).catch((error) => {
                //     console.log(error)              //失败   打印异常
                // })
                //data是一个对象（传给后台的参数）
                this.$post('/api/getScenicSpotList',{})
                    .then(response => {//成功执行这里
                        console.log(response)
                        if (response==null || response==''){
                            this.$router.push({name: 'Login'})
                            this.$message({  showClose: true,  message: '还没有登陆哦',  type: 'error' });
                        } else{
                            this.scenicList = response.data
                        }


                    })
                    .catch(response => {
                        console.log(response);
                    });
            }
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
        overflow: hidden; /*溢出隐藏*/
        text-overflow: ellipsis; /*以省略号...显示*/
        white-space: nowrap; /*强制不换行*/
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
        height: 13rem;
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
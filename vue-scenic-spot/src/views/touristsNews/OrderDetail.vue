<template>
    <div class="box">
        <el-container>
            <card></card>
            <el-main>
               <div style="font-size: 20px">订单详情</div>
                <div class="ordercontent">
                    <el-row>
                        <el-col :span="3" class="title">订单编号:</el-col>
                        <el-col offset="2" :span="16">{{orderDetail.code}}</el-col>
                    </el-row>
                    <el-row>
                        <el-col :span="3" class="title">景区名称:</el-col>
                        <el-col offset="2" :span="16">{{orderDetail.scenicName}}</el-col>
                    </el-row>
                    <el-row>
                        <el-col :span="3" class="title" >景区地址:</el-col>
                        <el-col offset="2" :span="16">{{orderDetail.address}}</el-col>
                    </el-row>
                    <el-row>
                        <el-col :span="3" class="title">项目名称:</el-col>
                        <el-col offset="2" :span="16">{{orderDetail.projectName}}</el-col>
                    </el-row>
                    <el-row>
                        <el-col :span="3" class="title">时间:</el-col>
                        <el-col offset="2" :span="16">{{orderDetail.time}}</el-col>
                    </el-row>
                    <el-row>
                        <el-col :span="3" class="title">单价:</el-col>
                        <el-col offset="2" :span="16">{{orderDetail.projectPrice}}</el-col>
                    </el-row>
                    <el-row>
                        <el-col :span="3" class="title">数量:</el-col>
                        <el-col offset="2" :span="16">{{orderDetail.num}}</el-col>
                    </el-row>
                    <el-row>
                        <el-col :span="3" class="title">订单时间:</el-col>
                        <el-col offset="2" :span="16">{{orderDetail.orderTime}}</el-col>
                    </el-row>
                    <el-row>
                        <el-col :span="3" class="title">订单总金额:</el-col>
                        <el-col offset="2" :span="16">{{orderDetail.total}}</el-col>
                    </el-row>
                    <el-row>
                        <el-col :span="3" class="title">订单备注:</el-col>
                        <el-col offset="2" :span="16">{{orderDetail.note}}</el-col>
                    </el-row>
                    <el-row>
                        <el-col :span="3" class="title">状态:</el-col>
                        <el-col offset="2" :span="3" class="orderstatus">{{orderDetail.orderStatus ==0?'未支付':orderDetail.orderStatus==1?'已支付':orderDetail.orderStatus==2?'待处理':orderDetail.orderStatus==3?'已取消':'-'}}</el-col>
                        <el-col offset="2" :span="12">
                            <el-button type="success" v-if="orderDetail.orderStatus ==0" @click="goPay" size="mini" round>支付</el-button>
                            <el-button type="danger" v-if="orderDetail.orderStatus==1" size="mini" round>取消订单</el-button>
                        </el-col>
                    </el-row>
                </div>
            </el-main>
        </el-container>
    </div>
</template>

<script>
    import Card from "../../components/card";
    export default {
        name: "OrderDetail",
        components: {
            Card,

        },
        data(){
          return{
              orderId:'',
              orderDetail:{},
          }
        },
        mounted(){
            this.orderId = sessionStorage.getItem("orderId")
            this.getInfo()
        },
        methods:{
            getInfo(){
                this.$post('/api/getOrderDetail',{"orderId":this.orderId})
                    .then(response => {//成功执行这里
                        console.log(response)
                        this.orderDetail = response.data
                    })
                    .catch(response => {
                        console.log(response);
                    });
            },
            goPay(){
                this.$router.push({name: 'Pay'})
            }
        }
    }
</script>

<style scoped>
    .box{
        margin: 0.5rem;
    }
    .ordercontent{
        margin-top: 1rem;
        width: 80%;
        height: 30rem;
        background-color: #d3dce6;
        padding: 1rem;
    }
    .ordercontent .el-row{
        height: 2.5rem;
    }
    .ordercontent .el-row .title{
        text-align: right;
        font-weight: bold;
    }
    .ordercontent .el-row .el-col{
        height: 2.5rem;
        line-height: 2.5rem;
    }
    .orderstatus{
        color: #319de7;
    }
</style>
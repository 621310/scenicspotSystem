<template>
    <div class="box">
        <el-container>
            <card></card>
            <el-main>
                <div style="font-size: 20px">订单支付</div>
                <div class="ordercontent">
                    <el-form ref="form" :model="payForm" label-width="80px">
                        <el-form-item label="订单编号">
                            <el-input v-model="payForm.WIDout_trade_no"></el-input>
                        </el-form-item>

                        <el-form-item label="支付金额">
                            <el-input v-model="payForm.WIDtotal_amount"></el-input>
                        </el-form-item>

                        <el-form-item label="商品名称">
                            <el-input v-model="payForm.WIDsubject"></el-input>
                        </el-form-item>

                        <el-form-item label="商品描述">
                            <el-input v-model="payForm.WIDbody"></el-input>
                        </el-form-item>

                        <el-form-item>
                            <el-button type="success" @click="onSubmit">立即支付</el-button>
                            <el-button type="info" @click="onback">返回</el-button>
                        </el-form-item>
                    </el-form>
                </div>
            </el-main>
        </el-container>
    </div>
</template>

<script>
    import Card from "../../components/card";
    export default {
        name: "Pay",
        components: {
            Card,

        },
        data(){
            return{
              payForm:{
                  WIDout_trade_no: sessionStorage.getItem("WIDout_trade_no"),
                  WIDtotal_amount: sessionStorage.getItem("WIDtotal_amount"),
                  WIDsubject :sessionStorage.getItem("WIDsubject"),
                  WIDbody:sessionStorage.getItem("projectName")
              }
            }
        },
        mounted(){
        },
        methods:{
            onSubmit(){
                this.$post('/api/pay',this.payForm)
                    .then(response => {//成功执行这里
                        console.log(response)
                        let routeData = this.$router.resolve({ path: 'Recharge', query: { htmls: response }});
                        window.open(routeData.href, '_blank');

                    })
                    .catch(response => {
                        console.log(response);
                    });
            },
            onback(){
                this.$router.push({name: 'OrderDetail'})
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
</style>
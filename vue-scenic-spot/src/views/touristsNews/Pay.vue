<template>
    <div class="box">
        <el-container>
            <card></card>
            <el-main>
                <el-form ref="form" :model="payForm" label-width="80px">
                    <el-form-item label="活动名称">
                        <el-input v-model="payForm.WIDout_trade_no"></el-input>
                    </el-form-item>

                    <el-form-item label="活动名称">
                        <el-input v-model="payForm.WIDtotal_amount"></el-input>
                    </el-form-item>

                    <el-form-item label="活动名称">
                        <el-input v-model="payForm.WIDsubject"></el-input>
                    </el-form-item>

                    <el-form-item label="活动名称">
                        <el-input v-model="payForm.WIDbody"></el-input>
                    </el-form-item>

                    <el-form-item>
                        <el-button type="primary" @click="onSubmit">立即创建</el-button>
                        <el-button>取消</el-button>
                    </el-form-item>
                </el-form>
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
                  WIDout_trade_no:'11111111',
                  WIDtotal_amount: 0.2,
                  WIDsubject :'00000',
                  WIDbody:'22222'
              }
            }
        },
        methods:{
            onSubmit(){
                this.$post('/api/pay',this.payForm)
                    .then(response => {//成功执行这里
                        console.log(response)

                        let routeData = this.$router.resolve({ path: 'Recharge', query: { htmls: response }});
                        window.open(routeData.href, '_blank');

                        // const div = document.createElement('div');
                        // div.innerHTML = this.$route.query.htmls;
                        // document.body.appendChild(div);
                        // document.forms[0].submit();

                    })
                    .catch(response => {
                        console.log(response);
                    });
            }
        }
    }
</script>

<style scoped>
    .box{
        margin: 0.5rem;
    }
</style>
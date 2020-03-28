<template>
    <div>
        <el-table :data="tableData" stripe style="width: 100%">
            <el-table-column type="index" label="序号" width="50"></el-table-column>
            <el-table-column prop="code" label="订单号" ></el-table-column>
            <el-table-column prop="username" label="姓名" ></el-table-column>
            <el-table-column prop="scenidName" label="景区" ></el-table-column>
            <el-table-column prop="time" label="时间" ></el-table-column>
            <el-table-column prop="phone" label="手机号" ></el-table-column>
            <el-table-column prop="total" label="金额"></el-table-column>
            <el-table-column label="操作">
                <template slot-scope="scope">
                    <el-button
                            size="mini"
                            @click="agree(scope.row)">同意</el-button>
                    <el-button
                            size="mini"
                            type="danger"
                            @click="refuse(scope.row)">拒绝</el-button>
                </template>
            </el-table-column>
        </el-table>
    </div>
</template>

<script>
    export default {
        name: "UnprocessedOrder",
        data(){
            return {
                tableData:[]
            }
        },
        mounted(){
            this.getInfo();
        },
        methods:{
            getInfo(row){
                this.$post('/api/selectPendingOrder',{})
                    .then(response => {//成功执行这里
                        console.log(response)
                        this.tableData = response.data
                    })
                    .catch(response => {
                        console.log(response);
                    });
            },
            agree(row){
                this.$post('/api/refundOrder',{
                    "id" : row.id,
                    "code" : row.code,
                    "trade_no" : row.trade_no,
                    "total" : row.total
                })
                    .then(response => {//成功执行这里
                        console.log(response)
                        if(response == 'Success'){
                            this.getInfo();
                         this.$message({  showClose: true,  message: "取消成功",  type: 'success' });
                        }else {
                            this.$message({  showClose: true,  message: "取消失败",  type: 'error' });
                        }
                    })
                    .catch(response => {
                        console.log(response);
                    });
            },
            refuse(){

            }
        }
    }
</script>

<style scoped>

</style>
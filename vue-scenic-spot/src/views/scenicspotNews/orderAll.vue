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
            <el-table-column prop="orderStatus" label="状态">
                <template slot-scope="scope">
                    <span>{{scope.row.orderStatus==0?'未支付': scope.row.orderStatus == 1?'已支付': scope.row.orderStatus == 2?'待处理':scope.row.orderStatus == 3?'已取消':'-'}}</span>
                </template>
            </el-table-column>
        </el-table>
    </div>
</template>

<script>
    export default {
        name: "orderAll",
        data(){
            return {
                tableData:[]
            }
        },
        mounted(){
            this.getInfo();
        },
        methods:{
            getInfo(){
                this.$post('/api/selectAllorder',{})
                    .then(response => {//成功执行这里
                        console.log(response)
                        this.tableData = response.data
                    })
                    .catch(response => {
                        console.log(response);
                    });
            },
        }
    }
</script>

<style scoped>

</style>
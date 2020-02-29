<template>
    <div class="box">
            <el-container>
                <card></card>
                <el-main>
                    <el-row>
                        <el-form :inline="true" ref="searchForm" :model="searchForm" label-width="80px">
                            <el-form-item label="名称">
                                <el-input v-model="searchForm.name"></el-input>
                            </el-form-item>

                            <el-form-item>
                                <el-button type="primary" @click="onSubmit">搜索</el-button>
                            </el-form-item>
                        </el-form>
                    </el-row>
                    <el-row>
                        <el-table :data="tableData" stripe border style="width: 100%">
                            <el-table-column prop="code" label="订单编号" width="180"></el-table-column>
                            <el-table-column prop="scenicName" label="景区名称" width="180"></el-table-column>
                            <el-table-column prop="projectName" label="项目名称"></el-table-column>
                            <el-table-column prop="time" label="时间"></el-table-column>
                            <el-table-column prop="total" label="顶订单金额"></el-table-column>
                            <el-table-column prop="orderStatus" label="状态">
                                <template slot-scope="scope">
                                    <span>{{scope.row.orderStatus==0?'未支付': scope.row.orderStatus == 1?'已支付': scope.row.orderStatus == 2?'待处理':scope.row.orderStatus == 3?'已取消':'-'}}</span>
                                </template>
                            </el-table-column>
                            <el-table-column fixed="right" label="操作" width="120">
                                <template slot-scope="scope">
                                    <el-button @click.native.prevent="onSubmit(scope.row)" type="text" size="small">查看详情</el-button>
                                </template>
                            </el-table-column>
                        </el-table>
                    </el-row>
                </el-main>

            </el-container>

        </div>
</template>

<script>
    import Card from "../../components/card"
    export default {
        name: 'MyOrder',
        components: {
            Card
        },
        data(){
          return {
              tableData: [],
              searchForm: {
                  name:'',
              },
          }
        },
        mounted(){
            this.getInfo();
        },
        methods:{
            onSubmit(row){
                sessionStorage.setItem("orderId",row.id)
                this.$router.push({name: 'OrderDetail'})
            },
            getInfo(){
                this.$post('/api/getMyOrders',{})
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
.box{
    margin: 0.5rem;
}
</style>
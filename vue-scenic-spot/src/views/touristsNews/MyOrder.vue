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
                            <el-form-item label="活动时间">
                                <el-date-picker
                                        v-model="searchForm.date"
                                        type="daterange"
                                        range-separator="至"
                                        start-placeholder="开始日期"
                                        end-placeholder="结束日期">
                                </el-date-picker>
                            </el-form-item>
                            <el-form-item>
                                <el-button type="primary" @click="onSubmit">搜索</el-button>
                            </el-form-item>
                        </el-form>
                    </el-row>
                    <el-row>
                        <el-table :data="tableData" stripe border style="width: 100%">
                            <el-table-column prop="date" label="订单编号" width="180"></el-table-column>
                            <el-table-column prop="name" label="景区名称" width="180"></el-table-column>
                            <el-table-column prop="address" label="景区地址"></el-table-column>
                            <el-table-column prop="address" label="包含项目"></el-table-column>
                            <el-table-column prop="address" label="时间"></el-table-column>
                            <el-table-column prop="address" label="支付金额"></el-table-column>
                            <el-table-column fixed="right" label="操作" width="120">
                                <template slot-scope="scope">
                                    <el-button @click.native.prevent="onSubmit" type="text" size="small">查看详情</el-button>
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
              tableData: [
                  {
                  date: '2016-05-02',
                  name: '王小虎',
                  address: '上海市普陀区金沙江路 1518 弄'
              }, {
                  date: '2016-05-04',
                  name: '王小虎',
                  address: '上海市普陀区金沙江路 1517 弄'
              }, {
                  date: '2016-05-01',
                  name: '王小虎',
                  address: '上海市普陀区金沙江路 1519 弄'
              }, {
                  date: '2016-05-03',
                  name: '王小虎',
                  address: '上海市普陀区金沙江路 1516 弄'
              }
              ],
              searchForm: {
                  name:'',
                  date:[]
              },
          }
        },
        methods:{
            onSubmit(){

            },

        }
    }
</script>

<style scoped>
.box{
    margin: 0.5rem;
}
</style>
<template>
    <div class="box">
        <el-container>
            <card></card>
            <el-main>
                <el-row class="bgcolor">
                    <el-col :span="12">
                    <el-carousel>
                        <el-carousel-item v-for="item in scenicPicList" :key="item.id">
                            <img :src="item.pic" class="image">
                        </el-carousel-item>
                    </el-carousel>
                    </el-col>
                    <el-col  :offset="1" :span="8">
                        <h1>{{scenicDetail.name}}</h1>
                        <div class="rightItem"><span>景区地址：</span>{{scenicDetail.address}}</div>
                        <div class="rightItem"><span>开放时间：</span>{{scenicDetail.openTime}}</div>
                        <div class="rightItem"><span>联系电话：</span>{{scenicDetail.phone}}</div>
                        <div class="rightItem"><span>景区特色：</span>{{scenicDetail.scenicfeatures}}</div>
                    </el-col>
                </el-row>
                <el-row>
                    <el-col :span="24">
                        <el-collapse v-model="activeName" accordion>
                            <el-collapse-item title="景区简介" name="1">
                                <div>{{scenicDetail.scenicInfo}}</div>
                            </el-collapse-item>
                            <el-collapse-item title="注意事项" name="2">
                                <div>{{scenicDetail.precautions}}</div>
                            </el-collapse-item>
                        </el-collapse>
                    </el-col>

                    <el-col  :span="24">
                        <el-table :data="scenicDetail.scenicProjectsList" border style="width: 100%;margin-top: 1rem">
                            <el-table-column prop="name" label="名称" width="500"></el-table-column>
                            <el-table-column prop="projectPrice" label="价格(元)" ></el-table-column>
                            <el-table-column prop="openTime" label="开放时间" ></el-table-column>
                            <el-table-column prop="note" label="其他" ></el-table-column>
<!--                            <el-table-column label="选择日期" width="300" prop="date">-->
<!--                                <template slot-scope="scope">-->
<!--                                    <div class="block">-->
<!--                                        <el-date-picker v-model="orderForm.date" type="date"-->
<!--                                                        size="small"-->
<!--                                                        placeholder="选择日期">-->
<!--                                        </el-date-picker>-->
<!--                                    </div>-->
<!--                                </template>-->
<!--                            </el-table-column>-->
<!--                            <el-table-column label="数量">-->
<!--                                <template slot-scope="scope">-->
<!--                                    <el-input-number size="small" v-model="orderForm.num" :min="1" :max="6" label="描述文字"></el-input-number>-->
<!--                                </template>-->
<!--                            </el-table-column>-->
                            <el-table-column fixed="right" label="操作">
                                <template slot-scope="scope">
                                    <el-button type="text" @click="addOrderDialog(scope.row)" size="small">添加至我的订单</el-button>
                                </template>
                            </el-table-column>
                        </el-table>
                    </el-col>
                </el-row>

                <el-row>
                    <el-dialog title="添加订单" :visible.sync="dialogVisible" width="35%">
                        <el-form ref="orderForm" :rules="rules" :model="orderForm" label-width="80px">
                            <el-form-item label="名称">
                                <el-input disabled v-model="orderForm.name"></el-input>
                            </el-form-item>

                            <el-form-item label="价格">
                                <el-input disabled v-model="orderForm.projectPrice"></el-input>
                            </el-form-item>

                            <el-form-item label="选择日期" prop="time">
                                <el-date-picker type="date" placeholder="选择日期"  v-model="orderForm.time" style="width: 100%;" value-format="yyyy-MM-dd"></el-date-picker>
                            </el-form-item>

                            <el-form-item label="数量">
                                <el-input-number size="small" v-model="orderForm.num" style="width: 100%;" :min="1" :max="6"></el-input-number>
                            </el-form-item>

                            <el-form-item label="订单备注">
                                <el-input type="textarea" maxlength="40" :rows="2" placeholder="最多可输入40字哦" v-model="orderForm.note">
                                </el-input>
                            </el-form-item>


                        </el-form>
                        <span slot="footer" class="dialog-footer">
                            <el-button @click="dialogVisible = false">取 消</el-button>
                            <el-button type="primary" @click="addOrder('orderForm')">添加至我的订单</el-button>
                        </span>
                    </el-dialog>
                </el-row>
            </el-main>
        </el-container>

    </div>
</template>

<script>
    import Card from "../../components/card";


    export default {
        name: "scenicDeatail",
        components: {
            Card,

        },
        data(){
            return{
                scenicPicList:[],
                swiperOption:[],
                bannerList:[],
                orderForm:{
                    scenicId:'',
                    projectId:'',
                    name:'',
                    projectPrice:'',
                    time:'',
                    num:0,
                    note:''
                },
                scenicId:'',
                scenicDetail:{},
                activeName: '',
                dialogVisible:false,

                rules: {
                    time: [{ type: 'string', required: true, message: '请选择日期', trigger: 'change' }],
                },
            }
        },
        mounted(){
            this.scenicId = sessionStorage.getItem("scenicId")
            console.log(this.scenicId)
            this.getInfo()
        },
        methods:{
            getInfo(){
                this.$post('/api/getScenicDetail',{id:this.scenicId})
                    .then(response => {//成功执行这里
                        console.log(response)
                        this.scenicDetail = response.data
                        this.scenicPicList = response.data.scenicPicList
                        console.log(this.scenicPicList)
                    })
                    .catch(response => {
                        console.log(response);
                    });
            },
            addOrderDialog(row){
                this.orderForm.scenicId = this.scenicId
                this.orderForm.projectId = row.id
                this.orderForm.name = row.name
                this.orderForm.projectPrice = row.projectPrice
                this.dialogVisible = true;
            },
            addOrder(orderForm){
                this.$refs[orderForm].validate((valid) => {
                    if (valid) {
                        console.log(this.orderForm)
                        this.$post('/api/addOrder',this.orderForm)
                            .then(response => {//成功执行这里
                                if(response.data.code == 200){
                                    this.$message({  showClose: true,  message: response.data.data,  type: 'success' });
                                }else{
                                    this.$message({  showClose: true,  message:  response.data.data,  type: 'error' });
                                }
                                this.dialogVisible = false;
                            })
                            .catch(response => {
                                console.log(response);
                            });
                    } else {
                        console.log('error submit!!');
                        return false;
                    }
                });
            }
        }
    }
</script>

<style scoped>
    .el-carousel{
        /*width: 50%;*/
        height: 300px;
    }
    .el-carousel__item h3 {
        color: #475669;
        font-size: 14px;
        opacity: 0.75;
        line-height: 150px;
        margin: 0;
    }

    .el-carousel__item:nth-child(2n) {
        background-color: #99a9bf;
    }

    .el-carousel__item:nth-child(2n+1) {
        background-color: #d3dce6;
    }
    .box{
        /*margin: 0.5rem;*/
        padding: 0.5rem;
        background-color: #e8e8e8;
    }
    .image {
        width: 100%;
        height: 100%;
        display: block;
    }
    .el-row{
        margin-bottom: 0.5rem;
    }
    .rightItem{
        margin-bottom: 1rem;
        color: #999999;
    }
    .rightItem span{
        font-weight: bolder;
    }
    h1{
        margin-bottom: 1.5rem;
    }
    .bgcolor{
        background-color: #fff;
    }
    .el-main{
        padding-top: 0;
    }
</style>
<style>
    .el-collapse-item__header{
        padding-left: 1rem;
    }
    .el-collapse-item__content{
        padding-left: 1rem;
        padding-right: 1rem;
    }
</style>
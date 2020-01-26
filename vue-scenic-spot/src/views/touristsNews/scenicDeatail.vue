<template>
    <div class="box">
        <el-container>
            <card></card>
            <el-main>
                <el-row>
                    <el-col :span="12">
                    <el-carousel>
                        <el-carousel-item v-for="item in 4" :key="item">
                            <img src="https://shadow.elemecdn.com/app/element/hamburger.9cf7b091-55e9-11e9-a976-7f4d0b07eef6.png"
                                 class="image">
                        </el-carousel-item>
                    </el-carousel>
                    </el-col>
                    <el-col :offset="1" :span="8">
                        <h1>武汉市黄鹤楼景区</h1>
                        <div class="rightItem"><span>景区地址：</span>武汉市-武昌区-蛇山西山坡特1号</div>
                        <div class="rightItem"><span>开放时间：</span>全年8:00 - 24:00</div>
                        <div class="rightItem"><span>联系电话：</span>100000000000</div>
                        <div class="rightItem"><span>景区特色：</span>分开发送接口和发电机发电发来的环境负荷富简富士康好看</div>
                    </el-col>
                </el-row>
                <el-row>
                    <el-col :span="6">
                        <el-card class="box-card">
                            <div slot="header" class="clearfix">
                                <span>景点简介</span>
                            </div>
                            <div style="color: #475669">
                                黄鹤楼位于湖北省武汉市长江南岸的武昌蛇山之巅，濒临万里长江，是国家5A级旅游景区，“江南三大名楼”之一，自古享有“天下江山第一楼“和”天下绝景“之称。黄鹤楼是武汉市标志性建筑，与晴川阁、古琴台并称“武汉三大名胜”。 [1-2]
                                黄鹤楼始建于三国时代吴黄武二年（公元223年），三国时期该楼只是夏口城一角瞭望守戍的“军事楼”，晋灭东吴以后，三国归于一统，该楼在失去其军事价值的同时，随着江夏城地发展，逐步演变成为官商行旅“游必于是”、“宴必于是”的观赏楼。
                            </div>
                        </el-card>
                    </el-col>
                    <el-col :offset="1" :span="17">
                        <el-table :data="tableData" style="width: 100%">
                            <el-table-column prop="date" label="名称" width="280"></el-table-column>
                            <el-table-column prop="name" label="价格" width="100"></el-table-column>
                            <el-table-column label="选择日期" width="240">
                                <template slot-scope="scope">
                                    <div class="block">
                                        <el-date-picker v-model="orderForm.date" type="date"
                                                        size="small"
                                                        placeholder="选择日期">
                                        </el-date-picker>
                                    </div>
                                </template>
                            </el-table-column>
                            <el-table-column label="数量">
                                <template slot-scope="scope">
                                    <el-input-number size="small" v-model="orderForm.num" :min="1" :max="6" label="描述文字"></el-input-number>
                                </template>
                            </el-table-column>
                            <el-table-column fixed="right" label="操作" width="100">
                                <template slot-scope="scope">
                                    <el-button type="text" size="small">添加至我的订单</el-button>
                                </template>
                            </el-table-column>
                        </el-table>
                    </el-col>
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
                swiperOption:[],
                bannerList:[],
                tableData: [{
                    date: '武汉市黄鹤楼门票',
                    name: '王小虎',
                },
                    {
                        date: '武汉市黄鹤楼门票',
                        name: '王小虎',
                    },
                    {
                        date: '武汉市黄鹤楼门票',
                        name: '王小虎',
                    }
                ],
                orderForm:{
                    date:'',
                    num:0,
                }
            }
        },
        methods:{

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
        margin: 0.5rem;
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
</style>
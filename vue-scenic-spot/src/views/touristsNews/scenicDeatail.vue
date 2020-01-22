<template>
    <div class="box">
        <el-container>
            <card></card>
            <el-main>
                <el-row>
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
            }
        },
        methods:{
            handleSwiperClick(){

            },
        }
    }
</script>

<style scoped>
    .el-carousel{
        width: 50%;
    }
    .el-carousel__item h3 {
        color: #475669;
        font-size: 18px;
        opacity: 0.75;
        line-height: 300px;
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
</style>
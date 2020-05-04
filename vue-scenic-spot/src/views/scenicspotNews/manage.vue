<template>
    <div>
    <div style="margin: 20px">
        <el-button type="success" icon="el-icon-plus"  plain>添加景区</el-button>
    </div>
        <el-table :data="tableData" stripe style="width: 100%">
            <el-table-column type="index" label="序号" width="50"></el-table-column>
            <el-table-column prop="name" label="景区名称" ></el-table-column>
            <el-table-column prop="address" label="景区地址" ></el-table-column>
            <el-table-column prop="phone" label="联系电话" ></el-table-column>
        </el-table>
    </div>
</template>

<script>
    export default {
        name: "manage",
        data(){
            return{
                tableData:[],
            }
        },
        mounted(){
            this.getInfo();
        },
        methods:{
            getInfo(){
                this.$post('/api/selectScenicByUserId',{})
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
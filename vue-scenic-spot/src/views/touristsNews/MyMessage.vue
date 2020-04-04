<template>
<div  class="box">
    <el-container>
        <card></card>
        <el-main>
            <div style="font-size: 20px">编辑个人信息</div>
            <div class="ordercontent">
                <el-form ref="form" :model="form" label-width="80px">
                    <el-form-item label="昵称">
                        <el-input style="width: 50%" placeholder="设置昵称" v-model="form.username"></el-input>
                    </el-form-item>
                    <el-form-item label="手机号">
                        <el-input style="width: 50%" placeholder="输入手机号" v-model="form.phone"></el-input>
                    </el-form-item>
                    <el-form-item label="邮箱">
                        <el-input style="width: 50%"  placeholder="输入邮箱" v-model="form.email"></el-input>
                    </el-form-item>
                    <el-form-item label="生日">
                        <el-date-picker  value-format="yyyy-MM-dd" style="width: 50%" v-model="form.birthday" type="date" placeholder="选择生日">
                        </el-date-picker>
                    </el-form-item>
                    <el-form-item label="性别">
                        <el-radio-group  v-model="form.sex"  size="medium">
                            <el-radio  border  label="1">男</el-radio>
                            <el-radio  border  label="2">女</el-radio>
                        </el-radio-group>
                    </el-form-item>
                    <el-form-item>
                        <el-button style="width: 50%" type="primary" :loading="loading" @click="updateMymsg">保存</el-button>
                    </el-form-item>
                </el-form>
            </div>
        </el-main>
    </el-container>
</div>
</template>

<script>
    import Card from "../../components/card"
    export default {
        components: {
            Card
        },
        name: 'MyMessage',

        data(){
            return{
                loading:false,
              form:{
                  username:'',
                  phone:'',
                  email:'',
                  birthday:'',
                  sex:'',
              }
            }
        },
        mounted(){
            this.getInfo();
        },
        methods:{
            getInfo(){
                this.$post('/api/getUsername',{})
                    .then(response => {//成功执行这里
                        console.log(response)
                        this.form = response.data
                    })
                    .catch(response => {
                        console.log(response);
                    });
            },
            updateMymsg(){
                this.loading = true;
                this.$post('/api/updateUserMsg',this.form)
                    .then(response => {//成功执行这里
                        console.log(response)
                        if(response.data.code = 200){
                            this.getInfo()
                            this.$message({  showClose: true,  message: response.data.data,  type: 'success' });
                        }else{
                            this.$message({  showClose: true,  message:  response.data.data,  type: 'error' });
                        }
                        this.loading = false;
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
    .ordercontent{
        margin-top: 1rem;
        width: 80%;
        height: 30rem;
        background-color: #d3dce6;
        padding: 1rem;
    }
    .ordercontent .el-row{
        height: 2.5rem;
    }
    .ordercontent .el-row .title{
        text-align: right;
        font-weight: bold;
    }
    .ordercontent .el-row .el-col{
        height: 2.5rem;
        line-height: 2.5rem;
    }
</style>
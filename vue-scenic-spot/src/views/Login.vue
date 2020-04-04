<template>
    <div class="login">
        <h1 style="color:white">景区订票系统</h1>

        <div class="panpel">
            <el-tabs v-model="activeName" :stretch="true">
                <el-tab-pane name="1" label="登录">
                    <div class="from_input">
                        <el-form ref="form" :rules="rules" :model="form" label-width="80px">
                            <el-form-item label="用户" prop="phone">
                                <el-input style="width: 80%" v-model="form.phone"></el-input>
                            </el-form-item>
                            <el-form-item label="密码" prop="password">
                                <el-input style="width: 80%" type='password' v-model="form.password"></el-input>
                            </el-form-item>
                            <el-form-item>
                                <el-button type="primary" class="loginBtn" @click="onLogin">登录</el-button>
                            </el-form-item>
                        </el-form>
                    </div>
                </el-tab-pane>
                <el-tab-pane name="2" label="注册">
                    <div>
                        <el-form ref="registForm" :rules="registFormRules" :model="registForm" label-width="80px">
                            <el-form-item label="手机号" prop="phone">
                                <el-input style="width: 80%" v-model="registForm.phone"></el-input>
                            </el-form-item>
                            <el-form-item label="邮箱" prop="email">
                                <el-input style="width: 80%" v-model="registForm.email"></el-input>
                            </el-form-item>
                            <el-form-item label="密码" prop="password">
                                <el-input style="width: 80%" type='password' v-model="registForm.password"></el-input>
                            </el-form-item>
                            <el-form-item label="确认密码" prop="confirmPassword">
                                <el-input style="width: 80%" type='password' v-model="registForm.confirmPassword"></el-input>
                            </el-form-item>
                            <el-form-item label="类型" prop="type">
                                <el-radio-group v-model="registForm.type" size="medium">
                                    <el-radio border label="1">景区管理员</el-radio>
                                    <el-radio border label="0">普通用户</el-radio>
                                </el-radio-group>
                            </el-form-item>
                            <el-form-item>
                                <el-button type="primary" class="loginBtn" @click="onRegist">注册</el-button>
                            </el-form-item>
                        </el-form>
                    </div>
                </el-tab-pane>
            </el-tabs>

        </div>

    </div>
</template>

<script>

    export default {
        name: 'Login',
        components: {},
        data() {
            return {
                activeName: '1',
                form: {
                    phone: '',
                    password: ''
                },
                registForm:{
                    phone: '',
                    email: '',
                    password: '',
                    confirmPassword: '',
                    type : '0',
                },
                registFormRules:{
                    phone: [
                        {required: true, message: '请输入手机号', trigger: 'blur'},
                    ],
                    email: [
                        {required: false, message: '请输入邮箱', trigger: 'blur'},
                    ],
                    password: [
                        {required: true, message: '请输入密码', trigger: 'blur'},
                    ],
                    confirmPassword: [
                        {required: true, message: '请输入密码', trigger: 'blur'},
                    ],
                    type: [
                        {required: true, message: '请输入密码', trigger: 'blur'},
                    ],
                },
                rules: {
                    phone: [
                        {required: true, message: '请输入手机号/邮箱', trigger: 'blur'},
                    ],
                    password: [
                        {required: true, message: '请输入密码', trigger: 'blur'},
                    ],
                }
            }
    },
        methods: {
            onLogin() {
                this.$axios({
                    method: 'post',              //交互方式
                    // url: '/api/getUserInfo',        //url地址
                    url: '/api/getUserInfo',
                    data: this.form             //需要交互的数据
                }).then((res) => {
                    console.log(res)
                    if(res.data.code != '201'){
                        this.$message({  showClose: true,  message: '登陆成功',  type: 'success' });
                        sessionStorage.setItem("token",res.data.data.token)
                        if(res.data.data.type == 0){
                            this.$router.push({name: 'touristsHome'})
                        }else{
                            this.$router.push({name: 'scenicspotHome'})
                        }

                    }else{
                        this.$message({  showClose: true,  message: '账号或密码错误！',  type: 'error' });
                    }
                }).catch((error) => {
                    console.log(error)              //失败   打印异常
                })

            },
            onRegist(){
                this.$axios({
                    method: 'post',              //交互方式
                    // url: '/api/getUserInfo',        //url地址
                    url: '/api/register',
                    data: this.registForm             //需要交互的数据
                }).then((res) => {
                    console.log(res)
                    if(res.data.data.code == '200'){
                        this.activeName = '1'
                        this.$message({  showClose: true,  message: res.data.data.data,  type: 'success' });

                    }else{
                        this.$message({  showClose: true,  message: res.data.data.data,  type: 'error' });
                    }
                }).catch((error) => {
                    console.log(error)              //失败   打印异常
                })
            },
        }
    }
</script>
<style scoped>
    .login {
        width: 100%;
        height: 100%;
        background: url(../assets/bg.jpeg) no-repeat;
        background-size: 100% 100%;
    }

    .panpel {
        height: 55%;
        width: 30%;
        background: white;
        position: absolute;
        top: 50%;
        left: 50%;
        transform: translate(-50%, -50%);
        padding-top: 1rem;
    }

    .from_input {
        margin-top: 3rem;
    }
    .loginBtn {
        width: 80%;
    }
    h1,h2{
        text-align: center;
    }

</style>

<template>
    <div class="login">
        <h1 style="color:white">景区订票系统</h1>
        <div class="panpel">
            <h2>用户登录</h2>
            <div class="from_input">
                <el-form ref="form" :rules="rules" :model="form" label-width="80px">
                    <el-form-item label="用户" prop="phone">
                        <el-input v-model="form.phone"></el-input>
                    </el-form-item>
                    <el-form-item label="密码" prop="password">
                        <el-input type='password' v-model="form.password"></el-input>
                    </el-form-item>
                    <el-form-item>
                        <el-button type="primary" @click="onLogin">登陆</el-button>
                        <el-button type="primary" @click="onLogin2">登陆</el-button>
                        <el-button>注册</el-button>
                    </el-form-item>
                </el-form>
            </div>
        </div>

    </div>
</template>

<script>

    export default {
        name: 'Login',
        components: {},
        data() {
            return {
                form: {
                    phone: '',
                    password: ''
                },
                rules: {
                    name: [
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
                    if(res.data.code === '200'){
                        this.$message({  showClose: true,  message: '登陆成功',  type: 'success' });
                        this.$router.push({name: 'touristsHome'})
                    }else{
                        this.$message({  showClose: true,  message: '账号或密码错误！',  type: 'error' });
                    }
                }).catch((error) => {
                    console.log(error)              //失败   打印异常
                })

            },
            onLogin2() {
                // this.$router.push({name: 'scenicspotHome'})
            }
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
        height: 40%;
        width: 30%;
        background: white;
        position: absolute;
        top: 50%;
        left: 50%;
        transform: translate(-50%, -50%);
        padding-top: 1rem;
    }

    .from_input {
        width: 80%;
        position: absolute;
        top: 50%;
        left: 50%;
        transform: translate(-60%, -50%);
    }
    h1,h2{
        text-align: center;
    }

</style>

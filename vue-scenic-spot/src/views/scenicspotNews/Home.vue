<template>
    <div class="scenicspotHome">
        <el-header><h1>景区管理平台</h1></el-header>
        <el-row class="main">
            <el-col :span="3">
                <el-menu :default-active="this.$router.path" class="el-menu-vertical-demo" @open="handleOpen"
                         @close="handleClose" router>
                    <el-menu-item index="/scenicList">
                        <i class="el-icon-menu"></i>
                        <span slot="title">管理</span>
                    </el-menu-item>
                    <el-menu-item index="2">
                        <i class="el-icon-s-order"></i>
                        <span slot="title">订单列表</span>
                    </el-menu-item>
                    <el-menu-item index="/MyMessage">
                        <i class="el-icon-user-solid"></i>
                        <span slot="title">我的信息</span>
                    </el-menu-item>
                </el-menu>
            </el-col>
            <el-col :span="21">
                <transition name="fade" mode="in-out">
                    <router-view></router-view>
                </transition>
            </el-col>
        </el-row>
    </div>
</template>

<script>
    export default {
        name: 'scenicspotHome',
        components: {},
        data() {
            return {}
        },
        methods: {
            handleOpen(key, keyPath) {
                console.log(key, keyPath);
            },
            handleClose(key, keyPath) {
                console.log(key, keyPath);
            },
        }
    }
</script>

<style scoped>
    .scenicspotHome {
        height: 100%;
    }

    .el-header {
        height: 10%;
        background-color: #5c9bd1;
        /*#5c9bd1*/
        color: #ffffff;
        text-align: center;
        line-height: 60px;
    }

    .main {
        height: 90%;
    }

    .main .el-col {
        height: 100%;
    }

    .el-menu {
        width: 100%;
    }

    .fade-enter {
        opacity: 0;
    }

    .fade-leave {
        opacity: 1;
    }

    .fade-enter-active {
        transition: opacity .1s;
    }

    .fade-leave-active {
        opacity: 0;
        transition: opacity .1s;
    }
</style>
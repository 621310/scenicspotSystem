<template>
    <div class="touristsHome">
        <el-menu :default-active="activeIndex"router class="el-menu-demo" mode="horizontal"
                @select="handleSelect" background-color="#545c64" text-color="#fff" active-text-color="#ffd04b">
            <el-menu-item v-for="(item,i) in navList" :key="i" :index="item.name">
                {{ item.navItem }}
            </el-menu-item>
        </el-menu>

                <transition name="fade" mode="in-out">
                    <router-view></router-view>
                </transition>

    </div>
</template>

<script>
    export default {
        name: 'touristsHome',
        components: {},
        data() {
            return {
                activeIndex: '/scenicList',
                navList:[
                    {name:'/scenicList',navItem:'首页'},
                    {name:'/MyOrder',navItem:'我的订单'},
                    {name:'/MyMessage',navItem:'个人中心'}
                ]
            }
        },
        mounted() {

        },
        methods: {
            handleSelect(key, keyPath) {
                console.log(key, keyPath);
            }
        }
    }
</script>

<style scoped>
    .touristsHome {
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



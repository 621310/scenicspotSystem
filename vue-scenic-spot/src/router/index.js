import Vue from 'vue'
import VueRouter from 'vue-router'


Vue.use(VueRouter)

const routes = [
    {
        path: '/',
        name: 'Login',
        component: () => import(/* webpackChunkName: "about" */ '../views/Login.vue')
    },

    {
        path: '/tourists',
        name:'touristsHome',
        component: () =>import(/* webpackChunkName: "about" */ '../views/touristsNews/Home.vue'),
        children:
            [
                {
                    path: '/scenicList',
                    name: 'scenicList',
                    component: () => import(/* webpackChunkName: "about" */ '../views/touristsNews/scenicList.vue')
                },
                {
                     path: '/MyOrder',
                     name:'MyOrder',
                    component:() =>
                    import(/* webpackChunkName: "about" */ '../views/touristsNews/MyOrder.vue')
                },
                {
                    path: '/MyMessage',
                    name:
                    'MyMessage',
                    component:() =>import(/* webpackChunkName: "about" */ '../views/touristsNews/MyMessage.vue')
                },
                {
                    path: '/scenicDeatail',
                    name:
                        'scenicDeatail',
                    component:() =>import(/* webpackChunkName: "about" */ '../views/touristsNews/scenicDeatail.vue')
                },
                {
                    path: '/OrderDetail',
                    name:
                        'OrderDetail',
                    component:() =>import(/* webpackChunkName: "about" */ '../views/touristsNews/OrderDetail.vue')
                },
                {
                    path: '/Pay',
                    name:
                        'Pay',
                    component:() =>import(/* webpackChunkName: "about" */ '../views/touristsNews/Pay.vue')
                },
                {
                    path: '/Recharge',
                    name:
                        'Recharge',
                    component:() =>import(/* webpackChunkName: "about" */ '../views/touristsNews/Recharge.vue')
                },
            ]
    },

    {
        path: '/scenicspot',
        name:'scenicspotHome',
        component: () =>import(/* webpackChunkName: "about" */ '../views/scenicspotNews/Home.vue'),
        children:[]
    },


]

const router = new VueRouter({
    mode: 'history',
    base: process.env.BASE_URL,
    routes
})

export default router

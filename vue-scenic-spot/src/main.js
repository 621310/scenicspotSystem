import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import axios from 'axios'
import { post, get } from './utils/request.js';



import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';


// 定义全局变量
Vue.prototype.$post = post;
Vue.prototype.$get = get;


Vue.prototype.$axios = axios


Vue.use(ElementUI);

Vue.config.productionTip = false

new Vue({
    router,
    store,
    render: h => h(App)
}).
$mount('#app')

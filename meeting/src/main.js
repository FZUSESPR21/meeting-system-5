// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App.vue'
import router from './router'

import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import axios from 'axios';
//import VueParticles from 'vue-particles'

Vue.use(ElementUI);
Vue.use(axios);
Vue.prototype.$axios = axios;
//Vue.use(VueParticles)

// new Vue({
//   el: '#app',
//   render: h => h(App)
// });

Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
    el: '#app',
    router,
    components: { App },
    template: '<App/>'
})
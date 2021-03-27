import Vue from 'vue'
import Router from 'vue-router'

//components
import test from '@/components/test'
import Admin from '@/views/admin/Admin'
import UserNumTable from '@/components/admin/UserNumTable'
import timeline from '@/components/client/index/timeline'
import timeline2 from '@/components/client/index/timeline2'
import pageHeader from '@/components/common/pageHeader'
import card from '@/components/common/card'

//views
import index from '@/views/client/index'

Vue.use(Router)

export default new Router({
    routes: [
        // 组件测试
        {
            path: '/test',
            name: 'test',
            component: test
        },

        // 首页
        {
            path: '/',
            name: 'index',
            component: index,
            children: [
                // 主页 时间线
                // {
                //   path: '/timeline',
                //   name: 'timeline',
                //   component: timeline,
                //   meta:{title:'时间线'}
                // },
                {
                    path: 'timeline2',
                    name: 'timeline2',
                    component: timeline2,
                    meta: { title: '时间线2' }
                },
                // 页头
                {
                    path: 'pageHeader',
                    name: 'pageHeader',
                    component: pageHeader,
                    meta: { title: '页头' }
                },
                {
                    path: 'card',
                    name: 'card',
                    component: card,
                    meta: { title: '论坛' }
                }
            ]
        },
        // 访问路径不存在，则重定向到首页
        {
            path: '*',
            redirect: '/'
        },
        {
            path: '/HelloWorld',
            name: 'HelloWorld',
            component: HelloWorld
        },
        {
            path: '/test',
            name: 'test',
            component: test
        },
        {
            path: '/admin',
            name: 'admin',
            component: Admin,
            children: [{
                path: '/user_num',
                name: 'user_num_table',
                component: UserNumTable
            }]
        }
    ]
})
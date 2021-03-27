// vue.config.js

/**
 * @type {import('@vue/cli-service').ProjectOptions}
 */
module.exports = {
    devServer: {
        open: true,
        // 跨域
        proxy: {
            '/nuojinadm/': {
                target: 'http://49.100.89.20',
                changeOrigin: true
            }
        }
    }
}
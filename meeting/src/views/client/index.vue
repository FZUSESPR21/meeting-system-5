<template>
    <div :class="'wrap'">
        <div class="header"><v-pageheader></v-pageheader></div>
        <div class="index-box">
            <div class="tmline"><v-timeline2></v-timeline2></div>
            <div>
                <v-card></v-card>
                <v-card></v-card>
                <v-card></v-card>
            </div>
        </div>
        
    </div>
</template>

<style scoped>
    .header{
        margin: 0 0 50px 0;
    }
    .index-box{
        display: flex;
        -ms-flex-align: center;
    }
    .tmline{
        width: auto;
        margin: 0 0 0 50px; 
        padding-left: 0;
        display: inline-block;
    }
</style>

<script>
    //页头
    import pageheader from '@/components/common/pageHeader';
    //时间线
    import timeline from '@/components/client/index/timeline';
    import timeline2 from '@/components/client/index/timeline2';
    import card from '@/components/common/card'

    export default {
    components:{
        'v-pageheader':pageheader,
        'v-timeline':timeline,
        'v-timeline2':timeline2,
        'v-card':card
    },
    data(){
        return{}
    }
  }
</script>
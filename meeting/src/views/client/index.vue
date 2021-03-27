<template>
    <div :class="'wrap'">
        <div class="header"><v-pageheader></v-pageheader></div>
        <div class="index-box">
            <div class="tmline"><v-timeline2></v-timeline2></div>
            <div class="index-card">
                <v-cvprcard class="card"></v-cvprcard>
                <v-iccvcard class="card"></v-iccvcard>
                <v-eccvcard class="card"></v-eccvcard>
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
    .index-card{
        margin-left: 50px;
    }
    .card{
        margin-bottom: 20px;
    }
</style>

<script>
    //页头
    import pageheader from '@/components/common/pageHeader';
    //时间线
    import timeline from '@/components/client/index/timeline';
    import timeline2 from '@/components/client/index/timeline2';
    import cvprcard from '@/components/client/subForum/CVPRcd';
    import iccvcard from '@/components/client/subForum/ICCVcd';
    import eccvcard from '@/components/client/subForum/ECCVcd';

    export default {
    components:{
        'v-pageheader':pageheader,
        'v-timeline':timeline,
        'v-timeline2':timeline2,
        'v-cvprcard':cvprcard,
        'v-iccvcard':iccvcard,
        'v-eccvcard':eccvcard
    },
    data(){
        return{}
    }
  }
</script>
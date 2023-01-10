<template>

    <v-data-table
        :headers="headers"
        :items="ordernInfomation"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'OrdernInfomationView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            ordernInfomation : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/ordernInfomations'))

            temp.data._embedded.ordernInfomations.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.ordernInfomation = temp.data._embedded.ordernInfomations;
        },
        methods: {
        }
    }
</script>


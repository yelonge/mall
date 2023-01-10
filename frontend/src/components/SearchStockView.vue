<template>

    <v-data-table
        :headers="headers"
        :items="searchStock"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'SearchStockView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            searchStock : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/searchStocks'))

            temp.data._embedded.searchStocks.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.searchStock = temp.data._embedded.searchStocks;
        },
        methods: {
        }
    }
</script>


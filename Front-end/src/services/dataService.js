
import axios from '../httpCommon.js'; 

export default {

    getPortfolio() {
        return axios.get('/portfolio'); 
    },
}

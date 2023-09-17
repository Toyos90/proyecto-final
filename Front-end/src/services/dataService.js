import axiosConnection from '../httpCommon';

export default({

    create(ProjectsData){
        return axiosConnection.get(`/projects`, ProjectsData);
    },
})
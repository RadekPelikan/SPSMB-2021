const loadDataWithFetch = async () => {
    try {
        const jsonFileFetch = await fetch('res/data/data.json');
        const data = await jsonFileFetch.json();
        console.log(`Fetch:`);
        console.log(data);
    } catch (error) {
        console.log(error);
    }
}

const loadDataWithAxios = async (dispatch) => {
    try {
        const jsonFileAxios = await axios('res/data/data.json');
        console.log(`Axios:`);
        console.log(jsonFileAxios.data);
    } catch (error) {
        console.log(error);
    }
}

loadDataWithFetch();
loadDataWithAxios();

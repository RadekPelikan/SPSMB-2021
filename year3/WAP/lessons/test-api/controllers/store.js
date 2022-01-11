exports.getStoreInv = (req, res) => {
    back(req, res);
};

exports.postOrder = (req, res) => {
    back(req, res);
};

exports.getOrderById = (req, res) => {
    back(req, res);
};

exports.deleteOrderbyId = (req, res) => {
    back(req, res);
};

const back = (req, res) => {
    res.status(200).send({
        req,
        msg: "seems good"
    })
}

//   router.get("/inventory", storeController.getStoreInv);

//   router.post("/order", storeController.postOrder);

//   router.get("/order/:id", storeController.getOrderById);

//   router.delete("/order/:id", storeController.deleteOrderbyId);
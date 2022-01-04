const express = require("express");
const router = express.Router();

const storeController = require("../controllers/store");

router.get("/inventory", storeController.getStoreInv);

router.post("/order", storeController.postOrder);

router.get("/order/:id", storeController.getOrderById);

router.delete("/order/:id", storeController.deleteOrderbyId);

module.exports = router;

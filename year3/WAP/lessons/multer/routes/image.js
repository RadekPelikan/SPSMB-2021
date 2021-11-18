const express = require("express");
const router = express.Router();

const imageController = require('../controllers/image');

router.get("/", imageController.getForm);

router.post('/upload', imageController.uploadFile)

module.exports = router;

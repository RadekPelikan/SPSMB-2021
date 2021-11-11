const express = require('express');
const router = express.Router();
const foodController = require('../controllers/food')

/* GET home page. */
router.get('/', foodController.getFood);

module.exports = router;

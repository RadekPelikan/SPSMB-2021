const express = require('express');
const router = express.Router();
const carController = require('../controllers/car')

/* GET home page. */
router.get('/', carController.getCar);

module.exports = router;

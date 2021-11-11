const express = require('express');
const router = express.Router();
const tableController = require('../controllers/table')

/* GET home page. */
router.get('/', tableController.getTable);

module.exports = router;

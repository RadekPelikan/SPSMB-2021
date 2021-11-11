const express = require('express');
const router = express.Router();
const usersController = require('../controllers/categories')

/* GET users listing. */
router.get('/', usersController.getCategories);

module.exports = router;

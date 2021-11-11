const express = require('express');
const router = express.Router();
const usersController = require('../controllers/users')

/* GET home page. */
router.get('/', usersController.getUsers);

module.exports = router;

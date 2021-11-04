const express = require('express');
const router = express.Router();

/* GET users listing. */
// http://127.0.0.1:3000/users
router.get('/', (req, res, next) => {
  res.send('respond with a resource');
});
// http://127.0.0.1:3000/users/:id
router.get('/:id', (req, res, next) => {
  res.send('respond with a resource');
});

module.exports = router;

const express = require("express");
const router = express.Router();

const bookController = require("../contollers/book");

/**
 * URL: /book
 * Method: GET
 */
router.get("/", bookController.getBooks);

/**
 * URL: /book/:id
 * Method: GET
 */
router.get("/:id", bookController.getBook);

/**
 * URL: /book
 * Method: POST
 */
router.post("/", bookController.postBook);

/**
 * URL: /book/:id
 * Method: PUT
 */
router.put("/:id", bookController.putBook);

/**
 * URL: /book/:id
 * Method: PATCH
 */
router.patch("/:id", bookController.patchBook);

/**
 * URL: /book/:id
 * Method: DELETE
 */
router.delete("/:id", bookController.deleteBook);

module.exports = router;

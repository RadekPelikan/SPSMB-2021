const express = require("express");
const router = express.Router();

const userController = require("../controllers/user");

router.post("/", userController.postUser);

router.post("/createWithArray", userController.postUsersArray);

router.post("/createWithList", userController.postUsersList);

router.get("/login", userController.getlogin);

router.get("/logout", userController.getlogout);

router.get("/:username", userController.getUserByUsername);

router.put("/:username", userController.putUser);

router.delete("/:username", userController.deleteUser);

module.exports = router;

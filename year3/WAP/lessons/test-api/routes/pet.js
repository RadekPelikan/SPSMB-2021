const express = require("express");
const router = express.Router();

const petController = require("../controllers/pet");

router.post("/", petController.postPet);

router.put("/", petController.putPet);

router.get("/findByStatus", petController.getPetByStatus);

router.get("/:id", petController.getPetById);

router.post("/:id", petController.postPetById);

router.delete("/:id", petController.deletePet);

router.post("/:id/uploadImage", petController.postImage);

module.exports = router;

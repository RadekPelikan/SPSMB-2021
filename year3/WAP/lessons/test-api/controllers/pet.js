exports.postPet = (req, res) => {
  back(req, res);
};

exports.putPet = (req, res) => {
    back(req, res);
};

exports.getPetByStatus = (req, res) => {
    back(req, res);
};

exports.getPetById = (req, res) => {
    back(req, res);
};

exports.postPetById = (req, res) => {
    back(req, res);
};

exports.deletePet = (req, res) => {
    back(req, res);
};

exports.postImage = (req, res) => {
    back(req, res);
};

const back = (req, res) => {
    res.status(200).send({
        req,
        msg: "seems good"
    })
}

// router.post("/", petController.postPet);

// router.put("/", petController.putPet);

// router.get("/findByStatus", petController.getPetByStatus);

// router.get("/:id", petController.getPetById);

// router.post("/:id", petController.postPetById);

// router.delete("/:id", petController.deletePet);

// router.post("/:id/uploadImage", petController.postImage);
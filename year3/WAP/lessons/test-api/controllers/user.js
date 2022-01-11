exports.postUser = (req, res) => {
    back(req, res);
};

exports.postUsersArray = (req, res) => {
    back(req, res);
};

exports.postUsersList = (req, res) => {
    back(req, res);
};

exports.getlogin = (req, res) => {
    back(req, res);
};

exports.getlogout = (req, res) => {
    back(req, res);
};

exports.getUserByUsername = (req, res) => {
    back(req, res);
};

exports.putUser = (req, res) => {
    back(req, res);
};

exports.deleteUser = (req, res) => {
    back(req, res);
};

const back = (req, res) => {
    res.status(200).send({
        req,
        msg: "seems good"
    })
}

//   router.post("/", userController.postUser);

//   router.post("/createWithArray", userController.postUsersArray);

//   router.post("/createWithList", userController.postUsersList);

//   router.get("/login", userController.getlogin);

//   router.get("/logout", userController.getlogout);

//   router.get("/:username", userController.getUserByUsername);

//   router.put("/:username", userController.putUser);

//   router.delete("/:username", userController.deleteUser);
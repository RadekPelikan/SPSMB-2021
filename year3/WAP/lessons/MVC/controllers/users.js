exports.getUsers = (req, res, next) => {
    res.render('users', { title: 'Users' });
}
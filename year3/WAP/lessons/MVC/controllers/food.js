exports.getFood = (req, res, next) => {
    res.render('food', { title: 'Food' });
  }
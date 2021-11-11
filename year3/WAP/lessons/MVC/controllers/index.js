exports.getIndex = (req, res, next) => {
  res.render('index', { title: 'Express' });
}
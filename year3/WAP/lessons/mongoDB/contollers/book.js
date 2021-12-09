const book = require("../models/book");
const Book = require("../models/book");

const handleError = (res, error) => {
  console.log(error);
  res.status(500).json({
    error: error,
  });
};

exports.getBooks = async (req, res) => {
  try {
    const result = await Book.find().select("name year _id");
    if (!result) return res.status(404).json({ message: "Books not found" });
    res.status(200).json({
      count: result.length,
      books: result.map((book) => {
        return {
          ...book.toObject(),
          request: {
            type: "GET",
            url: `http://localhost:3000/book/${book._id}`,
          },
        };
      }),
    });
  } catch (error) {
    handleError(res, error);
  }
};

exports.getBook = async (req, res) => {
  try {
    const result = await Book.findById(req.params.id);
    if (!result) return res.status(404).json({ message: "Book not found" });
    res.status(200).json({
      ...result.toObject(),
      request: {
        type: "GET",
        url: "http://127.0.0.1:3000/book",
      },
    });
  } catch (error) {
    handleError(res, error);
  }
};

exports.postBook = async (req, res) => {
  try {
    const book = new Book({
      name: req.body.name,
      year: req.body.year,
    });
    const result = await book.save();
    if (!result)
      return res.status(500).json({ message: "Book was not created" });
    res.status(201).json({
      message: "Your book was created",
      createdBook: {
        ...result.toObject(),
        payload: {
          type: "GET",
          url: `http://127.0.0.1:3000/book/${result._id}`,
        },
      },
    });
  } catch (error) {
    handleError(res, error);
  }
};

exports.putBook = async (req, res) => {
  try {
    const update = {
      name: req.body.name,
      year: req.body.year,
    };
    const result = await Book.findByIdAndUpdate(req.params.id, update);
    if (!result)
      return res.status(500).json({ message: "Book could not be updated" });
    res.status(200).json({
      message: `Book ${req.params.id} was updated`,
      request: {
        type: "GET",
        url: `http://127.0.0.1:3000/book/${req.params.id}`,
      },
    });
  } catch (error) {
    handleError(res, error);
  }
};

exports.patchBook = async (req, res) => {
  try {
    const update = {};
    req.body.forEach((ops) => {
      update[ops.propName] = ops.value;
    });
    const result = await Book.findByIdAndUpdate(req.params.id, update);
    if (!result)
      return res.status(500).json({ message: "Book could not be updated" });
    res.status(200).json({
      message: `Book ${req.params.id} was updated`,
      request: {
        type: "GET",
        url: `http://127.0.0.1:3000/book/${req.params.id}`,
      },
    });
  } catch (error) {
    handleError(res, error);
  }
};

exports.deleteBook = async (req, res) => {
  try {
    const result = await Book.findByIdAndDelete(req.params.id);
    if (!result) return res.status(404).json({ message: "Book not found" });
    res.status(200).json({
      message: `Book ${result.name}, id: ${result._id} was deleted`
    })
  } catch (error) {
    handleError(res, error);
  }
};

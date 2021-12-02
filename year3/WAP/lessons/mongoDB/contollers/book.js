const Book = require("../models/book")
const mongoose = require("mongoose");


exports.getBooks = (req, res) => {

}

exports.getBook = (req, res) => {

}

exports.postBook = async (req, res) => {
    try {
        const book = new Book({
            
        })

    } catch (error) {
        console.log(error);
        res.status(500).json({
            error
        })
    }
}

exports.putBook = (req, res) => {

}

exports.patchBook = (req, res) => {

}

exports.deleteBook = (req, res) => {

}

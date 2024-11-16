var express = require('express');
var app = express();

app.set('view engine', 'ejs');
app.use(express.static('public'));

app.get('/', function (req, res) {
  res.render("../views/index");
});

app.listen(5500, function(){
  console.log('Executando na porta 5500');
});
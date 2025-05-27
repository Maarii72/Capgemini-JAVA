import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
//import * as serviceWorker from './serviceWorker';
import { BrowserRouter as Router, Route} from 'react-router-dom';
import Home from './pages/home';
import Sobre from './pages/sobre';
import Contato from './pages/contato';

ReactDOM.render(
  (
    <Router>
      <App>
        <Route>
          <Route exact path="/" element={Home}/>
          <Route path="/sobre" element={Sobre}/>
          <Route path="/contato" element={Contato}/>
        </Route>
      </App>
    </Router>
  ),
  document.getElementById('root')
);
import React from "react";
import Logo from "../Assets/petlogo.png";
import { BsCart2 } from "react-icons/bs";

const Navbar = () => {
  return(
    <nav>
      <div className="nav-logo-container">
        <img src={Logo} alt="logo petvita care" />
      </div>

      <div className="navbar-links-container">
        <a href="">Home</a>
        <a href="">Sobre Nós</a>
        <a href="">Serviços</a>
        <a href="">Produtos</a>
        <a href="">Depoimentos</a>
        <a href="">Contato</a>
        <a href="">
          <BsCart2 className="navbar-cart-icon" />
        </a>
      </div>
    </nav>
  );
};

export default Navbar;
import '../Navbar/Navbar.css';
import React, { useState } from "react";
import Logo from "../../Assets/petlogo.png";
import { BsCart2 } from "react-icons/bs";
import HomeIcon from "@mui/icons-material/Home";
import InfoIcon from '@mui/icons-material/Info';
import PetsIcon from '@mui/icons-material/Pets';
import LocalMallIcon from '@mui/icons-material/LocalMall';
import CommentIcon from '@mui/icons-material/Comment';
import LocalPhoneIcon from '@mui/icons-material/LocalPhone';
import ShoppingCartIcon from '@mui/icons-material/ShoppingCart';
import { HiOutlineBars3 } from "react-icons/hi2"
import Drawer from "@mui/material/Drawer";
import { Box } from '@mui/material';
import List from "@mui/material/List";
import ListItem from "@mui/material/ListItem";
import ListItemButton from "@mui/material/ListItemButton";
import ListItemIcon from "@mui/material/ListItemIcon";
import ListItemText from "@mui/material/ListItemText";

const Navbar = () => {
  //estado iniciado como falso
  const [openMenu, setOpenMenu] = useState(false);
  const menuOptions = [
    {
      text: "Home",
      icon: <HomeIcon />,
    },
    {
      text: "Sobre Nós",
      icon: <InfoIcon />,
    },
    {
      text: "Serviços",
      icon: <PetsIcon />,
    },
    {
      text: "Produtos",
      icon: <LocalMallIcon />,
    },
    {
      text: "Depoimentos",
      icon: <CommentIcon />,
    },
    {
      text: "Contato",
      icon: <LocalPhoneIcon />,
    },
    {
      text: "Carrinho",
      icon: <ShoppingCartIcon />,
    },
  ];

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

      <div className="nav-bar-menu-container">
        <HiOutlineBars3 onClick={() => setOpenMenu(true)} />
      </div>

      <Drawer
        open={openMenu}
        onClose={() => setOpenMenu(false)}
        anchor="right"
      >
        <Box
          sx={{width:250}}
          role="presentation"
          onClick={() => setOpenMenu(false)}
          onKeyDown={() => setOpenMenu(false)}
        >
          <List>
            {menuOptions.map((item) => (
              <ListItem key={item.text} disablePadding>
                <ListItemButton>
                  <ListItemIcon>{item.icon}</ListItemIcon>
                  <ListItemText primary={item.text} />
                </ListItemButton>
              </ListItem>
            ))}

          </List>
        </Box>
      </Drawer>

    </nav>
  );
};

export default Navbar;
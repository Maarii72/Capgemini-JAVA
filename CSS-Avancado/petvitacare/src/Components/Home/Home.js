import Navbar from "../Navbar/Navbar";
import '../Home/Home.css';
import CaoHome from "../../Assets/cao-home.png";

const Home = () => {
  return(
    <div className="home-container">
      <div className="home-container-navbar">
        <Navbar />
      </div>

      <div className="home-banner-container">
        <div className="home-banner-content">
          <div className="home-bannerImage-container">
            <img src={CaoHome} alt="Imagem do cachorro home container" />
          </div>

          <div className="home-banner-text-content">
            <h1>CUIDAMOS DO SEU PET COMO PARTE DA <span>FAMÍLIA</span></h1>
            <p>Banho, tosa, produtos, consultas e muito carinho, tudo para o bem-estar do seu melhor amigo.</p>
            <div className="home-banner-text-buttons">
              <button className="primary-button">Agendar Agora</button>
              <button className="secondary-button">Conheça nossos serviços</button>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};

export default Home;
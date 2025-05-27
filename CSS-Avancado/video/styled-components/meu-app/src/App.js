import './App.css';
import styled from 'styled-components';

const Titulo = styled.h1`
color: #31e636;
text-decoration: underline;
`;

const Subtitulo = styled.h2`
color: green;
font-size: 30px;
`;

const Artigo = styled.section`
color: #9392e2;
`;

const Titulo2 = styled.h1`
color: blue;
font-size: 25px;
`;

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <Titulo>Meu Site</Titulo>
        <Subtitulo>Subtítulo</Subtitulo>
        <Artigo>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Maiores fuga, officia inventore numquam quae sit quos sequi explicabo. Vero nam a atque rerum porro rem! Officiis tempora eos vero totam. Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit porro et nihil distinctio autem perferendis recusandae quo eius, alias nisi praesentium inventore architecto quisquam voluptates at velit fuga aliquam placeat. Lorem ipsum dolor sit amet consectetur adipisicing elit. Saepe consectetur ipsum officia obcaecati illum. Doloremque, saepe cupiditate enim, dicta quidem aliquam est sed aspernatur id illum nostrum modi adipisci? Obcaecati?</Artigo>
        <Titulo2>Segunda Parte</Titulo2>
        <Artigo>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Maiores fuga, officia inventore numquam quae sit quos sequi explicabo. Vero nam a atque rerum porro rem! Officiis tempora eos vero totam. Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit porro et nihil distinctio autem perferendis recusandae quo eius, alias nisi praesentium inventore architecto quisquam voluptates at velit fuga aliquam placeat. Lorem ipsum dolor sit amet consectetur adipisicing elit. Saepe consectetur ipsum officia obcaecati illum. Doloremque, saepe cupiditate enim, dicta quidem aliquam est sed aspernatur id illum nostrum modi adipisci? Obcaecati?</Artigo>
      </header>
    </div>
  );
}

export default App;

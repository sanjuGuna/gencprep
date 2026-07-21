import './App.css';
import {BrowserRouter, Link, Routes, Route} from 'react-router-dom';
import TrainerList from './TrainerList';
import TrainerDetails from './TrainerDetails';
import Home from './Home';
function App() {
  return (
    <BrowserRouter>
      <div>
        <h1>My Academy trainers app</h1>
        <nav>
          <Link to='/'>Home</Link>
          <Link to='/trainers'>Show trainer</Link>
        </nav>

        <Routes>
          <Route path="/" element={<Home/>}/>
          <Route path="/trainers" element={<TrainerList/>}/>
          <Route path="/trainers/:id" element={<TrainerDetails/>}/>
        </Routes>
      </div>
    </BrowserRouter>
  );
}

export default App;

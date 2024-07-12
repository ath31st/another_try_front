import './header.css';
import Navbar from '../navbar/navbar';

const Header = () => {
  return (
      <>
        <img src="/logo192.png" alt="Company Logo" className="logo"/>
        <link rel="icon" href="/favicon.ico"/>
        < Navbar/>
      </>
  );
};

export default Header;
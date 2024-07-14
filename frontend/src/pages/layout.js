import Navbar from '../widgets/navbar/navbar';
import Footer from '../widgets/footer/footer';

function Layout({children}) {
  return (
      <>
        <Navbar/>
        <main>{children}</main>
        <Footer/>
      </>
  );
}

export default Layout;
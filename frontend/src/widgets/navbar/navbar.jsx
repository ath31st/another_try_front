import './navbar.css';

const Navbar = () => {
  return (
      <div className="navbar">
        <a className="home-link" href="/">Home</a>
        <ul>
          <li>
            <a href="/api/new-user">New user</a>
          </li>
          <li>
            <a href="/api/users ">Users</a>
          </li>
          <li>
            <a href="//">About</a>
          </li>
        </ul>
      </div>
  );
};

export default Navbar;
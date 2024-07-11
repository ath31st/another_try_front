import React from 'react';
import {
  FiGithub,
  FiGlobe,
  FiLinkedin,
  FiTwitter,
  FiYoutube,
} from 'react-icons/fi';

import './footer.css';

const socialLinks = [
  {
    id: 1,
    icon: <FiGlobe/>,
    url: 'https://www.stoman.me/',
  },
  {
    id: 2,
    icon: <FiGithub/>,
    url: 'https://github.com/',
  },
  {
    id: 3,
    icon: <FiTwitter/>,
    url: 'https://twitter.com/',
  },
  {
    id: 4,
    icon: <FiLinkedin/>,
    url: 'https://www.linkedin.com/in/',
  },
  {
    id: 5,
    icon: <FiYoutube/>,
    url: 'https://www.youtube.com/c/',
  },
];

const year = new Date().getFullYear();

const Footer = () => {
  return (
      <div className="footer-container">
        <div className="footer">
          <p>Copyright © The good training project {year}</p>
          <ul className="footer-links">
            {socialLinks.map((link) => (
                <li key={link.id}>
                  <a href={link.url} target="__blank" rel="noopener noreferrer">
                    <i>{link.icon}</i>
                  </a>
                </li>
            ))}
          </ul>
        </div>
      </div>
  );
};

export default Footer;
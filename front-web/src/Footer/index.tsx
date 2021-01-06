import "./styles.css";
import { ReactComponent as InstagramIcon } from "./img/instagram.svg";
import { ReactComponent as LinkedinIcon } from "./img/linkedin.svg";
import { ReactComponent as YoutubeIcon } from "./img/youtube.svg";

function Footer() {
  return (
    <footer className="main-footer">
      App desenvolvido durante a 2ª ed. do evento Semana DevSuperior
      <div className="footer-icons">
        <a href="http://www.youtube.com/c/DevSuperior" target="_new">
          <YoutubeIcon />
        </a>
        <a href="http://www.linkedin.com/school/devsuperior" target="_new">
          <LinkedinIcon />
        </a>
        <a href="http://www.instagram.com/devsuperior.ig" target="_new">
          <InstagramIcon />
        </a>
      </div>
    </footer>
  );
}

export default Footer;

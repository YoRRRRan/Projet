package jeuxvideo;

import java.sql.SQLException;
import java.util.List;

import dataaccess.JeuxDAO;
import model.Jeux;

public class Main {
	public static void main(String[] args) {

		try {
			JeuxDAO jeuxDAO = new JeuxDAO();
			List<Jeux> gameList = jeuxDAO.getJeuxByGenre(2); // FPS
			for (Jeux jeux : gameList) {
				System.out.println(jeux);
			}
			
			
			jeuxDAO.updateTitreById(13, "Origami");
				
			Jeux jeux = new Jeux();
			jeux.setTitre("Shuffaball");
			jeux.setDescription("Bouncy fun");
			jeux.setPrix(1);
			jeux.setGenreId(8);
			jeux.setDateSortie(java.sql.Date.valueOf("2012-12-12"));
			jeux.setPaysOrigine("Ecosse");
			jeux.setConnexion("OffLine");
			jeux.setJeuxMode("Solo");
			
			jeuxDAO.insertJeux(jeux);
			
			jeuxDAO.deleteJeuxById(jeux.getJeuxId());
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package web;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import Bean.Image_Implem;
import Bean.ImmobilierMetierImp;
import Bean.ImmobilierOperMetier;

@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2,  
maxFileSize = 1024 * 1024 * 10,
maxRequestSize = 1024 * 1024 * 50)


public class ControleurServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private ImmobilierOperMetier metier;
	private Image_Implem img;
	@Override
	public void init() throws ServletException {
		metier=new ImmobilierMetierImp();
		img=new Image_Implem();
		
	}
@Override
protected void doGet(HttpServletRequest request, 
		HttpServletResponse response) 
		 throws ServletException, IOException {
	doPost(request, response);
}
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
	ImmobilierModele model=new ImmobilierModele();
	ImageModele model1=new ImageModele();
	request.setAttribute("model", model);
	request.setAttribute("model", model1);
	String action=request.getParameter("action");
	if(action!=null) {
		if (action.equals("Enregistrer")) {
			
			model.getImmobilier().setNom_imm(request.getParameter("nom_imm"));
			model.getImmobilier().setType_imm(request.getParameter("type_imm"));
			model.getImmobilier().setPrix(Double.parseDouble(request.getParameter("prix")));
			model.getImmobilier().setSuperficie(Integer.parseInt(request.getParameter("superficie")));
			model.getImmobilier().setAddress_imm(request.getParameter("address_imm"));
			model.getImmobilier().setDescription(request.getParameter("description"));
			model.getImmobilier().setStatut(request.getParameter("statut"));
			int code = metier.addImmobilier(model.getImmobilier());
			/*
			Collection<Part> parts = request.getParts();
			Iterator<Part> it = parts.iterator();
			Part p;
			while(it.hasNext()) {
				p = it.next();
				if(p.getName().compareTo("file")==0) {
					String fileName = code+extractFileName(p);
					String savePath = "C:\\Users\\LENOVO\\eclipse-workspace1\\Immobilier\\WebContent\\img\\" + File.separator +fileName;
					p.write(savePath+File.separator);
					model1.getImage().setFilename(fileName);
					model1.getImage().setPath(savePath);
					img.addImage(model1.getImage(),code);	
				}
			}*/
			
			for(Part part :request.getParts()) {
			  if(part.getName().compareTo("file")==0){
				String fileName = code+extractFileName(part);
				String savePath = "C:\\Users\\XPS\\ProjetS3-workspace\\Projet s3\\WebContent\\img_upload\\"  +fileName;
				part.write(savePath+File.separator);
				model1.getImage().setFilename(fileName);
				model1.getImage().setPath(savePath);
				img.addImage(model1.getImage(),code);
			  }
			}
		}
		
	}
	
	request.getRequestDispatcher("/WEB-INF/FormDepotAnn.jsp").
	forward(request, response);
	

}





private String extractFileName (Part part) {
	String contentDisp = part.getHeader("content-disposition");
	String[] items =contentDisp.split(";");
	for(String s : items) {
		if(s.trim().startsWith("filename")) {
			return s.substring(s.indexOf("=") + 2, s.length() - 1);
		}
	}
	return"";
}
}


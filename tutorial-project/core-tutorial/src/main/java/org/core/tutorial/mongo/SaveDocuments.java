package org.core.tutorial.mongo;

import java.io.File;
import java.io.IOException;
import org.bson.Document;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;
import com.mongodb.gridfs.GridFSInputFile;

public class SaveDocuments {
	
	public static MongoClient mongo;
	public static DB db;
	public static MongoDatabase database;
	
	static {
		try {
			mongo=DBConn.getConnection();
			db=mongo.getDB("test");
			database=mongo.getDatabase("test");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void saveFile(String path) {
		
		try {
			File file=new File(path);
			GridFS gfsPhoto=new GridFS(db, "photo");
			GridFSInputFile giFsInputFile=gfsPhoto.createFile(file);
			giFsInputFile.setFilename("image002");
			giFsInputFile.save();
			System.out.println("File saved Sucessfully!");
		}catch (IOException e) {
			System.out.println("Exception 2: "+e);
		}finally {
			mongo.close();
		}
	}
	public void getFile() {
		try {
			GridFS gfsPhoto=new GridFS(db, "photo");
			GridFSDBFile imageForOutput = gfsPhoto.findOne("image001");
			System.out.println("OUTPUT: "+imageForOutput);
		}catch (Exception e) {
			System.out.println("Exception 2:"+e);
		}finally {
			mongo.close();
		}
	}
	public static String getContentType(String path) {
		String contentType=null;
		try {
			File file = new File(path);
			String filename=file.getName();
			String[] ar= {"jpeg", "jpg","tiff","gif", "png", "bmp"};
			for(int i=0; i<ar.length;i++) {
				if(filename.contains(ar[i]) || filename.contains(ar[i].toUpperCase())) {
					contentType="image/"+ar[i];
				}
			}
			
			return contentType;
		}catch (Exception e) {
			System.out.println("Exception in getContentType method: "+e);
		}
		return null;
	}
	
	/** Method to check Metadata and Asset management 
	 * */
	public void saveRcd(String path) {
		try {
			File file = new File(path);
			
			// create a collection of name rcd if not available.
			MongoCollection<Document> collection=database.getCollection("rcd");
			System.out.println("Collection ::RCD:: created sucessfully!");
			
			GridFS gfs=new GridFS(db, "attachments");
			GridFSInputFile giFsInputFile=gfs.createFile(file);
			giFsInputFile.setFilename("image004.jpg");
			giFsInputFile.setChunkSize(5120);
			giFsInputFile.save();
			
			MongoCollection<Document> collection_files=database.getCollection("attachments.files");
			collection_files.drop();
			String contentType=null;
			if(giFsInputFile.getContentType()==null)
				contentType=SaveDocuments.getContentType(path);
		
			
			
			Document document=new Document("title","rcd_attachments")
					.append("metadata", new Document()
							.append("_class", "eu.ohim.rcd.efi.DocumentEntity")
							.append("_id", "RCD201800000001024-0002-0000")
							.append("provisionalId", "RCD201800000001024-0002")
							.append("designApplicationId", "RCD201800000001024")
							.append("documentType", "PROTECTED_VIEW")
							.append("rcdProtected", true)
							)
					.append("filename", giFsInputFile.getFilename())
					.append("aliases", giFsInputFile.getAliases())
					.append("chunkSize", giFsInputFile.getChunkSize())
					.append("uploadDate", giFsInputFile.getUploadDate())
					.append("length", giFsInputFile.getLength())
					.append("contentType", contentType)
					.append("md5", giFsInputFile.getMD5());
					
			collection.insertOne(document);
			
			System.out.println("\n"+"Document Added sucessfully!"+"\n");
			
			
			
		}catch (Exception e) {
			System.out.println("Exception 3: "+e);
		}finally {
			mongo.close();
		}
	}
	
	public static void main(String[] args) throws IOException {
		//new SaveDocuments();
		//new SaveDocuments().saveFile("d:\\Profiles\\dsingh.AD-ONE\\Desktop\\eFilingDetails\\lion.jpg");
		//new SaveDocuments().getFile();
		new SaveDocuments().saveRcd("d:\\\\Profiles\\\\dsingh.AD-ONE\\\\Desktop\\\\eFilingDetails\\\\legal_status.png");
		//String contentType=SaveDocuments.getContentType("d:\\\\\\\\Profiles\\\\\\\\dsingh.AD-ONE\\\\\\\\Desktop\\\\\\\\eFilingDetails\\\\\\\\legal_status.png");
	}
}

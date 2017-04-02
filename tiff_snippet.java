//http://log.robmeek.com/2005/08/write-tiff-in-java.html
protected boolean saveTiff(String filename, BufferedImage image) {
			
		File tiffFile = new File(filename);
		ImageOutputStream ios = null;
		ImageWriter writer = null;
		
		try {
			
			// find an appropriate writer
			Iterator it = ImageIO.getImageWritersByFormatName("TIF");
			if (it.hasNext()) {
				writer = (ImageWriter)it.next();	
			} else {
				return false;
			}
			
			// setup writer
			ios = ImageIO.createImageOutputStream(tiffFile);
			writer.setOutput(ios);
			TIFFImageWriteParam writeParam = new TIFFImageWriteParam(Locale.ENGLISH);
			writeParam.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
			//  see writeParam.getCompressionTypes() for available compression type strings
			writeParam.setCompressionType("PackBits"); 
			
			// convert to an IIOImage
			IIOImage iioImage = new IIOImage(image, null, null);
			// write it!
			writer.write(null, iioImage, writeParam);
			
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;		

	}

package action;

import java.io.File;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author k570
 * 文件上传
 *
 */
public class FileUpload extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private File uploadFile;//用户上传的文件
	private String uploadFileName;//上传文件的文件名
	private String uploadFileContentType;//上传文件的类型
	public File getUploadFile() {
		return uploadFile;
	}
	public void setUploadFile(File uploadFile) {
		this.uploadFile = uploadFile;
	}
	public String getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	public String getUploadFileContentType() {
		return uploadFileContentType;
	}
	public void setUploadFileContentType(String uploadFileContentType) {
		this.uploadFileContentType = uploadFileContentType;
	}
	@Override
	public String execute() throws Exception {
		System.out.println(uploadFile);
		System.out.println(uploadFileContentType);
		System.out.println(uploadFileName);
		/*if (uploadFile!=null) {
			String dataDir = "e:\\newworkspace\\";//上传文件的存放目录
			File savedFile = new File(dataDir,uploadFileName);//上传文件在服务器的具体存放位置
			
			uploadFile.renameTo(savedFile);//将上传文件从临时文件复制到指定文件
			System.out.println("==========if方法执行了么？==========");
		}else {
			return INPUT;
		}*/
		return SUCCESS;
	}
	
	
}

package action;

import java.io.File;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author k570
 * �ļ��ϴ�
 *
 */
public class FileUpload extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private File uploadFile;//�û��ϴ����ļ�
	private String uploadFileName;//�ϴ��ļ����ļ���
	private String uploadFileContentType;//�ϴ��ļ�������
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
			String dataDir = "e:\\newworkspace\\";//�ϴ��ļ��Ĵ��Ŀ¼
			File savedFile = new File(dataDir,uploadFileName);//�ϴ��ļ��ڷ������ľ�����λ��
			
			uploadFile.renameTo(savedFile);//���ϴ��ļ�����ʱ�ļ����Ƶ�ָ���ļ�
			System.out.println("==========if����ִ����ô��==========");
		}else {
			return INPUT;
		}*/
		return SUCCESS;
	}
	
	
}

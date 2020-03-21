package lesson9;

@Version(version = 7.1, nameOfVersion = "Nougat")
public class MyService {
    private String nameOfService;
    private boolean statusOfWork;
    private String language;

    public MyService(){
    nameOfService="default service";
    statusOfWork=true;
    language="eu";
    }

    public MyService(String nameOfService, boolean statusOfWork, String language){
        this.nameOfService=nameOfService;
        this.statusOfWork=statusOfWork;
        this.language=language;
    }

    private void thisClassInfo(){
        System.out.println("Name of service is: " + nameOfService);
        System.out.println("You have to know eu language for use the service");
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime*result+ nameOfService.hashCode();
        result = prime*result+language.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj){
            return true;
        }
        if (obj==null || this.getClass()!=obj.getClass())
        return false;
        MyService guest = (MyService) obj;
        return statusOfWork==guest.statusOfWork && (nameOfService==guest.nameOfService ||
                (nameOfService!=null&&nameOfService.equals(guest.nameOfService))) &&(language==guest.language
                ||(language!=null && language.equals(guest.language)));
    }



    public void setNameOfService(String nameOfService) {
        this.nameOfService = nameOfService;
    }

    public void setStatusOfWork(boolean statusOfWork) {
        this.statusOfWork = statusOfWork;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getNameOfService() {
        return nameOfService;
    }

    public boolean isStatusOfWork() {
        return statusOfWork;
    }

    public String getLanguage() {
        return language;
    }
}

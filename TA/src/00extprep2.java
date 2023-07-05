public class testingtestNG(){
    @BeforeClass
    public void beforeclass(){
        System.out.println("before class");
    }
    @AfterClass
    public void afterclass(){
        System.out.println("after class");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before Method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("after Method");
    }
    @Test(priority=1)
    public void test1(){
        System.out.println("test case 1")
    }
    @Test(priority=2)
    public void test2(){
        System.out.println("test case 2")
    }
    @Test(priority=3)
    public void test3(){
        System.out.println("test case 3")
    }


    @Test(dataProvider="dataproviders")
    public void test1(String username,String password){
        System.out.println("Username: "+username+" Password: "+password);


    }
    @DataProviders
    public String[][] dataproviders(){
        String[][] data=new String[4][2];
        data[0][0]="Agam";
        data[0][1]="";
        data[1][0]="";
        data[1][1]="";
        data[2][0]="";
        data[2][1]="";
        data[3][0]="";
        data[3][1]="";
        return data;

    }

    @Parameter({userid,userpass})
	@Test
	public void test1(String username,String password){
		System.out.println("UserName : "+userName);
		System.out.println("Password:"+password);
	}

    
}

public class testing1(){
    WebElement rdriver;
    public void invokebrowser(WebElement ldriver){
        rdriver=ldriver;
        PageFactory.initElement(rdriver,this)
    }

    @FindBy(id="userid")
    WebElement testusername;
    @FindBy(id="pswd")
    WebElement testpassword;
    @FindBy(id="button")
    Webelement button1;
    public void setUserName(String uname){
        testusername.sendKeys(uname);
    }
    public void setPassword(String uname){
        testpassword.sendKeys(uname);
    }
    public void clickbutton(){
        button1.click();
    }
}
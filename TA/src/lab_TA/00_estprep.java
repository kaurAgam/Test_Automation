public class lab1(){
    ChromeDriver driver;
    public void invokeBrowser(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://google.com");
    }
    public void getPageTitle(){
        System.out.println("the page title is:"+driver.getTitle());
    }
    public void navigate(){
        driver.navigate().to("http://yahho.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
    public void closeBrowser() {
		driver.quit();
		
	}
    //--------------------------------------------------------------------------------

    public void login(String username,String password){
        WebElement userid;
        userid=driver.findElement(By.name("uid"))
        userid.sendKeys(username);
        driver.getElement(By.name("password")).sendKeys(password);
        driver.getElement(By.name("login")).click();
    }
    public void addAccount(String customerid){
        driver.findElement(By.linktext("create account")).click();
        driver.findElement(By.name("cusid")).sendKeys(customerid);
        WebElement seldropdown=driver.findElement(By.name("dropdown"));
        Select selectacc=new Select(seldropdown);
        selectacc.selectByVisibleText("current");
        driver.findElement(By.name("indeposit")).sendKeys("568976");
        deiver.findElement(By.name("button2")).click();
    }
//----------------------------------------------------------------------------------

    public void invokebrowser2(){
        driver.manage().deleteAllCookies();
        driver.manage().get("https://google.com");
        driver.manage().timeouts().pageLoadTimeout(4,TimeUnit.SECONDS);
        driver.manage().timeout().implicitlyWait();
        driver.manage.get("https://www.hongkiat.com/blog/websites-creative-mouse-over-effects/");
    }

    public void fluentwait( int timeout,int pollingtime,By by){
        Wait<WebDriver> = FluentWait<WebDriver>(driver).withTimeouts(Duration.ofSeconds(timeout))
                                                       .pollingEvery(Duration.ofSeconds(pollingtime))
                                                       .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visiblityofElementLocatedby(by));
    }

    public void explicitwait(Duration timeout,By by){//condition wait till element visible
        WebDriverWait wait=new WebDriverWait(driver,timeout);
        wait.until(ExpectedConditions.visiblityofAllElementsLocatedby(by));
    }

    public void mousehover(){
        WebElement mainmenu=driver.findElement(By.xpath(""))
        Actions action new Actions(driver);
        action.moveToElement(mainmenu).build().perform();
        By byalllist=By.xpath("all list element ka xpath");
        WailUntillElementVisible(Duration.bySeconds(10),byalllist)
        WebElement allist=driver.findElement(By.xpath(""));
        action.moveToElement(alllist).click(alllist).build().perform();

    }
    public void dargndrop(){
        driver.get("https://jqueryui.com")
        WebElement frameid=driver.findElement(By.classNmae("framee"));
        driver.switchTo().frame(frameid)
        WebDriver source=driver.findElement(By.id("draggable"));
        WebDriver target=driver.findElement(By.id("droppable"));
        Actions action =new Actions(driver)
        action.dragAndDrop(source,target).build().perform();

            }
    public void invokeanybrowser(String browser){
        if(browser.equalsIgnoreCase("chrome")){
            ChromeDriver driver=new ChromeDriver();
            // or first define upar===> WebDriver driver the define ====> driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("firefox")){
            FirefoxDriver driver=new FirefoxDriver();
        }
    }


}
public void lab1(){
    public void static main(String[] args){
        ChromeDriver driver=new ChromeDriver();
        driver.manage().deletAllCookies();
        driver.get("https://--------------");
        String parentwindow=driver.getWindowHandle();
        System.out.println("parent window:"+parentwindow);
        driver.switchTo().frame("iframeResult");
        driver.findElement(By.tagname("Button")).click();
        String childwindow=driver.getWindowHandles().toArray()[1].toString();
        System.out.println("child window"+childwindow);

        driver.switchTo(parentwindow);
        System.out.println(get.Title())
        
        driver.close();

        driver.switchTo(childwindow);
        System.out.println(get.Title());

        driver.quit()

}
}
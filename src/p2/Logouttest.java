package p2;

import org.testng.annotations.Test;

import p1.Logout;

public class Logouttest extends Select1test {
@Test(priority=4)
public void test3() throws InterruptedException {
Logout ob =new Logout(driver);
ob.log();
Thread.sleep(3000);
}}

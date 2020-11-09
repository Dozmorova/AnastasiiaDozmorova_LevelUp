package homework6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Ex2 extends BaseMailTest {

    @Test
    public void runEx2() {

        WebElement writeLetter = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".compose-button__txt")));
        assertEquals(writeLetter.getText(), "Написать письмо");
        writeLetter.click();
        WebElement destination = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".container--zU301")));
        destination.sendKeys("nastya.test.91@mail.ru");
        WebElement subject = driver.findElement(By.cssSelector("input[name='Subject']"));
        subject.sendKeys("Тест");
        WebElement body = driver.findElement(By.cssSelector("[role='textbox']"));
        body.sendKeys("Test ex2");

        WebElement sendLetter = driver.findElement(By.xpath("//*[@title='Отправить']"));
        sendLetter.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@title='Закрыть']"))).click();

        WebElement sentGo = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Отправленные')]")));
        sentGo.click();
        WebElement verifySendLetter = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@title='nastya.test.91@mail.ru']")));

        WebElement TestFolderGo = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Тест')]")));
        TestFolderGo.click();

        WebElement letterInTest = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@title='Анастасия <nastya.test.91@mail.ru>']")));
        letterInTest.click();
        String getDestination = wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//*[@class='letter-contact']"))).getText();

        String getSubject = driver.findElement
                (By.xpath("//*[@class='thread__subject']")).getText();
        String getBody = driver.findElement
                (By.xpath("//div[contains(text(),'Test ex2')]")).getText();

        soft.assertEquals(getDestination, "Анастасия");
        soft.assertEquals(getSubject, "Тест");
        soft.assertEquals(getBody, "Test ex2");
        soft.assertAll();
    }

}

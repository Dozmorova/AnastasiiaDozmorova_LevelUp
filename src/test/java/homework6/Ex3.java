package homework6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class Ex3 extends BaseMailTest{

    @Test
    public void runEx3() {
        WebElement writeLetter = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".compose-button__txt")));
        assertEquals(writeLetter.getText(), "Написать письмо");
        writeLetter.click();
        WebElement destination = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".container--zU301")));
        destination.sendKeys("nastya.test.91@mail.ru");
        WebElement subject = driver.findElement(By.cssSelector("input[name='Subject']"));
        subject.sendKeys("Test");
        WebElement body = driver.findElement(By.cssSelector("[role='textbox']"));
        body.sendKeys("Test ex3");

        WebElement sendLetter = driver.findElement(By.xpath("//*[@title='Отправить']"));
        sendLetter.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@title='Закрыть']"))).click();

        WebElement sentGo = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Входящие')]")));
        sentGo.click();
        WebElement verifyIncomingLetter = driver.findElement(By.cssSelector(".mt-snt-tmslf__subject-value"));
        verifyIncomingLetter.click();
        WebElement mysefLetter = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@title='Анастасия <nastya.test.91@mail.ru>']")));
        mysefLetter.click();

        String getDestination = wait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("//*[@title='nastya.test.91@mail.ru']"))).getText();
        String getSubject = driver.findElement
                (By.xpath("//*[@class='thread__header']//h2")).getText();
        String getBody = driver.findElement
                (By.xpath("//div[contains(text(),'Test ex3')]")).getText();

        soft.assertEquals(getDestination, "nastya.test.91@mail.ru");
        soft.assertEquals(getSubject, "Test");
        soft.assertEquals(getBody, "Test ex3");
    }
}

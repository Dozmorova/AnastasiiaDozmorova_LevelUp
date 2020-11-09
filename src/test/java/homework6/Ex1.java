package homework6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class Ex1 extends BaseMailTest {

    @Test
    public void runEx1() {

        WebElement writeLetter = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".compose-button__txt")));
        assertEquals(writeLetter.getText(), "Написать письмо");
        writeLetter.click();
        WebElement destination = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".container--zU301")));
        destination.sendKeys("nastya.test.91@mail.ru");
        WebElement subject = driver.findElement(By.cssSelector("input[name='Subject']"));
        subject.sendKeys("Test");
        WebElement body = driver.findElement(By.cssSelector("[role='textbox']"));
        body.sendKeys("Test ex1");

        WebElement saveLetter = driver.findElement(By.xpath("//*[@title='Сохранить']"));
        saveLetter.click();
        WebElement closeLetter = driver.findElement(By.xpath("//*[@title='Закрыть']"));
        closeLetter.click();
        WebElement draftsGo = driver.findElement(By.xpath("//div[contains(text(),'Черновики')]"));
        draftsGo.click();
        WebElement verifySavedLetter = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@title='nastya.test.91@mail.ru']")));
        verifySavedLetter.click();

        String getDestination = wait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("//*[@title='nastya.test.91@mail.ru']"))).getText();
        String getSubject = driver.findElement
                (By.cssSelector("input[name='Subject']")).getAttribute("value");
        String getBody = driver.findElement
                (By.cssSelector("[role='textbox']")).getText();

        soft.assertEquals(getDestination, "nastya.test.91@mail.ru");
        soft.assertEquals(getSubject, "Test");
        soft.assertEquals(getBody, "Test ex1\n" + "\n" + "ПОДПИСЬ");

        WebElement sendLetter = driver.findElement(By.xpath("//*[@title='Отправить']"));
        sendLetter.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@title='Закрыть']"))).click();

        soft.assertEquals(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='octopus__title']"))).getText(), "У вас нет незаконченных\nили неотправленных писем");

        WebElement sentGo = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Отправленные')]")));
        sentGo.click();
        WebElement verifySendLetter = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@title='nastya.test.91@mail.ru']")));
        soft.assertAll();
    }

}
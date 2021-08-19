/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Notificacion;
import Services.NotifDao;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Forchiney
 */
public class NotificationControllerTest {
    
    public NotificationControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of viewNotifs method, of class NotificationController.
     */
    @Test
    public void testViewNotifs() throws Exception {
        System.out.println("viewNotifs");
        int id = 0;
        NotificationController instance = new NotificationController();
        String expResult = "";
        String result = instance.viewNotifs(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of init method, of class NotificationController.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        NotificationController instance = new NotificationController();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of newEmailPage method, of class NotificationController.
     */
    @Test
    public void testNewEmailPage() {
        System.out.println("newEmailPage");
        NotificationController instance = new NotificationController();
        String expResult = "";
        String result = instance.newEmailPage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of redirectViewMailPage method, of class NotificationController.
     */
    @Test
    public void testRedirectViewMailPage() {
        System.out.println("redirectViewMailPage");
        NotificationController instance = new NotificationController();
        String expResult = "";
        String result = instance.redirectViewMailPage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sendmail method, of class NotificationController.
     */
    @Test
    public void testSendmail() {
        System.out.println("sendmail");
        NotificationController.sendmail();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of quartzMail method, of class NotificationController.
     */
    @Test
    public void testQuartzMail() {
        System.out.println("quartzMail");
        NotificationController instance = new NotificationController();
        String expResult = "automatic mail has benn succesfullly send";
        String result = instance.quartzMail();
        assertEquals(expResult, result);
        if (!result.equals(expResult))  {
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getShedule method, of class NotificationController.
     */
    @Test
    public void testGetShedule() {
        System.out.println("getShedule");
        NotificationController instance = new NotificationController();
        String expResult = "";
        String result = instance.getShedule();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setShedule method, of class NotificationController.
     */
    @Test
    public void testSetShedule() {
        System.out.println("setShedule");
        String shedule = "";
        NotificationController instance = new NotificationController();
        instance.setShedule(shedule);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimes method, of class NotificationController.
     */
    @Test
    public void testGetTimes() {
        System.out.println("getTimes");
        NotificationController instance = new NotificationController();
        List<String> expResult = null;
        List<String> result = instance.getTimes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimes method, of class NotificationController.
     */
    @Test
    public void testSetTimes() {
        System.out.println("setTimes");
        List<String> times = null;
        NotificationController instance = new NotificationController();
        instance.setTimes(times);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNotifs method, of class NotificationController.
     */
    @Test
    public void testGetNotifs() {
        System.out.println("getNotifs");
        NotificationController instance = new NotificationController();
        List<Notificacion> expResult = null;
        List<Notificacion> result = instance.getNotifs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNotifs method, of class NotificationController.
     */
    @Test
    public void testSetNotifs() {
        System.out.println("setNotifs");
        List<Notificacion> notifs = null;
        NotificationController instance = new NotificationController();
        instance.setNotifs(notifs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNdao method, of class NotificationController.
     */
    @Test
    public void testGetNdao() {
        System.out.println("getNdao");
        NotificationController instance = new NotificationController();
        NotifDao expResult = null;
        NotifDao result = instance.getNdao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNdao method, of class NotificationController.
     */
    @Test
    public void testSetNdao() {
        System.out.println("setNdao");
        NotifDao ndao = null;
        NotificationController instance = new NotificationController();
        instance.setNdao(ndao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDestinatario method, of class NotificationController.
     */
    @Test
    public void testGetDestinatario() {
        System.out.println("getDestinatario");
        NotificationController instance = new NotificationController();
        String expResult = "";
        String result = instance.getDestinatario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDestinatario method, of class NotificationController.
     */
    @Test
    public void testSetDestinatario() {
        System.out.println("setDestinatario");
        String destinatario = "";
        NotificationController instance = new NotificationController();
        instance.setDestinatario(destinatario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAsunto method, of class NotificationController.
     */
    @Test
    public void testGetAsunto() {
        System.out.println("getAsunto");
        NotificationController instance = new NotificationController();
        String expResult = "";
        String result = instance.getAsunto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAsunto method, of class NotificationController.
     */
    @Test
    public void testSetAsunto() {
        System.out.println("setAsunto");
        String asunto = "";
        NotificationController instance = new NotificationController();
        instance.setAsunto(asunto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCuerpo method, of class NotificationController.
     */
    @Test
    public void testGetCuerpo() {
        System.out.println("getCuerpo");
        NotificationController instance = new NotificationController();
        String expResult = "";
        String result = instance.getCuerpo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCuerpo method, of class NotificationController.
     */
    @Test
    public void testSetCuerpo() {
        System.out.println("setCuerpo");
        String cuerpo = "";
        NotificationController instance = new NotificationController();
        instance.setCuerpo(cuerpo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVeriController method, of class NotificationController.
     */
    @Test
    public void testGetVeriController() {
        System.out.println("getVeriController");
        NotificationController instance = new NotificationController();
        VerificationController expResult = null;
        VerificationController result = instance.getVeriController();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVeriController method, of class NotificationController.
     */
    @Test
    public void testSetVeriController() {
        System.out.println("setVeriController");
        VerificationController veriController = null;
        NotificationController instance = new NotificationController();
        instance.setVeriController(veriController);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdUsuario method, of class NotificationController.
     */
    @Test
    public void testGetIdUsuario() {
        System.out.println("getIdUsuario");
        NotificationController instance = new NotificationController();
        int expResult = 0;
        int result = instance.getIdUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdUsuario method, of class NotificationController.
     */
    @Test
    public void testSetIdUsuario() {
        System.out.println("setIdUsuario");
        int idUsuario = 0;
        NotificationController instance = new NotificationController();
        instance.setIdUsuario(idUsuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

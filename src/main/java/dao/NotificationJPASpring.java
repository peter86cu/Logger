package dao;




import org.springframework.data.jpa.repository.JpaRepository;


import modelo.Notification;



public interface NotificationJPASpring extends JpaRepository <Notification, String> {


}

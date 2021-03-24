import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean == bean2);

        Cat beanCat =
                (Cat) applicationContext.getBean("cat");
        Cat beanCat2 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat == beanCat2);

        //почему нет context.close();
        //где конфиг файл, разрешающий аннотации? <context:annotation-config/ > в наш конфигурационный файл
        //чем отличается с помощью аннотаций и с помощью java конфигурирование
        //pom xml не добавлена зависимость
        //spring core spring beans в pom
        //application.run в мейне
        //POJO-класс
        //public HelloWorld getHelloWorld() из кофиг???
        //, proxyMode= ScopedProxyMode.TARGET_CLASS чего?
        //_1_https://stackoverflow.com/questions/14731092/spring-request-scope-bean
        //_2_https://stackoverflow.com/questions/54756089/java-lang-illegalstateexception-no-scope-registered-for-scope-name-request
        //по scope не понятно

    }
}
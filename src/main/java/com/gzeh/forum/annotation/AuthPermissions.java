package com.gzeh.forum.annotation;
import java.lang.annotation.Documented;  
import java.lang.annotation.ElementType;  
import java.lang.annotation.Retention;  
import java.lang.annotation.RetentionPolicy;  
import java.lang.annotation.Target;  
  
import org.springframework.web.bind.annotation.Mapping;  
  
@Target({ElementType.METHOD,ElementType.TYPE})  
@Retention(RetentionPolicy.RUNTIME)  
@Documented  
@Mapping  
public @interface AuthPermissions {
  
    /** 
     * 权限标识 anon session sessionAndAuthc
     * @return 
     */  
	AnnAuthType authName() default AnnAuthType.sessionAndAuthc;
    /*
     验证签名
     */
	boolean validateSign() default true;
	
}  
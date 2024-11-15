/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corespring.patasamigas.utils;

import com.corespring.patasamigas.model.DAOs.GenericAbstractDAO;
import com.corespring.patasamigas.model.Pessoa;
import com.corespring.patasamigas.service.GenericAbstractService;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Set;
import lombok.experimental.UtilityClass;
import org.reflections.Reflections;
/**
 *
 * @author Erick
 */
@UtilityClass
public class DatabaseUtils {

    /**
     *
   
     * @param entity
     * @return 
     * @throws java.lang.Throwable 
     */
   public boolean exists(Pessoa entity) throws Throwable {
    Reflections reflections = new Reflections("com.corespring.patasamigas.service");
    Set<Class<? extends GenericAbstractService>> classes = reflections.getSubTypesOf(GenericAbstractService.class);

    for (Class<? extends GenericAbstractService> clazz : classes) {
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            if (GenericAbstractDAO.class.isAssignableFrom(field.getType())) {
                field.setAccessible(true); // Make the field accessible

                GenericAbstractService serviceInstance = clazz.getDeclaredConstructor().newInstance();
                GenericAbstractDAO dao = (GenericAbstractDAO) field.get(serviceInstance);

                if (dao.get(entity.getId()) == null) {
                    return false; 
                }
            }
        }
    }
    return true;
}
}

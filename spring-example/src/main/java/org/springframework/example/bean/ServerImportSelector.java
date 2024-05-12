package org.springframework.example.bean;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.lang.NonNull;

import java.util.Map;
@SuppressWarnings("unchecked")
public class ServerImportSelector implements ImportSelector {

    @Override
    @NonNull
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        Map<String, Object> annotationAttributes = importingClassMetadata.getAnnotationAttributes(EnableServer.class.getName());
        assert annotationAttributes != null;
        Class<? extends Server> type = (Class<? extends Server>) annotationAttributes.get("type");
        return new String[]{type.getName()};
    }
}

package org.springframework.example.bean.message;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;

public class OnSystemPropertyCondition implements Condition {

    /**
     *
     * @param context the condition context
     * @param metadata the metadata of the {@link org.springframework.core.type.AnnotationMetadata class}
     * or {@link org.springframework.core.type.MethodMetadata method} being checked
     * @return is candidate component
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        MultiValueMap<String, Object> attributes = metadata
                .getAllAnnotationAttributes(ConditionalOnSystemProperties.class.getName());
        if (attributes == null) {
            return false;
        }
        String name = (String) attributes.getFirst("name");
        String value = (String) attributes.getFirst("value");
        if (StringUtils.hasText(name) && StringUtils.hasText(value)) {
            String actualV = context.getEnvironment().getProperty(name);
            return value.equals(actualV);
        }

        return false;
    }
}

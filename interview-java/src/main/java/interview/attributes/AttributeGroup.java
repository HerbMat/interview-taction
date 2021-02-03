package interview.attributes;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Contains group of attributes.
 */
public class AttributeGroup implements AttributeDescription {
    private List<AttributeDescription> attributeDescriptionList;
    private String name;

    public AttributeGroup(String name, List<AttributeDescription> attributeDescriptionList) {
        this.name = name;
        this.attributeDescriptionList = List.copyOf(attributeDescriptionList);
    }

    @Override
    public String getDescription() {
        final var sb = new StringBuilder();
        sb.append("\"");
        sb.append(name);
        sb.append("\": {");
        sb.append(getAttributesDescription());
        sb.append(" }");

        return sb.toString();
    }

    private String getAttributesDescription() {
        return attributeDescriptionList.stream()
                .map(AttributeDescription::getDescription)
                .collect(Collectors.joining(",\n"));
    }
}

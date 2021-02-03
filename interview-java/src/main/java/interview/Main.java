package interview;

import interview.attributes.Attribute;
import interview.attributes.AttributeDescription;
import interview.attributes.AttributeGroup;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        final var attributeDescs = new ArrayList<AttributeDescription>();
        final var attributeGroup1 = new AttributeGroup("Attributes 1",
                List.of(
                        new Attribute("Attribute 1", "Value 1"),
                        new Attribute("Attribute 2", "Value 2")
                )
        );
        attributeDescs.add(attributeGroup1);
        attributeDescs.add(new Attribute("Attribute 3", "Value 3"));
        final var attributeGroup3 = new AttributeGroup("Attributes 3",
                List.of(
                        new Attribute("Attribute 4", "Value 4")
                )
        );
        final var  attributeGroup2 = new AttributeGroup("Attributes 2",
                List.of(
                        attributeGroup3,
                        new Attribute("Attribute 5", "Value 5")
                )
        );
        attributeDescs.add(attributeGroup2);
        final var productAttributes =new AttributeGroup("Product Attributes", attributeDescs);
        System.out.println("Attributes Description :");
        System.out.printf("{ %s }", productAttributes.getDescription());
    }
}

package interview.attributes;

public record Attribute(String name, String value) implements AttributeDescription {

        @Override
        public String getDescription() {
                return String.format("\"%s\": \"%s\"", name, value);
        }
}

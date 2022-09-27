public class BodyPart {
    final static BodyPart LEG = new BodyPart("Leg");
    final static BodyPart HEAD = new BodyPart("Head");
    final static BodyPart ARM = new BodyPart("arm");
    final static BodyPart CHEST = new BodyPart("chest");

    private String bodyPart;

    private BodyPart(String bodyPart){
        this.bodyPart = bodyPart;
    }

    public String toString(){
        return this.bodyPart;
    }
}

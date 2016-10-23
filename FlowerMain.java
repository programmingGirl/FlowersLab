/**
 * Class main which is checking the entire package by adding a flower to the bucket.
 */
public class FlowerMain {
    public static void main(String args[]) {
        FlowerBucket bucket = new FlowerBucket();
        FlowerSpec rose = new FlowerSpec();
        rose.setType("Rose");
        rose.setFresh(true);
        rose.setLength(50);
        rose.setPrice(5);
        rose.setColor(FlowerColor.RED);
        bucket.addFlower(rose);
        bucket.searchFlowers(rose);
        System.out.println(bucket);
    }
}

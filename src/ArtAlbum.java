public class ArtAlbum extends Book {

    String paperQuality = "";

    ArtAlbum(String name, int numberOfPages, String paperQuality) {
        super(name, numberOfPages);
        this.paperQuality = paperQuality;
    }

    @Override
    public String toString() {
        return "Name:" + name + " NumberOfPages:" + numberOfPages + " PaperQuality:" + paperQuality;
    }

}

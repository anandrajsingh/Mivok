package android.example.mivok;

public class Word {
    private String mDefaultTranslation;
    private String mMivokTranslation;
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mAudioResourceID;


    public Word(String defaultTranslation, String mivokTranslation, int audioResourceID){
        mDefaultTranslation = defaultTranslation;
        mMivokTranslation = mivokTranslation;
        mAudioResourceID = audioResourceID;
    }
    public Word(String defaultTranslation, String mivokTranslation, int imageResourceID, int audioResourceID){
        mDefaultTranslation = defaultTranslation;
        mMivokTranslation = mivokTranslation;
        mImageResourceID = imageResourceID;
        mAudioResourceID = audioResourceID;
    }

    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getmMivokTranslation(){
        return mMivokTranslation;
    }
    public int getmImageResourceID(){ return  mImageResourceID;}
    public int getmAudioResourceID(){ return mAudioResourceID;}
    public boolean hasImage(){ return mImageResourceID != NO_IMAGE_PROVIDED;}
}

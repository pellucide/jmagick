package magick;

public interface AlphaChannelType {
    /*
        Important! Constant values should correspond to:
        http://www.imagemagick.org/api/MagickCore/image_8h_source.html
    */
    public final static int UndefinedAlphaChannel=0;
    public final static int ActivateAlphaChannel=1;
    public final static int BackgroundAlphaChannel=2;
    public final static int CopyAlphaChannel=3;
    public final static int DeactivateAlphaChannel=4;
    public final static int ExtractAlphaChannel=5;
    public final static int OpaqueAlphaChannel=6;
    public final static int ResetAlphaChannel=7; /* deprecated */
    public final static int SetAlphaChannel=8;
    public final static int ShapeAlphaChannel=9;
    public final static int TransparentAlphaChannel=10;
    public final static int FlattenAlphaChannel=11;
    public final static int RemoveAlphaChannel=11;
    public final static int AssociateAlphaChannel=13;
    public final static int DisassociateAlphaChannel=14;

}



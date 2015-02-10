package magick;

public interface ImageLayerMethod {
    /* Important! Constant values should correspond to enum ImageLayerMethod:
       http://www.imagemagick.org/api/MagickCore/layer_8h_source.html#l00034
     */
    public final static int UndefinedLayer = 0;
    public final static int CoalesceLayer = 1;
    public final static int CompareAnyLayer = 2;
    public final static int CompareClearLayer = 3;
    public final static int CompareOverlayLayer = 4;
    public final static int DisposeLayer = 5;
    public final static int OptimizeLayer = 6;
    public final static int OptimizeImageLayer = 7;
    public final static int OptimizePlusLayer = 8;
    public final static int OptimizeTransLayer = 9;
    public final static int RemoveDupsLayer = 10;
    public final static int RemoveZeroLayer = 11;
    public final static int CompositeLayer = 12;
    public final static int MergeLayer = 13;
    public final static int FlattenLayer = 14;
    public final static int MosaicLayer = 14;
    public final static int TrimBoundsLayer=16;
}



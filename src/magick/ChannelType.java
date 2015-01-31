package magick;

public interface ChannelType {
    /* Important! Constant values should correspond to enum ChannelType:
       http://www.imagemagick.org/api/MagickCore/magick-type_8h_source.html#l00177
     */
    public final static int UndefinedChannel=0;
    public final static int RedChannel = 0x0001;
    public final static int GrayChannel = 0x0001;
    public final static int CyanChannel = 0x0001;
    public final static int GreenChannel = 0x0002;
    public final static int MagentaChannel = 0x0002;
    public final static int BlueChannel = 0x0004;
    public final static int YellowChannel = 0x0004;
    public final static int AlphaChannel = 0x0008;
    public final static int OpacityChannel = 0x0008;
    public final static int MatteChannel = 0x0008; /* deprecated */
    public final static int BlackChannel = 0x0020;
    public final static int IndexChannel = 0x0020;
    public final static int CompositeChannels = 0x002F;
    public final static int AllChannels = 0x7ffffff;

    /* Special purpose channel types.  */
    public final static int TrueAlphaChannel = 0x0040; /* extract actual alpha channel from opacity */
    public final static int RGBChannels = 0x0080; /* set alpha from grayscale mask in RGB */
    public final static int GrayChannels = 0x0080;
    public final static int SyncChannels = 0x0100; /* channels should be modified equally */
    public final static int DefaultChannels = ((AllChannels | SyncChannels) &~ OpacityChannel);
}



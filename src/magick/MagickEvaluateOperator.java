package magick;

public interface MagickEvaluateOperator {
    /* Important! Constant values should correspond to:
       http://www.imagemagick.org/api/MagickCore/statistic_8h_source.html#l00074
    */
    public final static int UndefinedEvaluateOperator=0;
    public final static int AddEvaluateOperator=1;
    public final static int AndEvaluateOperator=2;
    public final static int DivideEvaluateOperator=3;
    public final static int LeftShiftEvaluateOperator=4;
    public final static int MaxEvaluateOperator=5;
    public final static int MinEvaluateOperator=6;
    public final static int MultiplyEvaluateOperator=7;
    public final static int OrEvaluateOperator=8;
    public final static int RightShiftEvaluateOperator=9;
    public final static int SetEvaluateOperator=10;
    public final static int SubtractEvaluateOperator=11;
    public final static int XorEvaluateOperator=12;
    public final static int PowEvaluateOperator=13;
    public final static int LogEvaluateOperator=14;
    public final static int ThresholdEvaluateOperator=15;
    public final static int ThresholdBlackEvaluateOperator=16;
    public final static int ThresholdWhiteEvaluateOperator=17;
    public final static int GaussianNoiseEvaluateOperator=18;
    public final static int ImpulseNoiseEvaluateOperator=19;
    public final static int LaplacianNoiseEvaluateOperator=20;
    public final static int MultiplicativeNoiseEvaluateOperator=21;
    public final static int PoissonNoiseEvaluateOperator=22;
    public final static int UniformNoiseEvaluateOperator=23;
    public final static int CosineEvaluateOperator=24;
    public final static int SineEvaluateOperator=25;
    public final static int AddModulusEvaluateOperator=26;
    public final static int MeanEvaluateOperator=27;
    public final static int AbsEvaluateOperator=28;
    public final static int ExponentialEvaluateOperator=29;
    public final static int MedianEvaluateOperator=30;
    public final static int SumEvaluateOperator=31;
    public final static int RootMeanSquareEvaluateOperator=32;
}


package p106g3;

/* renamed from: g3.f */
/* loaded from: classes.dex */
public final class C2234f {

    /* renamed from: a */
    public static final double f10202a = 0.0d;

    /* renamed from: b */
    public static final /* synthetic */ int f10203b = 0;

    static {
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r2 = 4621819117588971520(0x4024000000000000, double:10.0)
            r4 = 4618441417868443648(0x4018000000000000, double:6.0)
            double r2 = java.lang.Math.pow(r2, r4)
            double r0 = r0 / r2
            p106g3.C2234f.f10202a = r0
            return
    }

    /* renamed from: a */
    public static double m5833a(long r2) {
            long r0 = android.os.SystemClock.elapsedRealtimeNanos()
            long r0 = r0 - r2
            double r2 = (double) r0
            double r0 = p106g3.C2234f.f10202a
            double r2 = r2 * r0
            return r2
    }
}

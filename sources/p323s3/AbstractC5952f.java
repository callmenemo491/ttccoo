package p323s3;

/* renamed from: s3.f */
/* loaded from: classes.dex */
public abstract class AbstractC5952f {

    /* renamed from: a */
    public static android.util.DisplayMetrics f22855a = null;

    /* renamed from: b */
    public static int f22856b = 50;

    /* renamed from: c */
    public static int f22857c = 8000;

    /* renamed from: d */
    public static android.graphics.Rect f22858d;

    /* renamed from: e */
    public static android.graphics.Paint.FontMetrics f22859e;

    /* renamed from: f */
    public static android.graphics.Rect f22860f;

    /* renamed from: g */
    public static p215m3.AbstractC4351c f22861g;

    /* renamed from: h */
    public static android.graphics.Rect f22862h;

    /* renamed from: i */
    public static android.graphics.Rect f22863i;

    /* renamed from: j */
    public static android.graphics.Paint.FontMetrics f22864j;

    static {
            r0 = 1
            java.lang.Double.longBitsToDouble(r0)
            r0 = 1
            java.lang.Float.intBitsToFloat(r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            p323s3.AbstractC5952f.f22858d = r1
            android.graphics.Paint$FontMetrics r1 = new android.graphics.Paint$FontMetrics
            r1.<init>()
            p323s3.AbstractC5952f.f22859e = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            p323s3.AbstractC5952f.f22860f = r1
            m3.b r1 = new m3.b
            r1.<init>(r0)
            p323s3.AbstractC5952f.f22861g = r1
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            p323s3.AbstractC5952f.f22862h = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            p323s3.AbstractC5952f.f22863i = r0
            android.graphics.Paint$FontMetrics r0 = new android.graphics.Paint$FontMetrics
            r0.<init>()
            p323s3.AbstractC5952f.f22864j = r0
            return
    }

    /* renamed from: a */
    public static int m12374a(android.graphics.Paint r3, java.lang.String r4) {
            android.graphics.Rect r0 = p323s3.AbstractC5952f.f22858d
            r1 = 0
            r0.set(r1, r1, r1, r1)
            int r2 = r4.length()
            r3.getTextBounds(r4, r1, r2, r0)
            int r3 = r0.height()
            return r3
    }

    /* renamed from: b */
    public static p323s3.C5947a m12375b(android.graphics.Paint r4, java.lang.String r5) {
            r0 = 0
            s3.a r0 = p323s3.C5947a.m12356b(r0, r0)
            android.graphics.Rect r1 = p323s3.AbstractC5952f.f22860f
            r2 = 0
            r1.set(r2, r2, r2, r2)
            int r3 = r5.length()
            r4.getTextBounds(r5, r2, r3, r1)
            int r4 = r1.width()
            float r4 = (float) r4
            r0.f22832b = r4
            int r4 = r1.height()
            float r4 = (float) r4
            r0.f22833c = r4
            return r0
    }

    /* renamed from: c */
    public static int m12376c(android.graphics.Paint r0, java.lang.String r1) {
            float r0 = r0.measureText(r1)
            int r0 = (int) r0
            return r0
    }

    /* renamed from: d */
    public static float m12377d(float r2) {
            android.util.DisplayMetrics r0 = p323s3.AbstractC5952f.f22855a
            if (r0 != 0) goto Lc
            java.lang.String r0 = "MPChartLib-Utils"
            java.lang.String r1 = "Utils NOT INITIALIZED. You need to call Utils.init(...) at least once before calling Utils.convertDpToPixel(...). Otherwise conversion does not take place."
            android.util.Log.e(r0, r1)
            return r2
        Lc:
            float r0 = r0.density
            float r2 = r2 * r0
            return r2
    }

    /* renamed from: e */
    public static p323s3.C5947a m12378e(float r5, float r6, float r7) {
            r0 = 1016003125(0x3c8efa35, float:0.017453292)
            float r7 = r7 * r0
            double r0 = (double) r7
            double r2 = java.lang.Math.cos(r0)
            float r7 = (float) r2
            float r7 = r7 * r5
            float r7 = java.lang.Math.abs(r7)
            double r2 = java.lang.Math.sin(r0)
            float r2 = (float) r2
            float r2 = r2 * r6
            float r2 = java.lang.Math.abs(r2)
            float r2 = r2 + r7
            double r3 = java.lang.Math.sin(r0)
            float r7 = (float) r3
            float r5 = r5 * r7
            float r5 = java.lang.Math.abs(r5)
            double r0 = java.lang.Math.cos(r0)
            float r7 = (float) r0
            float r6 = r6 * r7
            float r6 = java.lang.Math.abs(r6)
            float r6 = r6 + r5
            s3.a r5 = p323s3.C5947a.m12356b(r2, r6)
            return r5
    }

    /* renamed from: f */
    public static float m12379f(double r5) {
            boolean r0 = java.lang.Double.isInfinite(r5)
            if (r0 != 0) goto L3a
            boolean r0 = java.lang.Double.isNaN(r5)
            if (r0 != 0) goto L3a
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 != 0) goto L13
            goto L3a
        L13:
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 >= 0) goto L19
            double r0 = -r5
            goto L1a
        L19:
            r0 = r5
        L1a:
            double r0 = java.lang.Math.log10(r0)
            float r0 = (float) r0
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            float r0 = (float) r0
            int r0 = (int) r0
            int r0 = 1 - r0
            r1 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r3 = (double) r0
            double r0 = java.lang.Math.pow(r1, r3)
            float r0 = (float) r0
            double r1 = (double) r0
            double r5 = r5 * r1
            long r5 = java.lang.Math.round(r5)
            float r5 = (float) r5
            float r5 = r5 / r0
            return r5
        L3a:
            r5 = 0
            return r5
    }
}

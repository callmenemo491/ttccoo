package p230n3;

/* renamed from: n3.b */
/* loaded from: classes.dex */
public class C4684b {

    /* renamed from: a */
    public float f18651a;

    /* renamed from: b */
    public float f18652b;

    /* renamed from: c */
    public float f18653c;

    /* renamed from: d */
    public float f18654d;

    /* renamed from: e */
    public int f18655e;

    /* renamed from: f */
    public int f18656f;

    /* renamed from: g */
    public int f18657g;

    /* renamed from: h */
    public p181k3.C3685i.a f18658h;

    /* renamed from: i */
    public float f18659i;

    /* renamed from: j */
    public float f18660j;

    public C4684b(float r2, float r3, float r4, float r5, int r6, p181k3.C3685i.a r7) {
            r1 = this;
            r1.<init>()
            r0 = 2143289344(0x7fc00000, float:NaN)
            r1.f18651a = r0
            r1.f18652b = r0
            r0 = -1
            r1.f18655e = r0
            r1.f18657g = r0
            r1.f18651a = r2
            r1.f18652b = r3
            r1.f18653c = r4
            r1.f18654d = r5
            r1.f18656f = r6
            r1.f18658h = r7
            return
    }

    /* renamed from: a */
    public boolean m10724a(p230n3.C4684b r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r3.f18656f
            int r2 = r4.f18656f
            if (r1 != r2) goto L20
            float r1 = r3.f18651a
            float r2 = r4.f18651a
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L20
            int r1 = r3.f18657g
            int r2 = r4.f18657g
            if (r1 != r2) goto L20
            int r1 = r3.f18655e
            int r4 = r4.f18655e
            if (r1 != r4) goto L20
            r4 = 1
            return r4
        L20:
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "Highlight, x: "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            float r1 = r2.f18651a
            r0.append(r1)
            java.lang.String r1 = ", y: "
            r0.append(r1)
            float r1 = r2.f18652b
            r0.append(r1)
            java.lang.String r1 = ", dataSetIndex: "
            r0.append(r1)
            int r1 = r2.f18656f
            r0.append(r1)
            java.lang.String r1 = ", stackIndex (only stacked barentry): "
            r0.append(r1)
            int r1 = r2.f18657g
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

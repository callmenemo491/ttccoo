package p181k3;

/* renamed from: k3.i */
/* loaded from: classes.dex */
public class C3685i extends p181k3.AbstractC3677a {

    /* renamed from: A */
    public boolean f16303A;

    /* renamed from: B */
    public int f16304B;

    /* renamed from: C */
    public float f16305C;

    /* renamed from: D */
    public float f16306D;

    /* renamed from: E */
    public float f16307E;

    /* renamed from: F */
    public int f16308F;

    /* renamed from: G */
    public p181k3.C3685i.a f16309G;

    /* renamed from: H */
    public float f16310H;

    /* renamed from: z */
    public boolean f16311z;

    /* renamed from: k3.i$a */
    public enum a extends java.lang.Enum<p181k3.C3685i.a> {

        /* renamed from: Y */
        public static final p181k3.C3685i.a f16312Y = null;

        /* renamed from: Z */
        public static final p181k3.C3685i.a f16313Z = null;

        /* renamed from: a0 */
        public static final /* synthetic */ p181k3.C3685i.a[] f16314a0 = null;

        static {
                k3.i$a r0 = new k3.i$a
                java.lang.String r1 = "LEFT"
                r2 = 0
                r0.<init>(r1, r2)
                p181k3.C3685i.a.f16312Y = r0
                k3.i$a r1 = new k3.i$a
                java.lang.String r3 = "RIGHT"
                r4 = 1
                r1.<init>(r3, r4)
                p181k3.C3685i.a.f16313Z = r1
                r3 = 2
                k3.i$a[] r3 = new p181k3.C3685i.a[r3]
                r3[r2] = r0
                r3[r4] = r1
                p181k3.C3685i.a.f16314a0 = r3
                return
        }

        a(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static p181k3.C3685i.a valueOf(java.lang.String r1) {
                java.lang.Class<k3.i$a> r0 = p181k3.C3685i.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                k3.i$a r1 = (p181k3.C3685i.a) r1
                return r1
        }

        public static p181k3.C3685i.a[] values() {
                k3.i$a[] r0 = p181k3.C3685i.a.f16314a0
                java.lang.Object r0 = r0.clone()
                k3.i$a[] r0 = (p181k3.C3685i.a[]) r0
                return r0
        }
    }

    public C3685i(p181k3.C3685i.a r3) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.f16311z = r0
            r2.f16303A = r0
            r1 = -7829368(0xffffffffff888888, float:NaN)
            r2.f16304B = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r2.f16305C = r1
            r1 = 1092616192(0x41200000, float:10.0)
            r2.f16306D = r1
            r2.f16307E = r1
            r2.f16308F = r0
            r0 = 2139095040(0x7f800000, float:Infinity)
            r2.f16310H = r0
            r2.f16309G = r3
            r3 = 0
            r2.f16273c = r3
            return
    }

    @Override // p181k3.AbstractC3677a
    /* renamed from: a */
    public void mo8135a(float r5, float r6) {
            r4 = this;
            float r0 = r6 - r5
            float r0 = java.lang.Math.abs(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Lf
            r0 = 1065353216(0x3f800000, float:1.0)
            float r6 = r6 + r0
            float r5 = r5 - r0
        Lf:
            float r0 = r6 - r5
            float r0 = java.lang.Math.abs(r0)
            r1 = 1120403456(0x42c80000, float:100.0)
            float r2 = r0 / r1
            float r3 = r4.f16307E
            float r2 = r2 * r3
            float r5 = r5 - r2
            r4.f16269x = r5
            float r0 = r0 / r1
            float r1 = r4.f16306D
            float r0 = r0 * r1
            float r0 = r0 + r6
            r4.f16268w = r0
            float r5 = r5 - r0
            float r5 = java.lang.Math.abs(r5)
            r4.f16270y = r5
            return
    }

    /* renamed from: e */
    public float m8141e(android.graphics.Paint r8) {
            r7 = this;
            float r0 = r7.f16274d
            r8.setTextSize(r0)
            java.lang.String r0 = r7.m8137c()
            android.util.DisplayMetrics r1 = p323s3.AbstractC5952f.f22855a
            float r8 = r8.measureText(r0)
            int r8 = (int) r8
            float r8 = (float) r8
            float r0 = r7.f16272b
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r1
            float r0 = r0 + r8
            float r8 = r7.f16310H
            r1 = 0
            int r2 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r2 <= 0) goto L29
            r2 = 2139095040(0x7f800000, float:Infinity)
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 == 0) goto L29
            float r8 = p323s3.AbstractC5952f.m12377d(r8)
        L29:
            double r2 = (double) r8
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L31
            goto L32
        L31:
            r8 = r0
        L32:
            float r8 = java.lang.Math.min(r0, r8)
            float r8 = java.lang.Math.max(r1, r8)
            return r8
    }

    /* renamed from: f */
    public boolean m8142f() {
            r2 = this;
            boolean r0 = r2.f16271a
            if (r0 == 0) goto Le
            boolean r0 = r2.f16263r
            if (r0 == 0) goto Le
            int r0 = r2.f16308F
            r1 = 1
            if (r0 != r1) goto Le
            return r1
        Le:
            r0 = 0
            return r0
    }
}

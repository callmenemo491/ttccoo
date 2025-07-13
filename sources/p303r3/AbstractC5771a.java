package p303r3;

/* renamed from: r3.a */
/* loaded from: classes.dex */
public abstract class AbstractC5771a extends p366v0.AbstractC6484c {

    /* renamed from: b */
    public p181k3.AbstractC3677a f22243b;

    /* renamed from: c */
    public p323s3.C5951e f22244c;

    /* renamed from: d */
    public android.graphics.Paint f22245d;

    /* renamed from: e */
    public android.graphics.Paint f22246e;

    /* renamed from: f */
    public android.graphics.Paint f22247f;

    /* renamed from: g */
    public android.graphics.Paint f22248g;

    public AbstractC5771a(p323s3.C5953g r2, p323s3.C5951e r3, p181k3.AbstractC3677a r4) {
            r1 = this;
            r1.<init>(r2)
            r1.f22244c = r3
            r1.f22243b = r4
            s3.g r2 = (p323s3.C5953g) r2
            if (r2 == 0) goto L59
            android.graphics.Paint r2 = new android.graphics.Paint
            r3 = 1
            r2.<init>(r3)
            r1.f22246e = r2
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r1.f22245d = r2
            r4 = -7829368(0xffffffffff888888, float:NaN)
            r2.setColor(r4)
            android.graphics.Paint r2 = r1.f22245d
            r4 = 1065353216(0x3f800000, float:1.0)
            r2.setStrokeWidth(r4)
            android.graphics.Paint r2 = r1.f22245d
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r2.setStyle(r0)
            android.graphics.Paint r2 = r1.f22245d
            r0 = 90
            r2.setAlpha(r0)
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r1.f22247f = r2
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2.setColor(r0)
            android.graphics.Paint r2 = r1.f22247f
            r2.setStrokeWidth(r4)
            android.graphics.Paint r2 = r1.f22247f
            android.graphics.Paint$Style r4 = android.graphics.Paint.Style.STROKE
            r2.setStyle(r4)
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>(r3)
            r1.f22248g = r2
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r2.setStyle(r3)
        L59:
            return
    }

    /* renamed from: m */
    public void mo12086m(float r3, float r4, boolean r5) {
            r2 = this;
            java.lang.Object r0 = r2.f25150a
            r1 = r0
            s3.g r1 = (p323s3.C5953g) r1
            if (r1 == 0) goto L61
            s3.g r0 = (p323s3.C5953g) r0
            float r0 = r0.m12380a()
            r1 = 1092616192(0x41200000, float:10.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L61
            java.lang.Object r0 = r2.f25150a
            s3.g r0 = (p323s3.C5953g) r0
            boolean r0 = r0.m12382c()
            if (r0 != 0) goto L61
            s3.e r3 = r2.f22244c
            java.lang.Object r4 = r2.f25150a
            r0 = r4
            s3.g r0 = (p323s3.C5953g) r0
            android.graphics.RectF r0 = r0.f22866b
            float r0 = r0.left
            s3.g r4 = (p323s3.C5953g) r4
            android.graphics.RectF r4 = r4.f22866b
            float r4 = r4.top
            s3.b r3 = r3.m12367b(r0, r4)
            s3.e r4 = r2.f22244c
            java.lang.Object r0 = r2.f25150a
            r1 = r0
            s3.g r1 = (p323s3.C5953g) r1
            android.graphics.RectF r1 = r1.f22866b
            float r1 = r1.left
            s3.g r0 = (p323s3.C5953g) r0
            android.graphics.RectF r0 = r0.f22866b
            float r0 = r0.bottom
            s3.b r4 = r4.m12367b(r1, r0)
            if (r5 != 0) goto L4f
            double r0 = r4.f22836c
            float r5 = (float) r0
            double r0 = r3.f22836c
            goto L54
        L4f:
            double r0 = r3.f22836c
            float r5 = (float) r0
            double r0 = r4.f22836c
        L54:
            float r0 = (float) r0
            s3.d<s3.b> r1 = p323s3.C5948b.f22834d
            r1.m12363c(r3)
            s3.d<s3.b> r3 = p323s3.C5948b.f22834d
            r3.m12363c(r4)
            r3 = r5
            r4 = r0
        L61:
            r2.mo12087n(r3, r4)
            return
    }

    /* renamed from: n */
    public void mo12087n(float r13, float r14) {
            r12 = this;
            k3.a r0 = r12.f22243b
            int r0 = r0.f16259n
            float r1 = r14 - r13
            float r1 = java.lang.Math.abs(r1)
            double r1 = (double) r1
            r3 = 0
            if (r0 == 0) goto Ld2
            r4 = 0
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 <= 0) goto Ld2
            boolean r6 = java.lang.Double.isInfinite(r1)
            if (r6 == 0) goto L1c
            goto Ld2
        L1c:
            double r6 = (double) r0
            double r1 = r1 / r6
            float r0 = p323s3.AbstractC5952f.m12379f(r1)
            double r0 = (double) r0
            k3.a r2 = r12.f22243b
            java.util.Objects.requireNonNull(r2)
            double r6 = java.lang.Math.log10(r0)
            int r2 = (int) r6
            double r6 = (double) r2
            r8 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r6 = java.lang.Math.pow(r8, r6)
            float r2 = p323s3.AbstractC5952f.m12379f(r6)
            double r6 = (double) r2
            double r10 = r0 / r6
            int r2 = (int) r10
            r10 = 5
            if (r2 <= r10) goto L45
            double r6 = r6 * r8
            double r0 = java.lang.Math.floor(r6)
        L45:
            k3.a r2 = r12.f22243b
            java.util.Objects.requireNonNull(r2)
            k3.a r2 = r12.f22243b
            java.util.Objects.requireNonNull(r2)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L55
            r6 = r4
            goto L5d
        L55:
            double r6 = (double) r13
            double r6 = r6 / r0
            double r6 = java.lang.Math.ceil(r6)
            double r6 = r6 * r0
        L5d:
            k3.a r13 = r12.f22243b
            java.util.Objects.requireNonNull(r13)
            if (r2 != 0) goto L66
            r13 = r4
            goto L88
        L66:
            double r13 = (double) r14
            double r13 = r13 / r0
            double r13 = java.lang.Math.floor(r13)
            double r13 = r13 * r0
            r8 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            int r10 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r10 != 0) goto L75
            goto L88
        L75:
            double r13 = r13 + r4
            long r8 = java.lang.Double.doubleToRawLongBits(r13)
            int r10 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r10 < 0) goto L81
            r13 = 1
            goto L83
        L81:
            r13 = -1
        L83:
            long r8 = r8 + r13
            double r13 = java.lang.Double.longBitsToDouble(r8)
        L88:
            if (r2 == 0) goto L94
            r8 = r6
            r2 = 0
        L8c:
            int r10 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r10 > 0) goto L95
            int r2 = r2 + 1
            double r8 = r8 + r0
            goto L8c
        L94:
            r2 = 0
        L95:
            k3.a r13 = r12.f22243b
            r13.f16257l = r2
            float[] r14 = r13.f16256k
            int r14 = r14.length
            if (r14 >= r2) goto La2
            float[] r14 = new float[r2]
            r13.f16256k = r14
        La2:
            r13 = 0
        La3:
            if (r13 >= r2) goto Lb5
            int r14 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r14 != 0) goto Laa
            r6 = r4
        Laa:
            k3.a r14 = r12.f22243b
            float[] r14 = r14.f16256k
            float r8 = (float) r6
            r14[r13] = r8
            double r6 = r6 + r0
            int r13 = r13 + 1
            goto La3
        Lb5:
            r13 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            k3.a r13 = r12.f22243b
            if (r2 >= 0) goto Lca
            double r0 = java.lang.Math.log10(r0)
            double r0 = -r0
            double r0 = java.lang.Math.ceil(r0)
            int r14 = (int) r0
            r13.f16258m = r14
            goto Lcc
        Lca:
            r13.f16258m = r3
        Lcc:
            k3.a r13 = r12.f22243b
            java.util.Objects.requireNonNull(r13)
            return
        Ld2:
            k3.a r13 = r12.f22243b
            float[] r14 = new float[r3]
            r13.f16256k = r14
            r13.f16257l = r3
            return
    }
}
